package ro.sci.domain;

public class SearchCauciucRequest {
    public String size;
    public String radius;
    public String type;

    public SearchCauciucRequest(String size, String radius, String type){
        this.size = size;
        this.radius = radius;
        this.type = type;
    }

}


