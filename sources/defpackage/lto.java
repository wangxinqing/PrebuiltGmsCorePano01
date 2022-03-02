package defpackage;

import android.content.ComponentName;

/* renamed from: lto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lto {
    static final ComponentName a = new ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.wifi.CarWifiConnectionService");
    public static final ComponentName b = new ComponentName("com.google.android.gms", "com.google.android.location.drivingmode.AutoLaunchService");
    private static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.DrivingModeFrxActivity");
    private static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.location.drivingmode.DrivingModeFrxActivity");

    public static ComponentName b() {
        String str;
        if (jkr.g()) {
            str = d();
        } else {
            str = !awqm.b() ? "com.google.android.gms.carsetup.DrivingModeSettingsNoSummaryActivity" : "com.google.android.location.drivingmode.DrivingModeSettingsNoSummaryActivity";
        }
        return new ComponentName("com.google.android.gms", str);
    }

    public static ComponentName a() {
        return awqm.b() ? b : a;
    }

    public static ComponentName c() {
        return awqm.b() ? d : c;
    }

    public static String d() {
        return !awqm.b() ? "com.google.android.gms.carsetup.DrivingModeSettingsActivity" : "com.google.android.location.drivingmode.DrivingModeSettingsActivity";
    }
}
