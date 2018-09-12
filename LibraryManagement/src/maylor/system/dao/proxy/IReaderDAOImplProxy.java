package maylor.system.dao.proxy;

import java.util.List;

import maylor.system.dao.IReaderDAO;
import maylor.system.dao.dbc.DataBaseConnection;
import maylor.system.dao.impl.IReaderDAOImpl;
import maylor.system.model.Reader;

/**
 * ������Ϣ�����ӿڴ�����
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
		// ���Ӷ�����Ϣ(����ʵ��)
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
		// ���¶�����Ϣ(����ʵ��)
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
		// ɾ��������Ϣ(����ʵ��)
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
		//���ҽ�����Ϣ-ID����(����ʵ��)
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
		//���Ҷ�����Ϣ-�ؼ��ֲ���(����ʵ��)
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
