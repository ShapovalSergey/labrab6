import java.util.Scanner;
public class Program {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
public static void input_full_league(league a)
        {
            string im, loc, season; int i;
            System.out.print("Введите название лиги\n");
            im = in.nextLine();
            a.change_name(im);
            System.out.print("Введите количество команд\n");
           i=in.nextInt();
            a.change_value(i);
            System.out.print("Введите сезон лиги\n");
            season = in.nextLine();
            a.change_years(season);
            System.out.print("Введите страну лиги\n");
            loc = in.nextLine();
            a.change_loc(loc);
        }

        public static void input_full_team(team a)
        {
            string im, loc; int i;
            System.out.print("Введите название команды\n");
            im = in.nextLine();
            a.change_name(im);
            System.out.print("Введите количество побед\n");
            i = in.nextInt();
            a.change_wins(i);
            System.out.print("Введите количество поражений\n");
            i = in.nextInt();
            a.change_defeats(i);
            System.out.print("Введите количество ничьих\n");
            i = in.nextInt();
            a.change_draws(i);
            System.out.print("Введите количество полевых игроков\n");
            i = in.nextInt();
            a.change_value_of_field_players(i);
            System.out.print("Введите количество вратарей\n");
            i = in.nextInt();
            a.change_value_of_goalkeepers(i);
            System.out.print("Введите город команды\n");
            loc = in.nextLine();
            a.change_location(loc);
        }

        public static void input_full_gp(goalkeeper a)
        {
            string im, loc; int i;
            System.out.print("Введите имя вратаря\n");
            im = in.nextLine();
            a.change_name(im);
            System.out.print("Введите возраст\n");
            i = in.nextInt();
            a.change_age(i);
            System.out.print("Введите количество голов вратаря\n");
            i = in.nextInt();
            a.change_goals(i);
            System.out.print("Введите количество асистов вратаря\n");
            i = in.nextInt();
            a.change_assists(i);
            System.out.print("Введите количество красных карточек\n");
            i = in.nextInt();
            a.change_red_cards(i);
            System.out.print("Введите количество желтых карточек\n");
            i = in.nextInt();
            a.change_yellow_cards(i);
            System.out.print("Введите количество пропущенных мячей\n");
            i = in.nextInt();
            a.change_missed_balls(i);
            System.out.print("Введите национальность вратаря\n");
            loc = in.nextLine();
            a.change_nation(loc);
            System.out.print("Введите вес вратаря\n");
            i = in.nextInt();
            a.change_weight(i);
            System.out.print("Введите рост вратаря\n");
            i = in.nextInt();
            a.change_height(i);
        }

        public static void input_full_fp(field_player a)
        {
            string im, loc; int i; string pos;
            System.out.print("Введите имя полевого игрока\n");
            im = in.nextLine();
            a.change_name(im);
            System.out.print("Введите возраст\n");
            i = in.nextInt();
            a.change_age(i);
            System.out.print("Введите количество голов полевого игрока\n");
            i = in.nextInt();
            a.change_goals(i);
            System.out.print("Введите количество асистов полевого игрока\n");
            i = in.nextInt();
            a.change_assists(i);
            System.out.print("Введите количество красных карточек\n");
            i = in.nextInt();
            a.change_red_cards(i);
            System.out.print("Введите количество желтых карточек\n");
            i = in.nextInt();
            a.change_yellow_cards(i);
            System.out.print("Введите позицию\n");
            pos = in.nextLine();
            a.change_position(pos);
            System.out.print("Введите национальность полевого игрока\n");
            loc = in.nextLine();
            a.change_nation(loc);
            System.out.print("Введите вес полевого игрока\n");
            i = in.nextInt();
            a.change_weight(i);
            System.out.print("Введите рост полевого игрока\n");
            i = in.nextInt();
            a.change_height(i);
        }

        public static void input_full_game(game a)
        {
            string im;
            System.out.print("Введите название лиги\n");
            im = in.nextLine();
            a.change_name(im);
            System.out.print("Введите команду - хозяев\n");
            im = in.nextLine();
            a.change_home_team(im);
            System.out.print("Введите команду - гостей\n");
            im = in.nextLine();
            a.change_visitor_team(im);
            System.out.print("Введите результат матч\n");
            im = in.nextLine();
            a.change_result(im);
        }

        public static void func1()
        {
            int check = 1;  int action; league a = new league();
            while (check == 1)
            {
                System.out.print("Выберите, что вы хотите сделать\n1)Ввести данные лиги\n2)Изменить имя лиги\n3)Изменить количество команд\n4)Изменить сезон лиги\n5)Изменить страну лиги\n6)Вывести данные лиги\n");
                action = in.nextInt();
                if (action == 1)
                {
                    input_full_league(a);
                }
                if (action == 2)
                {
                    string im;
                    System.out.print("Введите название лиги\n");
                    im = in.nextLine();
                    a.change_name(im);
                }
                if (action == 3)
                {
                    int i;
                    System.out.print("Введите количество команд\n");
                    i = in.nextInt();
                    a.change_value(i);
                }
                if (action == 4)
                {
                    string season;
                    System.out.print("Введите сезон лиги\n");
                    season = in.nextLine();
                    a.change_years(season);
                }
                if (action == 5)
                {
                    string loc;
                    System.out.print("Введите страну лиги\n");
                    loc = in.nextLine();
                    a.change_loc(loc);
                }
                if (action == 6)
                {
                    a.vivod();
                }
                Console.ReadKey();
                System.out.print("\nВы хотите продолжить с этим классом? 1 - да, 0 - нет ");
                check = in.nextInt();
            }
        }

