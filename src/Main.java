public class Main {

    public static void main(String[] args) {
        Enstrument guitar = new Enstrument("Valencia acoustic guitar", 500, "red", 250685);
        Enstrument piano = new Enstrument("Yamaha Digital 61 piano ", 8000, "black", 562740);
        //UZUN YOL
       /*Enstrument piano=new Enstrument();
       piano.brand="Yamaha Digital 61 Piano";
       piano.price=8000;
       piano.color="black";
       piano.serialNumber=562740;*/

        Enstrument[] enstruments = {piano, guitar};

        for (Enstrument enstrument : enstruments) {
            System.out.println(enstrument.brand);
        }
        enstrumentManager enstrumentmanager = new enstrumentManager();
        enstrumentmanager.addToCart(piano);
        enstrumentmanager.addToCart(guitar);
        enstrumentmanager.deleteToCart(piano);
        enstrumentmanager.deleteToCart(guitar);

    }
}
