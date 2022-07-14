import java.util.*;
import java.util.function.Consumer;
import java.util.function.*;
import java.util.stream.*;

import javax.sql.rowset.spi.SyncResolver;


public class Test {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 4, 5, 6, 2, 9, 8, 10);
        

        System.out.println(list.stream().map(i -> i*2).filter(i->i%2==0).findFirst());
        
    
    }
}

