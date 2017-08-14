import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hero {
  private String mName;
  private LocalDateTime mmCreatedAt;
  private static List<Hero> instances = new ArrayList<Hero>();
  private int mAge;
  private String mSpower;
  private String mWeakness;
  private int mId;

  //Constructors.
  public Hero(String name, int age, String spower, String weakness) {
    mName = name;
    mAge = age;
    mSpower = spower;
    mWeakness = weakness;
    mCreatedAt = LocalDateTime.now();
    instances.add(this);
    mId = instancees.size();
  }
}
