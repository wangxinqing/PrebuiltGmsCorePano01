package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CardView extends FrameLayout {
    public static final agm e = new agm();
    private static final int[] g = {16842801};
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final agl f;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void b() {
        agn agn = (agn) this.f.a;
        if (agn.a != 0.0f) {
            agn.a = 0.0f;
            agn.a((Rect) null);
            agn.invalidateSelf();
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public final float a() {
        return agm.a(this.f);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList colorStateList;
        this.c = new Rect();
        this.d = new Rect();
        this.f = new agl(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, agk.a, i, R.style.CardView);
        qb.a(this, context, agk.a, attributeSet, obtainStyledAttributes, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            colorStateList = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(g);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateList = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(R.color.cardview_light_background) : getResources().getColor(R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.c.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        this.c.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        this.c.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        this.c.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        agl agl = this.f;
        agn agn = new agn(colorStateList, dimension);
        agl.a = agn;
        agl.b.setBackgroundDrawable(agn);
        CardView cardView = agl.b;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        Drawable drawable = agl.a;
        boolean a2 = agl.a();
        boolean b2 = agl.b();
        agn agn2 = (agn) drawable;
        if (!(dimension3 == agn2.b && agn2.c == a2 && agn2.d == b2)) {
            agn2.b = dimension3;
            agn2.c = a2;
            agn2.d = b2;
            agn2.a((Rect) null);
            agn2.invalidateSelf();
        }
        agm.c(agl);
    }

    public void a(float f2) {
        this.f.b.setElevation(f2);
    }
}
