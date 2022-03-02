package defpackage;

/* renamed from: axtq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axtq implements axtp {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.icing.mdh")).a();
        a = agvx.a(a2, "gms_icing_enable_mdh_suppress_exceptions_with_causal_chain_check", true);
        b = agvx.a(a2, "ExceptionSuppression__suppress_gcm_task_interrupted_exception", true);
        c = agvx.a(a2, "ExceptionSuppression__suppress_sync_status_runtime_exception", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
