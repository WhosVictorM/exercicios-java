package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AulaUdemyDateTime {

	public static void main(String[] args) {
//		Passar TIPOS PRIMITIVOS para TEMPO;
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-07-03");
		LocalDateTime d05 = LocalDateTime.parse("2023-07-03T22:17:30");
		Instant d10 = Instant.parse("2023-07-03T01:30:00Z");
		
		LocalDate d06 = LocalDate.parse("03/07/2023", fmt01);
		LocalDateTime d07 = LocalDateTime.parse("03/07/2023 22:30", fmt02);
		
		LocalDate d08 = LocalDate.of(2023, 07, 03);
		LocalDateTime d09 = LocalDateTime.of(2023, 07, 03, 22, 30);
		
		System.out.println("D01 = " + d01);
		System.out.println("D02 = " + d02);
		System.out.println("D03 = " + d03);
		System.out.println("D04 = " + d04);
		System.out.println("D05 = " + d05);
		System.out.println("D06 = " + d06);
		System.out.println("D07 = " + d07);
		System.out.println("D08 = " + d08);
		System.out.println("D09 = " + d09);
		
		System.out.println();
		
//		Passar TEMPO para TIPOS PRIMITIVOS;
		
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("D04 = " + d04.format(fmt01));
		System.out.println("D05 = " + d05.format(fmt02));
		System.out.println("D10 = " + fmt03.format(d10));
		
		System.out.println();
		
//		Pegar apenas DIA, MÊS OU ANO;
		
		System.out.println("DIA do D04 = " + d04.getDayOfMonth()); // getMonth(), getYear();
		
		System.out.println();
		
//		Cálculo com DATA-HORA;
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		System.out.println("Past Week D04 = " + pastWeekLocalDate);
		
		Instant pastWeekInstant = d10.minus(7, ChronoUnit.DAYS);
		System.out.println("Past Week D10 = " + pastWeekInstant);
		
		
	}

}
