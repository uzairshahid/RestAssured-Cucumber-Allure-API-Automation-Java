package OrderMedicinesPortal.OrderMedicinesPortal;

import OrderMedicinesPortal.OrderMedicinesPortalAPIResources;
import OrderMedicinesPortal.OrderMedicinesPortalAPIConstant;
import io.cucumber.java.en.Then;
import io.restassured.specification.RequestSpecification;

public class OrderMedicinesPortal implements OrderMedicinesPortalAPIResources {
    private static RequestSpecification request = null;
    private static final String filePath = OrderMedicinesPortalAPIConstant.API_ORDER_MEDICINE_DATA_JSON_FILE_PATH;


    @Then("user should be able to login")
    public void userShouldBeAbleToLogin() {
//        our logic here
    }

}
