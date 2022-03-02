package defpackage;

/* renamed from: aput  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aput implements aptv {
    private final String a;
    private final String b;
    private final String c;

    public aput(String str, String str2, String str3) {
        iva.c(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        aucd o = alml.e.o();
        String str = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        alml alml = (alml) o.b;
        str.getClass();
        int i = alml.a | 1;
        alml.a = i;
        alml.b = str;
        String str2 = this.b;
        if (str2 != null) {
            str2.getClass();
            i |= 2;
            alml.a = i;
            alml.c = str2;
        }
        String str3 = this.c;
        if (str3 != null) {
            str3.getClass();
            alml.a = i | 16;
            alml.d = str3;
        }
        return (alml) o.i();
    }
}
