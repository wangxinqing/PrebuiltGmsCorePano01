package defpackage;

/* renamed from: akdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akdw implements Runnable {
    final /* synthetic */ akdx a;

    public akdw(akdx akdx) {
        this.a = akdx;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0360, code lost:
        if (r0 == 0) goto L_0x0364;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            akdx r0 = r14.a
            akdz r0 = r0.j
            akef r0 = r0.e
            boolean r0 = r0.isAdded()
            if (r0 == 0) goto L_0x03e8
            akdx r0 = r14.a
            android.widget.RelativeLayout r0 = r0.b
            r1 = 0
            r0.setVisibility(r1)
            akdx r0 = r14.a
            akdz r0 = r0.j
            android.graphics.drawable.ColorDrawable r0 = r0.f
            r2 = 1
            int[] r3 = new int[r2]
            r4 = 255(0xff, float:3.57E-43)
            r3[r1] = r4
            java.lang.String r4 = "alpha"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r4, r3)
            r3 = 250(0xfa, double:1.235E-321)
            r0.setDuration(r3)
            r3 = 120(0x78, double:5.93E-322)
            r0.setStartDelay(r3)
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4)
            r0.setInterpolator(r3)
            r0.start()
            akdx r0 = r14.a
            akdz r3 = r0.j
            android.widget.TextView r0 = r0.c
            android.view.animation.DecelerateInterpolator r5 = new android.view.animation.DecelerateInterpolator
            r5.<init>(r4)
            r6 = -1024458752(0xffffffffc2f00000, float:-120.0)
            r3.a(r0, r6, r5, r1)
            akdx r0 = r14.a
            akdz r3 = r0.j
            android.widget.TextView r0 = r0.d
            android.view.animation.DecelerateInterpolator r5 = new android.view.animation.DecelerateInterpolator
            r5.<init>(r4)
            r3.a(r0, r6, r5, r1)
            akdx r0 = r14.a
            akdz r3 = r0.j
            android.widget.TextView r0 = r0.e
            android.view.animation.DecelerateInterpolator r5 = new android.view.animation.DecelerateInterpolator
            r5.<init>(r4)
            r3.a(r0, r6, r5, r1)
            akdx r0 = r14.a
            com.google.android.chimera.Activity r3 = r0.f
            akdz r0 = r0.j
            int r0 = r0.b
            r0 = 2131427455(0x7f0b007f, float:1.8476527E38)
            android.view.View r0 = r3.findViewById(r0)
            akdx r3 = r14.a
            akdz r3 = r3.j
            int r5 = r0.getMeasuredWidth()
            android.view.animation.DecelerateInterpolator r7 = new android.view.animation.DecelerateInterpolator
            r7.<init>(r4)
            float r5 = (float) r5
            r3.a(r0, r5, r7, r1)
            akdx r0 = r14.a
            android.widget.ImageView r3 = r0.g
            r5 = 0
            if (r3 == 0) goto L_0x03d1
            akey r7 = r0.h
            if (r7 == 0) goto L_0x03d1
            aker r0 = new aker
            r0.<init>()
            akdx r3 = r14.a
            android.net.Uri r4 = r3.i
            r0.a = r4
            android.widget.ImageView r3 = r3.g
            android.graphics.drawable.Drawable r4 = r3.getDrawable()
            boolean r6 = r4 instanceof android.graphics.drawable.BitmapDrawable
            if (r6 == 0) goto L_0x00ae
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            r0.b = r4
        L_0x00ae:
            android.graphics.RectF r4 = r0.h
            int r6 = r3.getWidth()
            float r6 = (float) r6
            int r7 = r3.getHeight()
            float r7 = (float) r7
            r4.set(r5, r5, r6, r7)
            android.graphics.RectF r4 = r0.h
            defpackage.akfb.a((android.view.View) r3, (android.graphics.RectF) r4)
            android.graphics.RectF r4 = r0.h
            android.graphics.Rect r5 = r0.c
            r4.round(r5)
            android.graphics.RectF r4 = r0.h
            android.graphics.RectF r5 = r0.g
            int r6 = r3.getPaddingLeft()
            float r6 = (float) r6
            int r7 = r3.getPaddingTop()
            float r7 = (float) r7
            int r8 = r3.getWidth()
            int r9 = r3.getPaddingRight()
            int r8 = r8 - r9
            float r8 = (float) r8
            int r9 = r3.getHeight()
            int r10 = r3.getPaddingBottom()
            int r9 = r9 - r10
            float r9 = (float) r9
            r4.set(r6, r7, r8, r9)
            android.graphics.Matrix r6 = r3.getImageMatrix()
            android.graphics.drawable.Drawable r7 = r3.getDrawable()
            r8 = 3
            r9 = 2
            if (r7 == 0) goto L_0x017e
            android.graphics.Rect r7 = r7.getBounds()
            r5.set(r7)
            r6.mapRect(r5)
            int r6 = r3.getPaddingLeft()
            float r6 = (float) r6
            int r7 = r3.getPaddingTop()
            float r7 = (float) r7
            r5.offset(r6, r7)
            float[] r6 = defpackage.akfb.b
            float r7 = r4.left
            r6[r1] = r7
            float[] r6 = defpackage.akfb.b
            float r7 = r4.top
            r6[r2] = r7
            float[] r6 = defpackage.akfb.b
            float r7 = r4.right
            r6[r9] = r7
            float[] r6 = defpackage.akfb.b
            float r7 = r4.bottom
            r6[r8] = r7
            float[] r6 = defpackage.akfb.b
            float r7 = r5.left
            r10 = 4
            r6[r10] = r7
            float[] r6 = defpackage.akfb.b
            float r7 = r5.top
            r11 = 5
            r6[r11] = r7
            float[] r6 = defpackage.akfb.b
            float r7 = r5.right
            r12 = 6
            r6[r12] = r7
            float[] r6 = defpackage.akfb.b
            float r7 = r5.bottom
            r13 = 7
            r6[r13] = r7
            float[] r6 = defpackage.akfb.b
            defpackage.akfb.a((android.view.View) r3, (float[]) r6)
            float[] r3 = defpackage.akfb.b
            r3 = r3[r1]
            r4.left = r3
            float[] r3 = defpackage.akfb.b
            r3 = r3[r2]
            r4.top = r3
            float[] r3 = defpackage.akfb.b
            r3 = r3[r9]
            r4.right = r3
            float[] r3 = defpackage.akfb.b
            r3 = r3[r8]
            r4.bottom = r3
            float[] r3 = defpackage.akfb.b
            r3 = r3[r10]
            r5.left = r3
            float[] r3 = defpackage.akfb.b
            r3 = r3[r11]
            r5.top = r3
            float[] r3 = defpackage.akfb.b
            r3 = r3[r12]
            r5.right = r3
            float[] r3 = defpackage.akfb.b
            r3 = r3[r13]
            r5.bottom = r3
            r4.intersect(r5)
            goto L_0x01b6
        L_0x017e:
            float[] r6 = defpackage.akfb.a
            float r7 = r4.left
            r6[r1] = r7
            float[] r6 = defpackage.akfb.a
            float r7 = r4.top
            r6[r2] = r7
            float[] r6 = defpackage.akfb.a
            float r7 = r4.right
            r6[r9] = r7
            float[] r6 = defpackage.akfb.a
            float r7 = r4.bottom
            r6[r8] = r7
            float[] r6 = defpackage.akfb.a
            defpackage.akfb.a((android.view.View) r3, (float[]) r6)
            float[] r3 = defpackage.akfb.a
            r3 = r3[r1]
            r4.left = r3
            float[] r3 = defpackage.akfb.a
            r3 = r3[r2]
            r4.top = r3
            float[] r3 = defpackage.akfb.a
            r3 = r3[r9]
            r4.right = r3
            float[] r3 = defpackage.akfb.a
            r3 = r3[r8]
            r4.bottom = r3
            r5.set(r4)
        L_0x01b6:
            akdx r3 = r14.a
            android.widget.ImageView r3 = r3.g
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            boolean r3 = r3 instanceof android.graphics.drawable.ColorDrawable
            if (r3 != 0) goto L_0x01c3
            goto L_0x01d3
        L_0x01c3:
            akdx r3 = r14.a
            android.widget.ImageView r3 = r3.g
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            android.graphics.drawable.ColorDrawable r3 = (android.graphics.drawable.ColorDrawable) r3
            int r3 = r3.getColor()
            r0.d = r3
        L_0x01d3:
            akdx r3 = r14.a
            akey r3 = r3.h
            int r4 = r3.h
            if (r4 != r2) goto L_0x01dc
            goto L_0x01de
        L_0x01dc:
            if (r4 != 0) goto L_0x036b
        L_0x01de:
            java.util.List r4 = r3.e
            int r4 = r4.size()
            r5 = 0
        L_0x01e5:
            if (r5 >= r4) goto L_0x036b
            java.util.List r6 = r3.e
            java.lang.Object r6 = r6.get(r5)
            akfa r6 = (defpackage.akfa) r6
            java.util.Comparator r7 = r3.g
            aker r10 = r6.a
            int r7 = r7.compare(r10, r0)
            if (r7 != 0) goto L_0x0367
            r6.b = r0
            aker r0 = r6.b
            android.graphics.Rect r3 = r6.C
            r0.a(r3)
            android.graphics.Rect r0 = r6.C
            int r0 = r0.width()
            float r0 = (float) r0
            android.graphics.Rect r3 = r6.z
            int r3 = r3.width()
            float r3 = (float) r3
            float r0 = r0 / r3
            r6.d = r0
            android.graphics.Rect r0 = r6.C
            int r0 = r0.height()
            float r0 = (float) r0
            android.graphics.Rect r3 = r6.z
            int r3 = r3.height()
            float r3 = (float) r3
            float r0 = r0 / r3
            r6.e = r0
            float r3 = r6.d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 + r4
            r6.f = r3
            float r0 = r0 + r4
            r6.g = r0
            android.graphics.Rect r0 = r6.C
            int r0 = r0.left
            android.graphics.Rect r3 = r6.z
            int r3 = r3.left
            int r0 = r0 - r3
            float r0 = (float) r0
            r6.h = r0
            android.graphics.Rect r0 = r6.C
            int r0 = r0.top
            android.graphics.Rect r3 = r6.z
            int r3 = r3.top
            int r0 = r0 - r3
            float r0 = (float) r0
            r6.i = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            aker r3 = r6.b
            android.graphics.RectF r3 = r3.h
            r0.set(r3)
            android.graphics.Rect r3 = r6.C
            int r3 = r3.left
            int r3 = -r3
            float r3 = (float) r3
            android.graphics.Rect r4 = r6.C
            int r4 = r4.top
            int r4 = -r4
            float r4 = (float) r4
            r0.offset(r3, r4)
            float r3 = r0.left
            float r4 = r6.d
            float r3 = r3 / r4
            r0.left = r3
            float r3 = r0.right
            float r4 = r6.d
            float r3 = r3 / r4
            r0.right = r3
            float r3 = r0.top
            float r4 = r6.e
            float r3 = r3 / r4
            r0.top = r3
            float r3 = r0.bottom
            float r4 = r6.e
            float r3 = r3 / r4
            r0.bottom = r3
            float r3 = r0.left
            android.graphics.RectF r4 = r6.B
            float r4 = r4.left
            float r3 = r3 - r4
            r6.j = r3
            float r3 = r0.right
            android.graphics.RectF r4 = r6.B
            float r4 = r4.right
            float r3 = r3 - r4
            r6.k = r3
            float r3 = r0.top
            android.graphics.RectF r4 = r6.B
            float r4 = r4.top
            float r3 = r3 - r4
            r6.l = r3
            float r0 = r0.bottom
            android.graphics.RectF r3 = r6.B
            float r3 = r3.bottom
            float r0 = r0 - r3
            r6.m = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            aker r3 = r6.b
            android.graphics.RectF r3 = r3.g
            r0.set(r3)
            android.graphics.Rect r3 = r6.C
            int r3 = r3.left
            int r3 = -r3
            float r3 = (float) r3
            android.graphics.Rect r4 = r6.C
            int r4 = r4.top
            int r4 = -r4
            float r4 = (float) r4
            r0.offset(r3, r4)
            float r3 = r0.width()
            android.graphics.RectF r4 = r6.A
            float r4 = r4.width()
            float r3 = r3 - r4
            r6.p = r3
            float r3 = r0.height()
            android.graphics.RectF r4 = r6.A
            float r4 = r4.height()
            float r3 = r3 - r4
            r6.q = r3
            float r3 = r0.left
            float r4 = r6.d
            float r3 = r3 / r4
            r0.left = r3
            float r3 = r0.right
            float r4 = r6.d
            float r3 = r3 / r4
            r0.right = r3
            float r3 = r0.top
            float r4 = r6.e
            float r3 = r3 / r4
            r0.top = r3
            float r3 = r0.bottom
            float r4 = r6.e
            float r3 = r3 / r4
            r0.bottom = r3
            float r3 = r0.centerX()
            android.graphics.RectF r4 = r6.A
            float r4 = r4.centerX()
            float r3 = r3 - r4
            r6.n = r3
            float r0 = r0.centerY()
            android.graphics.RectF r3 = r6.A
            float r3 = r3.centerY()
            float r0 = r0 - r3
            r6.o = r0
            aker r0 = r6.b
            float r3 = r0.e
            aker r4 = r6.a
            float r5 = r4.e
            float r3 = r3 - r5
            r6.s = r3
            int r3 = r4.d
            int r0 = r0.d
            int r4 = android.graphics.Color.alpha(r0)
            int r5 = android.graphics.Color.alpha(r3)
            int r4 = r4 - r5
            r6.t = r4
            int r4 = android.graphics.Color.red(r0)
            int r5 = android.graphics.Color.red(r3)
            int r4 = r4 - r5
            r6.u = r4
            int r4 = android.graphics.Color.green(r0)
            int r5 = android.graphics.Color.green(r3)
            int r4 = r4 - r5
            r6.v = r4
            int r0 = android.graphics.Color.blue(r0)
            int r3 = android.graphics.Color.blue(r3)
            int r0 = r0 - r3
            r6.w = r0
            aker r3 = r6.b
            float r3 = r3.f
            aker r4 = r6.a
            float r4 = r4.f
            float r3 = r3 - r4
            r6.r = r3
            int r3 = r6.t
            if (r3 != 0) goto L_0x0363
            int r3 = r6.u
            if (r3 != 0) goto L_0x0363
            int r3 = r6.v
            if (r3 == 0) goto L_0x0360
            r1 = 1
            goto L_0x0364
        L_0x0360:
            if (r0 != 0) goto L_0x0363
            goto L_0x0364
        L_0x0363:
            r1 = 1
        L_0x0364:
            r6.x = r1
            goto L_0x036b
        L_0x0367:
            int r5 = r5 + 1
            goto L_0x01e5
        L_0x036b:
            akdx r0 = r14.a
            akey r0 = r0.h
            int r1 = r0.h
            if (r1 != r2) goto L_0x0374
            goto L_0x0377
        L_0x0374:
            if (r1 == 0) goto L_0x0377
            return
        L_0x0377:
            java.util.List r1 = r0.e
            int r1 = r1.size()
            int r1 = r1 + -1
        L_0x037f:
            if (r1 < 0) goto L_0x0398
            java.util.List r2 = r0.e
            java.lang.Object r2 = r2.get(r1)
            akfa r2 = (defpackage.akfa) r2
            aker r3 = r2.b
            if (r3 != 0) goto L_0x0395
            r0.a((android.view.View) r2)
            java.util.List r2 = r0.e
            r2.remove(r1)
        L_0x0395:
            int r1 = r1 + -1
            goto L_0x037f
        L_0x0398:
            java.util.List r1 = r0.e
            int r1 = r1.size()
            if (r1 == 0) goto L_0x03ce
            float[] r1 = new float[r9]
            r1 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            android.view.animation.Interpolator r2 = r0.a
            r1.setInterpolator(r2)
            long r2 = r0.c
            r1.setDuration(r2)
            long r2 = r0.d
            r1.setStartDelay(r2)
            akeu r2 = new akeu
            r2.<init>(r0)
            r1.addUpdateListener(r2)
            akev r2 = new akev
            r2.<init>(r0)
            r1.addListener(r2)
            r1.start()
            r0.h = r9
            return
        L_0x03ce:
            r0.h = r8
            return
        L_0x03d1:
            if (r3 == 0) goto L_0x03e8
            akdz r0 = r0.j
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>(r4)
            r0.a(r3, r6, r1, r2)
            akdx r0 = r14.a
            akdz r0 = r0.j
            com.google.android.pano.widget.FrameLayoutWithShadows r0 = r0.c
            if (r0 == 0) goto L_0x03e8
            r0.a((float) r5)
        L_0x03e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akdw.run():void");
    }
}
