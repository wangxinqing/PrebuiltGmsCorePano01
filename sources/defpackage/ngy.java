package defpackage;

import android.content.Context;
import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: ngy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ngy {
    private final hol a;

    public ngy() {
        this.a = null;
    }

    public static final apxn a(int i, int i2, String str, long j) {
        apxl apxl = (apxl) apxn.f.o();
        if (apxl.c) {
            apxl.c();
            apxl.c = false;
        }
        apxn apxn = (apxn) apxl.b;
        apxn.b = i - 1;
        int i3 = apxn.a | 1;
        apxn.a = i3;
        str.getClass();
        apxn.a = i3 | 2;
        apxn.c = str;
        aucd o = apxp.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        apxp apxp = (apxp) o.b;
        apxp.d = 0;
        int i4 = apxp.a | 4;
        apxp.a = i4;
        int i5 = i4 | 16;
        apxp.a = i5;
        apxp.f = i2;
        apxp.a = i5 | 2;
        apxp.c = j;
        apxp apxp2 = (apxp) o.i();
        if (apxl.c) {
            apxl.c();
            apxl.c = false;
        }
        apxn apxn2 = (apxn) apxl.b;
        apxp2.getClass();
        apxn2.a();
        apxn2.d.add(apxp2);
        return (apxn) apxl.i();
    }

    public ngy(Context context) {
        this.a = new hol(context, "DL_FONTS", (String) null);
    }

    public static apxq a(FontMatchSpec fontMatchSpec) {
        aucd o = apxq.g.o();
        String str = fontMatchSpec.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        apxq apxq = (apxq) o.b;
        str.getClass();
        int i = apxq.a | 1;
        apxq.a = i;
        apxq.b = str;
        int i2 = fontMatchSpec.d;
        int i3 = i | 4;
        apxq.a = i3;
        apxq.d = i2;
        float f = fontMatchSpec.c;
        int i4 = i3 | 2;
        apxq.a = i4;
        apxq.c = f;
        float f2 = fontMatchSpec.e;
        int i5 = i4 | 8;
        apxq.a = i5;
        apxq.e = f2;
        boolean z = fontMatchSpec.f;
        apxq.a = i5 | 64;
        apxq.f = z;
        return (apxq) o.i();
    }

    public final void a(int i, int i2, String str) {
        a(a(i, i2, str, 0));
    }

    public final void a(apxn apxn) {
        ngz.c("FontsClearcutWrapper", "Logging to Clearcut %s", apxn.toString());
        this.a.a(apxn.k()).b();
    }
}
