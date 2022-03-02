package defpackage;

/* renamed from: axiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axiz implements axiy {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.games")).a("games.");
        a = agvx.a(a2, "StubModule__always_wait_before_update_if_pga_installed", true);
        b = agvx.a(a2, "StubModule__disable_upgrade_dialog_for_unicorn", true);
        c = agvx.a(a2, "StubModule__minimum_required_gmscore_version", 0);
        d = agvx.a(a2, "StubModule__wait_millis_to_gmscore_update_games_module", 10000);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }
}
