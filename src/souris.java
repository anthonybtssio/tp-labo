public class Souris {
    private static final int AGE_DEFAUT = 0;
    private static final int ESPERANCE_VIE_DEFAUT = 36;
    private String couleur;
    private int age;
    private int poids;
    private int esperanceVie;
    private boolean clonee;

    // Constructeur
public Souris( int poids, String couleur, int age) {

    this.poids = poids;
    this.couleur = couleur;
    this.age = age;

    this.esperanceVie = ESPERANCE_VIE_DEFAUT;

    System.out.println("Une nouvelle souris !");

}

public Souris( int poids, String couleur) {

    this.poids = poids;
    this.couleur = couleur;

    this.age = 0;


    this.esperanceVie = ESPERANCE_VIE_DEFAUT;

    System.out.println("Une nouvelle souris !");

}

public Souris(Souris autreSouris) {

    this.poids = autreSouris.poids;
    this.couleur = autreSouris.couleur;

    this.age = 0;
    this. 


    this.esperanceVie = ESPERANCE_VIE_DEFAUT;

    System.out.println("Une nouvelle souris !");

}










}