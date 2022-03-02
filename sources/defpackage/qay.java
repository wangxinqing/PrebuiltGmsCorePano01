package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: qay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qay {
    public static aorr a(amzy amzy, amqy amqy) {
        return aorl.c((Iterable) amzy).a((Callable) new qaw(amqy, amzy), (Executor) aoqm.a);
    }

    public static aorr a(aorr aorr) {
        return aopr.a(aorr, qau.a, (Executor) aoqm.a);
    }

    public static aorr a(aorr aorr, Object obj) {
        return aopr.a(aorr, amra.a(obj), (Executor) aoqm.a);
    }

    public static aorr a(Iterable iterable, amqy amqy) {
        return a(amzy.a(iterable), amqy);
    }
}
