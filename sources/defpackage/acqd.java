package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: acqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acqd {
    public static Status a(acwa acwa) {
        try {
            acws.a(acwa);
            return Status.a;
        } catch (InterruptedException | ExecutionException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return a(acwa.e());
        }
    }

    private static Status a(ibr ibr) {
        return new Status(ibr.a());
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
}
