package defpackage;

import android.content.Intent;

/* renamed from: gnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gnw {
    public final int a;
    public final Intent b;
    public final int c;
    public final Intent d;
    public final int e;
    public final int f;

    private gnw(int i, Intent intent, int i2, Intent intent2, int i3, int i4) {
        this.a = i;
        this.b = intent;
        this.c = i2;
        this.d = intent2;
        this.e = i3;
        this.f = i4;
    }

    public static gnw a(int i, Intent intent) {
        return new gnw(i, intent, 0, (Intent) null, -1, -1);
    }

    public static gnw b(int i, Intent intent) {
        return new gnw(0, (Intent) null, i, intent, -1, -1);
    }

    public final boolean a() {
        return this.b != null;
    }

    public static gnw a(int i, Intent intent, int i2, int i3) {
        return new gnw(i, intent, 0, (Intent) null, i2, i3);
    }

    public static gnw b(int i, Intent intent, int i2, int i3) {
        return new gnw(0, (Intent) null, i, intent, i2, i3);
    }
}
