package defpackage;

/* renamed from: axdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axdr implements axdq {
    public static final agvx a;

    static {
        agvw agvw = new agvw("direct_boot:gms_chimera_phenotype_flags");
        a = agvx.a(agvw, "WorkChainsPi__enable_retrieve_attribution_from_trace", true);
        agvx.a(agvw, "stats_wakeLocks_enable_work_chains_pi", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
