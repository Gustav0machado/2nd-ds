public class Filme {
    private String titulo;
    private int duraMin;

    public Filme(String titulo, int duraMin) {
        this.titulo = titulo;
        this.duraMin = duraMin;
    }

    public void exDurahrs() {
        int hrs = this.duraMin / 60;
		int min = this.duraMin % 60;
		
		if (this.duraMin < 60) {
			System.out.println("O filme"+titulo+" tem duração de " + min + " minutos.");
		} else if (minutos == 0) {
			System.out.println("O filme"+titulo+" tem duração de " + hrs + " hora(s).");
		} else {
			System.out.println("O filme"+titulo+" tem duração de " +  hrs + " hora(s) e " + min + " minuto(s).");
		}
       
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getduraMin() {
        return duraMin;
    }

    public void setduraMin(int duraMin) {
        this.duraMin= duraMin;
    }
}
