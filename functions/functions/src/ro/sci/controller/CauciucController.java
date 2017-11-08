package ro.sci.controller;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchCauciucRequest;
import ro.sci.service.SearchService;


public class CauciucController {
    private SearchService searchService = new SearchService();

    public Cauciuc handleSearchCauciucRequest(SearchCauciucRequest searchCauciucRequest){
        Cauciuc cauciuc = this.searchService.search(searchCauciucRequest);
        return cauciuc;

    }
}

