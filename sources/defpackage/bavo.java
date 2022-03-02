package defpackage;

import java.net.URI;

/* renamed from: bavo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavo implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ bawc b;

    public bavo(bawc bawc, String str) {
        this.b = bawc;
        this.a = str;
    }

    public final void run() {
        bawc bawc = this.b;
        bawc.p = URI.create(bawc.m).resolve(this.a).toString();
        bawc bawc2 = this.b;
        bawc2.f.add(bawc2.p);
        this.b.a(2, 3, new bavn(this));
    }
}
