package com.lcl.fav.entity;

public class Favorite {
	private Integer fid;
	private String flabel;
	private String furl;
	private String ftags;
	private String fdesc;
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getFlabel() {
		return flabel;
	}
	public void setFlabel(String flabel) {
		this.flabel = flabel;
	}
	public String getFurl() {
		return furl;
	}
	public void setFurl(String furl) {
		this.furl = furl;
	}
	public String getFtags() {
		return ftags;
	}
	public void setFtags(String ftags) {
		this.ftags = ftags;
	}
	public String getFdesc() {
		return fdesc;
	}
	public void setFdesc(String fdesc) {
		this.fdesc = fdesc;
	}
	@Override
	public String toString() {
		return "\nFavorite [fid=" + fid + ", flabel=" + flabel + ", furl=" + furl + ", ftags=" + ftags + ", fdesc="
				+ fdesc + "]";
	}

}
