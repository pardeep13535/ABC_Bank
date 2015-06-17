package com.sprhib.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bureaudata")
public class Bureaudata {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "ssn")
	private String ssn;

	public String getssn() {
		return ssn;
	}

	public void setssn(String ssn) {
		this.ssn = ssn;
	}

	@Column(name = "delinq_2yrs")
	private String delinq_2yrs;

	public String getdelinq_2yrs() {
		return delinq_2yrs;
	}

	public void setdelinq_2yrs(String delinq_2yrs) {
		this.delinq_2yrs = delinq_2yrs;
	}

	@Column(name = "inq_last_6mths")
	private String inq_last_6mths;

	public String getinq_last_6mths() {
		return inq_last_6mths;
	}

	public void setinq_last_6mths(String inq_last_6mths) {
		this.inq_last_6mths = inq_last_6mths;
	}

	@Column(name = "mths_since_last_delinq")
	private String mths_since_last_delinq;

	public String getmths_since_last_delinq() {
		return mths_since_last_delinq;
	}

	public void setmths_since_last_delinq(String mths_since_last_delinq) {
		this.mths_since_last_delinq = mths_since_last_delinq;
	}

	@Column(name = "mths_since_last_record")
	private String mths_since_last_record;

	public String getmths_since_last_record() {
		return mths_since_last_record;
	}

	public void setmths_since_last_record(String mths_since_last_record) {
		this.mths_since_last_record = mths_since_last_record;
	}

	@Column(name = "open_acc")
	private String open_acc;

	public String getopen_acc() {
		return open_acc;
	}

	public void setopen_acc(String open_acc) {
		this.open_acc = open_acc;
	}

	@Column(name = "pub_rec")
	private String pub_rec;

	public String getpub_rec() {
		return pub_rec;
	}

	public void setpub_rec(String pub_rec) {
		this.pub_rec = pub_rec;
	}

	@Column(name = "revol_bal")
	private String revol_bal;

	public String getrevol_bal() {
		return revol_bal;
	}

	public void setrevol_bal(String revol_bal) {
		this.revol_bal = revol_bal;
	}

	@Column(name = "revol_util")
	private String revol_util;

	public String getrevol_util() {
		return revol_util;
	}

	public void setrevol_util(String revol_util) {
		this.revol_util = revol_util;
	}

	@Column(name = "total_acc")
	private String total_acc;

	public String gettotal_acc() {
		return total_acc;
	}

	public void settotal_acc(String total_acc) {
		this.total_acc = total_acc;
	}
}
