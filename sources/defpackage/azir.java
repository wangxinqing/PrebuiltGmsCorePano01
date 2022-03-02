package defpackage;

/* renamed from: azir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azir implements aziq {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.smart_profile")).a();
        a = agvx.a(a2, "GplusTurndownFeature__correct_datamixer_auth_scope", "https://www.googleapis.com/auth/peopleapi.readwrite");
        b = agvx.a(a2, "GplusTurndownFeature__replace_plus_scopes", false);
    }

    public final String a() {
        return (String) a.c();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
