package defpackage;

/* renamed from: awry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awry implements awrx {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.chromesync")).a();
        a = agvx.a(a2, "AffiliationCacheExpirationTime__base_expiration_millis", 1209600000);
        b = agvx.a(a2, "AffiliationCacheExpirationTime__jitter_millis", 259200000);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
