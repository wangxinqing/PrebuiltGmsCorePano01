package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.R;

/* renamed from: ajud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajud extends yq {
    private static final int[][] a = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && rl.a(this) == null) {
            this.c = true;
            if (this.b == null) {
                int[] iArr = new int[a.length];
                int a2 = ajyl.a((View) this, (int) R.attr.colorControlActivated);
                int a3 = ajyl.a((View) this, (int) R.attr.colorSurface);
                int a4 = ajyl.a((View) this, (int) R.attr.colorOnSurface);
                iArr[0] = ajuo.a(a3, a2, 1.0f);
                iArr[1] = ajuo.a(a3, a4, 0.54f);
                iArr[2] = ajuo.a(a3, a4, 0.38f);
                iArr[3] = ajuo.a(a3, a4, 0.38f);
                this.b = new ColorStateList(a, iArr);
            }
            rl.a(this, this.b);
        }
    }

    public ajud(Context context, AttributeSet attributeSet) {
        super(akdg.a(context, attributeSet, R.attr.checkboxStyle, 2132019039), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray a2 = ajya.a(context2, attributeSet, ajue.a, R.attr.checkboxStyle, 2132019039, new int[0]);
        if (a2.hasValue(0)) {
            rl.a(this, ajym.a(context2, a2, 0));
        }
        this.c = a2.getBoolean(1, false);
        a2.recycle();
    }
}
