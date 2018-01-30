/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;

/**
 *
 * @author Chris
 */
public class Avail {
    protected int room_no;
    protected String type;
    protected String region;
    protected int price;
    protected boolean avail;

    public Avail(int room_no, String type, String region, int price, boolean avail) {
        this.room_no = room_no;
        this.type = type;
        this.region = region;
        this.price = price;
        this.avail = avail;
    }

    public int getRoom_no() {
        return room_no;
    }

    public String getType() {
        return type;
    }

    public String getRegion() {
        return region;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvail() {
        return avail;
    }

    
    
}
