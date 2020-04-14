package voice.prove.concept.step_definitions;


import io.cucumber.java8.En;
import voice.prove.concept.page_objects.PageObjectBase;

public class Hooks implements En {


    public Hooks(PageObjectBase pageObjectBase) {

        Before(0,() -> {
            pageObjectBase.open();
                });

        After(1,() -> {
            pageObjectBase.close();
        });
    }

}
