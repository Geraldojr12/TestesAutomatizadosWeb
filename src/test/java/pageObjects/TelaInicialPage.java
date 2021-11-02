package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class TelaInicialPage extends BasePage {
			
	//BasePage
	public void acionarAbaAdmin() {
		abaAdmin.click();
	}
	
	//ElEMENTOS
	@FindBy(name = "btnAdd")
	public WebElement botaoAdd;
	
	public void acionarBotaoAdd() {
		botaoAdd.click();
	}
	
	public void acesssarMenuCustomField() {
		Actions acao = new Actions(driver);
		acao.moveToElement(abaPim).build().perform();
		acao.moveToElement(menuConfiguration).build().perform();
		acao.moveToElement(menuCustomField).click().build().perform();
	}
	
}
