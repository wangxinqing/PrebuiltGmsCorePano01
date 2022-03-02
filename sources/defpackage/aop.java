package defpackage;

import android.app.PendingIntent;
import android.support.v4.graphics.drawable.IconCompat;

/* renamed from: aop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aop implements apc {
    public final apd a;

    public aop(PendingIntent pendingIntent, IconCompat iconCompat, int i, CharSequence charSequence) {
        this.a = new apd(pendingIntent, iconCompat, i, charSequence);
    }

    public static aop a(PendingIntent pendingIntent, IconCompat iconCompat, int i, CharSequence charSequence) {
        return new aop(pendingIntent, iconCompat, i, charSequence);
    }

    public final IconCompat a() {
        return this.a.b;
    }

    public final CharSequence b() {
        return this.a.c;
    }

    public final boolean c() {
        return this.a.d;
    }

    public final void a(anr anr) {
        PendingIntent a2 = this.a.a();
        anr a3 = this.a.a(anr);
        a3.a("shortcut", "title");
        anr.a(a2, a3.a(), this.a.b());
    }
}
