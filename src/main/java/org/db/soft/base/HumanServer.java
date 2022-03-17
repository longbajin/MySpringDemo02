package org.db.soft.base;

import lombok.Setter;

@Setter
public class HumanServer {
		private HumanDAO humanDAO;

		public void Login ( ) {
				boolean b = humanDAO.UserLogin ( "dage" , "123" );
				if ( b ) {
						System.out.println ( "Login Success" );
				} else {
						System.out.println ( "Login Defeated" );
				}
		}
}
