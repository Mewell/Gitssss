package maylor.system.dao;

import java.util.List;

/**
 * 读者信息的操作 接口
 */

import maylor.system.model.Reader;

public interface IReaderDAO {
	/**
	 * 数据库的增加操作
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean doCreate(Reader reader)throws Exception;
	/**
	 * 数据库的更新操作
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean doUpdate(Reader reader)throws Exception;
	/**
	 * 数据库的删除操作
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public boolean doDelete(String id)throws Exception;
	/**
	 * 数据库的查找操作(按id查找)
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Reader findById(String id)throws Exception;
	/**
	 * 数据库的查找操作(按关键字查找)
	 * @param keyword
	 * @return
	 * @throws Exception
	 */
	public List<Reader> findAll(String keyword)throws Exception;
}
