package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: prj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class prj implements Runnable {
    final /* synthetic */ prk a;

    public prj(prk prk) {
        this.a = prk;
    }

    public final void run() {
        ifn ifn;
        hxj hxj = hxj.a;
        aagp aagp = this.a.b;
        iva.a((Object) aagp, (Object) "Requested API must not be null.");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(aagp);
        arrayList.addAll(Arrays.asList(new icd[0]));
        synchronized (ifn.f) {
            iva.a((Object) ifn.g, (Object) "Must guarantee manager is non-null before using getInstance");
            ifn = ifn.g;
        }
        idd idd = new idd(arrayList);
        Handler handler = ifn.o;
        handler.sendMessage(handler.obtainMessage(2, idd));
        try {
            acws.a(idd.b.a.a(hxh.a), 5000, TimeUnit.MILLISECONDS);
            this.a.c.b(16003);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.a.c.b(16005);
        }
    }
}
