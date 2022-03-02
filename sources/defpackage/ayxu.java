package defpackage;

/* renamed from: ayxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayxu implements ayxt {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw("direct_boot:com.google.android.gms.phenotype").a();
        a = agvx.a(a2, "ApiService__thread_count", 2);
        b = agvx.a(a2, "ApiService__timeout_to_close_db_in_seconds", 60);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
