package defpackage;

/* renamed from: awqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awqo implements awqn {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.car"));
        agvx.a(agvw, "DrivingModeInLocation__driving_mode_proxy_car_service_call", false);
        a = agvx.a(agvw, "DrivingModeInLocation__enabled", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
