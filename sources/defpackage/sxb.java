package defpackage;

import android.net.Uri;

/* renamed from: sxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxb implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ Uri b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ sxc e;

    public sxb(sxc sxc, boolean z, Uri uri, String str, String str2) {
        this.e = sxc;
        this.a = z;
        this.b = uri;
        this.c = str;
        this.d = str2;
    }

    public final void run() {
        this.e.a(this.a, this.b, this.c, this.d);
    }
}
