package defpackage;

import android.app.Notification;

/* renamed from: tvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tvm implements Runnable {
    private final thb a;
    private final int b;
    private final Notification c;

    public tvm(thb thb, int i, Notification notification) {
        this.a = thb;
        this.b = i;
        this.c = notification;
    }

    public final void run() {
        thb thb = this.a;
        int i = this.b;
        Notification notification = this.c;
        int i2 = tvo.c;
        thb.a(i, notification);
    }
}
