import Entities.Ders;
import Entities.Konu;
import Entities.Ogrenci;
import Entities.Ogretmen;
import repositories.DersRepository;
import repositories.OgrenciRepository;
import repositories.OgretmenRepository;

import java.sql.SQLException;

public class App {
    private static final OgretmenRepository ogretmenRepository = new OgretmenRepository();
    private static final OgrenciRepository ogrenciRepository = new OgrenciRepository();
    private static final DersRepository dersRepository = new DersRepository();

    public static void main(String[] args) {

        try {
            System.out.println(ogretmenRepository.getAll());
            //System.out.println(ogretmenRepository.getById(2));
            //System.out.println(ogretmenRepository.save(new Ogretmen("Berke", true)));
            //System.out.println(ogretmenRepository.deleteById(3));

            System.out.println(ogrenciRepository.getAll());
            //System.out.println(ogrenciRepository.getById(2));
            //System.out.println(ogrenciRepository.save(new Ogrenci("Gökhan", 129, 5)));
            //System.out.println(ogrenciRepository.deleteById(7));

            System.out.println(dersRepository.getAll());
            //System.out.println(dersRepository.getById(2));
            //System.out.println(dersRepository.deleteById(1));
            //System.out.println(dersRepository.save(new Ders(new Ogretmen(1,"Ahmet",false),new Konu(3,"Network"))));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
