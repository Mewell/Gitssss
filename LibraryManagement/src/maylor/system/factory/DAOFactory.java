package maylor.system.factory;

import maylor.system.dao.*;
import maylor.system.dao.proxy.*;

/**
 * ����������
 * 
 * @author Administrator
 * 
 */

public class DAOFactory {
	
	public static IBookDAO getIBookDAOInstance() {
		//ͼ����Ϣ��������
		return new IBookDAOImplProxy();
	}

	public static IBorrowDAO getIBorrowDAOInstance() {
		//������Ϣ��������
		return new IBorrowDAOImplProxy();
	}

	public static IReaderDAO getIReaderDAOInstance() {
		//������Ϣ��������
		return new IReaderDAOImplProxy();
	}

	public static IUserDAO getIUserDAOInstance() {
		//�û���Ϣ��������
		return new IUserDAOImplProxy();
	}

}
