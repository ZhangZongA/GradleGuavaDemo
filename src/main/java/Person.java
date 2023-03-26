import com.google.common.base.Joiner;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Person {
    private String name;
    private int num;
    private static Multimap<String ,Integer> multimap= ArrayListMultimap.create();

    public Person(String name,int num){
        this.name=name;
        this.num=num;
        multimap.put(name,num);
    }

    public Object getMap()
    {
        return multimap;
    }




}
