package com.emg.datamanage.common;

public class CamelUtils {
	public static final char UNDERLINE = '_';

	/**
	 * �շ��ʽ�ַ���ת��Ϊ�»��߸�ʽ�ַ���
	 * 
	 * @param param
	 *            ��ת�����ַ���
	 * @return
	 */
	public static String camelToUnderline(String param) {
		if (param == null || param.isEmpty()) {
			return "";
		}
		int len = param.length();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			char c = param.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(UNDERLINE);
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();

	}

	/**
	 * �»��߸�ʽ�ַ���ת��Ϊ�շ��ʽ�ַ���
	 * 
	 * @param param
	 * @return
	 */
	public static String underlineToCamel(String param) {
		if (param == null || param.isEmpty()) {
			return "";
		}
		int len = param.length();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			char c = param.charAt(i);
			if (c == UNDERLINE) {
				if (++i < len) {
					sb.append(Character.toUpperCase(param.charAt(i)));
				}
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
