package lambdaexpr;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UserComparator {
    public static void main(String[] args) {
        User jogi=new User("Jogeswararao Kolla",31);
        User suma1=new User("Sumarchitha G",30);
        User suma2=new User("Sumarchitha G",25);
        User humisha=new User("Humisha Kolla",1);

        List<User> users= Arrays.asList(jogi,suma1,suma2,humisha);

        System.out.println("before sorting");
        users.forEach(u-> {
            System.out.println(u);
        });

        Comparator<User> cmp1=Comparator.comparing(user -> user.getName());

        Comparator<User> cmp2=Comparator.comparing(user -> user.getAge());

        Comparator<User>  cmp3= cmp1.thenComparing(cmp2.reversed());


        System.out.println("After sorting");
        users.sort(cmp3);
        users.forEach(u-> {
            System.out.println(u);
        });

        /* output
        before sorting
User{name='Jogeswararao Kolla', age=31}
User{name='Sumarchitha G', age=30}
User{name='Sumarchitha G', age=25}
User{name='Humisha Kolla', age=1}
After sorting
User{name='Humisha Kolla', age=1}
User{name='Jogeswararao Kolla', age=31}
User{name='Sumarchitha G', age=30}
User{name='Sumarchitha G', age=25}
         */

    }
}
