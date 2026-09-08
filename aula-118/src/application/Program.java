package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now();
		System.out.println("d01 = " + d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02 = " + d02);
		
		Instant d03 = Instant.now();
		System.out.println("d03 = " + d03);
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println("d04 = " + d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println("d05 = " + d05);
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		System.out.println("d06 = " + d06);
		
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		System.out.println("d07 = " + d07);

	}

}
