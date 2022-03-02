package defpackage;

/* renamed from: azln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azln implements azlm {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.smartdevice"));
        a = agvx.a(agvw, "ReduceSourceScreens__reduce_direct_transfer_screens", false);
        b = agvx.a(agvw, "ReduceSourceScreens__reduce_screens", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
