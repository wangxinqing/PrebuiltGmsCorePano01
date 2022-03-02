package defpackage;

import java.io.InputStream;

/* renamed from: bafi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bafi implements Runnable {
    final /* synthetic */ InputStream a;
    final /* synthetic */ bafs b;

    public bafi(bafs bafs, InputStream inputStream) {
        this.b = bafs;
        this.a = inputStream;
    }

    public final void run() {
        this.b.d.a(this.a);
    }
}
