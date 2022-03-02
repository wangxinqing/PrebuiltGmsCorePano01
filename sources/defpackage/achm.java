package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: achm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class achm implements Callable {
    final /* synthetic */ Context a;

    public achm(Context context) {
        this.a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return lxz.a(this.a, "android_d2d");
    }
}
