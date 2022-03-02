package defpackage;

/* renamed from: apvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvk implements aptv {
    private final String a;
    private final String b;
    private final String c;

    public apvk(String str, String str2, String str3) {
        iva.c(str);
        this.a = str;
        iva.c(str2);
        this.b = str2;
        this.c = str3;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        aucd o = alnb.f.o();
        String str = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        alnb alnb = (alnb) o.b;
        str.getClass();
        int i = alnb.a | 1;
        alnb.a = i;
        alnb.b = str;
        String str2 = this.b;
        str2.getClass();
        int i2 = i | 2;
        alnb.a = i2;
        alnb.c = str2;
        int i3 = i2 | 512;
        alnb.a = i3;
        alnb.d = true;
        String str3 = this.c;
        if (str3 != null) {
            str3.getClass();
            alnb.a = i3 | 1024;
            alnb.e = str3;
        }
        return (alnb) o.i();
    }
}
