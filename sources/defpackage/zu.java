package defpackage;

/* renamed from: zu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zu {
    long a = 0;
    zu b;

    private final void b() {
        if (this.b == null) {
            this.b = new zu();
        }
    }

    public final void a() {
        this.a = 0;
        zu zuVar = this.b;
        if (zuVar != null) {
            zuVar.a();
        }
    }

    public final boolean c(int i) {
        if (i < 64) {
            return (this.a & (1 << i)) != 0;
        }
        b();
        return this.b.c(i - 64);
    }

    public final boolean d(int i) {
        boolean z;
        if (i < 64) {
            long j = 1 << i;
            long j2 = this.a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (j ^ -1);
            this.a = j3;
            long j4 = j - 1;
            this.a = Long.rotateRight((j4 ^ -1) & j3, 1) | (j3 & j4);
            zu zuVar = this.b;
            if (zuVar != null) {
                if (zuVar.c(0)) {
                    a(63);
                }
                this.b.d(0);
            }
            return z;
        }
        b();
        return this.b.d(i - 64);
    }

    /* access modifiers changed from: package-private */
    public final int e(int i) {
        zu zuVar = this.b;
        if (zuVar != null) {
            if (i >= 64) {
                return zuVar.e(i - 64) + Long.bitCount(this.a);
            }
            return Long.bitCount(this.a & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.a & ((1 << i) - 1));
        } else {
            return Long.bitCount(this.a);
        }
    }

    public final String toString() {
        if (this.b == null) {
            return Long.toBinaryString(this.a);
        }
        return this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }

    public final void a(int i) {
        if (i < 64) {
            this.a |= 1 << i;
            return;
        }
        b();
        this.b.a(i - 64);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        if (i >= 64) {
            zu zuVar = this.b;
            if (zuVar != null) {
                zuVar.b(i - 64);
                return;
            }
            return;
        }
        this.a &= (1 << i) ^ -1;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, boolean z) {
        if (i < 64) {
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            long j3 = (-1 ^ j2) & j;
            this.a = (j & j2) | (j3 + j3);
            if (z) {
                a(i);
            } else {
                b(i);
            }
            if (z2 || this.b != null) {
                b();
                this.b.a(0, z2);
                return;
            }
            return;
        }
        b();
        this.b.a(i - 64, z);
    }
}
