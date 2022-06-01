import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
	
FirefoxDriver obj = new FirefoxDriver ();
	
	
	obj.get("https://demoqa.com/text-box");
	
	
	
	
	
	}

}
