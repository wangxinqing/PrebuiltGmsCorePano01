package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: yav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yav {
    private final Context a;
    private final yaz b;
    private final amsn c;
    private Long d = 0L;

    public yav(Context context, yaz yaz, amsn amsn) {
        this.a = context;
        this.b = yaz;
        this.c = amsn;
    }

    public final void a() {
        this.c.c();
        this.c.d();
        this.d = Long.valueOf(System.nanoTime() / 1000);
    }

    public final void a(String str, int i) {
        this.c.e();
        yba h = ybb.h();
        h.a = str;
        h.a(this.d.longValue());
        h.b(this.c.a(TimeUnit.MICROSECONDS));
        h.b(i);
        h.a(false);
        h.b = wmo.a(this.a);
        h.a(0);
        this.b.a(h.a());
    }

    public final void a(String str, int i, int i2) {
        this.c.e();
        yba h = ybb.h();
        h.a = str;
        h.a(this.d.longValue());
        h.b(this.c.a(TimeUnit.MICROSECONDS));
        h.b(i);
        h.a(true);
        h.b = wmo.a(this.a);
        h.a(i2);
        this.b.a(h.a());
    }
}
