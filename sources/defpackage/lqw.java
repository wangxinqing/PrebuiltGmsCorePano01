package defpackage;

import android.content.Context;
import android.text.format.Time;

/* renamed from: lqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqw {
    public final Context a;
    public final lsl b;
    public final kyu c;
    public final int d;

    public lqw(Context context, Time time, kyu kyu, int i) {
        this.a = context;
        this.b = new lsl(context.getApplicationContext(), time);
        this.c = kyu;
        this.d = i;
    }
}
