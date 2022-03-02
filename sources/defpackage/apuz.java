package defpackage;

/* renamed from: apuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apuz implements aptv {
    private String a;
    private String b;
    private final String c;

    public apuz(String str) {
        this.c = str;
    }

    public apuz(String str, String str2, String str3) {
        iva.c(str);
        this.a = str;
        iva.c(str2);
        this.b = str2;
        this.c = str3;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        aucd o = almr.e.o();
        String str = this.a;
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            almr almr = (almr) o.b;
            str.getClass();
            almr.a |= 1;
            almr.b = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            almr almr2 = (almr) o.b;
            str2.getClass();
            almr2.a |= 2;
            almr2.c = str2;
        }
        String str3 = this.c;
        if (str3 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            almr almr3 = (almr) o.b;
            str3.getClass();
            almr3.a |= 1024;
            almr3.d = str3;
        }
        return (almr) o.i();
    }
}
