package pages;

public class PaginaCursos extends BasePage {

    private String fundamentosTestingLink = "//a[normalize-space()='Fundamentos del Testing' and @href]";

    public PaginaCursos() {
        super(driver);
    }

    public void clickFundamentosTestingLink() {
        clickElement(fundamentosTestingLink);
    }

}
