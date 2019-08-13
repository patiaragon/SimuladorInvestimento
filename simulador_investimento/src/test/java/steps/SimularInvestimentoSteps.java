package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import interactions.SimularInvestimentoInteractions;


public class SimularInvestimentoSteps {
	private WebDriver driver;
	SimularInvestimentoInteractions simularInvestimento = PageFactory.initElements(driver, SimularInvestimentoInteractions.class);
	

}