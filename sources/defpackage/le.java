package defpackage;

import android.graphics.Typeface;

/* renamed from: le  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class le implements Runnable {
    final /* synthetic */ Typeface a;
    final /* synthetic */ lg b;

    public le(lg lgVar, Typeface typeface) {
        this.b = lgVar;
        this.a = typeface;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
