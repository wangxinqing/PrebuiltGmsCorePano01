package defpackage;

/* renamed from: awma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awma implements awlz {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.auth_account")).a();
        a = agvx.a(a2, "Pubsub__account_state_broadcast_receiver_enabled", false);
        b = agvx.a(a2, "Pubsub__credential_state_broadcast_receiver_enabled", false);
        c = agvx.a(a2, "Pubsub__log_sample_percentage", 0.0d);
        d = agvx.a(a2, "Pubsub__oneoff_task_execution_window_size_seconds", 5);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final double c() {
        return ((Double) c.c()).doubleValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }
}
