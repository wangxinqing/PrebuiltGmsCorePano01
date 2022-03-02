package defpackage;

import java.util.Locale;

/* renamed from: abso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abso implements acek {
    final /* synthetic */ long a;
    final /* synthetic */ absp b;

    public abso(absp absp, long j) {
        this.b = absp;
        this.a = j;
    }

    public final void a() {
        String format = String.format(Locale.US, "A message was not received or sent for %d millis", new Object[]{Long.valueOf(this.a)});
        absq.h.e(format, new Object[0]);
        this.b.c.b(10580, format);
    }
}
