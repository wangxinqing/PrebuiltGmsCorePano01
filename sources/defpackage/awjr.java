package defpackage;

/* renamed from: awjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awjr implements awjq {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth_account"));
        agvx.a(agvw, "ControlledActivityFeatures__enable_chimera_request_extras", true);
        a = agvx.a(agvw, "enable_controlled_activity_session_extras", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
