package defpackage;

/* renamed from: axyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axyz implements axyy {
    public static final agvx bugfixCatchLatestSettings;
    public static final agvx ignoreOldChreGeofenceVersions;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        bugfixCatchLatestSettings = agvx.a(a, "ChreGeofencingBugFixes__bugfix_catch_latest_settings", true);
        ignoreOldChreGeofenceVersions = agvx.a(a, "ChreGeofencingBugFixes__ignore_old_chre_geofence_versions", true);
    }

    public boolean bugfixCatchLatestSettings() {
        return ((Boolean) bugfixCatchLatestSettings.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean ignoreOldChreGeofenceVersions() {
        return ((Boolean) ignoreOldChreGeofenceVersions.c()).booleanValue();
    }
}
