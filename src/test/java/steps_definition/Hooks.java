package steps_definition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utilidades.BaseUtil;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks{

	private BaseUtil base;
	private ChromeOptions options;
	
	public Hooks(BaseUtil base) {
		this.base = base;
	}

	@Before
	public void inicializarTest() {
		WebDriverManager.chromedriver().setup();
		this.options = new ChromeOptions();
		options.addArguments("start-maximized");
		this.base.driver = new ChromeDriver(options);	
	}
	
	@After
	public void finalizarTest() {
		this.base.driver.quit();
	}
	
}
