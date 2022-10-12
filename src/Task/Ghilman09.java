package Task;
import java.util.Scanner;
public class Ghilman09 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Zehmet olmasa massivin setirini daxil edin:");
int setr = scanner.nextInt();
System.out.println("Zehmet olmasa massivin sutununu daxil edin:");
int sutun = scanner.nextInt();
int a[][] = new int[setr][sutun];
for (int i = 0; i <= setr; i++) {
for (int j = 0; j <= sutun; j++) {
System.out.print("a[" + i + "][" + j + "]=");
a[i][j] = scanner.nextInt();
}
}
for (int i = 0; i <=setr; i++) {
for (int j = 0; j <=sutun; j++) {
if (i == j){
System.out.println(a[i][j]);
}
}
}
}
}