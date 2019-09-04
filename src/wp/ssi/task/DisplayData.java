package wp.ssi.task;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DisplayData {
	public void showDetails()
	{
		System.out.println();
	}
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("d:/jdata/school.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//oos.writeObject(employee);
		oos.close(); fos.close();

	}

}
