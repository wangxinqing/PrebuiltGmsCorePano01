package defpackage;

/* renamed from: axrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axrf implements axrd {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.icing"));
        try {
            a = agvx.a(agvw, "type_configs_override", (ovp) aucj.a((aucj) ovp.c, new byte[0]), axre.a);
        } catch (auda e) {
            throw new AssertionError("Could not parse proto flag \"type_configs_override\"");
        }
    }

    public final ovp a() {
        return (ovp) a.c();
    }
}
