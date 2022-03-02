package defpackage;

import android.app.PendingIntent;
import android.content.Context;

/* renamed from: ahma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahma implements jio {
    public final boolean a;
    public final boolean b;
    public final PendingIntent c;
    public final Object d;
    public final ajbg e;
    public final ajrb f;
    public final Context g;
    private final int h;
    private final String i;

    public ahma(Context context, int i2, String str, boolean z, boolean z2, PendingIntent pendingIntent, Object obj, ajrb ajrb, ajbg ajbg) {
        this.g = context;
        this.h = i2;
        this.i = str;
        this.a = z;
        this.b = z2;
        this.c = pendingIntent;
        this.d = obj;
        this.f = ajrb;
        this.e = ajbg;
    }

    public final int j() {
        return this.h;
    }

    public final String k() {
        return this.i;
    }

    public final String l() {
        return null;
    }

    public final String[] m() {
        return new String[]{axwu.b()};
    }
}
