package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class DesktopAutomation {
	Screen s = new Screen();
  @Test
  public void desktop() throws FindFailed, InterruptedException {
	  s.click("C:\\Users\\\\Documents\\lib\\sikuli\\startbutton.png");
	  Thread.sleep(3000);
	  s.click("C:\\Users\\\\Documents\\lib\\sikuli\\wifi.png");
	  Thread.sleep(3000);
	  s.type("C:\\Users\\\\Documents\\lib\\sikuli\\search.png", "sikuli");
	  
	s.doubleClick();
	s.dragDrop(null, null);
  }
}
