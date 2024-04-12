public class Main {
        public static void main(String[] args) {

            Filme filme1 = new Filme(" Os Vingadores", 142);
            filme1.exDurahrs();


            Filme filme2 = new Filme(" Hotel Transilvânia", 93);
            filme2.exDurahrs();

            System.out.println("");
            

            System.out.println("Os filmes em cartaz são " + filme1.getTitulo() + " e " + filme2.getTitulo());
            
            System.out.println("");

            Filme filme3 = new Filme(" Ghostbusters: frozen empire", 120);
            filme3.exDurahrs();
    
            Filme filme4 = new Filme(" Godzilla e kong: o novo império", 115);
            filme4.exDurahrs();
    
            Filme filme5 = new Filme(" Kung Fu Panda 4", 94);
            filme5.exDurahrs();
    
            Filme filme6 = new Filme(" Suga - agust d tour 'd-day' the movie", 90);
            filme6.exDurahrs();
    
            Filme filme7 = new Filme(" Duna 2", 167);
            filme7.exDurahrs();
            
            System.out.println("");

            System.out.println("Os filmes em cartaz são " + filme3.getTitulo() + ", " + filme4.getTitulo() + " e " + filme5.getTitulo());
        }
}
