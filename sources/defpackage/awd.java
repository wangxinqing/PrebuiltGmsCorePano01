package defpackage;

import android.graphics.Path;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* renamed from: awd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awd implements awe, awb {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List d = new ArrayList();
    private final ayh e;

    public awd(ayh ayh) {
        int i = Build.VERSION.SDK_INT;
        this.e = ayh;
    }

    private final void a(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.d.size() - 1; size > 0; size--) {
            awe awe = (awe) this.d.get(size);
            if (awe instanceof avv) {
                avv avv = (avv) awe;
                List c2 = avv.c();
                for (int size2 = c2.size() - 1; size2 >= 0; size2--) {
                    Path e2 = ((awe) c2.get(size2)).e();
                    e2.transform(avv.d());
                    this.b.addPath(e2);
                }
            } else {
                this.b.addPath(awe.e());
            }
        }
        awe awe2 = (awe) this.d.get(0);
        if (awe2 instanceof avv) {
            avv avv2 = (avv) awe2;
            List c3 = avv2.c();
            for (int i = 0; i < c3.size(); i++) {
                Path e3 = ((awe) c3.get(i)).e();
                e3.transform(avv2.d());
                this.a.addPath(e3);
            }
        } else {
            this.a.set(awe2.e());
        }
        this.c.op(this.a, this.b, op);
    }

    public final String b() {
        throw null;
    }

    public final Path e() {
        this.c.reset();
        ayh ayh = this.e;
        if (ayh.a) {
            return this.c;
        }
        int i = ayh.b;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                for (int i3 = 0; i3 < this.d.size(); i3++) {
                    this.c.addPath(((awe) this.d.get(i3)).e());
                }
            } else if (i2 == 1) {
                a(Path.Op.UNION);
            } else if (i2 == 2) {
                a(Path.Op.REVERSE_DIFFERENCE);
            } else if (i2 == 3) {
                a(Path.Op.INTERSECT);
            } else if (i2 == 4) {
                a(Path.Op.XOR);
            }
            return this.c;
        }
        throw null;
    }

    public final void a(List list, List list2) {
        for (int i = 0; i < this.d.size(); i++) {
            ((awe) this.d.get(i)).a(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000b, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.ListIterator r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 != 0) goto L_0x0007
        L_0x0006:
            goto L_0x000e
        L_0x0007:
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x0006
            goto L_0x0000
        L_0x000e:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r3.previous()
            avu r0 = (defpackage.avu) r0
            boolean r1 = r0 instanceof defpackage.awe
            if (r1 == 0) goto L_0x000e
            java.util.List r1 = r2.d
            awe r0 = (defpackage.awe) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000e
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awd.a(java.util.ListIterator):void");
    }
}
