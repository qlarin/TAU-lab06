package lab06;

import org.jbehave.web.selenium.WebDriverProvider;

import lab06.pages.Home;
import lab06.pages.Registration;
import lab06.pages.Blog;
import lab06.pages.SamplePost;

public class Pages {
    private WebDriverProvider driverProvider;

    private Home home;
	private Registration registration;
	private Blog blog;
	private SamplePost samplePost;

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

	public Blog blog(){
		if (blog == null) {
			blog = new Blog(driverProvider);
		}
		return blog;
	}

	public SamplePost samplePost(){
		if (samplePost == null) {
			samplePost = new SamplePost(driverProvider);
		}
		return samplePost;
	}
}