package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MediaRouteExpandCollapseButton extends yw {
    public final AnimationDrawable a;
    public final AnimationDrawable b;
    public final String c;
    public final String d;
    public boolean e;
    public View.OnClickListener f;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if (r3 == 0) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaRouteExpandCollapseButton(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            r7 = 2131231636(0x7f080394, float:1.8079359E38)
            android.graphics.drawable.Drawable r7 = defpackage.kf.a((android.content.Context) r6, (int) r7)
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            r5.a = r7
            r7 = 2131231635(0x7f080393, float:1.8079357E38)
            android.graphics.drawable.Drawable r7 = defpackage.kf.a((android.content.Context) r6, (int) r7)
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            r5.b = r7
            android.graphics.PorterDuffColorFilter r7 = new android.graphics.PorterDuffColorFilter
            r0 = 1
            r1 = 2130968886(0x7f040136, float:1.7546438E38)
            r2 = 0
            if (r8 == 0) goto L_0x0035
            int[] r3 = new int[r0]
            r3[r2] = r1
            android.content.res.TypedArray r8 = r6.obtainStyledAttributes(r8, r3)
            int r3 = r8.getColor(r2, r2)
            r8.recycle()
            if (r3 != 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            goto L_0x0052
        L_0x0035:
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.res.Resources$Theme r3 = r6.getTheme()
            r3.resolveAttribute(r1, r8, r0)
            int r0 = r8.resourceId
            if (r0 == 0) goto L_0x0050
            android.content.res.Resources r0 = r6.getResources()
            int r8 = r8.resourceId
            int r3 = r0.getColor(r8)
            goto L_0x0052
        L_0x0050:
            int r3 = r8.data
        L_0x0052:
            double r0 = defpackage.lk.b(r3)
            r3 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x005f
            r8 = -570425344(0xffffffffde000000, float:-2.30584301E18)
            goto L_0x0060
        L_0x005f:
            r8 = -1
        L_0x0060:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r7.<init>(r8, r0)
            android.graphics.drawable.AnimationDrawable r8 = r5.a
            r8.setColorFilter(r7)
            android.graphics.drawable.AnimationDrawable r8 = r5.b
            r8.setColorFilter(r7)
            r7 = 2131953266(0x7f130672, float:1.9542998E38)
            java.lang.String r7 = r6.getString(r7)
            r5.c = r7
            r7 = 2131953264(0x7f130670, float:1.9542994E38)
            java.lang.String r6 = r6.getString(r7)
            r5.d = r6
            android.graphics.drawable.AnimationDrawable r6 = r5.a
            android.graphics.drawable.Drawable r6 = r6.getFrame(r2)
            r5.setImageDrawable(r6)
            java.lang.String r6 = r5.c
            r5.setContentDescription(r6)
            alw r6 = new alw
            r6.<init>(r5)
            super.setOnClickListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteExpandCollapseButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