        public static void func2()
        {
            int check = 1;  int action; team a=new team();
            while (check == 1)
            {
               
           
                    System.out.print("Выберите, что вы хотите сделать\n1)Ввести данные команды\n2)Изменить название команды\n3)Изменить количество побед команды\n4)Изменить количество поражений команды\n5)Изменить количество ничьих команды\n6)Изменить количество полевых игроков\n7)Изменить количество вратарей\n8)Изменить город команды\n9)Вывести данные команды\n");
                    action=in.nextInt();
                    if (action == 1)
                    {
                        input_full_team(a);
                    }
                    if (action == 2)
                    {
                        string im;
                        System.out.print("Введите название команды\n");
                        im=in.nextLine();
                        a.change_name(im);
                    }
                    if (action == 3)
                    {
                        int i;
                        System.out.print("Введите количество побед\n");
                        i= in.nextInt();
                        a.change_wins(i);
                    }
                    if (action == 4)
                    {
                        int i;
                        System.out.print("Введите количество поражений\n");
                    i = in.nextInt();
                    a.change_defeats(i);
                    }
                    if (action == 5)
                    {
                        int i;
                        System.out.print("Введите количество ничьих\n");
                    i = in.nextInt();
                    a.change_draws(i);
                    }
                    if (action == 6)
                    {
                        int i;
                        System.out.print("Введите количество полевых игроков\n");
                    i = in.nextInt();
                    a.change_value_of_field_players(i);
                    }
                    if (action == 7)
                    {
                        int i;
                        System.out.print("Введите количество вратарей\n");
                    i = in.nextInt();
                    a.change_value_of_goalkeepers(i);
                    }
                    if (action == 8)
                    {
                        string loc;
                        System.out.print("Введите город команды\n");
                        loc=in.nextLine();
                        a.change_location(loc);
                    }
                    if (action == 9)
                    {
                        a.vivod();
                    }
                Console.ReadKey();
                System.out.print("\nВы хотите продолжить с этим классом? 1 - да, 0 - нет ");
                check = in.nextInt();
            }
}


        public static void func3()
        {
            int check = 1;  int action; goalkeeper a=new goalkeeper();
            while (check == 1)
            {
                    System.out.print("Выберите, что вы хотите сделать\n1)Ввести  данные вратаря\n2)Изменить имя вратаря\n3)Изменить возраст вратаря\n4)Изменить количество голов вратаря\n5)Изменить количество асистов вратаря\n6)Изменить количество красных карточек\n7)Изменить количество желтых карточек\n8)Изменить количество пропущенных мячей\n9)Изменить национальность вратаря\n10)Изменить вес вратаря\n11)Изменить рост вратаря\n12)Вывести данные вратаря\n");
                action = in.nextInt();
                if (action == 1)
                    {
                        input_full_gp(a);
                    }
                    if (action == 2)
                    {
                        string im;
                        System.out.print("Введите имя вратаря\n");
                       im =in.nextLine();
                        a.change_name(im);
                    }
                    if (action == 3)
                    {
                        int i;
                        System.out.print("Введите возраст\n");
                    i = in.nextInt();
                    a.change_age(i);
                    }
                    if (action == 4)
                    {
                        int i;
                        System.out.print("Введите количество голов вратаря\n");
                    i = in.nextInt();
                    a.change_goals(i);
                    }
                    if (action == 5)
                    {
                        int i;
                        System.out.print("Введите количество асистов вратаря\n");
                    i = in.nextInt();
                    a.change_assists(i);
                    }
                    if (action == 6)
                    {
                        int i;
                        System.out.print("Введите количество красных карточек\n");
                    i = in.nextInt();
                    a.change_red_cards(i);
                    }
                    if (action == 7)
                    {
                        int i;
                        System.out.print("Введите количество желтых карточек\n");
                    i = in.nextInt();
                    a.change_yellow_cards(i);
                    }
                    if (action == 8)
                    {
                        int i;
                        System.out.print("Введите количество пропущенных мячей\n");
                    i = in.nextInt();
                    a.change_missed_balls(i);
                    }
                    if (action == 9)
                    {
                        string loc;
                        System.out.print("Введите национальность вратаря\n");
                        loc=in.nextLine();
                        a.change_nation(loc);
                    }
                    if (action == 10)
                    {
                        int i;
                        System.out.print("Введите вес вратаря\n");
                    i = in.nextInt();
                    a.change_height(i);
                    }
                    if (action == 11)
                    {
                        int i;
                        System.out.print("Введите рост вратаря\n");
                    i = in.nextInt();
                    a.change_height(i);
                    }
                    if (action == 12)
                    {
                        a.vivod();
                    }
                Console.ReadKey();
                    System.out.print("\nВы хотите продолжить с этим классом? 1 - да, 0 - нет ");
                check = in.nextInt();
            }
                
        }

