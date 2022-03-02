package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: aig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aig implements aia {
    public static final aii k = new aii((byte[]) null);
    public static final aii l = new aii((boolean[]) null);
    public static final aii m = new aii((float[]) null);
    public static final aii n = new aii((byte[][]) null);
    public static final aii o = new aii((short[]) null);
    public static final aii p = new aii((int[]) null);
    public static final aii q = new aii((char[]) null);
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public final Object c;
    final aii d;
    public boolean e = false;
    public float f = Float.MAX_VALUE;
    public float g = -3.4028235E38f;
    public final float h;
    public final ArrayList i = new ArrayList();
    public final aih j;
    private long r = 0;
    private final ArrayList s = new ArrayList();

    private static void a(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public aig(Object obj, aii aii) {
        this.c = obj;
        this.d = aii;
        if (aii == n || aii == o || aii == p) {
            this.h = 0.1f;
        } else if (aii == q || aii == l || aii == m) {
            this.h = 0.00390625f;
        } else {
            this.h = 1.0f;
        }
        aih aih = new aih();
        this.j = aih;
        aih.b = this.h * 0.75f * 62.5f;
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        ((View) this.c).setTranslationX(f2);
        for (int i2 = 0; i2 < this.s.size(); i2++) {
            if (this.s.get(i2) != null) {
                ((aif) this.s.get(i2)).a();
            }
        }
        a(this.s);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r11) {
        /*
            r10 = this;
            long r0 = r10.r
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0106
            r10.r = r11
            aih r4 = r10.j
            float r5 = r10.b
            float r6 = r10.a
            long r11 = r11 - r0
            float r11 = (float) r11
            aie r12 = r4.c
            double r0 = (double) r6
            r7 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r11 / r7
            float r9 = r4.a
            float r8 = r8 * r9
            double r8 = (double) r8
            double r8 = java.lang.Math.exp(r8)
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r8
            float r0 = (float) r0
            r12.b = r0
            aie r12 = r4.c
            float r0 = r4.a
            float r6 = r6 / r0
            float r5 = r5 - r6
            double r8 = (double) r5
            double r5 = (double) r6
            float r0 = r0 * r11
            float r0 = r0 / r7
            double r0 = (double) r0
            double r0 = java.lang.Math.exp(r0)
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r0
            java.lang.Double.isNaN(r8)
            double r8 = r8 + r5
            float r11 = (float) r8
            r12.a = r11
            aie r11 = r4.c
            float r11 = r11.b
            boolean r11 = r4.a(r11)
            if (r11 != 0) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            aie r11 = r4.c
            r12 = 0
            r11.b = r12
        L_0x0056:
            aie r11 = r4.c
            float r12 = r11.a
            r10.b = r12
            float r11 = r11.b
            r10.a = r11
            float r0 = r10.g
            r1 = 0
            r4 = 1
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x0085
            float r5 = r10.f
            int r6 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0072
            r10.b = r5
            r11 = 1
            goto L_0x0088
        L_0x0072:
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0084
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0084
            aih r12 = r10.j
            boolean r11 = r12.a(r11)
            if (r11 != 0) goto L_0x0084
            r11 = 0
            goto L_0x0088
        L_0x0084:
            goto L_0x0087
        L_0x0085:
            r10.b = r0
        L_0x0087:
            r11 = 1
        L_0x0088:
            float r12 = r10.b
            float r0 = r10.f
            float r12 = java.lang.Math.min(r12, r0)
            r10.b = r12
            float r0 = r10.g
            float r12 = java.lang.Math.max(r12, r0)
            r10.b = r12
            r10.a((float) r12)
            if (r11 == 0) goto L_0x0105
            r10.e = r1
            aid r11 = defpackage.aid.a()
            ou r12 = r11.b
            r12.remove(r10)
            java.util.ArrayList r12 = r11.c
            int r12 = r12.indexOf(r10)
            if (r12 < 0) goto L_0x00ba
            java.util.ArrayList r0 = r11.c
            r5 = 0
            r0.set(r12, r5)
            r11.e = r4
        L_0x00ba:
            r10.r = r2
            r11 = 0
        L_0x00bd:
            java.util.ArrayList r12 = r10.i
            int r12 = r12.size()
            if (r11 >= r12) goto L_0x0100
            java.util.ArrayList r12 = r10.i
            java.lang.Object r12 = r12.get(r11)
            if (r12 == 0) goto L_0x00fd
            java.util.ArrayList r12 = r10.i
            java.lang.Object r12 = r12.get(r11)
            wix r12 = (defpackage.wix) r12
            float r0 = r10.b
            com.google.android.gms.nearby.sharing.view.SelectionSlider r12 = r12.a
            int r0 = (int) r0
            r12.b = r0
            android.content.Context r2 = r12.getContext()
            boolean r2 = defpackage.wil.a((android.content.Context) r2)
            if (r2 == 0) goto L_0x00f4
            int r2 = r12.getWidth()
            android.widget.ImageView r3 = r12.a
            int r3 = r3.getWidth()
            int r2 = r2 - r3
            int r2 = r2 + r0
            r12.b = r2
        L_0x00f4:
            int r0 = r12.a()
            r12.a((int) r0)
            r12.b = r1
        L_0x00fd:
            int r11 = r11 + 1
            goto L_0x00bd
        L_0x0100:
            java.util.ArrayList r11 = r10.i
            a((java.util.ArrayList) r11)
        L_0x0105:
            return
        L_0x0106:
            r10.r = r11
            float r11 = r10.b
            r10.a((float) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aig.a(long):void");
    }
}
