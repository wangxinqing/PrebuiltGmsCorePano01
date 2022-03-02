package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.Thread;

/* renamed from: lwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lwh implements Thread.UncaughtExceptionHandler {
    public Thread.UncaughtExceptionHandler a;
    public boolean b;
    private final Context c;

    public lwh(Context context) {
        this.c = context;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Uncaught exception: ");
        sb.append(valueOf);
        sb.toString();
        try {
            new lxb(this.c).b(false, lxg.FORCE.ordinal());
        } catch (Exception e) {
            try {
                Log.e("CAR.DRIVINGMODE", "Crash on cleanup", e);
            } catch (Exception e2) {
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