        public static void func4()
        {
            int check = 1;  int action; field_player a=new field_player();
            while (check == 1)
            {
               
                
                    System.out.print("Выберите, что вы хотите сделать\n1)Ввести  данные полевого игрока\n2)Изменить имя полевого игрока\n3)Изменить возраст полевого игрока\n4)Изменить количество голов полевого игрока\n5)Изменить количество асистов полевого игрока\n6)Изменить количество красных карточек\n7)Изменить количество желтых карточек\n8)Изменить позицию\n9)Изменить национальность полевого игрока\n10)Изменить вес полевого игрока\n11)Изменить рост полевого игрока\n12)Вывести данные полевого игрока\n");
                action = in.nextInt();
                if (action == 1)
                    {
                        input_full_fp(a);
                    }
                    if (action == 2)
                    {
                        string im;
                        System.out.print("Введите имя полевого игрока\n");
                        im=in.nextLine();
                        a.change_name(im);
                    }
                    if (action == 3)
                    {
                        int i;
                        System.out.print("Введите возраст\n");
                    i = in.nextInt();
                    a.change_age(i);
                    }
                    if (action == 4)
                    {
                        int i;
                        System.out.print("Введите количество голов полевого игрока\n");
                    i = in.nextInt();
                    a.change_goals(i);
                    }
                    if (action == 5)
                    {
                        int i;
                        System.out.print("Введите количество асистов полевого игрока\n");
                    i = in.nextInt();
                    a.change_assists(i);
                    }
                    if (action == 6)
                    {
                        int i;
                        System.out.print("Введите количество красных карточек\n");
                    i = in.nextInt();
                    a.change_red_cards(i);
                    }
                    if (action == 7)
                    {
                        int i;
                        System.out.print("Введите количество желтых карточек\n");
                    i = in.nextInt();
                    a.change_yellow_cards(i);
                    }
                    if (action == 8)
                    {
                        string pos;
                        System.out.print("Введите позицию\n");
                       pos =in.nextLine();
                        a.change_position(pos);
                    }
                    if (action == 9)
                    {
                        string loc;
                        System.out.print("Введите национальность полевого игрока\n");
                        loc=in.nextLine();
                        a.change_nation(loc);
                    }
                    if (action == 10)
                    {
                        int i;
                        System.out.print("Введите вес полевого игрока\n");
                    i = in.nextInt();
                    a.change_height(i);
                    }
                    if (action == 11)
                    {
                        int i;
                        System.out.print("Введите рост полевого игрока\n");
                    i = in.nextInt();
                    a.change_height(i);
                    }
                    if (action == 12)
                    {
                        a.vivod();
                    }
                Console.ReadKey();
                    System.out.print("\nВы хотите продолжить с этим классом? 1 - да, 0 - нет ");
                check = in.nextInt();
            }
        }

        public static void func5()
        {
            int check = 1;  int action;game a=new game();
            while (check == 1)
            {
                    System.out.print("Выберите, что вы хотите сделать\n1)Ввести данные матча\n2)Изменить название лиги\n3)Изменить команду - хозяев\n4)Изменить команду - гостей\n5)Изменить результат матча\n6)Вывести данные матча\n");
                action = in.nextInt();
                if (action == 1)
                    {
                        input_full_game(a);
                    }
                    if (action == 2)
                    {
                        string im;
                        System.out.print("Введите название лиги\n");
                    im = in.nextLine();
                    a.change_name(im);
                    }
                    if (action == 3)
                    {
                        string im;
                        System.out.print("Введите команду - хозяев\n");
                    im = in.nextLine();
                    a.change_home_team(im);
                    }
                    if (action == 4)
                    {
                        string im;
                        System.out.print("Введите команду - гостей\n");
                        im=in.nextLine();
                        a.change_visitor_team(im);
                    }
                    if (action == 5)
                    {
                        string im;
                        System.out.print("Введите результат матч\n");
                       im =in.nextLine();
                        a.change_result(im);
                    }
                    if (action == 6)
                    {
                        a.vivod();
                    }
                Console.ReadKey();
                    System.out.print("\nВы хотите продолжить с этим классом? 1 - да, 0 - нет ");
                check = in.nextInt();
            }
        }
        static void Main(string[] args)
        {
            int mode; int check = 1;
            while (check == 1)
            {
               System.out.print("Выберите с каким классом вы хотите работать\n1)Лига\n2)Команда\n3)Вратари\n4)Полевые\n5)Игры\n");
                mode = in.nextInt();
                if (mode == 1)
                {
                    func1();
                }
                if (mode == 2)
                {
                    func2();
                }
                if (mode == 3)
                {
                    func3();
                }
                if (mode == 4)
                {
                    func4();
                }
                if (mode == 5)
                {
                    func5();
                }
                System.out.print("Вы хотите продолжить? 1 - да, 0 - нет ");
               // check = in.nextInt();
            }
            Console.ReadKey();
        in.close();

	}

}
