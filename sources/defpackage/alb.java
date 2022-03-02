package defpackage;

import android.graphics.Color;

/* renamed from: alb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alb {
    public final int a;
    public final int b;
    public final int c;

    public alb(int i, int i2, int i3) {
        this.a = i;
        if (i2 == i) {
            i2 = Color.argb((int) ((((float) Color.alpha(i)) * 0.85f) + 38.25f), (int) ((((float) Color.red(i)) * 0.85f) + 38.25f), (int) ((((float) Color.green(i)) * 0.85f) + 38.25f), (int) ((((float) Color.blue(i)) * 0.85f) + 38.25f));
        }
        this.b = i2;
        this.c = i3;
    }
}
