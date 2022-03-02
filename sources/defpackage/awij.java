package defpackage;

/* renamed from: awij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awij implements awii {
    public static final agvx a;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.audit")).a();
        a = agvx.a(a2, "LimitLocales__maximum_number_of_locales_to_record", 5);
        agvx.a(a2, "LimitLocales__restrict_maximum_number_of_locales_to_record", true);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }
}
