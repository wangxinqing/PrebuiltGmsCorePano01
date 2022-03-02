package defpackage;

/* renamed from: awse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awse implements awsd {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.chromesync")).a();
        a = agvx.a(a2, "GsyncFandangoMigration__disable_gsync_registration", false);
        b = agvx.a(a2, "GsyncFandangoMigration__enable_fandango", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
