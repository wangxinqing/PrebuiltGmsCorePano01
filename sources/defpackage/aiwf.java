package defpackage;

import android.os.IBinder;
import com.android.location.provider.ActivityRecognitionProvider;

/* renamed from: aiwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiwf implements aiwi {
    public static final Object a = new Object();
    public static ActivityRecognitionProvider b;
    private static final Object c = new Object();
    private static IBinder d;

    public final IBinder a() {
        IBinder iBinder;
        synchronized (c) {
            if (d == null) {
                d = new aiwe().getBinder();
            }
            iBinder = d;
        }
        return iBinder;
    }

    public final ActivityRecognitionProvider b() {
        ActivityRecognitionProvider activityRecognitionProvider;
        synchronized (a) {
            activityRecognitionProvider = b;
        }
        return activityRecognitionProvider;
    }
}
