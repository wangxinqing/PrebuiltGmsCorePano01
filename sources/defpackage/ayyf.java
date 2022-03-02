package defpackage;

/* renamed from: ayyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayyf implements ayye {
    public static final agvx a;

    static {
        agvw a2 = new agvw("direct_boot:com.google.android.gms.phenotype").a("gms:phenotype:");
        agvx.a(a2, "Database__enable_database_schema_version_22", true);
        a = agvx.a(a2, "Database__enable_database_schema_version_23", false);
        agvx.a(a2, "Database__enable_deferred_transactions", true);
        agvx.a(a2, "WriteAheadLoggingFeature__enable_write_ahead_logging", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
