package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: adwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adwd {
    static {
        TimeUnit.MINUTES.toMillis(10);
        SystemClock.elapsedRealtime();
    }

    public static void a(Status status, Object obj, acwd acwd) {
        if (status.c()) {
            acwd.a(obj);
        } else {
            acwd.a((Exception) irj.a(status));
        }
    }
}
