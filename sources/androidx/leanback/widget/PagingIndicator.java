package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PagingIndicator extends View {
    private static final TimeInterpolator i = new DecelerateInterpolator();
    private static final Property j = new akk(Float.class, "alpha");
    private static final Property k = new akl(Float.class, "diameter");
    private static final Property l = new akm(Float.class, "translation_x");
    boolean a;
    final int b;
    final int c;
    final int d;
    final Paint e;
    final Paint f;
    Bitmap g;
    Paint h;
    private final int m;
    private final int n;
    private final int o;
    private int[] p;
    private int[] q;
    private int[] r;
    private final AnimatorSet s;
    private final AnimatorSet t;
    private final AnimatorSet u;

    public PagingIndicator(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    private final int a(TypedArray typedArray, int i2, int i3) {
        return typedArray.getDimensionPixelOffset(i2, getResources().getDimensionPixelOffset(i3));
    }

    private final int b(TypedArray typedArray, int i2, int i3) {
        return typedArray.getColor(i2, getResources().getColor(i3));
    }

    private final void c() {
        int paddingLeft = getPaddingLeft();
        getPaddingTop();
        int width = getWidth();
        int paddingRight = getPaddingRight();
        int d2 = d();
        int i2 = (paddingLeft + (width - paddingRight)) / 2;
        int[] iArr = new int[0];
        this.p = iArr;
        int[] iArr2 = new int[0];
        this.q = iArr2;
        int[] iArr3 = new int[0];
        this.r = iArr3;
        if (this.a) {
            int i3 = (i2 - (d2 / 2)) + this.b;
            int i4 = this.m;
            int i5 = this.n;
            iArr[0] = (i3 - i4) + i5;
            iArr2[0] = i3;
            iArr3[0] = (i3 - (i4 + i4)) + i5 + i5;
        } else {
            int i6 = (i2 + (d2 / 2)) - this.b;
            int i7 = this.m;
            int i8 = this.n;
            iArr[0] = (i6 + i7) - i8;
            iArr2[0] = i6;
            iArr3[0] = (i6 + (i7 + i7)) - (i8 + i8);
        }
        throw null;
    }

    private final int d() {
        int i2 = this.b;
        int i3 = this.n;
        return i2 + i2 + i3 + i3 + (this.m * -3);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
    }

    public final void onRtlPropertiesChanged(int i2) {
        boolean z;
        super.onRtlPropertiesChanged(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.a != z) {
            this.a = z;
            this.g = a();
            c();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        setMeasuredDimension(i2, i3);
        c();
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final Animator b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, l, new float[]{(float) ((-this.n) + this.m), 0.0f});
        ofFloat.setDuration(417);
        ofFloat.setInterpolator(i);
        return ofFloat;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int paddingTop = getPaddingTop() + this.c + getPaddingBottom() + this.o;
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, View.MeasureSpec.getSize(i3));
        } else if (mode == 1073741824) {
            paddingTop = View.MeasureSpec.getSize(i3);
        }
        int paddingLeft = getPaddingLeft() + d() + getPaddingRight();
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, View.MeasureSpec.getSize(i2));
        } else if (mode2 == 1073741824) {
            paddingLeft = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        boolean z;
        this.u = new AnimatorSet();
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.b, i2, 0);
        qb.a(this, context, ait.b, attributeSet, obtainStyledAttributes, i2, 0);
        this.b = a(obtainStyledAttributes, 10, R.dimen.lb_page_indicator_dot_radius);
        int a2 = a(obtainStyledAttributes, 3, R.dimen.lb_page_indicator_arrow_radius);
        this.d = a2;
        this.c = a2 + a2;
        this.m = a(obtainStyledAttributes, 9, R.dimen.lb_page_indicator_dot_gap);
        this.n = a(obtainStyledAttributes, 8, R.dimen.lb_page_indicator_arrow_gap);
        int b2 = b(obtainStyledAttributes, 5, R.color.lb_page_indicator_dot);
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(b2);
        b(obtainStyledAttributes, 1, R.color.lb_page_indicator_arrow_background);
        if (this.h == null && obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            if (this.h == null) {
                this.h = new Paint();
            }
            this.h.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
        obtainStyledAttributes.recycle();
        if (resources.getConfiguration().getLayoutDirection() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
        int color2 = resources.getColor(R.color.lb_page_indicator_arrow_shadow);
        this.o = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_radius);
        this.f = new Paint(1);
        float dimensionPixelSize = (float) resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_offset);
        this.f.setShadowLayer((float) this.o, dimensionPixelSize, dimensionPixelSize, color2);
        this.g = a();
        new Rect(0, 0, this.g.getWidth(), this.g.getHeight());
        this.g.getWidth();
        AnimatorSet animatorSet = new AnimatorSet();
        this.s = animatorSet;
        int i3 = this.b;
        int i4 = this.d;
        animatorSet.playTogether(new Animator[]{a(0.0f, 1.0f), b((float) (i3 + i3), (float) (i4 + i4)), b()});
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.t = animatorSet2;
        int i5 = this.d;
        int i6 = this.b;
        animatorSet2.playTogether(new Animator[]{a(1.0f, 0.0f), b((float) (i5 + i5), (float) (i6 + i6)), b()});
        this.u.playTogether(new Animator[]{this.s, this.t});
        setLayerType(1, (Paint) null);
    }

    private static final Animator a(float f2, float f3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, j, new float[]{f2, f3});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(i);
        return ofFloat;
    }

    private final Bitmap a() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_ic_nav_arrow);
        if (this.a) {
            return decodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
    }

    private static final Animator b(float f2, float f3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, k, new float[]{f2, f3});
        ofFloat.setDuration(417);
        ofFloat.setInterpolator(i);
        return ofFloat;
    }
}
