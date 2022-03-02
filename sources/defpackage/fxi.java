package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: fxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fxi {
    public static aosq a(ibr ibr) {
        return new aosq(ibr);
    }

    public static Status b(ibr ibr) {
        if (ibr instanceof icj) {
            return new Status(ibr.a(), ibr.getMessage(), ((icj) ibr).c());
        }
        return new Status(ibr.a(), ibr.getMessage());
    }

    public static ibr a(Throwable th) {
        if ((th instanceof ExecutionException) || (th instanceof aosq)) {
            Throwable cause = th.getCause();
            return cause == null ? new ibr(Status.c) : a(cause);
        } else if (th instanceof ibr) {
            return (ibr) th;
        } else {
            return new ibr(Status.c);
        }
    }
}
