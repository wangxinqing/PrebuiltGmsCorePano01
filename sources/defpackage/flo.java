package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

/* renamed from: flo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class flo implements amqy {
    private final boolean a;

    public flo(boolean z) {
        this.a = z;
    }

    public final Object a(Object obj) {
        boolean z = this.a;
        wla wla = (wla) obj;
        if (wla.aO().c()) {
            amzt j = amzy.j();
            Iterator it = wla.b().iterator();
            while (it.hasNext()) {
                xaa xaa = (xaa) it.next();
                eug eug = new eug(xaa.c());
                if (z) {
                    eug.e = "https://accounts.google.com";
                }
                if (!TextUtils.isEmpty(xaa.d())) {
                    eug.a = xaa.d();
                }
                if (!TextUtils.isEmpty(xaa.f())) {
                    eug.f = xaa.f();
                }
                if (!TextUtils.isEmpty(xaa.g())) {
                    eug.g = xaa.g();
                }
                String i = xaa.i();
                if (!TextUtils.isEmpty(i)) {
                    eug.b = Uri.parse(i);
                }
                j.c(eug.a());
            }
            return j.a();
        }
        throw qbf.a((icl) wla).c();
    }
}
