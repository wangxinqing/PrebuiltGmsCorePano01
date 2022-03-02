package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* renamed from: aliv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aliv implements alhi {
    public final TemplateLayout a;
    private final int b;
    private final ImageView.ScaleType c;

    public aliv(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        ImageView a2;
        ImageView a3;
        int i2;
        this.a = templateLayout;
        Context context = templateLayout.getContext();
        ImageView a4 = a();
        if (a4 != null) {
            this.b = a4.getLayoutParams().height;
            this.c = a4.getScaleType();
        } else {
            this.b = 0;
            this.c = null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alhx.i, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (!(resourceId == 0 || (a3 = a()) == null)) {
            a3.setImageResource(resourceId);
            if (resourceId != 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            a3.setVisibility(i2);
        }
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        ImageView a5 = a();
        if (a5 != null) {
            ViewGroup.LayoutParams layoutParams = a5.getLayoutParams();
            int i3 = Build.VERSION.SDK_INT;
            layoutParams.height = !z ? this.b : a5.getMaxHeight();
            a5.setLayoutParams(layoutParams);
            a5.setScaleType(!z ? this.c : ImageView.ScaleType.FIT_CENTER);
        }
        int color = obtainStyledAttributes.getColor(1, 0);
        if (!(color == 0 || (a2 = a()) == null)) {
            a2.setColorFilter(color);
        }
        obtainStyledAttributes.recycle();
    }

    public final ImageView a() {
        return (ImageView) this.a.b(R.id.sud_layout_icon);
    }
}
