package ex.networking;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class UdpServer {
	public void start() throws IOException {
		DatagramSocket socket = new DatagramSocket(7777);
		DatagramPacket inPacket, outPacket;

		byte[] inMsg = new byte[10];
		byte[] outMsg;

		while (true) {
			// �����͸� �����ϱ� ���� ��Ŷ�� ����
			inPacket = new DatagramPacket(inMsg, inMsg.length);

			// ��Ŷ�� ���� �����͸� �����Ѵ�.
			socket.receive(inPacket);

			// ������ ��Ŷ���� ���� client�� IP�ּҿ� Port�� ��´�.
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();

			// ������ ���� �ð��� �ú��� ���·� ��ȯ
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes(); // time�� ����Ʈ�迭�� ��ȯ

			// ��Ŷ�� �����ؼ� client���� �����Ѵ�.
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
			socket.send(outPacket);
		}
	}

	public static void main(String[] args) {
		try {
			new UdpServer().start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
