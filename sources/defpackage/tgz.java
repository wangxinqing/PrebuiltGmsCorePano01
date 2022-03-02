package defpackage;

import android.app.Notification;

/* renamed from: tgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tgz implements Runnable {
    private final thb a;
    private final String b;
    private final int c;
    private final Notification d;

    public tgz(thb thb, String str, int i, Notification notification) {
        this.a = thb;
        this.b = str;
        this.c = i;
        this.d = notification;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d);
    }
}
