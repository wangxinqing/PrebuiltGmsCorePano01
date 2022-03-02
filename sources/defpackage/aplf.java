package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: aplf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aplf {
    private static WeakReference a;

    public static synchronized aplf a(Context context) {
        aplf aplf;
        synchronized (aplf.class) {
            iva.a((Object) context);
            if (a != null) {
                aplf = (aplf) a.get();
            } else {
                aplf = null;
            }
            if (aplf == null) {
                aplf = new apmj(context.getApplicationContext());
                a = new WeakReference(aplf);
            }
        }
        return aplf;
    }

    public abstract acwa a(aplu... apluArr);

    public abstract acwa a(String... strArr);

    public abstract acwa b(aplu... apluArr);

    public abstract acwa b(String... strArr);
}
