package defpackage;

import android.app.Notification;

/* renamed from: jk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jk {
    final String a;
    final int b;
    final String c;
    final Notification d;

    public jk(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final String toString() {
        return "NotifyTask[" + "packageName:" + this.a + ", id:" + this.b + ", tag:" + this.c + "]";
    }
}
