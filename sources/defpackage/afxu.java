package defpackage;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: afxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afxu {
    public final afym a;

    public afxu(afym afym) {
        this.a = afym;
    }

    public static Object a(aorr aorr) {
        try {
            return aorr.get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            amrl.a((Object) cause);
            amtb.a(cause, IOException.class);
            throw new IllegalStateException(e);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new IOException(e2);
        }
    }
}
