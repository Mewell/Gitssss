package maylor.system.dao;

import java.util.List;

/**
 * ������Ϣ�����ӿ�
 */

import maylor.system.model.Borrow;

public interface IBorrowDAO {
	/**
	 * ���ݿ�����Ӳ���
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean doCreate(Borrow borrow)throws Exception;
	/**
	 * ���ݿ�ĸ��²���
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean doUpdate(Borrow borrow)throws Exception;
	/**
	 * ���ݿ��ɾ������
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public boolean doDelete(int id)throws Exception;
	/**
	 * ���ݿ�Ĳ��Ҳ���(��id����)
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Borrow findById(String id)throws Exception;
	//����ʱ�õ�
	public Borrow findById(int id) throws Exception; 
	/**
	 * ���ݿ�Ĳ��Ҳ���(���ؼ��ֲ���)
	 * @param keyword
	 * @return
	 * @throws Exception
	 */
	public List<Borrow> findAll(String keyword)throws Exception;
}
