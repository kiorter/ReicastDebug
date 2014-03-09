package com.reicast.emulator.debug;

public class Config {

	public static boolean isCustom;
	public static String git_api;
	public static String git_issues;
	public static String log_url;
	public static String cloudUrl;
	public static String numberUrl;
	public static String archiveUrl;
	public static String serverUrl;

	public static void setVersioning() {
		if (isCustom) {
			git_api = "https://api.github.com/repos/NoblesseOblige/reicast-emulator/commits";
			git_issues = "https://github.com/NoblesseOblige/reicast-emulator/issues/";
			log_url = "http://twisted.dyndns.tv:3194/Dreamcast/report/submit.php";
			cloudUrl = "http://twisted.dyndns.tv:3194/Dreamcast/plugin/submit.php";
			numberUrl = "http://twisted.dyndns.tv:3194/Dreamcast/plugin/number.php";
			archiveUrl = "http://twisted.dyndns.tv:3194/Dreamcast/plugin/archive.php";
			serverUrl = "http://twisted.dyndns.tv:3194/Dreamcast/plugin/register.php";
		} else {
			git_api = "https://api.github.com/repos/NoblesseOblige/reicast-emulator/commits";
			git_issues = "https://github.com/NoblesseOblige/reicast-emulator/issues/";
			log_url = "http://twisted.dyndns.tv:3194/Dreamcast/report/submit.php";
			cloudUrl = "http://twisted.dyndns.tv:3194/Dreamcast/plugin/submit.php";
			numberUrl = "http://twisted.dyndns.tv:3194/Dreamcast/plugin/number.php";
			archiveUrl = "http://twisted.dyndns.tv:3194/Dreamcast/plugin/archive.php";
			serverUrl = "http://twisted.dyndns.tv:3194/Dreamcast/plugin/register.php";
		}
	}

	public static String getApkName(String build) {
		if (isCustom) {
			return "reicast-lkedition-" + build + ".apk";
		} else {
			return "reicast-emulator-" + build + ".apk";
		}
	}

	public static String getApkUrl(String apk) {
		if (isCustom) {
			return "http://twisted.dyndns.tv:3194/Dreamcast/compiled/" + apk;
		} else {
			return "http://twisted.dyndns.tv:3194/ReicastBot/compiled/" + apk;
		}
	}
}
