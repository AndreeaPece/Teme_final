package ro.sci.service;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchCauciucRequest;


public class SearchService {
    private CauciucService cauciucService = new CauciucService();
    public Cauciuc search(SearchCauciucRequest searchCauciucRequest){
        Cauciuc availableCauciuc = null;

        if (searchCauciucRequest != null) {
            Cauciuc cauciuc = this.cauciucService.findCauciuc(searchCauciucRequest.size);

        }

        return availableCauciuc;
    }


}


