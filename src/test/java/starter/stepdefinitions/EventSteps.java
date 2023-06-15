package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;
import starter.pages.Event;

public class EventSteps {
    @Steps
    Login login;

    @Steps
    Event event;

    //======TCEVENT01==========
    @Given("admin on the dashboard page")
    public void adminOnTheDashboardPage() {
        login.onLoginPage();
        login.inputEmail("ekaameliaputri17@gmail.com");
        login.inputPassword("ekaa123");
        login.clickLoginButton();
        event.adminOnTheDashboardPage();
    }

    @When("admin clicks on the event menu")
    public void AdminClicksOnTheEventMenu() {
        event.AdminClicksOnTheEventMenu();
    }

    @Then("admin can see all event data")
    public void AdminCanSeeAllEventData() {
        event.AdminCanSeeAllEventData();
    }

    //======TCEVENT02==========
    @And("admin on the event page")
    public void adminOnTheEventPage() {
        event.adminOnTheEventPage();
    }

    @And("admin click the add event button")
    public void adminClickTheAddEventButton() {
        event.adminClickTheAddEventButton();
    }

    @And("admin click the select photo button")
    public void adminClickTheSelectPhotoButton() {
        event.adminClickTheSelectPhotoButton();
    }

    @And("admin fills in the event title")
    public void adminFillsInTheEventTitle() {
        event.adminFillsInTheEventTitle("Tari Kecak");
    }

    @And("admin fills in the event description")
    public void adminFillsInTheEventDescription() {
        event.adminFillsInTheEventDescription("Tari Kecak adalah pertunjukan dramatari seni khas Bali yang lebih utama menceritakan mengenai Ramayana dan dimainkan terutama oleh laki-laki.");
    }

//    @And("admin click add article")
//    public void adminClickAddArticle() {
//    }
//
//    @And("admin click on the selected article")
//    public void adminClickOnTheSelectedArticle() {
//    }
//
//    @And("admin successfully added the article")
//    public void adminSuccessfullyAddedTheArticle() {
//    }

    @And("admin fills in the location address")
    public void adminFillsInTheLocationAddress() {
        event.adminFillsInTheLocationAddress("Badung, Bali");
    }

    @And("admin fills in the google maps link")
    public void adminFillsInTheGoogleMapsLink() {
        event.adminFillsInTheGoogleMapsLink("https://goo.gl/maps/WcUWffZ9hK4CmJEu5");
    }

    @And("admin fill in time")
    public void adminFillInTime() {
        event.adminFillInTime("16.00 WITA");
    }

    @And("admin click paid ticket mode")
    public void adminClickPaidTicketMode() {
        event.adminClickPaidTicketMode();
    }

    @And("admin fills in the price")
    public void adminFillsInThePrice() {
        event.adminFillsInThePrice("30000");
    }

    @And("admin fills in the amount")
    public void adminFillsInTheAmount() {
        event.adminFillsInTheAmount("1");
    }

    @And("admin click the save button")
    public void adminClickTheSaveButton() {
        event.adminClickTheSaveButton();
    }

//    @Then("admin managed to add new event data")
//    public void adminManagedToAddNewEventData() {
//    }

    //======TCEVENT03==========
    @And("admin click one data event")
    public void adminClickOneDataEvent() {
        event.adminClickOneDataEvent();
    }

    @Then("admin on detail page")
    public void adminOnDetailPage() {
        event.adminOnDetailPage();
    }

    //======TCEVENT04==========
    @And("admin click edit on one of the event data")
    public void adminClickEditOnOneOfTheEventData() {
        event.adminClickEditOnOneOfTheEventData();
    }

    @And("admin click the replace article button")
    public void theAdminClickTheReplaceArticleButton() {
        event.theAdminClickTheReplaceArticleButton();
    }

//    @And("admin click on the selected article")
//    public void adminClickOnTheSelectedArticle() {
//    }
//
//    @Then("the admin managed to edit the event data")
//    public void theAdminManagedToEditTheEventData() {
//    }

    //======TCEVENT05==========
    @And("admin click delete on the event data that you want to delete")
    public void adminClickDeleteOnTheEventDataThatYouWantToDelete() {
        event.adminClickDeleteOnTheEventDataThatYouWantToDelete();
    }

//    @And("click yes in the warning")
//    public void clickYesInTheWarning() {
//    }
//
//    @Then("admin successfully deletes the event data")
//    public void adminSuccessfullyDeletesTheEventData() {
//    }

    //======TCEVENT07==========
    @Then("admin stays on the add event page")
    public void adminStaysOnTheAddEventPage() {
    }
}
