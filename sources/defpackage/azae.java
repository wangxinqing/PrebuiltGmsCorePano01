package defpackage;

/* renamed from: azae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azae implements azad {
    public static final agvx a;

    static {
        agvw a2 = new agvw("direct_boot:com.google.android.gms.phenotype").a("gms:phenotype:");
        agvx.a(a2, "disable_gcm_interaction", false);
        agvx.a(a2, "enable_gcm_push", false);
        a = agvx.a(a2, "enable_sync_after", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
