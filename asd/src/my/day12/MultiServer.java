package my.day12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer {
	
	/**
	 * 
	 *  Ŭ���̾�Ʈ�� ��û�� ó���ϰ�, �޼��� ó����
	 *   MultiServerRunnable ��ü�� ó���ϵ��� �и��Ѵ�.
	 */

	ServerSocket ser;
	public ArrayList<MultiServerRunnable> arrlist  ;	
	MultiServerRunnable mr;
	Socket socket;
	
	public MultiServer(){
		
		try {
			arrlist = new ArrayList<MultiServerRunnable>();
			ser = new ServerSocket(5000);
			System.out.println("���� �����.");
			
			
			while(true){
				socket= ser.accept();
				
				System.out.println("���� ����");
				mr = new MultiServerRunnable(socket);
				arrlist.add(mr);
				Thread thread = new Thread(mr);
				thread.start();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
			
	
	public static void main(String[] args) {
		new MultiServer();

	}

	/*
	 * Ŭ���̾�Ʈ�� �޼��� ó���� ����ϴ� ������ ���� ��ü
	 */
	class MultiServerRunnable implements Runnable {
		Socket sock;
		DataInputStream dis;
		DataOutputStream dos;

		public MultiServerRunnable(Socket sock) {
			this.sock = sock;

		}

		// arraylist�� �ִ� ��ü�鿡�� ���ÿ� �޼��� ����ϴ� �޼ҵ�
		public void broadCasting(String msg) throws IOException {
			for (MultiServerRunnable mr : arrlist) {
				if(mr!=this){
					System.out.println("Message: " + msg.toString());
					mr.send(msg);
				}
				
			}
		}

		public void send(String msg) throws IOException {
			System.out.println("send[Message]:" + msg);
			dos.writeUTF(msg);
			dos.flush();
		}

		@Override
		public synchronized void run() {
			boolean isStop=false;
			try {
				dis = new DataInputStream(sock.getInputStream());
				dos = new DataOutputStream(sock.getOutputStream());

				while (!isStop) {
					String msg = dis.readUTF().toString();
					System.out.println("Message: " + msg);
					broadCasting(msg);

				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}//MultiServerRunnable---

}//MultiServer-----