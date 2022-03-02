package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: agyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agyx implements Callable {
    private final Context a;

    public agyx(Context context) {
        this.a = context;
    }

    public final Object call() {
        return kf.b(this.a);
    }
}
