package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: annl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class annl extends amvu {
    final /* synthetic */ annp a;
    private int b = 0;
    private final amsn c = amsn.b(amtd.a);

    public annl(annp annp) {
        this.a = annp;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        annp annp = this.a;
        int i = this.b;
        this.c.a(TimeUnit.MILLISECONDS);
        int d = annp.d(i);
        if (d < 0) {
            return (Integer) d();
        }
        this.b++;
        return Integer.valueOf(d);
    }
}
