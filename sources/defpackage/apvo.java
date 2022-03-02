package defpackage;

/* renamed from: apvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvo implements aptv {
    private final String a;
    private final String b;

    public apvo(String str, String str2) {
        iva.c(str);
        this.a = str;
        iva.c(str2);
        this.b = str2;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        aucd o = alnf.d.o();
        String str = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        alnf alnf = (alnf) o.b;
        str.getClass();
        int i = alnf.a | 1;
        alnf.a = i;
        alnf.b = str;
        String str2 = this.b;
        str2.getClass();
        alnf.a = i | 2;
        alnf.c = str2;
        return (alnf) o.i();
    }
}
