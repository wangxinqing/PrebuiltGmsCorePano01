package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: akuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akuh implements Runnable {
    private final Context a;

    public akuh(Context context) {
        this.a = context;
    }

    public final void run() {
        jjc.a(new File(this.a.getCacheDir(), "simple_tensorflow_model_weights"));
    }
}
