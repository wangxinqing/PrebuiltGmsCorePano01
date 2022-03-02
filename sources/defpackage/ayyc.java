package defpackage;

/* renamed from: ayyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayyc implements ayyb {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw("direct_boot:com.google.android.gms.phenotype").a("gms:phenotype:");
        a = agvx.a(a2, "content_provider_3p_whitelist", "com.google.android.gms.clearcut.public,com.google.android.gms.vision.sdk,com.google.android.gms.measurement,com.google.android.gms.icing,com.google.android.cruiser,org.chromium.net.cronet,com.google.android.gms.auth_account");
        b = agvx.a(a2, "ContentProvider__enable_committed_flags_dump", false);
    }

    public final String a() {
        return (String) a.c();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
