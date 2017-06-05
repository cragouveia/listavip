package br.com.alura.listavip.conf;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Created by carlos on 04/06/2017.
 */
@Configuration
public class JPAConfiguration {

    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/listavip");
        dataSource.setUser("root");
        dataSource.setPassword("mysql");

        dataSource.setMinPoolSize(3);
        dataSource.setMaxPoolSize(5);

        dataSource.setIdleConnectionTestPeriod(1);
        return dataSource;
    }
}
