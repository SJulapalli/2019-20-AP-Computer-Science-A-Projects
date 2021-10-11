import java.util.*;
public class MultipleGroups implements NumberGroup
{
	private List<NumberGroup> groupList;
	
	public MultipleGroups(NumberGroup[] groups)
	{
		groupList = new ArrayList<NumberGroup>();
		for(NumberGroup ng : groups)
			groupList.add(ng);
	}
	
	/**@return true if at least one of the number groups in this
	 * 	multiple group contains num; false otherwise.
	 */
	public boolean contains(int num)
	{
		/* your code for part c goes here */
		return false; //quiets the compiler
	}

}
