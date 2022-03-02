package defpackage;

/* renamed from: azjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azjs implements azjr {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.smartdevice"));
        agvx.a(agvw, "ConnectionlessMigration__use_account_transfer_client_on_source", true);
        agvx.a(agvw, "ConnectionlessMigration__use_account_transfer_client_on_target", true);
        agvx.a(agvw, "ConnectionlessMigration__use_accounts_client", true);
        agvx.a(agvw, "ConnectionlessMigration__use_connectionless_accounts_api_in_auth_account", true);
        agvx.a(agvw, "ConnectionlessMigration__use_connectionless_nearby_on_source", true);
        a = agvx.a(agvw, "ConnectionlessMigration__use_connectionless_people_api", false);
        b = agvx.a(agvw, "ConnectionlessMigration__use_cryptauth_async", true);
        agvx.a(agvw, "ConnectionlessMigration__use_location_client", true);
        agvx.a(agvw, "ConnectionlessMigration__use_source_client", true);
        agvx.a(agvw, "ConnectionlessMigration__use_target_client", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
