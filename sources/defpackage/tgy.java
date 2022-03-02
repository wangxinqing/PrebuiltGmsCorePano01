package defpackage;

import android.app.Notification;

/* renamed from: tgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tgy implements Runnable {
    private final thb a;
    private final int b;
    private final Notification c;

    public tgy(thb thb, int i, Notification notification) {
        this.a = thb;
        this.b = i;
        this.c = notification;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
