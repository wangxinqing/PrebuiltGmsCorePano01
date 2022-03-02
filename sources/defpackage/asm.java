package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: asm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class asm extends arn {
    private static final String[] p = {"android:visibility:visibility", "android:visibility:parent"};
    public int o = 3;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r0.e == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r8 == 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        if (r0.c == 0) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final defpackage.asl b(defpackage.arw r7, defpackage.arw r8) {
        /*
            asl r0 = new asl
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r7 == 0) goto L_0x0033
            java.util.Map r6 = r7.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map r6 = r7.a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.c = r6
            java.util.Map r6 = r7.a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L_0x0037
        L_0x0033:
            r0.c = r4
            r0.e = r3
        L_0x0037:
            if (r8 == 0) goto L_0x005a
            java.util.Map r6 = r8.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map r3 = r8.a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.util.Map r3 = r8.a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L_0x005e
        L_0x005a:
            r0.d = r4
            r0.f = r3
        L_0x005e:
            r2 = 1
            if (r7 == 0) goto L_0x0083
            if (r8 == 0) goto L_0x0083
            int r7 = r0.c
            int r8 = r0.d
            if (r7 != r8) goto L_0x0071
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 == r4) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            return r0
        L_0x0071:
            if (r7 != r8) goto L_0x007d
            android.view.ViewGroup r7 = r0.f
            if (r7 != 0) goto L_0x0078
            goto L_0x0094
        L_0x0078:
            android.view.ViewGroup r7 = r0.e
            if (r7 != 0) goto L_0x0097
            goto L_0x0082
        L_0x007d:
            if (r7 != 0) goto L_0x0080
            goto L_0x0094
        L_0x0080:
            if (r8 != 0) goto L_0x0097
        L_0x0082:
            goto L_0x0089
        L_0x0083:
            if (r7 != 0) goto L_0x008e
            int r7 = r0.d
            if (r7 != 0) goto L_0x008e
        L_0x0089:
            r0.b = r2
        L_0x008b:
            r0.a = r2
            goto L_0x0097
        L_0x008e:
            if (r8 != 0) goto L_0x0097
            int r7 = r0.c
            if (r7 != 0) goto L_0x0097
        L_0x0094:
            r0.b = r1
            goto L_0x008b
        L_0x0097:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asm.b(arw, arw):asl");
    }

    public static final void d(arw arw) {
        arw.a.put("android:visibility:visibility", Integer.valueOf(arw.b.getVisibility()));
        arw.a.put("android:visibility:parent", arw.b.getParent());
        int[] iArr = new int[2];
        arw.b.getLocationOnScreen(iArr);
        arw.a.put("android:visibility:screenLocation", iArr);
    }

    public Animator a(View view, arw arw) {
        throw null;
    }

    public void a(arw arw) {
        throw null;
    }

    public final String[] a() {
        return p;
    }

    public Animator b(View view, arw arw) {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0146, code lost:
        if (b(b(r13, false), a(r13, false)).a == false) goto L_0x0148;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator a(android.view.ViewGroup r13, defpackage.arw r14, defpackage.arw r15) {
        /*
            r12 = this;
            asl r0 = b((defpackage.arw) r14, (defpackage.arw) r15)
            boolean r1 = r0.a
            r2 = 0
            if (r1 == 0) goto L_0x014f
            android.view.ViewGroup r1 = r0.e
            if (r1 == 0) goto L_0x000e
            goto L_0x0014
        L_0x000e:
            android.view.ViewGroup r1 = r0.f
            if (r1 != 0) goto L_0x0014
            goto L_0x014f
        L_0x0014:
            boolean r1 = r0.b
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0127
            int r0 = r0.d
            int r1 = r12.o
            r5 = 2
            r1 = r1 & r5
            if (r1 == r5) goto L_0x0024
            goto L_0x0126
        L_0x0024:
            if (r14 == 0) goto L_0x0125
            android.view.View r1 = r14.b
            if (r15 == 0) goto L_0x002d
            android.view.View r15 = r15.b
            goto L_0x002e
        L_0x002d:
            r15 = r2
        L_0x002e:
            r6 = 2131429365(0x7f0b07f5, float:1.84804E38)
            java.lang.Object r7 = r1.getTag(r6)
            android.view.View r7 = (android.view.View) r7
            if (r7 == 0) goto L_0x003e
            r15 = r2
            r8 = 1
            goto L_0x00ad
        L_0x003e:
            if (r15 == 0) goto L_0x0052
            android.view.ViewParent r7 = r15.getParent()
            if (r7 == 0) goto L_0x0052
            r7 = 4
            if (r0 != r7) goto L_0x004d
            r7 = r15
            r15 = r2
            r8 = 0
            goto L_0x005a
        L_0x004d:
            if (r1 != r15) goto L_0x0057
            r7 = r15
            r15 = r2
            goto L_0x0055
        L_0x0052:
            if (r15 == 0) goto L_0x0057
            r7 = r2
        L_0x0055:
            r8 = 0
            goto L_0x005a
        L_0x0057:
            r15 = r2
            r7 = r15
            r8 = 1
        L_0x005a:
            if (r8 != 0) goto L_0x0061
            r8 = 0
            r11 = r7
            r7 = r15
            r15 = r11
            goto L_0x00ad
        L_0x0061:
            android.view.ViewParent r8 = r1.getParent()
            if (r8 != 0) goto L_0x006b
            r15 = r7
            r8 = 0
            r7 = r1
            goto L_0x00ad
        L_0x006b:
            android.view.ViewParent r8 = r1.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x00a9
            android.view.ViewParent r8 = r1.getParent()
            android.view.View r8 = (android.view.View) r8
            arw r9 = r12.a((android.view.View) r8, (boolean) r3)
            arw r10 = r12.b(r8, r3)
            asl r9 = b((defpackage.arw) r9, (defpackage.arw) r10)
            boolean r9 = r9.a
            if (r9 != 0) goto L_0x0092
            android.view.View r15 = defpackage.arv.a(r13, r1, r8)
            r8 = 0
            r11 = r7
            r7 = r15
            r15 = r11
            goto L_0x00ad
        L_0x0092:
            int r9 = r8.getId()
            android.view.ViewParent r8 = r8.getParent()
            if (r8 == 0) goto L_0x00a1
        L_0x009c:
            r8 = 0
            r11 = r7
            r7 = r15
            r15 = r11
            goto L_0x00ad
        L_0x00a1:
            r8 = -1
            if (r9 != r8) goto L_0x00a5
            goto L_0x009c
        L_0x00a5:
            android.view.View r8 = r13.findViewById(r9)
        L_0x00a9:
            r8 = 0
            r11 = r7
            r7 = r15
            r15 = r11
        L_0x00ad:
            if (r7 != 0) goto L_0x00d4
            if (r15 == 0) goto L_0x00d3
            int r13 = r15.getVisibility()
            defpackage.asc.a((android.view.View) r15, (int) r4)
            android.animation.Animator r2 = r12.b((android.view.View) r15, (defpackage.arw) r14)
            if (r2 == 0) goto L_0x00cf
            ask r13 = new ask
            r13.<init>(r15, r0)
            r2.addListener(r13)
            int r14 = android.os.Build.VERSION.SDK_INT
            r2.addPauseListener(r13)
            r12.a((defpackage.arm) r13)
            goto L_0x0126
        L_0x00cf:
            defpackage.asc.a((android.view.View) r15, (int) r13)
            goto L_0x0126
        L_0x00d3:
            goto L_0x0126
        L_0x00d4:
            if (r8 != 0) goto L_0x0108
            java.util.Map r15 = r14.a
            java.lang.String r0 = "android:visibility:screenLocation"
            java.lang.Object r15 = r15.get(r0)
            int[] r15 = (int[]) r15
            int[] r15 = (int[]) r15
            r0 = r15[r4]
            r15 = r15[r3]
            int[] r2 = new int[r5]
            r13.getLocationOnScreen(r2)
            r4 = r2[r4]
            int r0 = r0 - r4
            int r4 = r7.getLeft()
            int r0 = r0 - r4
            r7.offsetLeftAndRight(r0)
            r0 = r2[r3]
            int r15 = r15 - r0
            int r0 = r7.getTop()
            int r15 = r15 - r0
            r7.offsetTopAndBottom(r15)
            ary r15 = defpackage.arz.a(r13)
            r15.a(r7)
        L_0x0108:
            android.animation.Animator r2 = r12.b((android.view.View) r7, (defpackage.arw) r14)
            if (r8 == 0) goto L_0x010f
            goto L_0x0126
        L_0x010f:
            if (r2 == 0) goto L_0x011d
            r1.setTag(r6, r7)
            asj r14 = new asj
            r14.<init>(r12, r13, r7, r1)
            r12.a((defpackage.arm) r14)
            goto L_0x0126
        L_0x011d:
            ary r13 = defpackage.arz.a(r13)
            r13.b(r7)
            goto L_0x0126
        L_0x0125:
        L_0x0126:
            return r2
        L_0x0127:
            int r13 = r12.o
            r13 = r13 & r3
            if (r13 != r3) goto L_0x014f
            if (r15 == 0) goto L_0x014f
            if (r14 != 0) goto L_0x0148
            android.view.View r13 = r15.b
            android.view.ViewParent r13 = r13.getParent()
            android.view.View r13 = (android.view.View) r13
            arw r0 = r12.b(r13, r4)
            arw r13 = r12.a((android.view.View) r13, (boolean) r4)
            asl r13 = b((defpackage.arw) r0, (defpackage.arw) r13)
            boolean r13 = r13.a
            if (r13 != 0) goto L_0x014f
        L_0x0148:
            android.view.View r13 = r15.b
            android.animation.Animator r13 = r12.a((android.view.View) r13, (defpackage.arw) r14)
            return r13
        L_0x014f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asm.a(android.view.ViewGroup, arw, arw):android.animation.Animator");
    }

    public final void b(arw arw) {
        d(arw);
    }

    public final boolean a(arw arw, arw arw2) {
        if (arw == null && arw2 == null) {
            return false;
        }
        if (arw != null && arw2 != null && arw2.a.containsKey("android:visibility:visibility") != arw.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        asl b = b(arw, arw2);
        if (!b.a) {
            return false;
        }
        if (b.c == 0 || b.d == 0) {
            return true;
        }
        return false;
    }
}
