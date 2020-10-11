package com.example.tubes;

import java.util.ArrayList;

public class TshirtList {
    public ArrayList<Tshirt> tshirts;

    public TshirtList() {
        tshirts = new ArrayList<Tshirt>();
    }

    Tshirt tshirt1 = new Tshirt("T-SHIRT HITAM 1", "Kaos hitam pertama", "L", 135000, "@drawable/Tshirt.JPG");
    Tshirt tshirt2 = new Tshirt("T-SHIRT HITAM 2", "Kaos hitam kedua", "M", 145000, "https://images.unsplash.com/photo-1583744946564-b52ac1c389c8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
    Tshirt tshirt3 = new Tshirt("T-SHIRT PUTIH 1", "Kaos putih pertama", "S", 135000, "https://images.unsplash.com/photo-1586790170083-2f9ceadc732d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
    Tshirt tshirt4 = new Tshirt("T-SHIRT PUTIH 2", "Kaos putih kedua", "L",155000, "https://images.unsplash.com/photo-1566101797645-91bfeaac56e3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=375&q=80");
}
