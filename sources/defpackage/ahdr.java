package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: ahdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahdr implements aoqa {
    private final ahdy a;
    private final aoqb b;
    private final Executor c;

    public ahdr(ahdy ahdy, aoqb aoqb, Executor executor) {
        this.a = ahdy;
        this.b = aoqb;
        this.c = executor;
    }

    public final aorr a() {
        ahdy ahdy = this.a;
        aoqb aoqb = this.b;
        Executor executor = this.c;
        Uri uri = (Uri) aorl.a((Future) ahdy.b);
        ahbm a2 = ahbm.a((Closeable) ahdy.d.a(uri, ahcf.a(), new agzk[0]));
        try {
            aorr b2 = ahdy.b(uri);
            aorr a3 = aopr.a(b2, aoqb, executor);
            aorr a4 = aopr.a(a3, amll.a((aoqb) new ahdt(ahdy, b2, a3)), (Executor) aoqm.a);
            aorr[] aorrArr = {a4};
            aorr a5 = aorl.b(aorrArr).a((Callable) new ahdw(a2.a(), a4), (Executor) aoqm.a);
            a2.close();
            return a5;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
