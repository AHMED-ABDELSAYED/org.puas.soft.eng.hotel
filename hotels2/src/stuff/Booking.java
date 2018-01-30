/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;

import java.util.Date;

/**
 *
 * @author Chris
 */
public class Booking {
    protected int code;
    protected String lastname;
    protected String firstname;
    protected String region;
    protected int room_no;
    protected Date checkin;
    protected Date checkout;
    protected int charge;

    public Booking(int code, String lastname, String firstname, String region,int room_no, Date checkin, Date checkout, int charge) {
        this.code = code;
        this.lastname = lastname;
        this.firstname = firstname;
        this.region = region;
        this.room_no = room_no;
        this.checkin = checkin;
        this.checkout = checkout;
        this.charge = charge;
    }

    public int getCode() {
        return code;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getRegion() {
        return region;
    }

    public int getRoom_no() {
        return room_no;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public int getCharge() {
        return charge;
    }

   
}
