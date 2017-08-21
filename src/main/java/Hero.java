import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hero {
  private static List<Hero> instances = new ArrayList<Hero>();
  private String mName;
  private LocalDateTime mCreatedAt;
  private int mAge;
  private String mSpower;
  private String mWeakness;
  private int mId;

  //Constructors.
  public Hero(String name, int age, String spower, String weakness) {
    mCreatedAt = LocalDateTime.now();
    mName = name;
    mAge = age;
    mSpower = spower;
    mWeakness = weakness;
    instances.add(this);
    mId = instances.size();
  }

  //implements getName()
public String getName() {
  return mName;
}
//implements getAge()
public int getAge() {
  return mAge;
}
//implements getSpower()
public String getSpower() {
  return mSpower;
}
//implements getWeakness()
public String getWeakness() {
  return mWeakness;
}
//implements getCreatedAt()
public LocalDateTime getCreatedAt() {
  return mCreatedAt;
}
//implements all()
public static List<Hero> all() {
  return instances;
}
//implements clear()
public static void clear() {
instances.clear();
}
//implements getId()
public int getId() {
 return mId;
}
}
