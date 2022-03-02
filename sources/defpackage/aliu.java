package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* renamed from: aliu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aliu implements alhi {
    public final TemplateLayout a;

    public aliu(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        TextView a2;
        this.a = templateLayout;
        TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, alhx.a, i, 0);
        CharSequence text = obtainStyledAttributes.getText(0);
        if (text != null) {
            a(text);
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (!(colorStateList == null || (a2 = a()) == null)) {
            a2.setTextColor(colorStateList);
        }
        obtainStyledAttributes.recycle();
    }

    public final TextView a() {
        return (TextView) this.a.b(R.id.suc_layout_title);
    }

    public final void a(CharSequence charSequence) {
        TextView a2 = a();
        if (a2 != null) {
            a2.setText(charSequence);
        }
    }
}
