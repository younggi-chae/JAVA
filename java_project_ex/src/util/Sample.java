package util;

import java.time.LocalDateTime;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

import models.Member;

public class Sample {
	
	public static Vector<String> getMemberName(){
		//Į�� ������
		Vector<String> memberName = new Vector<>();
		memberName.add("ID");
		memberName.add("USERNAME");
		memberName.add("PASSWORD");
		memberName.add("REALNAME");
		memberName.add("EMAIL");
		memberName.add("PHONE");
		memberName.add("CREATEDATE");
		
		return memberName;
	}
	
	public static Vector<Member> getMembers(){
		//Member ������
		Vector<Member> members = new Vector<>();
		members.add(new Member(1,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(2,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(3,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(4,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(5,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(6,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(7,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(8,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(9,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(10,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(11,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(12,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(13,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(14,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(15,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(16,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(17,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(18,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(19,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(20,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(21,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		members.add(new Member(22,"ssarmango","bitc5600","jooho","ssar@nate.com", "01022228888", Time.localDateTimeToTimeStamp(LocalDateTime.now())));
		
		return members;
	}
}

