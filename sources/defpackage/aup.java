package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: aup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aup implements Callable {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ Context b;
    final /* synthetic */ int c;

    public aup(WeakReference weakReference, Context context, int i) {
        this.a = weakReference;
        this.b = context;
        this.c = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Context context = (Context) this.a.get();
        if (context == null) {
            context = this.b;
        }
        return aus.b(context, this.c);
    }
}
