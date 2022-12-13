package FFSSM;
import java.util.*;
import java.time.*;
public class Plongeur extends Personne {
    protected int niveau;
    protected ArrayList<Licence> listeLicence= new ArrayList<Licence>();
    protected GroupeSanguin H;

    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance, int n, GroupeSanguin G){
    super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
    niveau=n;
    H=G;
    }

    public int getNiveau(){return(niveau);}
    public Licence getLicence(){return()}

    public void ajouterLicence(String numero, LocalDate delivr, Club club ){
        Licence L=new Licence(this,numero,delivr, club);
        listeLicence.add(L);}
    
    public Licence getlastlicence(){return(listeLicence.get(listeLicence.size()-1));}
}
