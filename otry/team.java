package otry;
public class team 
{
	private String name;
	private int wins;
	private int defeats;
	private int draws;
	private int value_of_field_players;
	private int value_of_goalkeepers;
	private String location;
	//////////////////////////func
	public team() { }
	public team(String name1, int wins1, int defeats1, int draws1, int val_of_fp, int val_of_gk, String location1) 
{

		name = name1;
		wins = wins1;
	defeats = defeats1;
	draws = draws1;
	value_of_field_players = val_of_fp;
	value_of_goalkeepers = val_of_gk;
		location = location1;
	}
 public void change_name(String name1)
{
		name = name1;
}
 public void change_defeats(int defeats1)
{
	defeats = defeats1;
}
 public void change_draws(int draws1)
{
	draws = draws1;
}
 public void change_value_of_field_players(int value_of_field_players1)
{
	value_of_field_players = value_of_field_players1;
}
 public void change_value_of_goalkeepers(int value_of_goalkeepers1)
{
	value_of_goalkeepers = value_of_goalkeepers1;
}
 public void change_wins(int wins1)
{
	wins = wins1;
}
 public void change_location(String location1)
{
	location = location1;
}
	public String return_name() { return name; }
	public int return_defeats() { return defeats; }
	public int return_wins() { return wins; }
	public int return_draws() { return draws; }
	public int return_value_of_field_players() { return value_of_field_players; }
	public int return_value_of_goalkeepers() { return value_of_goalkeepers; }
	public String return_location() { return location; }
 public void vivod() { System.out.println( name + " " + defeats+" "+ wins+" "+ draws+" "+ value_of_field_players+" "+ value_of_goalkeepers+" "+ location+"\n"); }
}
