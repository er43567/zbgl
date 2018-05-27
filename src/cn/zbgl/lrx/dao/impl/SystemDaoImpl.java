package cn.zbgl.lrx.dao.impl;

import cn.zbgl.adapters.DaoAdapter;
import cn.zbgl.lrx.dao.SystemDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cn.zbgl.bean.Role;
import cn.zbgl.bean.User;

public class SystemDaoImpl extends DaoAdapter  implements SystemDao {

	public void testDao() {
		System.out.println("SystemDao层被调用，hibernateTemplate = " + hibernateTemplate);
	}
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	@Override
	public User getUserByUser_id(String user_id) {
		String hql = "from User where userId = '" + user_id + "'";
		return (User) getSession().createQuery(hql).uniqueResult();
	}

	@Override
	public Role getUserRoleByRoleId(String roleId) {
		String hql = "from Role where roleId ='" + roleId + "'";
		return (Role) getSession().createQuery(hql).uniqueResult();
	}

	@Override
	public User updateUser(User loging_user) {
		System.out.println(loging_user);
		getSession().update(loging_user);
		return loging_user;
	}


}
