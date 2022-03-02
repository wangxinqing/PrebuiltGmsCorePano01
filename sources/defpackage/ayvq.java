package defpackage;

/* renamed from: ayvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayvq implements ayvp {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "MenagerieIdentityApiFeature__identity_get_by_id_web_data_source_disabled", true);
        agvx.a(agvw, "MenagerieIdentityApiFeature__identity_get_by_ids_operation_disabled", 0);
        b = agvx.a(agvw, "MenagerieIdentityApiFeature__identity_list_operation_disabled", 0);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
