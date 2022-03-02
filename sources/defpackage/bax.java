package defpackage;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bax implements avf {
    private static final Set a = new HashSet();

    public final void a(String str, Throwable th) {
        if (!a.contains(str)) {
            Log.w("LOTTIE", str, th);
            a.add(str);
        }
    }
}
