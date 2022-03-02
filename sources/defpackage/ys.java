package defpackage;

import android.widget.CompoundButton;

/* renamed from: ys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ys {
    private final CompoundButton a;
    private boolean b;

    public ys(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!this.b) {
            this.b = true;
            rl.b(this.a);
            return;
        }
        this.b = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a A[Catch:{ all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[Catch:{ all -> 0x007f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.a
            android.content.Context r0 = r0.getContext()
            int[] r1 = defpackage.uh.l
            r2 = 0
            aev r0 = defpackage.aev.a(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.a
            android.content.Context r4 = r3.getContext()
            int[] r5 = defpackage.uh.l
            android.content.res.TypedArray r7 = r0.b
            r9 = 0
            r6 = r11
            r8 = r12
            defpackage.qb.a(r3, r4, r5, r6, r7, r8, r9)
            r11 = 1
            boolean r12 = r0.f(r11)     // Catch:{ all -> 0x007f }
            if (r12 == 0) goto L_0x0039
            int r11 = r0.f(r11, r2)     // Catch:{ all -> 0x007f }
            if (r11 == 0) goto L_0x0039
            android.widget.CompoundButton r12 = r10.a     // Catch:{ NotFoundException -> 0x0038 }
            android.content.Context r1 = r12.getContext()     // Catch:{ NotFoundException -> 0x0038 }
            android.graphics.drawable.Drawable r11 = defpackage.uj.b(r1, r11)     // Catch:{ NotFoundException -> 0x0038 }
            r12.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x0038 }
            goto L_0x0053
        L_0x0038:
            r11 = move-exception
        L_0x0039:
            boolean r11 = r0.f(r2)     // Catch:{ all -> 0x007f }
            if (r11 == 0) goto L_0x0053
            int r11 = r0.f(r2, r2)     // Catch:{ all -> 0x007f }
            if (r11 == 0) goto L_0x0053
            android.widget.CompoundButton r12 = r10.a     // Catch:{ all -> 0x007f }
            android.content.Context r1 = r12.getContext()     // Catch:{ all -> 0x007f }
            android.graphics.drawable.Drawable r11 = defpackage.uj.b(r1, r11)     // Catch:{ all -> 0x007f }
            r12.setButtonDrawable(r11)     // Catch:{ all -> 0x007f }
        L_0x0053:
            r11 = 2
            boolean r12 = r0.f(r11)     // Catch:{ all -> 0x007f }
            if (r12 == 0) goto L_0x0063
            android.widget.CompoundButton r12 = r10.a     // Catch:{ all -> 0x007f }
            android.content.res.ColorStateList r11 = r0.e(r11)     // Catch:{ all -> 0x007f }
            defpackage.rl.a(r12, r11)     // Catch:{ all -> 0x007f }
        L_0x0063:
            r11 = 3
            boolean r12 = r0.f(r11)     // Catch:{ all -> 0x007f }
            if (r12 == 0) goto L_0x007b
            android.widget.CompoundButton r12 = r10.a     // Catch:{ all -> 0x007f }
            r1 = -1
            int r11 = r0.a((int) r11, (int) r1)     // Catch:{ all -> 0x007f }
            r1 = 0
            android.graphics.PorterDuff$Mode r11 = defpackage.aak.a(r11, r1)     // Catch:{ all -> 0x007f }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x007f }
            r12.setButtonTintMode(r11)     // Catch:{ all -> 0x007f }
        L_0x007b:
            r0.a()
            return
        L_0x007f:
            r11 = move-exception
            r0.a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys.a(android.util.AttributeSet, int):void");
    }
}
