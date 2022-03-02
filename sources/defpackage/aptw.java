package defpackage;

import com.google.android.chimera.FragmentTransaction;

/* renamed from: aptw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aptw implements aptv {
    private final String a;
    private final String b = "http://localhost";
    private final String c;

    public aptw(String str, String str2) {
        iva.c(str);
        this.a = str;
        this.c = str2;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        aucd o = allw.e.o();
        String str = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        allw allw = (allw) o.b;
        str.getClass();
        int i = allw.a | 1;
        allw.a = i;
        allw.b = str;
        String str2 = this.b;
        str2.getClass();
        int i2 = i | 2;
        allw.a = i2;
        allw.c = str2;
        String str3 = this.c;
        if (str3 != null) {
            str3.getClass();
            allw.a = i2 | FragmentTransaction.TRANSIT_EXIT_MASK;
            allw.d = str3;
        }
        return (allw) o.i();
    }
}
