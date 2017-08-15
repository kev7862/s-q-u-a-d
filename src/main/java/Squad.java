import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Squad {
  private String mName;
  private static List<Squad> instances = new ArrayList<Squad>();
  private int mid;
  private List<Hero> mHeroes;

//constructor
  public Squad (String name) {
    mName = name;
    instances.add(this); // instances appear before mId
    mId = instances.size();
    mHeroes = new ArrayList<Hero>();

    //=====implements getName()
public String getName() {
  return mName;
}

//======implements all()
public static List<Squad> all() {
   return instances;
 }
//=====implements clear()
 public static void clear() {
   instances.clear();
 }

 public int getId() {
   return mId;
 }

 public static Squad find(int id) {
   return instances.get(id - 1);
 }

 public List<Hero> getHeroes() {
   return mHeroes;
 }

 public void addHero(Hero hero) {
  mHeroes.add(hero);

  }
}
