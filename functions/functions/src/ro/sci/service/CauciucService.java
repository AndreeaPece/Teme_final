package ro.sci.service;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchCauciucRequest;


public class CauciucService {
    private Cauciuc[] cauciucuri;
    public CauciucService () {initCauciucFeature (); }
    public Cauciuc findCauciuc (String size){
        Cauciuc foundCauciuc = null;
        for (Cauciuc cauciuc: cauciucuri) {
            if (size != null && size.equals(cauciuc.size)){
                foundCauciuc = cauciuc;
                break;
            }
        }
        return foundCauciuc;
    }

    private void initCauciucFeature(){
        //define some features for car rubber
        Cauciuc c1 = new Cauciuc ("225/55R17 97W");
        c1.type = "Cauciuc de vara";

        Cauciuc c2 = new Cauciuc ("225/60R18 97Y");
        c2.type = "Cauciuc de iarna";

        Cauciuc c3 = new Cauciuc ("235/70R17 97V");
        c3.type = "Cauciuc toate anotimpurile";

        cauciucuri = new Cauciuc[]{c1, c2, c3};

    }

}


