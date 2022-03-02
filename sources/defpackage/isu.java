package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.Thread;

/* renamed from: isu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class isu implements Thread.UncaughtExceptionHandler {
    protected final Context a;
    private Thread.UncaughtExceptionHandler b;

    protected isu(Context context) {
        ism ism = new ism();
        iva.a((Object) context, (Object) "Context cannot be null.");
        this.a = context;
        iva.a((Object) ism, (Object) "exceptionHandlerUtils cannot be null.");
    }

    public final void a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (!getClass().isInstance(defaultUncaughtExceptionHandler)) {
            this.b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(Thread thread, Throwable th);

    public final void uncaughtException(Thread thread, Throwable th) {
        Throwable th2;
        try {
            if (!a(thread, th)) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
                if (uncaughtExceptionHandler == null) {
                    Log.e("BaseUncaughtHandler", "No handler available which handled the exception. Original exception: ", th);
                    jhg.e();
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
                return;
            }
            return;
        } catch (RuntimeException e) {
            Log.e("BaseUncaughtHandler", "Hit an exception while processing the UncaughtExceptionHandler. Original exception: ", th);
            throw e;
        } catch (Throwable th3) {
            th2 = th3;
            th = e;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.b;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th);
        }
        throw th2;
    }
}
