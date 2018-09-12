package maylor.system.factory;

import maylor.system.dao.*;
import maylor.system.dao.proxy.*;

/**
 * 创建工厂类
 * 
 * @author Administrator
 * 
 */

public class DAOFactory {
	
	public static IBookDAO getIBookDAOInstance() {
		//图书信息操作工厂
		return new IBookDAOImplProxy();
	}

	public static IBorrowDAO getIBorrowDAOInstance() {
		//借阅信息操作工厂
		return new IBorrowDAOImplProxy();
	}

	public static IReaderDAO getIReaderDAOInstance() {
		//读者信息操作工厂
		return new IReaderDAOImplProxy();
	}

	public static IUserDAO getIUserDAOInstance() {
		//用户信息操作工厂
		return new IUserDAOImplProxy();
	}

}
