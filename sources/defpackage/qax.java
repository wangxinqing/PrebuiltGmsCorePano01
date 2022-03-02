package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: qax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qax implements amqy {
    static final amqy a = new qax();

    private qax() {
    }

    public final Object a(Object obj) {
        aorr aorr = (aorr) obj;
        amrl.a((Object) aorr);
        try {
            return aosr.a(aorr);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new aoqn((Error) cause);
            }
            throw new aosq(cause);
        }
    }
}
