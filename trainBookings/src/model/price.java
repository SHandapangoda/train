package model;

public class price {

    private String price;
    private String trID;

    public price(String price,String trID){
        this.price=price;
        this.trID=trID;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTrID() {
        return trID;
    }

    public void setTrID(String trID) {
        this.trID = trID;
    }
}
