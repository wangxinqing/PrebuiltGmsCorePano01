package defpackage;

/* renamed from: axvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axvj implements axvi {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.instantapps")).a();
        agvx.a(a2, "Routing__checkDomainFilterBeforeOptInState", false);
        agvx.a(a2, "Routing__doNotCheckAppInfoForBrowserIncomingIntents", false);
        a = agvx.a(a2, "Routing__enableDynamicIntentActionLookup", false);
        b = agvx.a(a2, "Routing__return_null_intent_on_go_to_browser_o_plus", true);
        c = agvx.a(a2, "Routing__useSupervisorMinGmsCoreMetadata", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
