package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: adgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adgl implements jmh {
    public final View a;
    public final View b;
    public final View c;
    public final View d;
    private final ScrollView e;
    private final ViewGroup f;
    private final int g;
    private final Animation h;
    private final Animation i;
    private final Animation j;

    public adgl(ScrollView scrollView, ViewGroup viewGroup) {
        this.e = scrollView;
        ViewGroup viewGroup2 = (ViewGroup) scrollView.findViewById(R.id.udc_consent_header);
        this.f = viewGroup2;
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header);
        if (textView == null) {
            textView = null;
        } else if (TextUtils.isEmpty(textView.getText())) {
            textView = null;
        }
        this.a = textView;
        this.b = this.f.findViewById(R.id.illustration);
        this.c = viewGroup.findViewById(R.id.udc_consent_toolbar);
        this.d = viewGroup.findViewById(R.id.udc_consent_toolbar_shadow);
        Context context = scrollView.getContext();
        this.g = context.getResources().getDimensionPixelSize(R.dimen.udc_consent_title_vertical_margin);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.udc_fade_in);
        this.i = loadAnimation;
        loadAnimation.setDuration(600);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.udc_fade_out);
        this.j = loadAnimation2;
        loadAnimation2.setDuration(600);
        this.h = AnimationUtils.loadAnimation(context, R.anim.udc_fade_in);
    }

    private final void a(View view) {
        a(view, this.i, 0);
    }

    private final void b(View view) {
        a(view, this.j, 4);
    }

    public static final void a(View view, int i2) {
        if (view != null && view.getVisibility() != 8 && view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
    }

    private final void a(View view, Animation animation, int i2) {
        View view2 = this.b;
        if ((view != view2 || view2 == null || view2.getVisibility() != 8) && view != null) {
            view.clearAnimation();
            view.startAnimation(animation);
            view.setVisibility(i2);
        }
    }

    public final void a(int i2) {
        if (a()) {
            if (this.c.getVisibility() != 0) {
                a(this.c);
                b(this.a);
                b(this.b);
            }
        } else if (this.c.getVisibility() == 0) {
            b(this.c);
            a(this.a);
            a(this.b);
        }
        if (this.f.getHeight() - i2 <= this.c.getHeight()) {
            if (this.d.getVisibility() != 0) {
                a(this.d, this.h, 0);
            }
        } else if (this.d.getVisibility() == 0) {
            this.d.clearAnimation();
            this.d.setVisibility(4);
        }
    }

    public final boolean a() {
        int i2;
        if (this.e == null || this.c == null) {
            return false;
        }
        View view = this.a;
        if (view != null) {
            i2 = view.getTop();
        } else {
            View view2 = this.b;
            i2 = view2 != null ? view2.getBottom() : 0;
        }
        return i2 - this.e.getScrollY() <= this.g + this.c.getPaddingTop();
    }
}
