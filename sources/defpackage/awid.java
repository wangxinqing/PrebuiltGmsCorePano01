package defpackage;

/* renamed from: awid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awid implements awib {
    public static final agvx a;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.audit")).a();
        try {
            a = agvx.a(a2, "ConfigFeature__upload_blacklist", (egz) aucj.a((aucj) egz.b, new byte[0]), awic.a);
        } catch (auda e) {
            throw new AssertionError("Could not parse proto flag \"ConfigFeature__upload_blacklist\"");
        }
    }

    public final egz a() {
        return (egz) a.c();
    }
}
