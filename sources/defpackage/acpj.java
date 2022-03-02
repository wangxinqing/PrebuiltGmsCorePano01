package defpackage;

import android.os.Looper;
import java.lang.Thread;

/* renamed from: acpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpj implements Thread.UncaughtExceptionHandler {
    private static final iwd c = acqa.a("Utils", "CascadingUncaughtExceptionHandler");
    public final Thread.UncaughtExceptionHandler a;
    final /* synthetic */ acpx b;

    public acpj(acpx acpx, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = acpx;
        this.a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        iwd iwd = c;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Uncaught exception: ");
        sb.append(valueOf);
        iwd.b(sb.toString(), new Object[0]);
        try {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper.getThread() != thread) {
                new qvr(mainLooper).post(new acpw(this));
            } else {
                this.b.a();
            }
        } catch (Exception e) {
            try {
                c.e("Error reporting crash", e, new Object[0]);
            } catch (Exception e2) {
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
