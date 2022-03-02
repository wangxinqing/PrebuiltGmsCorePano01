package defpackage;

import android.content.Context;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: aplg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aplg {
    private static WeakReference b;
    public final iby a;

    public aplg() {
    }

    public static synchronized aplg a(Context context) {
        aplg aplg;
        synchronized (aplg.class) {
            iva.a((Object) context);
            if (b != null) {
                aplg = (aplg) b.get();
            } else {
                aplg = null;
            }
            if (aplg == null) {
                aplg = new aplg(context.getApplicationContext());
                b = new WeakReference(aplg);
            }
        }
        return aplg;
    }

    public aplg(Context context) {
        this.a = new iby(context, apmc.a, Looper.getMainLooper(), (igu) new apld());
    }
}
