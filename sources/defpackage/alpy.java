package defpackage;

/* renamed from: alpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alpy {
    public static final amic a;
    public static final amic b;
    public static final amic c;
    public static final amic d;
    public final int e;
    public final amic f;
    public final String g;
    public final long h;
    public final Object i;

    static {
        amia f2 = amic.f();
        f2.a("noop");
        a = f2.a();
        amia f3 = amic.f();
        f3.a("c");
        b = f3.a();
        amia f4 = amic.f();
        f4.a("stop");
        c = f4.a();
        amia f5 = amic.f();
        f5.a(3.0d);
        d = f5.a();
    }

    private alpy(int i2, String str, long j, Object obj, amic amic) {
        this.e = i2;
        this.g = str;
        this.h = j;
        this.i = obj;
        alys.a((Object) amic, "payloadType");
        this.f = amic;
        if (i2 < 0) {
            throw new IllegalArgumentException("envelopeId < 0");
        }
    }

    public static alpy a(alze alze) {
        Object obj;
        long j;
        String str;
        alze.c();
        int b2 = alze.b();
        alze.c();
        amic amic = (amic) alze.a((alzf) alsd.a);
        if (amic.equals(d)) {
            long longValue = ((Number) alze.a((alzf) alzc.a)).longValue();
            obj = alve.a(alze);
            long j2 = longValue;
            str = null;
            j = j2;
        } else if (amic.equals(b)) {
            obj = null;
            j = 0;
            str = alze.g();
        } else {
            amib amib = amic.b;
            if (amib == amib.NUMBER_VALUE) {
                obj = null;
                j = 0;
                str = null;
            } else if (amib == amib.STRING_VALUE) {
                obj = null;
                j = 0;
                str = null;
            } else {
                String valueOf = String.valueOf(amib);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Payload type should be number or string, but was: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        alze.d();
        alze.d();
        return new alpy(b2, str, j, obj, amic);
    }
}
