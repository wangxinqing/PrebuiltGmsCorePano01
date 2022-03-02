package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: hdh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hdh {
    public static Context a;

    public static synchronized void a(Context context) {
        synchronized (hdh.class) {
            if (a != null) {
                Log.e("DynamiteAppCtx", "Duplicated init of DynamiteApplicationContext");
            } else {
                a = context;
            }
        }
    }
}
