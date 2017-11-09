package ro.sci;

import ro.sci.controller.CauciucController;
import ro.sci.controller.LoginController;
import ro.sci.domain.Cauciuc;
import ro.sci.domain.LoginRequest;
import ro.sci.domain.SearchCauciucRequest;
import ro.sci.domain.User;

public class Main {

    public static void main(String[] args) {

        LoginController loginController = new LoginController();

        LoginRequest loginRequest = new LoginRequest("gigi", "alegeoaia");

        User result = loginController.handleLoginRequest(loginRequest);

        if (result != null) {
            System.out.println("autentificare cu succes");
        }else {
            System.out.println("mai incearca " + loginRequest.loginName);

        }
        CauciucController cauciucController = new CauciucController();

        SearchCauciucRequest searchCauciucRequest = new SearchCauciucRequest("250/70R18 97Y","18", "Cauciuc toate anotimpurile");

        Cauciuc output = cauciucController.handleSearchCauciucRequest(searchCauciucRequest);

        if (output != null) {
            System.out.println("Cauciuc disponibil pe stoc");
        }else {
            System.out.println("Cauciuc indisponibil pe stoc");
        }
    }
}


