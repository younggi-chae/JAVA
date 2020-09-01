package util;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Time {
	
	//�ڹ��� LocalDateTime ������ Ÿ���� DB�� insert�� �� �ʿ�
	public static Timestamp localDateTimeToTimeStamp(LocalDateTime ldt) {
		return Timestamp.valueOf(ldt); // 2018-07-26 01:06:55.323
	}
	
	//DB�� TimeStamp ������ Ÿ���� Java�� select�Ͽ� ������ �� �ʿ�
	public static LocalDateTime timeStampToLocalDateTime(Timestamp ts) {
		return ts.toLocalDateTime(); // 2018-07-26T01:20:07.364
	}
	
	public static void main(String[] args) {
		Timestamp ts = localDateTimeToTimeStamp(LocalDateTime.now());
		System.out.println("ts : "+ts);
		
		LocalDateTime ldt = timeStampToLocalDateTime(ts);
		System.out.println("ldt : "+ldt);
	}
}

 