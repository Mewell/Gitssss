package maylor.system.dao.proxy;

import java.util.List;

import maylor.system.dao.IReaderDAO;
import maylor.system.dao.dbc.DataBaseConnection;
import maylor.system.dao.impl.IReaderDAOImpl;
import maylor.system.model.Reader;

/**
 * 读者信息操作接口代理类
 * @author Administrator
 *
 */
public class IReaderDAOImplProxy implements IReaderDAO {
	private DataBaseConnection dbc = null;
	private IReaderDAO dao = null;

	public IReaderDAOImplProxy() {
		this.dbc = new DataBaseConnection();
		this.dao = new IReaderDAOImpl(this.dbc.getConnection());
	}

	@Override
	public boolean doCreate(Reader reader) throws Exception {
		// 增加读者信息(代理实现)
		boolean flag = true;
		try {
			flag = this.dao.doCreate(reader);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public boolean doUpdate(Reader reader) throws Exception {
		// 更新读者信息(代理实现)
		boolean flag = true;
		try {
			flag = this.dao.doUpdate(reader);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public boolean doDelete(String id) throws Exception {
		// 删除读者信息(代理实现)
		boolean flag = true;
		try {
			flag = this.dao.doDelete(id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public Reader findById(String id) throws Exception {
		//查找借阅信息-ID查找(代理实现)
		Reader reader = null;
		try {
			reader = this.dao.findById(id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return reader;
	}

	@Override
	public List<Reader> findAll(String keyword) throws Exception {
		//查找读者信息-关键字查找(代理实现)
		List<Reader> all = null;
		try {
			all = this.dao.findAll(keyword);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return all;
	}

}
