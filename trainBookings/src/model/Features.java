package model;

public class Features {

    public int price;
    int newPrice;


    double seatPitch;
    double seatWidth;

    Double newSeatPitch;
    Double newSeatWidth;

    String videoType;
    String newVideoType;

    String seatType;
    String newSeatType;

    String powerType;
    String newPowerType;


    String wifi;
    String newWifi;

    String specialFood;
    String newSpecialFood;

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getNewPrice()
    {
        return newPrice;
    }

    public void setNewPrice(int price)
    {
        newPrice = price;
    }

    public double getSeatPitch()
    {
        return seatPitch;
    }

    public double getSeatWidth()
    {
        return seatWidth;
    }
}
