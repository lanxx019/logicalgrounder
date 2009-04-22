package edu.umn.grounder.core;

import edu.umn.grounder.LogicContext;

public abstract class AbstractSort extends AbstractCoreEntity implements IObjectTermContainer {
	
	public abstract void init(LogicContext language) throws FinitenessCheckFailedException;
	
	public abstract boolean isValidIndex(int index);
}
