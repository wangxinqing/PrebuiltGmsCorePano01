package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MediaNowPlayingView extends LinearLayout {
    protected final LinearInterpolator a = new LinearInterpolator();
    private final ImageView b;
    private final ImageView c;
    private final ImageView d;
    private final ObjectAnimator e;
    private final ObjectAnimator f;
    private final ObjectAnimator g;

    public MediaNowPlayingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.lb_playback_now_playing_bars, this, true);
        this.b = (ImageView) findViewById(R.id.bar1);
        this.c = (ImageView) findViewById(R.id.bar2);
        this.d = (ImageView) findViewById(R.id.bar3);
        ImageView imageView = this.b;
        imageView.setPivotY((float) imageView.getDrawable().getIntrinsicHeight());
        ImageView imageView2 = this.c;
        imageView2.setPivotY((float) imageView2.getDrawable().getIntrinsicHeight());
        ImageView imageView3 = this.d;
        imageView3.setPivotY((float) imageView3.getDrawable().getIntrinsicHeight());
        a((View) this.b);
        a((View) this.c);
        a((View) this.d);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, "scaleY", new float[]{0.41666666f, 0.25f, 0.41666666f, 0.5833333f, 0.75f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.5f, 0.33333334f, 0.16666667f, 0.33333334f, 0.5f, 0.5833333f, 0.75f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.41666666f, 0.25f, 0.33333334f, 0.41666666f});
        this.e = ofFloat;
        ofFloat.setRepeatCount(-1);
        this.e.setDuration(2320);
        this.e.setInterpolator(this.a);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.c, "scaleY", new float[]{1.0f, 0.9166667f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.8333333f, 1.0f, 0.8333333f, 0.75f, 0.6666667f, 1.0f});
        this.f = ofFloat2;
        ofFloat2.setRepeatCount(-1);
        this.f.setDuration(2080);
        this.f.setInterpolator(this.a);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.d, "scaleY", new float[]{0.6666667f, 0.75f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.5833333f, 0.6666667f, 0.75f, 1.0f, 0.9166667f, 1.0f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.6666667f});
        this.g = ofFloat3;
        ofFloat3.setRepeatCount(-1);
        this.g.setDuration(2000);
        this.g.setInterpolator(this.a);
    }

    private final void a() {
        a((Animator) this.e);
        a((Animator) this.f);
        a((Animator) this.g);
        this.b.setVisibility(0);
        this.c.setVisibility(0);
        this.d.setVisibility(0);
    }

    private final void b() {
        a(this.e, this.b);
        a(this.f, this.c);
        a(this.g, this.d);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            b();
        } else {
            a();
        }
    }

    private static final void a(Animator animator) {
        if (!animator.isStarted()) {
            animator.start();
        }
    }

    private static final void a(Animator animator, View view) {
        if (animator.isStarted()) {
            animator.cancel();
            a(view);
        }
    }

    static void a(View view) {
        view.setScaleY(0.083333336f);
    }
}
