
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


/**
 *
 * @author Jana
 */
public class DatabaseProject {

    public static void main(String[] args) throws Exception{
        ConnectionProvider.initilize();
        Runtime.getRuntime().addShutdownHook(
                new Thread(
                        new Runnable(){
                            public void run(){
                                try{
                                ConnectionProvider.getCon().close();
                                }catch(SQLException exception){
                                    exception.printStackTrace();
                                }
                            }
                        }
                )
        );
        new Signup().setVisible(true);
    }
}
