package defpackage;

import android.view.View;

/* renamed from: ajv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajv {
    final /* synthetic */ akb a;

    public ajv(akb akb) {
        this.a = akb;
    }

    public final int a() {
        return this.a.f;
    }

    public final int b() {
        return this.a.e.a() + this.a.f;
    }

    public final int c(int i) {
        akb akb = this.a;
        return akb.n(akb.b(i - akb.f));
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r6, boolean r7, java.lang.Object[] r8, boolean r9) {
        /*
            r5 = this;
            akb r0 = r5.a
            int r1 = r0.f
            int r1 = r6 - r1
            android.view.View r0 = r0.i(r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            ajy r1 = (defpackage.ajy) r1
            boolean r1 = r1.a()
            r2 = 0
            if (r1 == 0) goto L_0x0019
            goto L_0x00fc
        L_0x0019:
            if (r9 != 0) goto L_0x0029
            if (r7 != 0) goto L_0x0023
            akb r7 = r5.a
            r7.b((android.view.View) r0, (int) r2)
            goto L_0x0036
        L_0x0023:
            akb r7 = r5.a
            r7.b((android.view.View) r0)
            goto L_0x0036
        L_0x0029:
            if (r7 != 0) goto L_0x0031
            akb r7 = r5.a
            r7.a((android.view.View) r0, (int) r2)
            goto L_0x0036
        L_0x0031:
            akb r7 = r5.a
            r7.a((android.view.View) r0)
        L_0x0036:
            akb r7 = r5.a
            int r7 = r7.p
            r9 = -1
            if (r7 != r9) goto L_0x003e
            goto L_0x0042
        L_0x003e:
            r0.setVisibility(r2)
        L_0x0042:
            akb r7 = r5.a
            ajz r7 = r7.o
            if (r7 != 0) goto L_0x004a
            goto L_0x00b3
        L_0x004a:
            boolean r9 = r7.m
            if (r9 != 0) goto L_0x00b3
            int r9 = r7.p
            if (r9 == 0) goto L_0x00b3
            if (r9 > 0) goto L_0x005c
            akb r9 = r7.q
            int r1 = r9.m
            int r9 = r9.J
            int r1 = r1 - r9
            goto L_0x0063
        L_0x005c:
            akb r9 = r7.q
            int r1 = r9.m
            int r9 = r9.J
            int r1 = r1 + r9
        L_0x0063:
            r9 = 0
        L_0x0064:
            int r3 = r7.p
            if (r3 == 0) goto L_0x0096
            android.view.View r3 = r7.b(r1)
            if (r3 == 0) goto L_0x0096
            akb r4 = r7.q
            boolean r4 = r4.p((android.view.View) r3)
            if (r4 == 0) goto L_0x0086
            akb r9 = r7.q
            r9.m = r1
            int r9 = r7.p
            if (r9 <= 0) goto L_0x0081
            int r9 = r9 + -1
            goto L_0x0083
        L_0x0081:
            int r9 = r9 + 1
        L_0x0083:
            r7.p = r9
            r9 = r3
        L_0x0086:
            int r3 = r7.p
            if (r3 > 0) goto L_0x0090
            akb r3 = r7.q
            int r3 = r3.J
            int r1 = r1 - r3
            goto L_0x0064
        L_0x0090:
            akb r3 = r7.q
            int r3 = r3.J
            int r1 = r1 + r3
            goto L_0x0064
        L_0x0096:
            if (r9 == 0) goto L_0x00b3
            akb r1 = r7.q
            boolean r1 = r1.w()
            if (r1 == 0) goto L_0x00b3
            akb r1 = r7.q
            int r3 = r1.k
            r3 = r3 | 32
            r1.k = r3
            r9.requestFocus()
            akb r7 = r7.q
            int r9 = r7.k
            r9 = r9 & -33
            r7.k = r9
        L_0x00b3:
            android.view.View r7 = r0.findFocus()
            defpackage.akb.a((android.view.View) r0, (android.view.View) r7)
            akb r7 = r5.a
            int r9 = r7.k
            r1 = r9 & 3
            r3 = 1
            if (r1 != r3) goto L_0x00ec
            r1 = r9 & 4
            if (r1 != 0) goto L_0x00f7
            r9 = r9 & 16
            if (r9 != 0) goto L_0x00d4
            int r9 = r7.m
            if (r6 == r9) goto L_0x00d0
            goto L_0x00f7
        L_0x00d0:
            r7.k()
            goto L_0x00f7
        L_0x00d4:
            int r7 = r7.m
            if (r6 < r7) goto L_0x00f7
            boolean r7 = r0.hasFocusable()
            if (r7 == 0) goto L_0x00f7
            akb r7 = r5.a
            r7.m = r6
            int r6 = r7.k
            r6 = r6 & -17
            r7.k = r6
            r7.k()
            goto L_0x00f7
        L_0x00ec:
            int r9 = r7.m
            if (r6 != r9) goto L_0x00f7
            ajz r6 = r7.o
            if (r6 != 0) goto L_0x00f7
            r7.k()
        L_0x00f7:
            akb r6 = r5.a
            r6.o((android.view.View) r0)
        L_0x00fc:
            r8[r2] = r0
            akb r6 = r5.a
            int r6 = r6.d
            if (r6 == 0) goto L_0x0109
            int r6 = defpackage.akb.q((android.view.View) r0)
            goto L_0x010d
        L_0x0109:
            int r6 = defpackage.akb.r(r0)
        L_0x010d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajv.a(int, boolean, java.lang.Object[], boolean):int");
    }

    public final int b(int i) {
        akb akb = this.a;
        View b = akb.b(i - akb.f);
        akb akb2 = this.a;
        return (akb2.k & 262144) == 0 ? akb2.l(b) : akb2.m(b);
    }

    public final void a(int i) {
        akb akb = this.a;
        View b = akb.b(i - akb.f);
        akb akb2 = this.a;
        if ((akb2.k & 3) == 1) {
            akb2.a(b, akb2.j);
        } else {
            akb2.b(b, akb2.j);
        }
    }

    public final void a(Object obj, int i, int i2, int i3) {
        int i4;
        int i5;
        ajz ajz;
        int i6;
        View view = (View) obj;
        if (i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE) {
            akb akb = this.a;
            if (akb.K.b) {
                ali ali = akb.L.d;
                i3 = ali.f - ali.h;
            } else {
                i3 = akb.L.d.g;
            }
        }
        akb akb2 = this.a;
        if (akb2.K.b) {
            i5 = i3 - i;
            i4 = i3;
        } else {
            i4 = i + i3;
            i5 = i3;
        }
        int j = akb2.j(i2);
        akb akb3 = this.a;
        akb3.a(i2, view, i5, i4, (j + akb3.L.e.g) - akb3.E);
        akb akb4 = this.a;
        if (!akb4.e.g) {
            akb4.C();
        }
        akb akb5 = this.a;
        if ((akb5.k & 3) != 1 && (ajz = akb5.o) != null) {
            if (ajz.m && (i6 = ajz.p) != 0) {
                ajz.p = ajz.q.a(true, i6);
            }
            int i7 = ajz.p;
            if (i7 == 0 || ((i7 > 0 && ajz.q.E()) || (ajz.p < 0 && ajz.q.F()))) {
                ajz.a = ajz.q.m;
                ajz.a();
            }
        }
    }
}
