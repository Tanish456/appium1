package Fruits;

import org.testng.annotations.Test;

public class Groups {
@Test(priority=0, groups = "smoke")
public void carA() {
	System.out.print("This is my fisrt smoke project");
}
@Test(priority=1, groups = "smoke")
public void carB() {
	System.out.print("This is my second smoke project");
}
@Test(priority=2, groups = "regression")
public void carC() {
	System.out.print("This is my fisrt regression project");
}
@Test(priority=4, groups = "regression")
public void carD() {
	System.out.print("This is my second regression project");
}
}
