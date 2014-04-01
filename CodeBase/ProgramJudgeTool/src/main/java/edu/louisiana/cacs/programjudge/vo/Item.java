package edu.louisiana.cacs.programjudge.vo;

import java.io.Serializable;

/**
 * Class to hold data present in input file.
 * Each line in the input file is represented by Item object.
 * @author rsunkara
 *
 */
public class Item implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2712185900993607424L;

	private String key;
	
	private int count;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (count != other.count)
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "The total for "+this.key + " is " + count + ".";
	}
	
}
