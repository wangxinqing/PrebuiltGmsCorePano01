package defpackage;

/* renamed from: ayvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayvt implements ayvs {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "MenagerieIdentityApiLogging__menagerie_get_by_ids_enabled", false);
        b = agvx.a(agvw, "MenagerieIdentityApiLogging__menagerie_get_by_ids_sample_rate", 0.01d);
        agvx.a(agvw, "MenagerieIdentityApiLogging__menagerie_list_operation_endpoint_logging_enabled", false);
        agvx.a(agvw, "MenagerieIdentityApiLogging__menagerie_list_operation_endpoint_logging_sample_rate", 0.01d);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final double b() {
        return ((Double) b.c()).doubleValue();
    }
}
