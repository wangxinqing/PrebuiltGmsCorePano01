package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: lg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lg {
    public abstract void a(int i);

    public abstract void a(Typeface typeface);

    public final void b(int i) {
        new Handler(Looper.getMainLooper()).post(new lf(this, i));
    }

    public final void b(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new le(this, typeface));
    }
}
