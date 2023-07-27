package co.micol.miniproject;

import co.micol.miniproject.menu.MainMenu;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	System.out.println("Start App=======");
//        DataSource.getInstance();
//        DataSource dao = DataSource.getInstance();
//        dao.getConnection();
//        System.out.println("Stop App=======");
        MainMenu menu = new MainMenu();
        menu.run();
    }
}
