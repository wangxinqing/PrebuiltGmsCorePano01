package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: ajyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajyg extends ImageButton {
    public int d;

    public ajyg(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.d = i;
        }
    }

    public final void setVisibility(int i) {
        a(i, true);
    }

    public ajyg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ajyg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = getVisibility();
    }
}
