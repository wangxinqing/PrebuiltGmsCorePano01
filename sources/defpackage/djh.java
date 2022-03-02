package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: djh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class djh {
    public static final Object e = new Object();
    public final WeakReference a;
    public WeakReference b = null;
    public WeakReference c = null;
    public final Handler d;

    public djh(View view) {
        this.a = new WeakReference(view);
        this.d = new qvr(Looper.getMainLooper());
    }
}
