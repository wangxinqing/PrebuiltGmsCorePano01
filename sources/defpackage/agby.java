package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: agby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agby implements Runnable {
    private final agcd a;
    private final Drawable b;

    public agby(agcd agcd, Drawable drawable) {
        this.a = agcd;
        this.b = drawable;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
