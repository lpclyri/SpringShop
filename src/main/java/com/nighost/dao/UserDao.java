package com.nighost.dao;

import com.nighost.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void save(User user) {
        getCurrentSession().save(user);
    }

    public User getById(int id) {
        return (User) getCurrentSession().createCriteria(User.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
    }

    public List<User> getAllUser() {
        String hql = "from users";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();
    }
}
