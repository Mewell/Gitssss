package maylor.system.dao;

import java.util.List;

/**
 * ������Ϣ�Ĳ��� �ӿ�
 */

import maylor.system.model.Reader;

public interface IReaderDAO {
	/**
	 * ���ݿ�����Ӳ���
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean doCreate(Reader reader)throws Exception;
	/**
	 * ���ݿ�ĸ��²���
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean doUpdate(Reader reader)throws Exception;
	/**
	 * ���ݿ��ɾ������
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public boolean doDelete(String id)throws Exception;
	/**
	 * ���ݿ�Ĳ��Ҳ���(��id����)
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Reader findById(String id)throws Exception;
	/**
	 * ���ݿ�Ĳ��Ҳ���(���ؼ��ֲ���)
	 * @param keyword
	 * @return
	 * @throws Exception
	 */
	public List<Reader> findAll(String keyword)throws Exception;
}
