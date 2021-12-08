
import otry.*;
import java.util.Scanner;
public class Program 
{
static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
        {
            int mode; int check = 1; 
            while (check == 1)
            {
               System.out.print("Выберите с каким классом вы хотите работать\n1)Лига\n2)Команда\n3)Вратари\n4)Полевые\n5)Nгры\n");
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
                check = in.nextInt();
            }
          
        in.close();

	}
	
public static void input_full_league(league a)
        {
            String im, loc, season; int i;
            System.out.print("Введите название лиги\n");
            in.nextLine();im = in.nextLine();
			
            a.change_name(im);
            System.out.print("Введите количество команд\n");
           i=in.nextInt();
		   in.nextLine();
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
            String im, loc; int i;
            System.out.print("Введите название команды\n");
            in.nextLine();im = in.nextLine();
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
            in.nextLine();loc = in.nextLine();
            a.change_location(loc);
        }

        public static void input_full_gp(goalkeeper a)
        {
            String im, loc; int i;
            System.out.print("Введите имя вратаря\n");
            in.nextLine();im = in.nextLine();
            a.change_name(im);
			System.out.print("Введите количество матчей вратаря\n");
            i = in.nextInt();
            a.change_games(i);
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
            in.nextLine();loc = in.nextLine();
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
            String im, loc; int i; String pos;
            System.out.print("Введите имя полевого игрока\n");
            in.nextLine();im = in.nextLine();
            a.change_name(im);System.out.print("Введите количество матчей полевого игрока\n");
            i = in.nextInt();
            a.change_games(i);
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
            System.out.print("Введите позицию\n");in.nextLine();
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
            String im;
            System.out.print("Введите название лиги\n");
            in.nextLine();im = in.nextLine();
            a.change_name(im);
            System.out.print("Введите команду - хозяев\n");
            in.nextLine();im = in.nextLine();
            a.change_home_team(im);
            System.out.print("Введите команду - гостей\n");
            in.nextLine();im = in.nextLine();
            a.change_visitor_team(im);
            System.out.print("Введите результат матч\n");
            in.nextLine();im = in.nextLine();
            a.change_result(im);
        }

        public static void func1()
        {
            int check = 1;  int action; league a = new league();
            while (check == 1)
            {
                System.out.print("Выберите, что вы хотите сделать\n1)Ввести данные лиги\n2)Nзменить имя лиги\n3)Nзменить количество команд\n4)Nзменить сезон лиги\n5)Nзменить страну лиги\n6)Вывести данные лиги\n");
                action = in.nextInt();
                if (action == 1)
                {
                    input_full_league(a);
                }
                if (action == 2)
                {
                    String im;
                    System.out.print("Введите название лиги\n");
                    in.nextLine();im = in.nextLine();
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
                    String season;
                    System.out.print("Введите сезон лиги\n");
                    in.nextLine();season = in.nextLine();
                    a.change_years(season);
                }
                if (action == 5)
                {
                    String loc;
                    System.out.print("Введите страну лиги\n");
                    in.nextLine();loc = in.nextLine();
                    a.change_loc(loc);
                }
                if (action == 6)
                {
                    a.vivod();
                }
              
                System.out.print("\nВы хотите продолжить с этим классом? 1 - да, 0 - нет ");
                check = in.nextInt();
            }
        }

        public static void func2()
        {
            int check = 1;  int action; team a=new team();
            while (check == 1)
            {
               
           
                    System.out.print("Выберите, что вы хотите сделать\n1)Ввести данные команды\n2)Nзменить название команды\n3)Nзменить количество побед команды\n4)Nзменить количество поражений команды\n5)Nзменить количество ничьих команды\n6)Nзменить количество полевых игроков\n7)Nзменить количество вратарей\n8)Nзменить город команды\n9)Вывести данные команды\n");
                    action=in.nextInt();
                    if (action == 1)
                    {
                        input_full_team(a);
                    }
                    if (action == 2)
                    {
                        String im;
                        System.out.print("Введите название команды\n");
                        in.nextLine();im = in.nextLine();
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
                        String loc;
                        System.out.print("Введите город команды\n");
                        in.nextLine();loc = in.nextLine();
                        a.change_location(loc);
                    }
                    if (action == 9)
                    {
                        a.vivod();
                    }
              
                System.out.print("\nВы хотите продолжить с этим классом? 1 - да, 0 - нет ");
                check = in.nextInt();
            }
}


