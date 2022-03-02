package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ikp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ikp {
    private static final AtomicReference a = new AtomicReference((Object) null);

    private ikp() {
    }

    public static void a(Context context) {
        if (a.compareAndSet((Object) null, new ikp())) {
            try {
                anjj anjj = new anjj();
                anjj.a = new aqcu(new ikj(context), new anjs());
                if (anjk.a.compareAndSet(false, true)) {
                    Object obj = anjj.a;
                    if (obj == null) {
                        obj = new anjs();
                    }
                    if (anjr.a.compareAndSet((Object) null, obj)) {
                        anjr.b();
                        return;
                    }
                    throw new IllegalStateException("Logger backends can only be configured once.");
                }
                throw new IllegalStateException("Logger backend configuration may only occur once.");
            } catch (IllegalStateException e) {
                Log.w("FloggerConfig", "Attempted to configure logger more than once.");
            } catch (NoSuchMethodError e2) {
                Log.w("FloggerConfig", "Flogger not available in this version of GMS Core.");
            }
        } else {
            Log.w("FloggerConfig", "Logger already initialized.");
        }
    }
}
