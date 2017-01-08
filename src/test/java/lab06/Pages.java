package lab06;

import org.jbehave.web.selenium.WebDriverProvider;

import lab06.pages.Home;
import lab06.pages.Registration;

public class Pages {
    private WebDriverProvider driverProvider;

    private Home home;
	private Registration registration;

    public Pages(WebDriverProvider driverProvider) {
		super();
		this.driverProvider = driverProvider;
	}

    public Home home() {
		if (home == null) {
			home = new Home(driverProvider);
		}
		return home;
	}

	public Registration registration(){
		if (registration == null) {
			registration = new Registration(driverProvider);
		}
		return registration;
	}
}