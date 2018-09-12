package maylor.system.dao;

import java.util.List;

/**
 * 借阅信息操作接口
 */

import maylor.system.model.Borrow;

public interface IBorrowDAO {
	/**
	 * 数据库的增加操作
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean doCreate(Borrow borrow)throws Exception;
	/**
	 * 数据库的更新操作
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean doUpdate(Borrow borrow)throws Exception;
	/**
	 * 数据库的删除操作
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public boolean doDelete(int id)throws Exception;
	/**
	 * 数据库的查找操作(按id查找)
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Borrow findById(String id)throws Exception;
	//还书时用到
	public Borrow findById(int id) throws Exception; 
	/**
	 * 数据库的查找操作(按关键字查找)
	 * @param keyword
	 * @return
	 * @throws Exception
	 */
	public List<Borrow> findAll(String keyword)throws Exception;
}
