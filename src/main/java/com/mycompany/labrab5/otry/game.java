package otry;
public class game {
	private String league_name;
	private String home_team;
	private String visitor_team;
	private String result;
	//////////////////////////func
	public game() { }
	public game(String name, String rez, String vis, String home)
	{
		league_name = name;
		home_team = home;
		visitor_team = vis;
		result = rez;
	}
	public void change_name(String name1)
	{
		league_name = name1;
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
	public String return_name() { return league_name; }
	public String return_home_team() { return home_team; }
	public String return_visitor_team() { return visitor_team; }
	public String return_result() { return result; }
	public void vivod() { System.out.println(league_name + " " + home_team + " " + result + " " + visitor_team + "\n"); }
}
