package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.setupwizardlib.TemplateLayout;
import com.google.android.gms.R;

@Deprecated
/* renamed from: bdy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bdy implements bea {
    private final TemplateLayout a;

    public final TextView a() {
        return (TextView) this.a.c(R.id.suw_layout_title);
    }

    public bdy(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        TextView a2;
        this.a = templateLayout;
        TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, bdg.h, i, 0);
        CharSequence text = obtainStyledAttributes.getText(0);
        if (text != null) {
            a(text);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = templateLayout.getContext().obtainStyledAttributes(attributeSet, bdg.c, i, 0);
        ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
        if (!(colorStateList == null || (a2 = a()) == null)) {
            a2.setTextColor(colorStateList);
        }
        obtainStyledAttributes2.recycle();
    }

    public final void a(CharSequence charSequence) {
        TextView a2 = a();
        if (a2 != null) {
            a2.setText(charSequence);
        }
    }
}
