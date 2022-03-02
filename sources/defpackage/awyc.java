package defpackage;

/* renamed from: awyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awyc implements awyb {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw("direct_boot:gms_chimera_phenotype_flags");
        agvx.a(agvw, "ClientLogging__enable_background_init", true);
        a = agvx.a(agvw, "ClientLogging__enable_client_logging", true);
        b = agvx.a(agvw, "ClientLogging__min_logging_level", 900);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
