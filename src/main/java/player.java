package otry;
public class player 
{
    protected String name;
    protected int age;
    protected String nation;
    public player() { }
    public player(String name1, int age1, String nation1)
		{
			name = name1;
			age = age1;
			nation = nation1;
		}
    public void change_name(String name1){name=name1;}
    public void change_age(int age1){age=age1;}
    public void change_nation(String nation1){nation=nation1;}
    public String return_name(){return name;}
    public String return_nation(){return nation;}
    public int return_age(){return age;}
}
