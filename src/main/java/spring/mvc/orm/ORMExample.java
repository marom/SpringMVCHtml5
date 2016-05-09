package spring.mvc.orm;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import spring.mvc.bean.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by maro on 09/05/16.
 */
@Repository
@Transactional
public class ORMExample {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> queryFindAllUsersJPA() {

        System.out.println("Query find all users");
        String qlString = "from User order by idUser";
        TypedQuery<User> query = entityManager.createQuery(qlString, User.class);
        return query.getResultList();
    }

    public User queryFindByIdUser(int idUser) {
        System.out.println("ORMExample queryFindByIdUser is called");
        return entityManager.find(User.class,idUser);
    }

    public boolean updateUser(int idUser, boolean enabled) {
        System.out.println("ORMExample updateUser is called");
        String qlString = "update user set enabled= ? where iduser=?";
        Query query = entityManager.createNativeQuery(qlString);
        query.setParameter(1, enabled);
        query.setParameter(2, idUser);
        int result = query.executeUpdate();
        if(result>0)
            return true;
        else
            return false;
    }

    public boolean insertUser(String username, String password, boolean enabled) {

        System.out.println("ORMExample insertUserByIdUser is called");
        String qlString = "insert into user (username,password,enabled) values (?,?,?)";
        Query query = entityManager.createNativeQuery(qlString);
        query.setParameter(1, username);
        query.setParameter(2, password);
        query.setParameter(3, enabled);
        int result = query.executeUpdate();
        if(result>0)
            return true;
        else
            return false;
    }

    public boolean deleteUser(int idUser) {

        System.out.println("ORMExample insertUserByIdUser is called");
        String qlString = "delete from user where iduser=?";
        Query query = entityManager.createNativeQuery(qlString);
        query.setParameter(1, idUser);
        int result = query.executeUpdate();
        if(result>0)
            return true;
        else
            return false;
    }
}
