package otry;
public class league 
{	
private String name;
private int value_of_teams;
private String years;
private String location;
//////////////////////////func

public league() { }


public league(String name1, int value_of_teams1, String  years1, String location1)
{
	name = name1;
	value_of_teams = value_of_teams1;
	years = years1;
	location = location1;
}
public league(String name1) {name = name1; }
public void change_name(String name1)
{
name = name1;
}
public void change_value(int value)
{
value_of_teams = value;
}
public void change_years(String years1)
{
years = years1;
}
public void change_loc(String location1)
{
location = location1;
}
public String return_name()
{
return name;
}
public int return_value()
{
return value_of_teams;
}
public String return_years()
{
return years;
}
public String return_location()
{
return location;
}
//~league();

public void vivod() { System.out.println( name+" "+ value_of_teams + " " + years + " " + location+"\n"); }

}
