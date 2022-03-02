package defpackage;

/* renamed from: ayxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayxo implements ayxn {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw b2 = new agvw(agvj.a("com.google.android.gms.people")).b();
        a = agvx.a(b2, "gal_provider_gmscore_delegation_enabled", false);
        b = agvx.a(b2, "google_contacts_sync_is_delegation_enabled", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
