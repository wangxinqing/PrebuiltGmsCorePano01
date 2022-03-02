package defpackage;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: aieo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aieo {
    private static final HandlerThread a;
    private static acrz b = null;
    private static aidf c = null;

    static {
        HandlerThread handlerThread = new HandlerThread("FlpThread");
        a = handlerThread;
        handlerThread.start();
    }

    public static acrz a(Context context) {
        acrz acrz;
        synchronized (a) {
            if (b == null) {
                acrz acrz2 = new acrz(context, 1, "GCoreFlp", "FusionThread", "com.google.android.gms");
                b = acrz2;
                acrz2.a(true);
            }
            acrz = b;
        }
        return acrz;
    }

    public static aidf b() {
        synchronized (a) {
            if (c == null) {
                c = new aidf((int) ayap.a.a().eventLogSize());
            }
        }
        return c;
    }

    public static Looper a() {
        return a.getLooper();
    }
}
