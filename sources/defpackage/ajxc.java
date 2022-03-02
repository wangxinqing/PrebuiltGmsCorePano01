package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* renamed from: ajxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajxc extends ajxa {
    public ajxc(FloatingActionButton floatingActionButton, ajwp ajwp) {
        super(floatingActionButton, ajwp);
    }

    private final Animator a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.B, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.B, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    public final void d() {
    }

    public final boolean f() {
        return this.D.a() || !c();
    }

    public final boolean g() {
        return false;
    }

    public final ajzf h() {
        ajzl ajzl = this.b;
        ot.a((Object) ajzl);
        return new ajxb(ajzl);
    }

    public final void j() {
    }

    public final float a() {
        return this.B.getElevation();
    }

    public final void a(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.B.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(v, a(f, f3));
            stateListAnimator.addState(w, a(f, f2));
            stateListAnimator.addState(x, a(f, f2));
            stateListAnimator.addState(y, a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.B, "elevation", new float[]{f}).setDuration(0));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.B, View.TRANSLATION_Z, new float[]{this.B.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.B, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(z, animatorSet);
            stateListAnimator.addState(A, a(0.0f, 0.0f));
            this.B.setStateListAnimator(stateListAnimator);
        }
        if (f()) {
            e();
        }
    }

    public final void a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        this.c = h();
        this.c.setTintList(colorStateList);
        if (mode != null) {
            this.c.setTintMode(mode);
        }
        this.c.a(this.B.getContext());
        if (i > 0) {
            Context context = this.B.getContext();
            ajzl ajzl = this.b;
            ot.a((Object) ajzl);
            ajwl ajwl = new ajwl(ajzl);
            int b = kf.b(context, R.color.design_fab_stroke_top_outer_color);
            int b2 = kf.b(context, R.color.design_fab_stroke_top_inner_color);
            int b3 = kf.b(context, R.color.design_fab_stroke_end_inner_color);
            int b4 = kf.b(context, R.color.design_fab_stroke_end_outer_color);
            ajwl.c = b;
            ajwl.d = b2;
            ajwl.e = b3;
            ajwl.f = b4;
            float f = (float) i;
            if (ajwl.b != f) {
                ajwl.b = f;
                ajwl.a.setStrokeWidth(f * 1.3333f);
                ajwl.g = true;
                ajwl.invalidateSelf();
            }
            ajwl.a(colorStateList);
            this.e = ajwl;
            ajwl ajwl2 = this.e;
            ot.a((Object) ajwl2);
            ajzf ajzf = this.c;
            ot.a((Object) ajzf);
            drawable = new LayerDrawable(new Drawable[]{ajwl2, ajzf});
        } else {
            this.e = null;
            drawable = this.c;
        }
        this.d = new RippleDrawable(ajyu.b(colorStateList2), drawable, (Drawable) null);
        this.f = this.d;
    }

    public final void a(Rect rect) {
        if (this.D.a()) {
            super.a(rect);
        } else if (!c()) {
            int b = (this.l - this.B.b()) / 2;
            rect.set(b, b, b, b);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    public final void a(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.B.isEnabled()) {
            this.B.setElevation(this.i);
            if (this.B.isPressed()) {
                this.B.setTranslationZ(this.k);
            } else if (this.B.isFocused() || this.B.isHovered()) {
                this.B.setTranslationZ(this.j);
            } else {
                this.B.setTranslationZ(0.0f);
            }
        } else {
            this.B.setElevation(0.0f);
            this.B.setTranslationZ(0.0f);
        }
    }
}
