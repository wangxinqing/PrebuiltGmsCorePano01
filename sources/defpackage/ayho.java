package defpackage;

/* renamed from: ayho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayho implements ayhn {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.measurement"));
        a = agvx.a(agvw, "measurement.androidId.delete_feature", true);
        agvx.a(agvw, "measurement.log_androidId_enabled", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
