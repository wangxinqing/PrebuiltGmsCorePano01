package defpackage;

import android.os.SystemClock;

/* renamed from: nuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nuf extends nug {
    long a = SystemClock.elapsedRealtime();
    int b = 0;

    public nuf(amnc amnc) {
        super(amnc);
    }

    public final int a() {
        return 2;
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        return this.a + (((long) Math.scalb((float) axlc.a.a().r(), this.b)) * 1000);
    }

    public final String toString() {
        String nug = super.toString();
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(nug).length() + 20);
        sb.append(nug);
        sb.append(" retries=");
        sb.append(i);
        return sb.toString();
    }
}
