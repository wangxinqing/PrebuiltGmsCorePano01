package defpackage;

/* renamed from: aytj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aytj implements ayti {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaEntryPointSwitcherFeature__do_not_check_delegation_flag", true);
        b = agvx.a(agvw, "FsaEntryPointSwitcherFeature__explicitly_disable_gmscore_entry_point_when_fsa1_not_exist", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
