package edu.orangecoastcollege.cs170.jgordon41.ic26;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Hike implements Serializable {

	private String name,dateCompleted, comment;
	private double milesCompleted;
	

	public Hike(String name, String dateCompleted, String comment, double milesCompleted) {
		this.name = name;
		this.dateCompleted = dateCompleted;
		this.comment = comment;
		this.milesCompleted = milesCompleted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateCompleted() {
		return dateCompleted;
	}

	public void setDateCompleted(String dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public double getMilesCompleted() {
		return milesCompleted;
	}

	public void setMilesCompleted(double milesCompleted) {
		this.milesCompleted = milesCompleted;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((dateCompleted == null) ? 0 : dateCompleted.hashCode());
		long temp;
		temp = Double.doubleToLongBits(milesCompleted);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Hike)) {
			return false;
		}
		Hike other = (Hike) obj;
		if (comment == null) {
			if (other.comment != null) {
				return false;
			}
		} else if (!comment.equals(other.comment)) {
			return false;
		}
		if (dateCompleted == null) {
			if (other.dateCompleted != null) {
				return false;
			}
		} else if (!dateCompleted.equals(other.dateCompleted)) {
			return false;
		}
		if (Double.doubleToLongBits(milesCompleted) != Double.doubleToLongBits(other.milesCompleted)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Hike [name=" + name + ", dateCompleted=" + dateCompleted + ", comment=" + comment + ", milesCompleted="
				+ milesCompleted + "]";
	}

}
