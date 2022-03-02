package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: akcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akcn {
    public final Context a;
    public final TextInputLayout b;
    public Animator c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public int j;
    public ColorStateList k;
    public CharSequence l;
    public boolean m;
    public TextView n;
    public int o;
    public ColorStateList p;
    private LinearLayout q;
    private int r;
    private FrameLayout s;
    private int t;
    private final float u;

    public akcn(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.u = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    private static final void a(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    static final boolean c(int i2) {
        return i2 == 0 || i2 == 1;
    }

    private final TextView d(int i2) {
        if (i2 == 1) {
            return this.h;
        }
        if (i2 != 2) {
            return null;
        }
        return this.n;
    }

    public final void b() {
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final int e() {
        TextView textView = this.h;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    private final void a(List list, boolean z, TextView textView, int i2, int i3, int i4) {
        float f2;
        if (textView != null && z) {
            if (i2 == i4 || i2 == i3) {
                if (i4 != i2) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f2});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(ajrr.a);
                list.add(ofFloat);
                if (i4 == i2) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.u, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(ajrr.d);
                    list.add(ofFloat2);
                }
            }
        }
    }

    public final void b(int i2) {
        this.o = i2;
        TextView textView = this.n;
        if (textView != null) {
            ry.a(textView, i2);
        }
    }

    public final void c() {
        EditText editText;
        LinearLayout linearLayout = this.q;
        if (linearLayout != null && (editText = this.b.a) != null) {
            qb.a(linearLayout, qb.i(editText), 0, qb.j(this.b.a), 0);
        }
    }

    public final boolean d() {
        if (this.e != 1 || this.h == null || TextUtils.isEmpty(this.f)) {
            return false;
        }
        return true;
    }

    public final void b(ColorStateList colorStateList) {
        this.p = colorStateList;
        TextView textView = this.n;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void b(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.q != null) {
            if (!c(i2) || (frameLayout = this.s) == null) {
                this.q.removeView(textView);
            } else {
                int i3 = this.t - 1;
                this.t = i3;
                a((ViewGroup) frameLayout, i3);
                this.s.removeView(textView);
            }
            int i4 = this.r - 1;
            this.r = i4;
            a((ViewGroup) this.q, i4);
        }
    }

    public final void a() {
        this.f = null;
        b();
        if (this.d == 1) {
            this.e = (!this.m || TextUtils.isEmpty(this.l)) ? 0 : 2;
        }
        a(this.d, this.e, a(this.h, (CharSequence) null));
    }

    public final void a(int i2) {
        this.j = i2;
        TextView textView = this.h;
        if (textView != null) {
            this.b.a(textView, i2);
        }
    }

    public final void a(int i2, int i3, boolean z) {
        TextView d2;
        TextView d3;
        int i4 = i2;
        int i5 = i3;
        boolean z2 = z;
        if (i4 != i5) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.c = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i6 = i2;
                int i7 = i3;
                a(arrayList2, this.m, this.n, 2, i6, i7);
                a(arrayList2, this.g, this.h, 1, i6, i7);
                ajrs.a(animatorSet, arrayList);
                animatorSet.addListener(new akcm(this, i3, d(i2), i2, d(i3)));
                animatorSet.start();
            } else if (i4 != i5) {
                if (!(i5 == 0 || (d3 = d(i3)) == null)) {
                    d3.setVisibility(0);
                    d3.setAlpha(1.0f);
                }
                if (!(i4 == 0 || (d2 = d(i2)) == null)) {
                    d2.setVisibility(4);
                    if (i4 == 1) {
                        d2.setText((CharSequence) null);
                    }
                }
                this.d = i5;
            }
            this.b.c();
            this.b.a(z2);
            this.b.i();
        }
    }

    public final void a(ColorStateList colorStateList) {
        this.k = colorStateList;
        TextView textView = this.h;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void a(TextView textView, int i2) {
        if (this.q == null && this.s == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.q = linearLayout;
            linearLayout.setOrientation(0);
            this.b.addView(this.q, -1, -2);
            this.s = new FrameLayout(this.a);
            this.q.addView(this.s, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.b.a != null) {
                c();
            }
        }
        if (c(i2)) {
            this.s.setVisibility(0);
            this.s.addView(textView);
            this.t++;
        } else {
            this.q.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.q.setVisibility(0);
        this.r++;
    }

    public final void a(CharSequence charSequence) {
        this.i = charSequence;
        TextView textView = this.h;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public final boolean a(TextView textView, CharSequence charSequence) {
        if (!qb.A(this.b) || !this.b.isEnabled() || (this.e == this.d && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }
}
