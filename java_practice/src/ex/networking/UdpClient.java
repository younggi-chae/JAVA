package ex.networking;

import java.net.*;
import java.io.*;

public class UdpClient {
	public void start() throws IOException, UnknownHostException {
		DatagramSocket datagramSocket = new DatagramSocket();
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
		
		//�����Ͱ� ����� �������� ����Ʈ�迭�� ����
		byte[] msg = new byte[100];
		
		DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777);
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		System.out.println("current server time : " + new String(inPacket.getData()));
		
		datagramSocket.close();
	}
	
	public static void main(String[] args) {
		try {
			new UdpClient().start();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
