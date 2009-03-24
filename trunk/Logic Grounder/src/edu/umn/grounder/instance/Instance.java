package edu.umn.grounder.instance;

import edu.umn.grounder.constraint.Comparable;
import edu.umn.grounder.core.AbstractSort;

public interface Instance extends Comparable {
	public AbstractSort getSortType();
	public String getName();
}
