package defpackage;

/* renamed from: axbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axbd implements axbc {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms"));
        a = agvx.a(agvw, "Providence__skip_global_processors", true);
        agvx.a(agvw, "Providence__use_concurrent_post_processors", false);
        agvx.a(agvw, "Providence__use_concurrent_pre_processors", false);
        agvx.a(agvw, "Providence__use_future_operation_dispatcher", false);
        agvx.a(agvw, "Providence__use_noop_synchronizer_persistent_process", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
