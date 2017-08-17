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
    mHeroes = new ArrayList<Hero>();

  }
}
