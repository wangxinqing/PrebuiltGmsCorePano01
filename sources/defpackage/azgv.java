package defpackage;

/* renamed from: azgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azgv implements azgu {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.signin"));
        a = agvx.a(agvw, "EnableNewConsentFlow__delegate_to_pano_auth_activity", false);
        agvx.a(agvw, "enable_new_consent_flow", false);
        agvx.a(agvw, "record_consent_after_picking_account", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
