package defpackage;

/* renamed from: axdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axdl implements axdk {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw("direct_boot:gms_chimera_phenotype_flags");
        a = agvx.a(agvw, "uncertified_status", 0);
        b = agvx.a(agvw, "uncertified_status_expiration_time_ms", 0);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
