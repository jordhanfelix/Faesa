package br.data;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class TesteCalendar {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
//		cal.add(Calendar.HOUR_OF_DAY, 4);// Add tempo
//		d = cal.getTime();

		int minute = cal.get(Calendar.MINUTE);
		int month = 1+cal.get(Calendar.MONTH);// Acrescenta 1 antes do cal pois a data n calendario começa em 0
		
		
		System.out.println("Mês: " + month);
		System.out.println("Minutes: "+ minute);
		System.out.println(sdf.format(d));

	}

}
