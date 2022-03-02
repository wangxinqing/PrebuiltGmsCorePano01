package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.R;

/* renamed from: ajyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajyh extends zb {
    private static final int[][] a = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && rl.a(this) == null) {
            this.c = true;
            if (this.b == null) {
                int a2 = ajyl.a((View) this, (int) R.attr.colorControlActivated);
                int a3 = ajyl.a((View) this, (int) R.attr.colorOnSurface);
                int a4 = ajyl.a((View) this, (int) R.attr.colorSurface);
                int[] iArr = new int[a.length];
                iArr[0] = ajuo.a(a4, a2, 1.0f);
                iArr[1] = ajuo.a(a4, a3, 0.54f);
                iArr[2] = ajuo.a(a4, a3, 0.38f);
                iArr[3] = ajuo.a(a4, a3, 0.38f);
                this.b = new ColorStateList(a, iArr);
            }
            rl.a(this, this.b);
        }
    }

    public ajyh(Context context, AttributeSet attributeSet) {
        super(akdg.a(context, attributeSet, R.attr.radioButtonStyle, 2132019040), attributeSet);
        TypedArray a2 = ajya.a(getContext(), attributeSet, ajyi.a, R.attr.radioButtonStyle, 2132019040, new int[0]);
        this.c = a2.getBoolean(0, false);
        a2.recycle();
    }
}
