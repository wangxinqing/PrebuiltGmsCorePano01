package defpackage;

/* renamed from: awqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awqx implements awqw {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.car"));
        a = agvx.a(agvw, "DrivingModeTriggerSource__abar_suppression_after_explicit_exit_minutes", 0);
        b = agvx.a(agvw, "DrivingModeTriggerSource__check_signal_strength_on_exit", false);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
