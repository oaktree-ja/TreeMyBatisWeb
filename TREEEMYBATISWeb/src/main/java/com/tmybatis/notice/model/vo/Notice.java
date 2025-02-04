package com.tmybatis.notice.model.vo;

import java.sql.Timestamp;

public class Notice {
	private int noticeNo;
	private String noticeSubject;
	private String noticeContent;
	private String noticeWriter;
	private Timestamp writeDate;
	private int viewCount;
	private String attachmentName;
	private String attachmentPath;
	private Timestamp attachmentDate;
	
	public Notice() {}

	/**
	 * @return the noticeNo
	 */
	public int getNoticeNo() {
		return noticeNo;
	}

	/**
	 * @return the noticeSubject
	 */
	public String getNoticeSubject() {
		return noticeSubject;
	}

	/**
	 * @return the noticeContent
	 */
	public String getNoticeContent() {
		return noticeContent;
	}

	/**
	 * @return the noticeWriter
	 */
	public String getNoticeWriter() {
		return noticeWriter;
	}

	/**
	 * @return the writeDate
	 */
	public Timestamp getWriteDate() {
		return writeDate;
	}

	/**
	 * @return the viewCount
	 */
	public int getViewCount() {
		return viewCount;
	}

	/**
	 * @return the attachmentName
	 */
	public String getAttachmentName() {
		return attachmentName;
	}

	/**
	 * @return the attachmentPath
	 */
	public String getAttachmentPath() {
		return attachmentPath;
	}

	/**
	 * @return the attachmentDate
	 */
	public Timestamp getAttachmentDate() {
		return attachmentDate;
	}

	public Notice(String noticeSubject, String noticeContent, String noticeWriter) {
		super();
		this.noticeSubject = noticeSubject;
		this.noticeContent = noticeContent;
		this.noticeWriter = noticeWriter;
	}

	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", noticeSubject=" + noticeSubject + ", noticeContent=" + noticeContent
				+ ", noticeWriter=" + noticeWriter + ", writeDate=" + writeDate + ", viewCount=" + viewCount
				+ ", attachmentName=" + attachmentName + ", attachmentPath=" + attachmentPath + ", attachmentDate="
				+ attachmentDate + "]";
	}
	
	
	
	
}
