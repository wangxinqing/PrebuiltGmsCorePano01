package defpackage;

/* renamed from: axzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axzf implements axze {
    public static final agvx bugFixOnlyRunOnPrimaryProfile;
    public static final agvx wifiScanNanoApp;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        bugFixOnlyRunOnPrimaryProfile = agvx.a(a, "ChreWifiScan__bug_fix_only_run_on_primary_profile", true);
        wifiScanNanoApp = agvx.a(a, "wfsna", false);
    }

    public boolean bugFixOnlyRunOnPrimaryProfile() {
        return ((Boolean) bugFixOnlyRunOnPrimaryProfile.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean wifiScanNanoApp() {
        return ((Boolean) wifiScanNanoApp.c()).booleanValue();
    }
}
