package defpackage;

import com.android.volley.toolbox.ImageLoader;

/* renamed from: bfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bfm implements Runnable {
    final /* synthetic */ ImageLoader.ImageContainer a;
    final /* synthetic */ bfn b;

    public bfm(bfn bfn, ImageLoader.ImageContainer imageContainer) {
        this.b = bfn;
        this.a = imageContainer;
    }

    public final void run() {
        this.b.onResponse(this.a, false);
    }
}
