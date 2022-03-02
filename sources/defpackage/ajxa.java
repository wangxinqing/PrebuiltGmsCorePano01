package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* renamed from: ajxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajxa {
    static final int[] A = new int[0];
    public static final /* synthetic */ int E = 0;
    static final TimeInterpolator a = ajrr.c;
    static final int[] v = {16842919, 16842910};
    static final int[] w = {16843623, 16842908, 16842910};
    static final int[] x = {16842908, 16842910};
    static final int[] y = {16843623, 16842910};
    static final int[] z = {16842910};
    public final FloatingActionButton B;
    public ViewTreeObserver.OnPreDrawListener C;
    final ajwp D;
    private final ajxs F;
    private final Rect G = new Rect();
    private final RectF H = new RectF();
    private final RectF I = new RectF();
    private final Matrix J = new Matrix();
    ajzl b;
    public ajzf c;
    Drawable d;
    public ajwl e;
    Drawable f;
    public boolean g;
    final boolean h = true;
    public float i;
    public float j;
    public float k;
    public int l;
    public ajrv m;
    public ajrv n;
    public Animator o;
    public ajrv p;
    public ajrv q;
    public float r;
    public float s = 1.0f;
    public int t;
    public int u = 0;

    public ajxa(FloatingActionButton floatingActionButton, ajwp ajwp) {
        this.B = floatingActionButton;
        this.D = ajwp;
        ajxs ajxs = new ajxs();
        this.F = ajxs;
        ajxs.a(v, a((ajwz) new ajwx(this)));
        this.F.a(w, a((ajwz) new ajww(this)));
        this.F.a(x, a((ajwz) new ajww(this)));
        this.F.a(y, a((ajwz) new ajww(this)));
        this.F.a(z, a((ajwz) new ajwy(this)));
        this.F.a(A, a((ajwz) new ajwv(this)));
        this.r = this.B.getRotation();
    }

    private static final ValueAnimator a(ajwz ajwz) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(ajwz);
        valueAnimator.addUpdateListener(ajwz);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public float a() {
        return this.i;
    }

    public final void b() {
        a(this.s);
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return !this.g || this.B.b() >= this.l;
    }

    public void d() {
        ajxs ajxs = this.F;
        ValueAnimator valueAnimator = ajxs.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            ajxs.c = null;
        }
    }

    public final void e() {
        Rect rect = this.G;
        a(rect);
        ot.a((Object) this.f, (Object) "Didn't initialize content background");
        if (f()) {
            this.D.a(new InsetDrawable(this.f, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.D.a(this.f);
        }
        ajwp ajwp = this.D;
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        ajwp.a.c.set(i2, i3, i4, i5);
        FloatingActionButton floatingActionButton = ajwp.a;
        int i6 = floatingActionButton.a;
        floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    public boolean f() {
        return true;
    }

    public boolean g() {
        return true;
    }

    public ajzf h() {
        ajzl ajzl = this.b;
        ot.a((Object) ajzl);
        return new ajzf(ajzl);
    }

    public final boolean i() {
        return qb.A(this.B) && !this.B.isInEditMode();
    }

    public void j() {
        int i2 = Build.VERSION.SDK_INT;
        ajzf ajzf = this.c;
        if (ajzf != null) {
            ajzf.b((int) this.r);
        }
    }

    private final void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.B.getDrawable();
        if (drawable != null && this.t != 0) {
            RectF rectF = this.H;
            RectF rectF2 = this.I;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f3 = (float) this.t;
            rectF2.set(0.0f, 0.0f, f3, f3);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f4 = ((float) this.t) / 2.0f;
            matrix.postScale(f2, f2, f4, f4);
        }
    }

    public final void b(float f2) {
        ajzf ajzf = this.c;
        if (ajzf != null) {
            ajzf.d(f2);
        }
    }

    private static final void a(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new ajwt());
        }
    }

    public final AnimatorSet a(ajrv ajrv, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.B, View.ALPHA, new float[]{f2});
        ajrv.a("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B, View.SCALE_X, new float[]{f3});
        ajrv.a("scale").a(ofFloat2);
        a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.B, View.SCALE_Y, new float[]{f3});
        ajrv.a("scale").a(ofFloat3);
        a(ofFloat3);
        arrayList.add(ofFloat3);
        a(f4, this.J);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.B, new ajrt(), new ajws(this), new Matrix[]{new Matrix(this.J)});
        ajrv.a("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        ajrs.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final void a(float f2) {
        this.s = f2;
        Matrix matrix = this.J;
        a(f2, matrix);
        this.B.setImageMatrix(matrix);
    }

    public void a(float f2, float f3, float f4) {
        e();
        b(f2);
    }

    public final void a(ajzl ajzl) {
        this.b = ajzl;
        ajzf ajzf = this.c;
        if (ajzf != null) {
            ajzf.a(ajzl);
        }
        Drawable drawable = this.d;
        if (drawable instanceof ajzw) {
            ((ajzw) drawable).a(ajzl);
        }
        ajwl ajwl = this.e;
        if (ajwl != null) {
            ajwl.h = ajzl;
            ajwl.invalidateSelf();
        }
    }

    public void a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        ajzf h2 = h();
        this.c = h2;
        h2.setTintList(colorStateList);
        if (mode != null) {
            this.c.setTintMode(mode);
        }
        this.c.r();
        this.c.a(this.B.getContext());
        ajyt ajyt = new ajyt(new ajys(new ajzf(this.c.h())));
        ajyt.setTintList(ajyu.b(colorStateList2));
        this.d = ajyt;
        ajzf ajzf = this.c;
        ot.a((Object) ajzf);
        this.f = new LayerDrawable(new Drawable[]{ajzf, ajyt});
    }

    public void a(Rect rect) {
        int i2;
        if (this.g) {
            i2 = (this.l - this.B.b()) / 2;
        } else {
            i2 = 0;
        }
        float a2 = this.h ? a() + this.k : 0.0f;
        int max = Math.max(i2, (int) Math.ceil((double) a2));
        int max2 = Math.max(i2, (int) Math.ceil((double) (a2 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public void a(int[] iArr) {
        ajxr ajxr;
        ValueAnimator valueAnimator;
        ajxs ajxs = this.F;
        int size = ajxs.a.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                ajxr = null;
                break;
            }
            ajxr = (ajxr) ajxs.a.get(i2);
            if (StateSet.stateSetMatches(ajxr.a, iArr)) {
                break;
            }
            i2++;
        }
        ajxr ajxr2 = ajxs.b;
        if (ajxr != ajxr2) {
            if (!(ajxr2 == null || (valueAnimator = ajxs.c) == null)) {
                valueAnimator.cancel();
                ajxs.c = null;
            }
            ajxs.b = ajxr;
            if (ajxr != null) {
                ajxs.c = ajxr.b;
                ajxs.c.start();
            }
        }
    }
}
