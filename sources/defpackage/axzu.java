package defpackage;

/* renamed from: axzu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axzu implements axzt {
    public static final agvx enableDndNotification;
    public static final agvx enableDrivingDndGms;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        enableDndNotification = agvx.a(a, "enable_dnd_notification", false);
        enableDrivingDndGms = agvx.a(a, "enable_driving_dnd_gms", true);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableDndNotification() {
        return ((Boolean) enableDndNotification.c()).booleanValue();
    }

    public boolean enableDrivingDndGms() {
        return ((Boolean) enableDrivingDndGms.c()).booleanValue();
    }
}
