import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;


class Add {
	public int add(int a, int b) {
		return a + b;
	}
}

class Test {
	public static void main(String [] args) {
		Add a = new Add();
		System.out.println(a.add(10, 12));
		System.out.println("hello world");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		System.out.println(sdf.format(new Timestamp(date.getTime())));
		System.out.println(date.getTime());
	}
}

