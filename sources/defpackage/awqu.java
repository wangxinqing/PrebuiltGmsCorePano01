package defpackage;

/* renamed from: awqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awqu implements awqt {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.car"));
        a = agvx.a(agvw, "DrivingModeSetupNotificationFeature__driving_mode_setup_reminder_notification_count", 3);
        b = agvx.a(agvw, "DrivingModeSetupNotificationFeature__use_car_setup_module_setup_notification", false);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
