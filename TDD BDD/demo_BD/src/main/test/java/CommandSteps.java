public class CommandSteps {
    private Command command;

    @Given("Customer who want to command for Someone")
    public void customerWhoWantToCommandForSomeone() {
        command = new Command();
        command.setFrom("Toto");
    }

    @When("a command is make for Someone")
    public void aCommandMakeForSomeone() {
        command.setTo("Tata");
    }

    @Then(" there is no product in the Command")
    public void thereIsNoProductInTheCommand() {
        Assert.assertTrue(command.getProducts().isEmpty());
    }

    @And("the command come from Customer")
    public void theCommandComeFromCustomer() {
        Asser.assertEquals("Toto", command.getFrom());
    }
}