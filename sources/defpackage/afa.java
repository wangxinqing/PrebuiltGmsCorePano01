package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: afa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afa extends se {
    public int b = 0;

    public afa() {
        this.a = 8388627;
    }

    public afa(afa afa) {
        super((se) afa);
        this.b = afa.b;
    }

    public afa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public afa(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public afa(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super((ViewGroup.LayoutParams) marginLayoutParams);
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public afa(se seVar) {
        super(seVar);
    }
}
