eam().filter(t -> t%2 == 0).reduce(0, (c,e)-> c + e).forEach(System.out::println);
        System.out