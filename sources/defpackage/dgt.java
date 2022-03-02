package defpackage;

import android.content.Intent;

/* renamed from: dgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dgt implements csb {
    static final csb a = new dgt();

    private dgt() {
    }

    public final Object a(Object obj, Object obj2) {
        Throwable th = ((csn) obj2).c;
        String str = (String) ((amri) obj).c();
        cyf a2 = cyf.a(th, ihs.b());
        if (a2 == null) {
            if (str != null) {
                aucd o = aqrl.g.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aqrl aqrl = (aqrl) o.b;
                aqrl.a |= 1;
                aqrl.b = 19;
                a2 = new cyf(str, (String) null, (String) null, (aqrl) o.i(), false, (Intent) null);
            } else {
                a2 = null;
            }
        }
        return amri.c(a2);
    }
}
