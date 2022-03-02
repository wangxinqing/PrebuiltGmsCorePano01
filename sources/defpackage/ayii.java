package defpackage;

/* renamed from: ayii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayii implements ayih {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.measurement"));
        a = agvx.a(agvw, "measurement.sdk.dynamite.allow_remote_dynamite", false);
        agvx.a(agvw, "measurement.collection.init_params_control_enabled", true);
        b = agvx.a(agvw, "measurement.sdk.dynamite.use_dynamite3", false);
        agvx.a(agvw, "measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
