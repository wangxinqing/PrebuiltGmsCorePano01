package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.google.android.gms.R;

/* renamed from: ajwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajwe extends sr {
    private Drawable b;
    private final Rect c;

    public ajwe(Context context) {
        this(context, 0);
    }

    private static int a(Context context) {
        TypedValue a = ajyl.a(context, (int) R.attr.materialAlertDialogTheme);
        if (a != null) {
            return a.data;
        }
        return 0;
    }

    public final ss b() {
        ss b2 = super.b();
        Window window = b2.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.b;
        if (drawable instanceof ajzf) {
            ((ajzf) drawable).d(qb.o(decorView));
        }
        Drawable drawable2 = this.b;
        Rect rect = this.c;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ajwd(b2, this.c));
        return b2;
    }

    public final void c(int i) {
        super.a(i);
    }

    public final void d(int i, DialogInterface.OnClickListener onClickListener) {
        super.b(i, onClickListener);
    }

    public final void c(int i, DialogInterface.OnClickListener onClickListener) {
        super.a(i, onClickListener);
    }

    public final void d(CharSequence charSequence) {
        super.b(charSequence);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ajwe(android.content.Context r12, int r13) {
        /*
            r11 = this;
            int r0 = a(r12)
            r1 = 0
            r2 = 2130968620(0x7f04002c, float:1.7545899E38)
            r3 = 2132017771(0x7f14026b, float:1.967383E38)
            android.content.Context r4 = defpackage.akdg.a(r12, r1, r2, r3)
            if (r0 == 0) goto L_0x0018
            vt r5 = new vt
            r5.<init>((android.content.Context) r4, (int) r0)
            r4 = r5
            goto L_0x0019
        L_0x0018:
        L_0x0019:
            if (r13 != 0) goto L_0x0020
            int r13 = a(r12)
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            r11.<init>(r4, r13)
            android.content.Context r12 = r11.a()
            android.content.res.Resources$Theme r13 = r12.getTheme()
            r6 = 0
            int[] r7 = defpackage.ajwf.a
            r8 = 2130968620(0x7f04002c, float:1.7545899E38)
            r9 = 2132017771(0x7f14026b, float:1.967383E38)
            r0 = 0
            int[] r10 = new int[r0]
            r5 = r12
            android.content.res.TypedArray r4 = defpackage.ajya.a(r5, r6, r7, r8, r9, r10)
            r5 = 2
            android.content.res.Resources r6 = r12.getResources()
            r7 = 2131166618(0x7f07059a, float:1.7947486E38)
            int r6 = r6.getDimensionPixelSize(r7)
            int r5 = r4.getDimensionPixelSize(r5, r6)
            r6 = 3
            android.content.res.Resources r7 = r12.getResources()
            r8 = 2131166619(0x7f07059b, float:1.7947488E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r6 = r4.getDimensionPixelSize(r6, r7)
            android.content.res.Resources r7 = r12.getResources()
            r8 = 2131166617(0x7f070599, float:1.7947484E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r8 = 1
            int r7 = r4.getDimensionPixelSize(r8, r7)
            android.content.res.Resources r9 = r12.getResources()
            r10 = 2131166616(0x7f070598, float:1.7947482E38)
            int r9 = r9.getDimensionPixelSize(r10)
            int r0 = r4.getDimensionPixelSize(r0, r9)
            r4.recycle()
            int r4 = android.os.Build.VERSION.SDK_INT
            android.content.res.Resources r4 = r12.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.getLayoutDirection()
            if (r4 == r8) goto L_0x0091
            r9 = r7
            goto L_0x0092
        L_0x0091:
            r9 = r5
        L_0x0092:
            if (r4 == r8) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r5 = r7
        L_0x0096:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r5, r6, r9, r0)
            r11.c = r4
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            int r0 = defpackage.ajuo.a((android.content.Context) r12, (java.lang.String) r0)
            ajzf r4 = new ajzf
            r4.<init>(r12, r1, r2, r3)
            r4.a((android.content.Context) r12)
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r0)
            r4.c((android.content.res.ColorStateList) r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r12 < r0) goto L_0x00e6
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            r0 = 16844145(0x1010571, float:2.3697462E-38)
            r13.resolveAttribute(r0, r12, r8)
            android.content.Context r13 = r11.a()
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r12.getDimension(r13)
            int r12 = r12.type
            r0 = 5
            if (r12 != r0) goto L_0x00e6
            r12 = 0
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 < 0) goto L_0x00e6
            r4.b((float) r13)
        L_0x00e6:
            r11.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwe.<init>(android.content.Context, int):void");
    }

    public final void c(View view) {
        super.b(view);
    }

    public final void d(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.a(charSequence, onClickListener);
    }

    public final void c(CharSequence charSequence) {
        super.a(charSequence);
    }

    public final void b(boolean z) {
        super.a(z);
    }

    public final void c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.b(charSequence, onClickListener);
    }
}
