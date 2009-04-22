package edu.umn.grounder.core;

import edu.umn.grounder.LogicContext;

public interface IObjectTermCollection extends IObjectTermContainer, ITermCollection {
	public void init(LogicContext language);
}
