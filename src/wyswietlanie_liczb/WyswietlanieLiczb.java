package wyswietlanie_liczb;

public class WyswietlanieLiczb {

    public static void main(String[] args)
    {
        //program za pomoca funkcji do..while wyswietla liczby od 1 do 20

        int i = 0;

        System.out.println("liczby z przedziały 1-20 to:");

        do
        {
            i++;
            System.out.print(i + "" + '\t');
        }
        while(i<20);
    }
}

