package defpackage;

import android.os.SystemClock;

/* renamed from: aeii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeii {
    public final String a;
    public final long b = SystemClock.elapsedRealtime();
    public long c = 0;
    public long d = 0;

    public aeii(String str) {
        this.a = str;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return "END_LABEL".equals(this.a);
    }
}
