package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* renamed from: crm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class crm implements aora {
    final /* synthetic */ crq a;

    public crm(crq crq) {
        this.a = crq;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        wla wla = (wla) obj;
        xfh b = wla.b();
        if (b != null) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                xaa xaa = (xaa) it.next();
                crq crq = this.a;
                String c = xaa.c();
                String d = xaa.d();
                if (!TextUtils.isEmpty(d)) {
                    cro cro = (cro) crq.b.get(c);
                    if (cro == null) {
                        cro = new cro();
                    }
                    cro.a = d;
                    crq.b.put(c, cro);
                }
            }
            b.c();
        }
        wla.c();
    }

    public final void a(Throwable th) {
        Log.e("AccountChipArrayAdapter", "Failed to load owner", th);
    }
}
