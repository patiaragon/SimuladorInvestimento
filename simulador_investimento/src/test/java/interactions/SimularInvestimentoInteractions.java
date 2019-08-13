package interactions;

import page.SimularInvestimentoPage;

import org.openqa.selenium.WebDriver;

import io.cucumber.core.cli.Main;

public class SimularInvestimentoInteractions extends SimularInvestimentoPage {

	public SimularInvestimentoInteractions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void inputOpcao(String opcao) {
		opcao.isSelected(opcao);
	}
	
	public void inputValorAplicar(String valorAplicar) {
		valorAplicar.sendKeys(valorAplicar);
	}
	
	public void inputValorPoupar(String valorPoupar) {
		valorPoupar.sendKeys(valorPoupar);
	}
	
	public void inputTempo(String tempo) {
		tempo.sendKeys(tempo);
	}
	
	public void submitFormularioSimulacaoInvestimento(String bntSimular) {
		bntSimular.click(bntSimular);
		
	}

}
