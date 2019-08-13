package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SimularInvestimentoPage {
	private WebDriver driver;
	
	 public SimularInvestimentoPage(WebDriver driver) {
		   this.driver = driver;
		 }
		 
		 public SimularInvestimentoPage visita(String url) {
		   driver.get(url);
		   return this;
		 }
	
	@FindBy(name = "perfil")
	protected WebElement textPerfil; 
	
	@FindBy(name = "opcao")
	protected WebElement textOpcao;
	
	@FindBy(id = "valorAplicar")
	protected WebElement textValorAplicar;
	
	@FindBy(id = "valorAplicar-error")
	protected WebElement textValorAplicarErro;
	
	@FindBy(id = "valorInvestir")
	protected WebElement textValorInvestir;
	
	@FindBy(id = "valorInvestir-error")
	protected WebElement textValorInvestirErro;
	
	@FindBy(id = "tempo")
	protected WebElement textTempo;
	
	@FindBy(className = "btSelect btSelectAberto")
	protected WebElement btSelectAberto;
	
	@FindBy(className = "btSelect")
	protected WebElement textTextoMeses;
	
	@FindBy(className = "btn btnAmarelo btnSimular")
	protected WebElement btnSimular;
	
	@FindBy(className = "btn btnLimpar")
	protected WebElement btnLimpar;

}
