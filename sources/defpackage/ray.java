package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: ray  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ray implements amsv {
    private final Context a;
    private final Executor b;

    public ray(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public final Object a() {
        Context context = this.a;
        return aorl.a((Callable) new rbf(context), this.b);
    }
}
