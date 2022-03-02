package defpackage;

import com.google.android.gms.auth.account.accounttransfer.AccountBootstrapPayload;
import com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: ejp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ejp {
    private static Status a(ibr ibr) {
        return new Status(ibr.a());
    }

    public static void b(etl etl) {
        etl.a("com.google", 2);
    }

    public static Status a(Exception exc) {
        if (exc instanceof ibr) {
            return a((ibr) exc);
        }
        if (exc instanceof ExecutionException) {
            Throwable cause = exc.getCause();
            if (cause instanceof ibr) {
                return a((ibr) cause);
            }
        }
        return Status.c;
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new ejk("null");
    }

    public static void a(etl etl) {
        a(etl, "com.google");
    }

    public static void a(etl etl, AccountBootstrapPayload accountBootstrapPayload) {
        byte[] h = accountBootstrapPayload.h();
        iva.a((Object) "com.google");
        iva.a((Object) h);
        etl.b((ihb) new esw(new SendDataRequest("com.google", h)));
    }

    public static void a(etl etl, String str) {
        etl.a(str, 1);
    }

    public static Object[] a(Object[] objArr) {
        a((Object) objArr);
        if (objArr.length != 0) {
            return objArr;
        }
        throw new ejk("empty");
    }
}
