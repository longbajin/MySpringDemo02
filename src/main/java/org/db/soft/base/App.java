package org.db.soft.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
		public static void main ( String[] args ) {

				System.out.println ( "Hello World!" );

				//读取配置文件信息
				ApplicationContext applicationContext = new ClassPathXmlApplicationContext ( "config.xml" );

				//从  config.xml  文件读取  id  名为  “HumanServer”  的  <bean id="HumanServer"></bean>
				HumanServer humanServer = ( HumanServer ) applicationContext.getBean ( "HumanServer" );
//				Server server = applicationContext.getBean ( "HumanServer" , Server.class );
				humanServer.Login ( );
		}
}
