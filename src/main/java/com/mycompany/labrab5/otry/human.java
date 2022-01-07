
package otry;

public abstract class human 
{
    protected int status;
		public human(int st) { status = st; }
		int return_status() { return status; }
		public abstract String CreateStatus();
}
