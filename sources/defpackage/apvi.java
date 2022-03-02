package defpackage;

/* renamed from: apvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvi implements aptv {
    private final String a;
    private final String b;

    public apvi(String str, String str2) {
        iva.c(str);
        this.a = str;
        this.b = str2;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        aucd o = almz.e.o();
        String str = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        almz almz = (almz) o.b;
        str.getClass();
        int i = almz.a | 1;
        almz.a = i;
        almz.b = str;
        int i2 = i | 4;
        almz.a = i2;
        almz.c = true;
        String str2 = this.b;
        if (str2 != null) {
            str2.getClass();
            almz.a = i2 | 16;
            almz.d = str2;
        }
        return (almz) o.i();
    }
}
