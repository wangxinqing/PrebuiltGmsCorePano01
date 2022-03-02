package defpackage;

import android.net.Uri;

/* renamed from: afrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afrx implements Runnable {
    final /* synthetic */ Uri a;
    final /* synthetic */ afrz b;

    public afrx(afrz afrz, Uri uri) {
        this.b = afrz;
        this.a = uri;
    }

    public final void run() {
        this.b.a.remove(this.a);
    }
}
