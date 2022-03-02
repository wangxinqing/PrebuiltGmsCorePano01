package defpackage;

/* renamed from: vf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vf implements vo {
    final vo a;
    int b = 0;
    int c = -1;
    int d = -1;
    Object e = null;

    public vf(vo voVar) {
        this.a = voVar;
    }

    public final void a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.a(this.c, this.d);
            } else if (i != 2) {
                this.a.a(this.c, this.d, this.e);
            } else {
                this.a.b(this.c, this.d);
            }
            this.e = null;
            this.b = 0;
        }
    }

    public final void b(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 2;
    }

    public final void c(int i, int i2) {
        a();
        this.a.c(i, i2);
    }

    public final void a(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r5.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r6, int r7, java.lang.Object r8) {
        /*
            r5 = this;
            int r0 = r5.b
            r1 = 3
            if (r0 != r1) goto L_0x0025
            int r0 = r5.c
            int r2 = r5.d
            int r2 = r2 + r0
            if (r6 <= r2) goto L_0x000d
            goto L_0x0025
        L_0x000d:
            int r3 = r6 + r7
            if (r3 < r0) goto L_0x0025
            java.lang.Object r4 = r5.e
            if (r4 != r8) goto L_0x0025
            int r6 = java.lang.Math.min(r6, r0)
            r5.c = r6
            int r6 = java.lang.Math.max(r2, r3)
            int r7 = r5.c
            int r6 = r6 - r7
            r5.d = r6
            return
        L_0x0025:
            r5.a()
            r5.c = r6
            r5.d = r7
            r5.e = r8
            r5.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf.a(int, int, java.lang.Object):void");
    }
}
