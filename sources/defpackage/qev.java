package defpackage;

import android.os.SystemClock;

/* renamed from: qev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qev {
    final /* synthetic */ qex a;
    private final long b;

    public qev(qex qex) {
        this.a = qex;
        this.b = -1;
    }

    public final long a() {
        return SystemClock.elapsedRealtime() - this.b;
    }

    public qev(qex qex, long j) {
        this.a = qex;
        this.b = SystemClock.elapsedRealtime() - j;
    }

    public final void a(String str) {
        if (this.b >= 0 && this.a.a != null) {
            long a2 = a();
            Object[] objArr = {str, Long.valueOf(a2)};
            this.a.a(str).a(a2);
        }
    }
}
