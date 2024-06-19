package day0619.set;

import java.util.Objects;

public class Member {
    private String name;
    private int age;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member member)) return false;
        return age == member.age && Objects.equals(name, member.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    @Override
    public int hashCode() {
        int i = name.hashCode() + age;
        System.out.println(i);
        return i;
    }

    //public class Member {
    //  private String name;
    //  private int age;
    //
    //  public Member(String name, int age) {
    //    this.name = name;
    //    this.age = age;
    //  }
    //
    //  @Override
    //  public boolean equals(Object o) {
    //    if (o instanceof Member) {
    //      Member member = (Member) o;
    //      return member.name.equals(this.name) && member.age == this.age;
    //      //
    //    } else {
    //      return false;
    //    }
    //  }
    //
    //  @Override
    //  public int hashCode() {
    //    int i = name.hashCode() + age;
    //    System.out.println(i);
    //    return i;
    //  }
    //}
}
