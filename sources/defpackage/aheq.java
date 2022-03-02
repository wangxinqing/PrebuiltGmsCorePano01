package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: aheq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aheq implements aoqa {
    private final ahey a;
    private final aoqb b;
    private final Executor c;

    public aheq(ahey ahey, aoqb aoqb, Executor executor) {
        this.a = ahey;
        this.b = aoqb;
        this.c = executor;
    }

    public final aorr a() {
        aorr aorr;
        ahey ahey = this.a;
        aoqb aoqb = this.b;
        Executor executor = this.c;
        Uri uri = (Uri) aorl.a((Future) ahey.b);
        ahbm a2 = ahbm.a((Closeable) ahey.e.a(uri, ahcf.a(), new agzk[0]));
        try {
            aorr = aorl.a(ahey.a(uri));
        } catch (IOException e) {
            try {
                aorr = aopr.a(ahey.a(e), amll.a((aoqb) new ahev(ahey, uri)), ahey.d);
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        aorr a3 = aopr.a(aorr, aoqb, executor);
        aorr a4 = aopr.a(a3, amll.a((aoqb) new aher(ahey, aorr, a3)), (Executor) aoqm.a);
        aorr[] aorrArr = {a4};
        aorr a5 = aorl.b(aorrArr).a((Callable) new aheu(a2.a(), a4), (Executor) aoqm.a);
        a2.close();
        return a5;
        throw th;
    }
}
