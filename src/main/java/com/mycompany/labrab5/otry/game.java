package otry;
public class game implements Cloneable
{
	public league lg;
	private String home_team;
	private String visitor_team;
	private String result;
	//////////////////////////func
	public game() { }
	public game(league lg, String rez, String vis, String home)
	{
		this.lg=lg;
		home_team = home;
		visitor_team = vis;
		result = rez;
	}
        public game(String rez) {result = rez; }
	public void change_name(String name1)
	{
		lg.change_name(name1);
	}
	public void change_home_team(String home_team1)
	{
		home_team = home_team1;
	}
	public void change_visitor_team(String visitor_team1)
	{
		visitor_team = visitor_team1;
	}
	public void change_result(String result1)
	{
		result = result1;
	}
	public String return_name() { return lg.return_name(); }
	public String return_home_team() { return home_team; }
	public String return_visitor_team() { return visitor_team; }
	public String return_result() { return result; }
	public void vivod() { System.out.println(lg.return_name() + " " + home_team + " " + result + " " + visitor_team + "\n"); }
        //public game clone() throws CloneNotSupportedException {return (game) super.clone();}
        public game clone() throws CloneNotSupportedException  { return new game(new league(lg.return_name()), return_result(),return_visitor_team(), return_home_team());}
}
