package org.db.soft.base;

public class HumanDAOImpl implements HumanDAO {
		@Override
		public boolean UserLogin ( String userName , String userPassword ) {
				boolean b = false;
				if ( userName.equalsIgnoreCase ( "dage" ) ) {
						if ( userPassword.equalsIgnoreCase ( "123" ) ) {
								b = true;
						}
				}
				return b;
		}
}
