package maylor.system.dao.proxy;

import java.util.List;

import maylor.system.dao.IBorrowDAO;
import maylor.system.dao.dbc.DataBaseConnection;
import maylor.system.dao.impl.IBorrowDAOImpl;
import maylor.system.model.Borrow;

/**
 * 借阅信息操作接口代理类
 * @author Administrator
 *
 */
public class IBorrowDAOImplProxy implements IBorrowDAO {
	private DataBaseConnection dbc = null;
	private IBorrowDAO dao = null;

	public IBorrowDAOImplProxy() {
		this.dbc = new DataBaseConnection();
		this.dao = new IBorrowDAOImpl(this.dbc.getConnection());
	}

	@Override
	public boolean doCreate(Borrow borrow) throws Exception {
		// 增加借阅信息(代理实现)
		boolean flag = true;
		try {
			flag = this.dao.doCreate(borrow);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public boolean doUpdate(Borrow borrow) throws Exception {
		// 更新借阅信息(代理实现)
		boolean flag = true;
		try {
			flag = this.dao.doUpdate(borrow);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public boolean doDelete(int id) throws Exception {
		// 删除借阅信息(代理实现)
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
	public Borrow findById(String id) throws Exception {
		//查找借阅信息-ID查找(代理实现)
		Borrow borrow = null;
		try {
			borrow = this.dao.findById(id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return borrow;
	}

	@Override
	public Borrow findById(int id) throws Exception {
		//查找借阅信息-ID查找(代理实现)
		Borrow borrow = null;
		try {
			borrow = this.dao.findById(id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return borrow;
	}
	
	@Override
	public List<Borrow> findAll(String keyword) throws Exception {
		//查找借阅信息-关键字查找(代理实现)
		List<Borrow> all = null;
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
