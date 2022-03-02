package defpackage;

import java.util.Arrays;

/* renamed from: csl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class csl {
    public final aqso a;
    public final long b;
    public final boolean c;

    public csl(aqso aqso, long j) {
        this(aqso, j, false);
    }

    public final boolean a() {
        return this.a.b == 1000;
    }

    public final aqpp b() {
        aqso aqso = this.a;
        int i = aqso.b;
        if (i == 1000) {
            return csm.b;
        }
        if (i == 3) {
            return (aqpp) ((aqsv) aqso.c).a.get(0);
        }
        return csm.c;
    }

    public final boolean c() {
        long j;
        if (a()) {
            return true;
        }
        if (this.a.e) {
            j = awgs.a.a().x();
        } else {
            j = awgs.a.a().y();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.b;
        if (j + j2 < currentTimeMillis || currentTimeMillis < j2) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof csl) {
            csl csl = (csl) obj;
            return this.b == csl.b && this.c == csl.c && amqx.a(this.a, csl.a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public csl(aqso aqso, long j, boolean z) {
        this.a = aqso;
        this.b = j;
        this.c = z;
    }

    public csl(aqsr aqsr) {
        this.a = csm.a(aqsr);
        this.b = 0;
        this.c = false;
    }
}
