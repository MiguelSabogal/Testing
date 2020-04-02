package steps_definition;

import core.PageObjectBase;
import io.cucumber.java8.En;

public class Hooks implements En {
	public Hooks() {
		
		Before(0, () ->{
			PageObjectBase pageObjectBase = new PageObjectBase();
			pageObjectBase.open();
		});
		
		After(1, () ->{
			PageObjectBase.close();
		});
	}
}