        public static void func3()
        {
            int check = 1;  int action; goalkeeper a=new goalkeeper();
            while (check == 1)
            {
                    System.out.print("Выберите, что вы хотите сделать\n1)Ввести  данные вратаря\n2)Nзменить имя вратаря\n3)Nзменить возраст вратаря\n4)Nзменить количество голов вратаря\n5)Nзменить количество асистов вратаря\n6)Nзменить количество красных карточек\n7)Nзменить количество желтых карточек\n8)Nзменить количество пропущенных мячей\n9)Nзменить национальность вратаря\n10)Nзменить вес вратаря\n11)Nзменить рост вратаря\n12)Вывести данные вратаря\n");
                action = in.nextInt();
                if (action == 1)
                    {
                        input_full_gp(a);
                    }
                    if (action == 2)
                    {
                        String im;
                        System.out.print("Введите имя вратаря\n");
                       in.nextLine();im = in.nextLine();
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
                        String loc;
                        System.out.print("Введите национальность вратаря\n");
                        in.nextLine();loc = in.nextLine();
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
              
                    System.out.print("\nВы хотите продолжить с этим классом? 1 - да, 0 - нет ");
                check = in.nextInt();
            }
                
        }

        public static void func4()
        {
            int check = 1;  int action; field_player a=new field_player();
            while (check == 1)
            {
               
                
                    System.out.print("Выберите, что вы хотите сделать\n1)Ввести  данные полевого игрока\n2)Nзменить имя полевого игрока\n3)Nзменить возраст полевого игрока\n4)Nзменить количество голов полевого игрока\n5)Nзменить количество асистов полевого игрока\n6)Nзменить количество красных карточек\n7)Nзменить количество желтых карточек\n8)Nзменить позицию\n9)Nзменить национальность полевого игрока\n10)Nзменить вес полевого игрока\n11)Nзменить рост полевого игрока\n12)Вывести данные полевого игрока\n");
                action = in.nextInt();
                if (action == 1)
                    {
                        input_full_fp(a);
                    }
                    if (action == 2)
                    {
                        String im;
                        System.out.print("Введите имя полевого игрока\n");
                        in.nextLine();im = in.nextLine();
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
                        String pos;
                        System.out.print("Введите позицию\n");in.nextLine();
                       pos =in.nextLine();
                        a.change_position(pos);
                    }
                    if (action == 9)
                    {
                        String loc;
                        System.out.print("Введите национальность полевого игрока\n");
                        in.nextLine();loc = in.nextLine();
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
              
                    System.out.print("\nВы хотите продолжить с этим классом? 1 - да, 0 - нет ");
                check = in.nextInt();
            }
        }

        public static void func5()
        {
            int check = 1;  int action;game a=new game();
            while (check == 1)
            {
                    System.out.print("Выберите, что вы хотите сделать\n1)Ввести данные матча\n2)Nзменить название лиги\n3)Nзменить команду - хозяев\n4)Nзменить команду - гостей\n5)Nзменить результат матча\n6)Вывести данные матча\n");
                action = in.nextInt();
                if (action == 1)
                    {
                        input_full_game(a);
                    }
                    if (action == 2)
                    {
                        String im;
                        System.out.print("Введите название лиги\n");
                    in.nextLine();im = in.nextLine();
                    a.change_name(im);
                    }
                    if (action == 3)
                    {
                        String im;
                        System.out.print("Введите команду - хозяев\n");
                    in.nextLine();im = in.nextLine();
                    a.change_home_team(im);
                    }
                    if (action == 4)
                    {
                        String im;
                        System.out.print("Введите команду - гостей\n");
                        in.nextLine();im = in.nextLine();
                        a.change_visitor_team(im);
                    }
                    if (action == 5)
                    {
                        String im;
                        System.out.print("Введите результат матч\n");
                       in.nextLine();im = in.nextLine();
                        a.change_result(im);
                    }
                    if (action == 6)
                    {
                        a.vivod();
                    }
              
                    System.out.print("\nВы хотите продолжить с этим классом? 1 - да, 0 - нет ");
                check = in.nextInt();
            }
        }
	
	

}



