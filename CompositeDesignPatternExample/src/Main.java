public class Main {
    public static void main(String[] args) {

        CompositeDealers genelMudurluk = new CompositeDealers();
        CompositeDealers bayi = new CompositeDealers();
        CompositeDealers ozelSektor = new CompositeDealers();

        genelMudurluk.add(new WorkerPerson());
        bayi.add(new WorkerPerson());
        ozelSektor.add(new WorkerPerson());

        bayi.add(genelMudurluk);
        ozelSektor.add(bayi);

        System.out.println("Genel müdürlük çalışanları maaşı: " + genelMudurluk.getMaas());
        System.out.println("Bayi çalışanları maaşı: " + bayi.getMaas());
        System.out.println("Ozel sektor çalışanları maaşı: " + ozelSektor.getMaas());

    }
}