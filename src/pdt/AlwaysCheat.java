/*
 * Edit history:
 *   Lin, 4/7: created
 *   
 *
*/
package pdt;

import java.util.ArrayList;

public class AlwaysCheat extends Strategy{
    public AlwaysCheat(Prisoner owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	@Override
    public boolean execute(ArrayList<Boolean> cooperateHistory) {
        return false;
    }
}
