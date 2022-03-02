package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: akfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akfk {
    public Uri a;
    public int b = 2048;
    private int c = 2048;
    private final Context d;

    public akfk(Context context) {
        this.d = context.getApplicationContext();
    }

    public final akfl a() {
        akfl akfl = new akfl();
        if (!TextUtils.isEmpty((CharSequence) null)) {
            akfl.a = new Intent.ShortcutIconResource();
            akfl.a.packageName = null;
            akfl.a.resourceName = null;
        }
        int max = Math.max(this.c, this.b);
        if (max > 2048) {
            double d2 = (double) max;
            Double.isNaN(d2);
            double d3 = 2048.0d / d2;
            double d4 = (double) this.c;
            Double.isNaN(d4);
            this.c = (int) (d4 * d3);
            double d5 = (double) this.b;
            Double.isNaN(d5);
            this.b = (int) (d5 * d3);
        }
        akfl.b = this.a;
        akfl.c = this.c;
        akfl.d = this.b;
        akfl.e = this.d;
        akfl.f = 0;
        akfl.g = null;
        if (akfl.a != null || akfl.b != null) {
            return akfl;
        }
        throw new RuntimeException("Both Icon and ResourceUri are null");
    }

    public final void a(int i) {
        if (i > 0) {
            this.c = i;
            return;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Can't set width to ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
