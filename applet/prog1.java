import java.applet.*;
import java.awt.*;
public class prog1 extends Applet
{
	public void init()
	{
		Checkbox Checkbox1= new Checkbox();
		Checkbox1.setLabel("CheckBox1");
		Checkbox Checkbox2= new Checkbox("CheckBox2");
		add(Checkbox1);
		add(Checkbox2);
	}
	public static void main(String args[])
	{
		prog1 obj=new prog1();
		obj.init();
	}
}
