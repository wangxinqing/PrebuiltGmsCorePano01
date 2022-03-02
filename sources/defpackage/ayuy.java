package defpackage;

/* renamed from: ayuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayuy implements ayux {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "MenagerieDatabaseOperation__catch_cant_open_database_exception", true);
        b = agvx.a(agvw, "MenagerieDatabaseOperation__cleanup_stale_pages", true);
        agvx.a(agvw, "MenagerieDatabaseOperation__log_cache_vs_account_manager_diff", false);
        agvx.a(agvw, "MenagerieDatabaseOperation__log_cache_vs_account_manager_diff_sample_rate", 0.01d);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
