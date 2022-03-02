package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.gms.R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akcd implements akdc {
    final /* synthetic */ akck a;

    public akcd(akck akck) {
        this.a = akck;
    }

    public final void a(TextInputLayout textInputLayout) {
        AutoCompleteTextView a2 = this.a.a(textInputLayout.a);
        akck akck = this.a;
        int i = akck.k.j;
        if (i == 2) {
            a2.setDropDownBackgroundDrawable(akck.g);
        } else if (i == 1) {
            a2.setDropDownBackgroundDrawable(akck.f);
        }
        akck akck2 = this.a;
        if (a2.getKeyListener() == null) {
            TextInputLayout textInputLayout2 = akck2.k;
            int i2 = textInputLayout2.j;
            if (i2 == 1 || i2 == 2) {
                ajzf ajzf = textInputLayout2.i;
                int a3 = ajyl.a((View) a2, (int) R.attr.colorControlHighlight);
                int[][] iArr = {new int[]{16842919}, new int[0]};
                if (i2 != 2) {
                    int i3 = akck2.k.k;
                    qb.a((View) a2, (Drawable) new RippleDrawable(new ColorStateList(iArr, new int[]{ajuo.a(a3, i3, 0.1f), i3}), ajzf, ajzf));
                } else {
                    int a4 = ajyl.a((View) a2, (int) R.attr.colorSurface);
                    ajzf ajzf2 = new ajzf(ajzf.h());
                    int a5 = ajuo.a(a3, a4, 0.1f);
                    ajzf2.c(new ColorStateList(iArr, new int[]{a5, 0}));
                    ajzf2.setTint(a4);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{a5, a4});
                    ajzf ajzf3 = new ajzf(ajzf.h());
                    ajzf3.setTint(-1);
                    qb.a((View) a2, (Drawable) new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, ajzf2, ajzf3), ajzf}));
                }
            } else {
                throw new IllegalStateException();
            }
        }
        akck akck3 = this.a;
        a2.setOnTouchListener(new akcf(akck3, a2));
        a2.setOnFocusChangeListener(new akcg(akck3));
        a2.setOnDismissListener(new akch(akck3));
        a2.setThreshold(0);
        a2.removeTextChangedListener(this.a.a);
        a2.addTextChangedListener(this.a.a);
        textInputLayout.a((Drawable) null);
        textInputLayout.a(this.a.b);
        textInputLayout.e(true);
    }
}
