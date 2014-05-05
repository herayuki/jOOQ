/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.h2.matchers.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FAuthorExists extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 34673829;

	/**
	 * The parameter <code>PUBLIC.F_AUTHOR_EXISTS.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>PUBLIC.F_AUTHOR_EXISTS.P2</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> P2 = createParameter("P2", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647));

	/**
	 * Create a new routine call instance
	 */
	public FAuthorExists() {
		super("F_AUTHOR_EXISTS", org.jooq.examples.h2.matchers.NonPublic.NON_PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P2);
	}

	/**
	 * Set the <code>P2</code> parameter IN value to the routine
	 */
	public void setP2(java.lang.String value) {
		setValue(org.jooq.examples.h2.matchers.routines.FAuthorExists.P2, value);
	}

	/**
	 * Set the <code>P2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP2(org.jooq.Field<java.lang.String> field) {
		setField(P2, field);
	}
}