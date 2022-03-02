package defpackage;

/* renamed from: ayai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayai implements ayah {
    public static final agvx activityLocationBindTimeRange;
    public static final agvx activityRecognitionResultGlsUploadEnabled;
    public static final agvx enabledCollectors;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        activityLocationBindTimeRange = agvx.a(a, "activity_location_bind_time_range", 360000);
        activityRecognitionResultGlsUploadEnabled = agvx.a(a, "activity_recognition_result_gls_upload_enabled", true);
        enabledCollectors = agvx.a(a, "enabled_collectors", 2147483582);
    }

    public long activityLocationBindTimeRange() {
        return ((Long) activityLocationBindTimeRange.c()).longValue();
    }

    public boolean activityRecognitionResultGlsUploadEnabled() {
        return ((Boolean) activityRecognitionResultGlsUploadEnabled.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long enabledCollectors() {
        return ((Long) enabledCollectors.c()).longValue();
    }
}
