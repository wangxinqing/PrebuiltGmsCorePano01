package defpackage;

/* renamed from: ayev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayev implements ayeu {
    public static final agvx minimumDialogShowingIntervalMillis;
    public static final agvx onlyShowDialogWhenSettingsOnForeground;
    public static final agvx showWifiScanningConsentDialogPreP;
    public static final agvx wifiScanningConsentDialogPrePAri;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        minimumDialogShowingIntervalMillis = agvx.a(a, "ScanningSettingsPreP__minimum_dialog_showing_interval_millis", 0);
        onlyShowDialogWhenSettingsOnForeground = agvx.a(a, "ScanningSettingsPreP__only_show_dialog_when_settings_on_foreground", false);
        showWifiScanningConsentDialogPreP = agvx.a(a, "show_wifi_scanning_consent_dialog_pre_p", false);
        wifiScanningConsentDialogPrePAri = agvx.a(a, "wifi_scanning_consent_dialog_pre_p_ari", false);
    }

    public boolean compiled() {
        return true;
    }

    public long minimumDialogShowingIntervalMillis() {
        return ((Long) minimumDialogShowingIntervalMillis.c()).longValue();
    }

    public boolean onlyShowDialogWhenSettingsOnForeground() {
        return ((Boolean) onlyShowDialogWhenSettingsOnForeground.c()).booleanValue();
    }

    public boolean showWifiScanningConsentDialogPreP() {
        return ((Boolean) showWifiScanningConsentDialogPreP.c()).booleanValue();
    }

    public boolean wifiScanningConsentDialogPrePAri() {
        return ((Boolean) wifiScanningConsentDialogPrePAri.c()).booleanValue();
    }
}
