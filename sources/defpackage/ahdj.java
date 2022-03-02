package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ahdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahdj implements amqy {
    private final AtomicBoolean a;

    public ahdj(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    public final Object a(Object obj) {
        AtomicBoolean atomicBoolean = this.a;
        TimeoutException timeoutException = (TimeoutException) obj;
        TimeUnit timeUnit = ahdo.a;
        atomicBoolean.set(false);
        return null;
    }
}
