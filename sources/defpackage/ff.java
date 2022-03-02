package defpackage;

import java.util.HashSet;

/* renamed from: ff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ff {
    final fg a;
    ff b;
    public int c = 0;
    int d = -1;
    public int e = 0;
    public fd f;
    final int g;
    public int h = 1;
    public int i = 1;

    public ff(fg fgVar, int i2) {
        this.a = fgVar;
        this.g = i2;
    }

    private final String a(HashSet hashSet) {
        String str;
        if (!hashSet.add(this)) {
            return "<-";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("null:");
        sb.append(fe.a(this.g));
        if (this.b != null) {
            str = " connected to " + this.b.a(hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = r3.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a() {
        /*
            r3 = this;
            fg r0 = r3.a
            int r0 = r0.K
            r1 = 8
            if (r0 == r1) goto L_0x001b
            int r0 = r3.d
            if (r0 < 0) goto L_0x0018
            ff r2 = r3.b
            if (r2 == 0) goto L_0x0018
            fg r2 = r2.a
            int r2 = r2.K
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            return r0
        L_0x0018:
            int r0 = r3.c
            return r0
        L_0x001b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff.a():int");
    }

    public final void b() {
        this.b = null;
        this.c = 0;
        this.d = -1;
        this.h = 2;
        this.e = 0;
        this.i = 1;
    }

    public final boolean c() {
        return this.b != null;
    }

    public final void d() {
        fd fdVar = this.f;
        if (fdVar == null) {
            this.f = new fd(1);
        } else {
            fdVar.a();
        }
    }

    public final String toString() {
        String str;
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        sb.append("null:");
        sb.append(fe.a(this.g));
        if (this.b != null) {
            str = " connected to " + this.b.a(hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ff r10, int r11, int r12, int r13, int r14, boolean r15) {
        /*
            r9 = this;
            r0 = -1
            r1 = 2
            r2 = 0
            r3 = 1
            if (r10 != 0) goto L_0x0012
            r10 = 0
            r9.b = r10
            r9.c = r2
            r9.d = r0
            r9.h = r3
            r9.e = r1
            return
        L_0x0012:
            if (r15 != 0) goto L_0x0076
            int r15 = r10.g
            int r4 = r9.g
            r5 = 6
            if (r15 == r4) goto L_0x005f
            int r4 = r4 + r0
            r0 = 8
            r6 = 4
            if (r4 == r3) goto L_0x0049
            r7 = 9
            r8 = 3
            if (r4 == r1) goto L_0x0034
            if (r4 == r8) goto L_0x0049
            if (r4 == r6) goto L_0x0034
            if (r4 == r5) goto L_0x002d
            goto L_0x0075
        L_0x002d:
            if (r15 == r5) goto L_0x0075
            if (r15 == r0) goto L_0x0075
            if (r15 == r7) goto L_0x0075
            goto L_0x005e
        L_0x0034:
            if (r15 == r8) goto L_0x003c
            r0 = 5
            if (r15 != r0) goto L_0x003a
            goto L_0x003d
        L_0x003a:
            r3 = 0
            goto L_0x003d
        L_0x003c:
        L_0x003d:
            fg r0 = r10.a
            boolean r0 = r0 instanceof defpackage.fi
            if (r0 != 0) goto L_0x0044
            goto L_0x005c
        L_0x0044:
            if (r3 != 0) goto L_0x005e
            if (r15 == r7) goto L_0x005e
            goto L_0x0075
        L_0x0049:
            if (r15 == r1) goto L_0x0050
            if (r15 != r6) goto L_0x004e
            goto L_0x0051
        L_0x004e:
            r3 = 0
            goto L_0x0051
        L_0x0050:
        L_0x0051:
            fg r1 = r10.a
            boolean r1 = r1 instanceof defpackage.fi
            if (r1 == 0) goto L_0x005c
            if (r3 != 0) goto L_0x0076
            if (r15 != r0) goto L_0x0075
            goto L_0x0076
        L_0x005c:
            if (r3 == 0) goto L_0x0075
        L_0x005e:
            goto L_0x0076
        L_0x005f:
            r15 = 7
            if (r4 == r15) goto L_0x0075
            if (r4 != r5) goto L_0x0076
            fg r15 = r10.a
            boolean r15 = r15.k()
            if (r15 == 0) goto L_0x0075
            fg r15 = r9.a
            boolean r15 = r15.k()
            if (r15 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            return
        L_0x0076:
            r9.b = r10
            if (r11 <= 0) goto L_0x007d
            r9.c = r11
            goto L_0x007f
        L_0x007d:
            r9.c = r2
        L_0x007f:
            r9.d = r12
            r9.h = r13
            r9.e = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff.a(ff, int, int, int, int, boolean):void");
    }
}
