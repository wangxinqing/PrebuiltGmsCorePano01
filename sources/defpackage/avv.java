package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: avv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avv implements avw, awe, awl, axj {
    private final Matrix a;
    private final Path b;
    private final RectF c;
    private final String d;
    private final boolean e;
    private final List f;
    private final avc g;
    private List h;
    private axa i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public avv(defpackage.avc r8, defpackage.ayu r9, defpackage.ayn r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.a
            boolean r4 = r10.c
            java.util.List r0 = r10.b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = 0
        L_0x0011:
            int r6 = r0.size()
            if (r2 >= r6) goto L_0x002a
            java.lang.Object r6 = r0.get(r2)
            ayc r6 = (defpackage.ayc) r6
            avu r6 = r6.a(r8, r9)
            if (r6 != 0) goto L_0x0024
            goto L_0x0027
        L_0x0024:
            r5.add(r6)
        L_0x0027:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x002a:
            java.util.List r10 = r10.b
        L_0x002c:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0043
            java.lang.Object r0 = r10.get(r1)
            ayc r0 = (defpackage.ayc) r0
            boolean r2 = r0 instanceof defpackage.axy
            if (r2 == 0) goto L_0x0040
            axy r0 = (defpackage.axy) r0
            r6 = r0
            goto L_0x0045
        L_0x0040:
            int r1 = r1 + 1
            goto L_0x002c
        L_0x0043:
            r10 = 0
            r6 = r10
        L_0x0045:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avv.<init>(avc, ayu, ayn):void");
    }

    public final void a() {
        this.g.invalidateSelf();
    }

    public final String b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final List c() {
        if (this.h == null) {
            this.h = new ArrayList();
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                avu avu = (avu) this.f.get(i2);
                if (avu instanceof awe) {
                    this.h.add((awe) avu);
                }
            }
        }
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final Matrix d() {
        axa axa = this.i;
        if (axa != null) {
            return axa.a();
        }
        this.a.reset();
        return this.a;
    }

    public final Path e() {
        this.a.reset();
        axa axa = this.i;
        if (axa != null) {
            this.a.set(axa.a());
        }
        this.b.reset();
        if (!this.e) {
            for (int size = this.f.size() - 1; size >= 0; size--) {
                avu avu = (avu) this.f.get(size);
                if (avu instanceof awe) {
                    this.b.addPath(((awe) avu).e(), this.a);
                }
            }
        }
        return this.b;
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        int i3;
        if (!this.e) {
            this.a.set(matrix);
            axa axa = this.i;
            if (axa != null) {
                this.a.preConcat(axa.a());
                awm awm = this.i.e;
                if (awm != null) {
                    i3 = ((Integer) awm.f()).intValue();
                } else {
                    i3 = 100;
                }
                i2 = (int) ((((((float) i3) / 100.0f) * ((float) i2)) / 255.0f) * 255.0f);
            }
            for (int size = this.f.size() - 1; size >= 0; size--) {
                Object obj = this.f.get(size);
                if (obj instanceof avw) {
                    ((avw) obj).a(canvas, this.a, i2);
                }
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.a.set(matrix);
        axa axa = this.i;
        if (axa != null) {
            this.a.preConcat(axa.a());
        }
        this.c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f.size() - 1; size >= 0; size--) {
            avu avu = (avu) this.f.get(size);
            if (avu instanceof avw) {
                ((avw) avu).a(this.c, this.a, z);
                rectF.union(this.c);
            }
        }
    }

    public avv(avc avc, ayu ayu, String str, boolean z, List list, axy axy) {
        new avq();
        new RectF();
        this.a = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.d = str;
        this.g = avc;
        this.e = z;
        this.f = list;
        if (axy != null) {
            axa a2 = axy.a();
            this.i = a2;
            a2.a(ayu);
            this.i.a((awl) this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            avu avu = (avu) list.get(size);
            if (avu instanceof awb) {
                arrayList.add((awb) avu);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((awb) arrayList.get(size2)).a(list.listIterator(list.size()));
        }
    }

    public final void a(axi axi, int i2, List list, axi axi2) {
        if (axi.a(this.d, i2)) {
            if (!"__container".equals(this.d)) {
                axi2 = axi2.a(this.d);
                if (axi.c(this.d, i2)) {
                    list.add(axi2.a((axj) this));
                }
            }
            if (axi.d(this.d, i2)) {
                int b2 = i2 + axi.b(this.d, i2);
                for (int i3 = 0; i3 < this.f.size(); i3++) {
                    avu avu = (avu) this.f.get(i3);
                    if (avu instanceof axj) {
                        ((axj) avu).a(axi, b2, list, axi2);
                    }
                }
            }
        }
    }

    public final void a(Object obj, bbe bbe) {
        axa axa = this.i;
        if (axa != null) {
            axa.a(obj, bbe);
        }
    }

    public final void a(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f.size());
        arrayList.addAll(list);
        for (int size = this.f.size() - 1; size >= 0; size--) {
            avu avu = (avu) this.f.get(size);
            avu.a(arrayList, this.f.subList(0, size));
            arrayList.add(avu);
        }
    }
}
