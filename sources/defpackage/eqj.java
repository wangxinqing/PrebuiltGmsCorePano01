package defpackage;

import android.app.PendingIntent;

/* renamed from: eqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eqj {
    public Throwable a = null;
    public String b = null;
    private final int c;

    public eqj(int i) {
        this.c = i;
    }

    /* access modifiers changed from: package-private */
    public final nja a() {
        Throwable th;
        if (this.b == null && (th = this.a) != null) {
            this.b = th.getMessage();
        }
        nja nja = new nja(this.c, this.b, (PendingIntent) null, this.a);
        nja.b = !eqk.a.contains(Integer.valueOf(this.c));
        return nja;
    }
}
