/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nightstay3;

/**
 *
 * @author Turgut Reiss
 */
public class RRoyal extends RTemplate{
    double harga = 30.0;
    double total = 0;
    private int hari;
    private String roomid;
    private boolean status = false;

    public RRoyal(String id) {
        roomid = id;
    }

    @Override
    public void order(int h) {
        hari = h;
        total = harga * hari;
        status = true;

        System.out.println("Room Ordered: " + roomid);
        System.out.println("Durasi: " + hari + " malam");
        System.out.println("Subtotal: Rp" + total);
    }

    public String roomchooser() {
        return roomid;
    }

    @Override
    public double getharga() {
        return harga;
    }
    
    @Override
    public double getTotal(){
        return total;
    }
    
    @Override
    public boolean getStatus(){
        return status;
    }
    
    @Override
    public void setStatus(boolean newstat){
        status = newstat;
    }
    
    @Override
    public String displaydescription(){
        String res;
        if (status != true){
            res = ("Status: Available");
        } else {
            res = ("Status: Booked");
        }
        return ("Nomor Kamar: " + roomid
                + "\no Tipe Kamar: Royal Suite"
                + "\no Pricing: " + harga + " /malam"
                + "\n" + res 
                + "\n=====================");
    }
}
