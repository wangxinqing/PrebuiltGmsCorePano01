package defpackage;

import java.io.InputStream;

/* renamed from: ammo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ammo extends ammi {
    private final ammi a;
    private final long b;
    private final long c;

    public ammo(ammi ammi, long j, long j2) {
        this.a = ammi;
        long a2 = a(j);
        this.b = a2;
        this.c = a(a2 + j2);
    }

    private final long a(long j) {
        long j2 = 0;
        if (j >= 0) {
            j2 = ((ammk) this.a).b;
            if (j <= j2) {
                return j;
            }
        }
        return j2;
    }

    public final long a() {
        return this.c - this.b;
    }

    public final void close() {
    }

    /* access modifiers changed from: protected */
    public final InputStream a(long j, long j2) {
        long a2 = a(this.b + j);
        return this.a.a(a2, a(j2 + a2) - a2);
    }
}
