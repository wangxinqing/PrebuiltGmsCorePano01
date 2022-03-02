package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.apache.http.params.HttpParams;

/* renamed from: iow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iow extends imt {
    public iow() {
        super("PhenotypeSafebootFix", Math.max(axbk.a.a().k(), 60), TimeUnit.MINUTES.toMillis(3));
    }

    /* access modifiers changed from: protected */
    public final boolean a(inb inb) {
        return axbk.a.a().j();
    }

    /* access modifiers changed from: protected */
    public final inb b(inb inb) {
        int i;
        ihs b = ihs.b();
        int i2 = iou.b;
        opc opc = new opc((Context) b, yfi.a(b), true, hxz.g(b) ? opd.PERMIT_ALL : opd.PERMIT_NONE);
        HttpParams httpParams = opc.b;
        httpParams.setParameter("http.connection.timeout", Integer.valueOf(Math.max((int) azaf.b(), 30000)));
        httpParams.setParameter("http.socket.timeout", Integer.valueOf(Math.max((int) azaf.b(), 30000)));
        iou iou = new iou(b, new ior(), yfg.a(b), new ioq(opc, yiu.e()));
        ilb ilb = new ilb(b, new iov(b));
        try {
            iou.a(18, "com.google.android.gms", (avta) avtd.h.o());
            ilb.a();
            i = 3;
        } catch (yfy e) {
            if (e.a == 29504) {
                Log.e("PhenotypeSafebootFix", e.toString());
                Log.e("PhenotypeSafebootFix", "task failed");
                i = 5;
            } else {
                throw e;
            }
        }
        ina d = inb.d();
        d.a(this, i);
        return d.a();
    }
}
