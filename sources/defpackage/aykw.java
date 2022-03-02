package defpackage;

/* renamed from: aykw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aykw implements aykv {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.measurement"));
        a = agvx.a(agvw, "measurement.test.boolean_flag", false);
        b = agvx.a(agvw, "measurement.test.double_flag", -3.0d);
        c = agvx.a(agvw, "measurement.test.int_flag", -2);
        d = agvx.a(agvw, "measurement.test.long_flag", -1);
        e = agvx.a(agvw, "measurement.test.string_flag", "---");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final double b() {
        return ((Double) b.c()).doubleValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final String e() {
        return (String) e.c();
    }
}
