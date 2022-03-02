package defpackage;

import java.io.IOException;
import java.util.HashSet;

/* renamed from: aerv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aerv {
    public static final anax a = anax.a(aomr.BAD_AUTHENTICATION, aomr.NETWORK_ERROR, aomr.AUTH_INTERNAL_ERROR);

    static aomr a(Exception exc) {
        HashSet hashSet = new HashSet();
        for (Throwable th : amtb.c(exc)) {
            hashSet.add(th.getClass());
        }
        if ((amtb.b(exc) instanceof IOException) && exc.getMessage() != null && exc.getMessage().contains("NetworkError")) {
            return aomr.NETWORK_ERROR;
        }
        if (amtb.b(exc) instanceof IOException) {
            return aomr.IO_EXCEPTION;
        }
        if (hashSet.contains(aetl.class) && exc.getMessage() != null && exc.getMessage().contains("BadAuthentication")) {
            return aomr.BAD_AUTHENTICATION;
        }
        if (hashSet.contains(aetl.class)) {
            return aomr.USER_RECOVERABLE_AUTH_EXCEPTION;
        }
        if (hashSet.contains(aetk.class) && exc.getMessage() != null && exc.getMessage().contains("InternalError")) {
            return aomr.AUTH_INTERNAL_ERROR;
        }
        if (hashSet.contains(aetk.class)) {
            return aomr.AUTH_EXCEPTION;
        }
        return aomr.UNDEFINED;
    }
}
