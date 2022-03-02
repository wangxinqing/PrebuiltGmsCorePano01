package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akbx extends akcl {
    public final TextWatcher a = new akbp(this);
    private final akdc b = new akbr(this);
    private AnimatorSet c;
    private ValueAnimator d;

    public akbx(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    private final ValueAnimator a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(ajrr.a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new akbv(this));
        return ofFloat;
    }

    public final void b(boolean z) {
        boolean g = this.k.g();
        if (z) {
            this.d.cancel();
            this.c.start();
            if (g) {
                this.c.end();
                return;
            }
            return;
        }
        this.c.cancel();
        this.d.start();
        if (!g) {
            this.d.end();
        }
    }

    public static boolean a(Editable editable) {
        return editable.length() > 0;
    }

    public final void a() {
        this.k.b(uj.b(this.l, R.drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.k;
        textInputLayout.d(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.k.a((View.OnClickListener) new akbs(this));
        this.k.a(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(ajrr.d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new akbw(this));
        ValueAnimator a2 = a(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, a2});
        this.c.addListener(new akbt(this));
        ValueAnimator a3 = a(1.0f, 0.0f);
        this.d = a3;
        a3.addListener(new akbu(this));
    }

    public final void a(boolean z) {
        if (this.k.g != null) {
            b(z);
        }
    }
}
