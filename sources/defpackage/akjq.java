package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: akjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akjq extends akjt {
    final /* synthetic */ akju a;
    private akhy d;
    private float e;
    private List f;
    private ou g = new ou();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akjq(akju akju, akhy akhy) {
        super(akhy);
        this.a = akju;
        akhy b = b(akhy);
        this.d = b;
        this.e = ((akhx) b.b.get(0)).e;
        List b2 = akju.b(akhy.b);
        this.f = b2;
        this.g = akju.a(b2);
    }

    private static final akhy b(akhy akhy) {
        ArrayList arrayList = new ArrayList();
        for (akhx akhx : akhy.b) {
            String str = akhx.b;
            int i = akhx.c;
            float f2 = akhx.e;
            arrayList.add(new akhx(str, i, (String) null, akhx.a, 0, f2, f2, (aklq) null, false));
        }
        Collections.sort(arrayList, akju.a);
        return akhy.a(arrayList, akhy.d, akhy.e, akhy.f, akhy.g, akhy.i, akhy.k, akhy.c, akhy.j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0118, code lost:
        r9.c = true;
        defpackage.aklz.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.akjt a(defpackage.akhy r10) {
        /*
            r9 = this;
            java.util.List r0 = r10.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0010
            akjr r0 = new akjr
            akju r1 = r9.a
            r0.<init>(r1, r10)
            return r0
        L_0x0010:
            akhy r0 = b(r10)
            java.util.List r1 = r0.b
            akhy r2 = r9.d
            java.util.List r2 = r2.b
            r3 = 0
            r9.c = r3
            long r4 = defpackage.azcf.c()
            int r5 = (int) r4
            r4 = 0
        L_0x0023:
            int r6 = r1.size()
            int r7 = r2.size()
            int r6 = java.lang.Math.min(r6, r7)
            int r6 = java.lang.Math.min(r5, r6)
            r7 = 1
            if (r4 >= r6) goto L_0x0051
            java.lang.Object r6 = r1.get(r4)
            akhx r6 = (defpackage.akhx) r6
            java.lang.String r6 = r6.b
            java.lang.Object r8 = r2.get(r4)
            akhx r8 = (defpackage.akhx) r8
            java.lang.String r8 = r8.b
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x004f
            int r4 = r4 + 1
            goto L_0x0023
        L_0x004f:
            r9.c = r7
        L_0x0051:
            boolean r2 = r9.c
            if (r2 != 0) goto L_0x006f
            java.lang.Object r2 = r1.get(r3)
            akhx r2 = (defpackage.akhx) r2
            float r2 = r2.e
            float r4 = r9.e
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            float r4 = defpackage.akuo.f()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r9.c = r7
        L_0x006f:
            boolean r2 = r9.c
            if (r2 == 0) goto L_0x007d
            java.lang.Object r1 = r1.get(r3)
            akhx r1 = (defpackage.akhx) r1
            float r1 = r1.e
            r9.e = r1
        L_0x007d:
            boolean r1 = r9.c
            if (r1 == 0) goto L_0x0083
            goto L_0x0129
        L_0x0083:
            boolean r1 = defpackage.akuo.a()
            if (r1 == 0) goto L_0x0129
            java.util.List r1 = r10.b
            java.util.List r1 = defpackage.akju.b(r1)
            java.util.List r2 = r9.f
            int r2 = r2.size()
            int r4 = r1.size()
            if (r2 == r4) goto L_0x00c5
            defpackage.aklz.a()
            java.util.List r2 = r9.f
            int r2 = r2.size()
            int r1 = r1.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 107(0x6b, float:1.5E-43)
            r3.<init>(r4)
            java.lang.String r4 = "Triggering update due to change in size of the hierarchy: current size - "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " new size - "
            r3.append(r2)
            r3.append(r1)
            r3.toString()
            r9.c = r7
            goto L_0x0129
        L_0x00c5:
            int r2 = r1.size()
            int r2 = r2 + -1
        L_0x00cb:
            if (r2 < 0) goto L_0x011d
            java.lang.Object r4 = r1.get(r2)
            akhx r4 = (defpackage.akhx) r4
            java.util.List r5 = r9.f
            java.lang.Object r5 = r5.get(r2)
            akhx r5 = (defpackage.akhx) r5
            java.lang.String r6 = r4.b
            java.lang.String r5 = r5.b
            boolean r5 = r6.equals(r5)
            ou r6 = r9.g
            int r8 = -r2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r6 = r6.containsKey(r8)
            if (r6 == 0) goto L_0x010f
            float r4 = r4.f
            ou r6 = r9.g
            java.lang.Object r6 = r6.get(r8)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            float r4 = r4 - r6
            float r4 = java.lang.Math.abs(r4)
            float r6 = defpackage.akuo.f()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x010d
            r4 = 1
            goto L_0x0110
        L_0x010d:
            r4 = 0
            goto L_0x0110
        L_0x010f:
            r4 = 1
        L_0x0110:
            if (r5 != 0) goto L_0x0113
            goto L_0x0118
        L_0x0113:
            if (r4 == 0) goto L_0x0118
            int r2 = r2 + -1
            goto L_0x00cb
        L_0x0118:
            r9.c = r7
            defpackage.aklz.a()
        L_0x011d:
            boolean r2 = r9.c
            if (r2 == 0) goto L_0x0129
            r9.f = r1
            ou r1 = defpackage.akju.a((java.util.List) r1)
            r9.g = r1
        L_0x0129:
            r9.b = r10
            r9.d = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjq.a(akhy):akjt");
    }
}
