package defpackage;

/* renamed from: axbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axbj implements axbi {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a("gms:common:sqlite_");
        a = agvx.a(a2, "SQLite__idle_connection_timeout_blacklisted_database_names", "");
        b = agvx.a(a2, "SQLite__idle_connection_timeout_ms", 30000);
        c = agvx.a(a2, "SQLite__use_idle_connection_timeout_modules", false);
    }

    public final String a() {
        return (String) a.c();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
