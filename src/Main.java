public class Main {
    public static void main(String[] args)


    {
        var dog = 8.0;
        System.out.println("имя переменной "+dog);
        var cat = 3.6;
        System.out.println("имя переменной "+cat);
        var paper = 763789;
        System.out.println("имя переменной "+paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight+boxer2Weight;
        System.out.println("общая масса "+ totalWeight + " кг");
        var difference = boxer1Weight-boxer2Weight;
        System.out.println("разница между боксерами "+ difference+ " кг");
        var overweight = boxer2Weight % boxer1Weight;
        System.out.println("Остаток от деления равен " +overweight);
        var totalworkinghours = 640;
        var personworkinghours = 8;
        var person = totalworkinghours/personworkinghours;
        System.out.println("Всего работников в компании - "+person+ " человек");
        person = person + 94;
        var newworkinghours = person * personworkinghours;
        System.out.println("Если в компании работет "+person+ " человек, то всего "+newworkinghours+ " часов работы может быть поделено между сотрудниками");






    }
}