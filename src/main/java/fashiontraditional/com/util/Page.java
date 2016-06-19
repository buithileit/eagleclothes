package fashiontraditional.com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import fashiontraditional.com.vo.ProductVO;

public class Page<T> {

	// private int page;
	private int numberRecord;
	private List<T> list;

	public Page(int numberRecord) {
		super();
		// this.page = page;
		this.numberRecord = numberRecord;
		this.list = new ArrayList<T>();
	}

	public Page(List<T> list) {
		super();
		// this.page = 0;
		if (list == null)
			list = new LinkedList<T>();
		this.list = list;
		this.numberRecord = 10;
	}

	public Page(int numberRecord, List<T> list) {
		super();
		// this.page = page;
		if (list == null)
			list = new LinkedList<T>();

		this.list = list;
		this.numberRecord = numberRecord;
	}

	public int getNumberPages() {
		return this.list.size() / numberRecord + 1;
	}

	// public void setPage(int page) {
	// this.page = page;
	// }

	public List<T> getList(int page) {
		page--;
		List<T> result = new LinkedList<T>();
		if (this.list.size() < numberRecord)
			result = list;
		else {
			int start = page * numberRecord;
			int end = start + numberRecord;
			for (; start < end; start++) {
				result.add(list.get(start));
			}
		}
		return result;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getNumberRecord() {
		return numberRecord;
	}

	public void setNumberRecord(int numberRecord) {
		this.numberRecord = numberRecord;
	}

	@Override
	public String toString() {
		return "Page [numberRecord=" + numberRecord + ", list=" + list + "]";
	}

}
