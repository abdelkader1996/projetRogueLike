package classes;

public class Monde {
    private int largeur;
    int hauteur;
    int[][] map;

    public Monde(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        map=new int[hauteur][largeur];

        for (int i=0 ;i<hauteur ;i++){
          for (int j=0 ;j<largeur ; j++){
              map[i][j]=0;
          }
        }
    }


    public int[][] getMap() {
        return map;
    }

    public void afficher(){
        for (int i=0 ;i<hauteur ;i++){
            for (int j=0 ;j<largeur ; j++){
                System.out.print(map[i][j]=0);
            }
            System.out.println();
        }
    }


}
