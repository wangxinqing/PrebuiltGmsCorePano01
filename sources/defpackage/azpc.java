package defpackage;

/* renamed from: azpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azpc implements azpb {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw("com.google.android.metrics").a("gms:stats:");
        a = agvx.a(a2, "MediaStats__max_content_length", 1000);
        b = agvx.a(a2, "MediaStats__upload_unhandled_fields", false);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
