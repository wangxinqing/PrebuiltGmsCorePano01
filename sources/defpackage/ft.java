package defpackage;

import android.util.Log;

/* renamed from: ft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ft implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public ft(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final void run() {
        try {
            if (fv.d != null) {
                fv.d.invoke(this.a, new Object[]{this.b, false, "AppCompat recreation"});
                return;
            }
            fv.e.invoke(this.a, new Object[]{this.b, false});
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
