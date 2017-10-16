import javax.swing.JOptionPane;

public class SimpleNumberSorter {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Enter a number");
		String num2 = JOptionPane.showInputDialog("Enter another number");
		String num3 = JOptionPane.showInputDialog("Enter another number");
		int int1 = Integer.parseInt(num1);
		int int2 = Integer.parseInt(num2);
		int int3 = Integer.parseInt(num3);

		if (int1 > int2) {
			int temp = int1;
			int1 = int2;
			int2 = temp;
		} 
		if (int2 >  int3) {
			int tem = int2;
			int2= int3;
			int3 = tem; 
		}
		if (int3 >  int1) {
			int te = int3;
			int3= int1;
			int1 = te; 
		}
		JOptionPane.showMessageDialog(null, int1+","+int2+","+int3);
	}
}
