import java.util.Calendar;
import java.util.Formatter;
public class zad1 {

	public static void main(String[] args) {
		Calendar dzis=Calendar.getInstance();
		Formatter data=new Formatter();
		data.format("%tA %td %tB %tY", dzis, dzis, dzis, dzis);
		System.out.println(data);
		data.close();
		
	
		Formatter data2=new Formatter();
		data2.format("%TR",dzis);
		System.out.println(data2);
		data.close();
	}

}