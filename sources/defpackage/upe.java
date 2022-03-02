package defpackage;

import android.content.Context;

/* renamed from: upe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class upe implements Runnable {
    private final upf a;
    private final Context b;

    public upe(upf upf, Context context) {
        this.a = upf;
        this.b = context;
    }

    public final void run() {
        this.a.d(this.b);
    }
}
