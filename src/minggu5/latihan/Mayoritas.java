package minggu5.latihan;

public class Mayoritas {
    String[] hasilSuara;
    
    public Mayoritas(int panjang) {
        hasilSuara = new String[panjang];
    }

    public String cariMayoritas(String[] hasilSuara, int first, int last) {
        if (first == last) {
            return hasilSuara[first];
        } else {
            int middle = (first + last) / 2;
            String temp1 = cariMayoritas(hasilSuara, first, middle);
            String temp2 = cariMayoritas(hasilSuara, middle + 1, last);
            String nm = "No Mayoritas";
            if (temp1.equalsIgnoreCase(nm)) return temp2;
            if (temp2.equalsIgnoreCase(nm)) return temp1;
            return (temp1.equalsIgnoreCase(temp2) ? temp1 : nm);
        }
    }
}
