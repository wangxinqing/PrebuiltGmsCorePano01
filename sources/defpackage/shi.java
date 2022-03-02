package defpackage;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: shi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class shi {
    static Exception a(Exception exc) {
        if (exc instanceof ExecutionException) {
            ExecutionException executionException = (ExecutionException) exc;
            amqy amqy = shh.a;
            Throwable cause = executionException.getCause();
            amrl.a((Object) cause, (Object) "Execution exceptions must have a cause!");
            return cause instanceof Exception ? (Exception) amqy.a((Exception) cause) : executionException;
        } else if (!(exc instanceof babl)) {
            return exc instanceof IOException ? new sld(exc) : exc;
        } else {
            babj babj = ((babl) exc).a;
            babg babg = babg.OK;
            int ordinal = babj.r.ordinal();
            if (ordinal == 1 || ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 14) {
                return new slg(exc);
            }
            if (ordinal != 16) {
                return new sld(exc);
            }
            return new slc(exc);
        }
    }

    public static aorr b(Exception exc) {
        return aorl.a((Throwable) a(exc));
    }
}
