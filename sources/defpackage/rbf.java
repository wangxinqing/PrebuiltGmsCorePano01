package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: rbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rbf implements Callable {
    private final Context a;

    public rbf(Context context) {
        this.a = context;
    }

    public final Object call() {
        return jgu.d(this.a, "com.google.android.gms");
    }
}
