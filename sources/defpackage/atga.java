package defpackage;

import android.os.StrictMode;
import android.util.Log;

/* renamed from: atga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atga {
    public static final atga a = new atga();
    private static final String b = atga.class.getSimpleName();

    private atga() {
    }

    public final StrictMode.ThreadPolicy a() {
        if (atfx.a(b, 5)) {
            Log.w(b, "Suppressed StrictMode policy violation: StrictModeDiskReadViolation");
        }
        return StrictMode.allowThreadDiskReads();
    }

    public final StrictMode.ThreadPolicy b() {
        StrictMode.ThreadPolicy a2 = a();
        if (atfx.a(b, 5)) {
            Log.w(b, "Suppressed StrictMode policy violation: StrictModeDiskWriteViolation");
        }
        StrictMode.allowThreadDiskWrites();
        return a2;
    }

    public final void a(StrictMode.ThreadPolicy threadPolicy) {
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
