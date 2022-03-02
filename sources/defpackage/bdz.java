package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.setupwizardlib.TemplateLayout;
import com.google.android.gms.R;

@Deprecated
/* renamed from: bdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bdz implements bea {
    private final TemplateLayout a;

    public bdz(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        ImageView a2;
        this.a = templateLayout;
        int i2 = 0;
        TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, bdg.j, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (!(resourceId == 0 || (a2 = a()) == null)) {
            a2.setImageResource(resourceId);
            a2.setVisibility(resourceId == 0 ? 8 : i2);
        }
        obtainStyledAttributes.recycle();
    }

    public final ImageView a() {
        return (ImageView) this.a.c(R.id.suw_layout_icon);
    }
}
