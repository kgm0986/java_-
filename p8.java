import java.util.HashSet;
import java.util.Set;

public class p8 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();
        set.add(new Member("a", 30));
        set.add(new Member("b", 30));
        set.add(new Member("c", 30));
        //System.out.println(set.size());
        Member member = new Member("a", 30);
        Member member1 = new Member("a", 30);
        Member member2 = member;
        System.out.println(member1.hashCode());
        System.out.println(member.hashCode());
        System.out.println(member2.hashCode());

    }
}
class Member{
    public String name;
    public int age;
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member) obj;
            return member.name.equals(this.name);
        }else{
            return false;
        }
    }
    @Override
    public int hashCode() {
        return name.hashCode()+age;
    }
}
