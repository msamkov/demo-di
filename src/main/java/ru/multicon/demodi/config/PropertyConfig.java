package ru.multicon.demodi.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.multicon.demodi.datasource.FakeDataSource;
import ru.multicon.demodi.datasource.FakeJmsBroker;

/**
 * Created by msamkov on 07.06.2018
 */
@Configuration
public class PropertyConfig {

    @Value("${postgres.username}")
    String user;

    @Value("${postgres.password}")
    String password;

    @Value("${postgres.dburl}")
    String url;


    @Value("${jms.username}")
    String jmsUser;

    @Value("${jms.password}")
    String jmsPpassword;

    @Value("${jms.dburl}")
    String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }


    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUser);
        fakeJmsBroker.setPassword(jmsPpassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

}
