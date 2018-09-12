package maylor.system.model;

import java.util.Date;

public class Borrow {
	private int id;
	private Date back_date;
	private String book_id;
	private Date borrow_date;
	private int is_back;
	private String reader_id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Date getBack_date() {
		return back_date;
	}

	public String getBook_id() {
		return book_id;
	}

	public Date getBorrow_date() {
		return borrow_date;
	}



	public int getIs_back() {
		return is_back;
	}

	public String getReader_id() {
		return reader_id;
	}

	public void setBack_date(Date backDate) {
		back_date = backDate;
	}

	public void setBook_id(String bookId) {
		book_id = bookId;
	}

	public void setBorrow_date(Date borrowDate) {
		borrow_date = borrowDate;
	}


	public void setIs_back(int isBack) {
		is_back = isBack;
	}

	public void setReader_id(String readerId) {
		reader_id = readerId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n"+"��ţ�" + id +"\n\n"+ "���߱�ţ�" +reader_id+"\n\n"+ "ͼ���ţ�" + book_id+"\n\n"
		+ "�������ڣ�" + borrow_date +"\n\n"+ "�������ڣ�" + back_date+"\n\n"+"�Ƿ�黹��"+is_back;
	}

}
