package HomeWork.date160808.shop;


public class Products {
    private double prise;
    private String name;




    public Products(String name, double prise) {
        this.name = name;
        this.prise = prise;
    }



    public double getPrise() {
        return prise;
    }

    public String getName() {
        return name;
    }


    public static void sum(Products product) {
        if (!(product.name.equals("")&&product.prise==0)) {
            System.out.println("Вы заказали: " + product.name);
            System.out.println("И заплатили: " + product.prise + " грн");
        }

    }


    public static void res(Products[] p) {
        double prise = 0;
        String menu = "";
        for (Products pr : p) {
            if (!(pr.name.equals("")&&pr.prise==0)) {
                menu+= pr.name + " ";
                prise+=pr.prise;
            }

        }

        System.out.println("Вы заказали: " + menu );
        System.out.println("И заплатили: " + prise + " грн"  );

    }



    public static void sum(Products product, Products product1) {
        Products[] p  = {product, product1};
        res(p);
    }


    public static void sum(Products product, Products product1, Products product2) {
        Products[] p  = {product, product1, product2};
        res(p);
    }


    public static void sum(Products product, Products product1, Products product2, Products product3 ) {
        Products[] p  = {product, product1, product2, product3};
        res(p);
    }

    public static void sum(Products product, Products product1, Products product2, Products product3, Products product4) {
        Products[] p  = {product, product1, product2, product3, product4};
        res(p);
    }


    public static void sum(Products product, Products product1, Products product2, Products product3, Products product4, Products product5) {
        Products[] p  = {product, product1, product2, product3, product4, product5};
        res(p);
    }

    public static void sum(Products product, Products product1, Products product2, Products product3, Products product4, Products product5, Products product6) {
        Products[] p  = {product, product1, product2, product3, product4,product5, product6};
        res(p);
    }





}
