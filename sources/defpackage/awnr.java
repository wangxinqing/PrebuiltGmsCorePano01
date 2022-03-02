package defpackage;

/* renamed from: awnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awnr implements awnq {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth.api.credentials"));
        a = agvx.a(agvw, "GisAssistedSigninCancelBackoff__cancel_backoff_duration_minutes", 1440);
        b = agvx.a(agvw, "GisAssistedSigninCancelBackoff__threshold_cancel_count_to_backoff", 4);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
