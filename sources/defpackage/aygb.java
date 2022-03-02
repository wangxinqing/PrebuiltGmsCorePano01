package defpackage;

/* renamed from: aygb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aygb implements ayga {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw b2 = new agvw("com.google.android.gms.lockbox").a("gms:lockbox:service").b();
        a = agvx.a(b2, "collect_standby_buckets", false);
        b = agvx.a(b2, "commit_phenotype_interval_millis", 3600000);
        agvx.a(b2, "disable_lockbox_udc_receiver", true);
        agvx.a(b2, "phenotype_register_timeout_millis", 5000);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
