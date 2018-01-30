/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.util.Date;
public class Offer {
    protected String region;
    protected String type;
    protected Date sdate;
    protected Date edate;
    protected int discount;

    public Offer(String region, String type, Date sdate, Date edate, int discount) {
        this.region = region;
        this.type = type;
        this.sdate = sdate;
        this.edate = edate;
        this.discount = discount;
    }

    public String getRegion() {
        return region;
    }

    public String getType() {
        return type;
    }

    public Date getSdate() {
        return sdate;
    }

    public Date getEdate() {
        return edate;
    }

    public int getDiscount() {
        return discount;
    }
}
