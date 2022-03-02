package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.List;
import org.chromium.net.UrlRequest;

/* renamed from: vup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vup extends vud {
    private final ImageView A;
    private final Drawable B;
    private final Drawable C;
    private final Drawable D;
    /* access modifiers changed from: private */
    public Animator E;
    public final View s;
    public final ImageView t;
    public final ProgressBar u;
    public final vwn v;
    final /* synthetic */ vuq w;
    private final TextView x;
    private final TextView y;
    private final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vup(vuq vuq, View view) {
        super(view);
        this.w = vuq;
        this.s = view.findViewById(R.id.root);
        this.x = (TextView) view.findViewById(R.id.header);
        this.y = (TextView) view.findViewById(R.id.title);
        this.z = (TextView) view.findViewById(R.id.description);
        this.t = (ImageView) view.findViewById(R.id.profile_image);
        this.u = (ProgressBar) view.findViewById(R.id.progress_bar);
        this.A = (ImageView) view.findViewById(R.id.badge);
        this.v = new vwn(vuq.a);
        this.B = kf.a(vuq.a, (int) R.drawable.sharing_progress_sending);
        this.C = kf.a(vuq.a, (int) R.drawable.sharing_progress_complete);
        this.D = kf.a(vuq.a, (int) R.drawable.sharing_progress_failed);
    }

    private final void a(float f) {
        ProgressBar progressBar = this.u;
        if (progressBar != null) {
            int i = (int) (f * 100.0f);
            progressBar.setProgress(i);
            this.u.setTag(R.id.progress_bar, Integer.valueOf(i));
        }
    }

    private static final void b(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    private final void c(Drawable drawable) {
        ProgressBar progressBar = this.u;
        if (progressBar != null) {
            Rect bounds = progressBar.getIndeterminateDrawable().getBounds();
            this.u.setIndeterminateDrawable(drawable);
            drawable.setBounds(bounds);
        }
    }

    private final void d(Drawable drawable) {
        ProgressBar progressBar;
        if (this.E == null && (progressBar = this.u) != null) {
            if (!progressBar.isIndeterminate()) {
                a(drawable);
                return;
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.v, "realLevel", new int[]{8000, 10000});
            this.E = ofInt;
            ofInt.addListener(new vum(this, drawable));
            this.E.setDuration(300);
            this.E.setInterpolator(new LinearInterpolator());
            this.E.start();
        }
    }

    private final void e(Drawable drawable) {
        Animator animator = this.E;
        if (animator != null) {
            animator.cancel();
        }
        ProgressBar progressBar = this.u;
        if (progressBar == null) {
            return;
        }
        if (progressBar.getProgress() == this.u.getMax()) {
            b(drawable);
            return;
        }
        ProgressBar progressBar2 = this.u;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar2, "progress", new int[]{progressBar2.getProgress(), this.u.getMax()});
        this.E = ofInt;
        ofInt.setDuration((long) (((this.u.getMax() - this.u.getProgress()) * 450) / this.u.getMax()));
        this.E.setInterpolator(new LinearInterpolator());
        this.E.addListener(new vun(this, drawable));
        this.E.start();
    }

    private final void v() {
        a((View) this.u, 1.0f);
        a(this.D);
        d(this.D);
        a((View) this.A, (int) R.drawable.sharing_bg_badge_error);
        a(this.A, (int) R.drawable.quantum_gm_ic_priority_high_vd_theme_24);
        e(this.D);
    }

    public final void b(Drawable drawable) {
        ImageView imageView = this.A;
        if (imageView != null && imageView.getVisibility() != 0) {
            this.A.animate().cancel();
            this.A.setVisibility(0);
            this.A.setScaleX(0.0f);
            this.A.setScaleY(0.0f);
            this.A.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator()).setUpdateListener(new vuo(this, drawable));
        }
    }

    private final void a(Context context, String str) {
        if (!amrk.a(str)) {
            a(this.z, (CharSequence) context.getString(R.string.sharing_notification_confirm_token, new Object[]{str}));
            b(this.z, 0);
        }
    }

    private static final void a(View view) {
        if (view != null) {
            view.animate().cancel();
        }
    }

    private static final void a(View view, float f) {
        if (view != null) {
            view.setAlpha(f);
        }
    }

    private static final void a(View view, int i) {
        if (view != null) {
            view.setBackgroundResource(i);
        }
    }

    private static final void a(ImageView imageView, int i) {
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    private static final void a(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final /* bridge */ /* synthetic */ void a(Context context, Object obj) {
        boolean z2;
        ShareTarget shareTarget = (ShareTarget) obj;
        TextView textView = this.x;
        String a = wig.a(this.w.a, shareTarget.b());
        List b = shareTarget.b();
        if (!b.isEmpty()) {
            z2 = ((Attachment) b.get(0)).d();
        } else {
            z2 = false;
        }
        if (textView != null) {
            a(textView, (CharSequence) a);
            if (z2) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
        }
        TextView textView2 = this.x;
        Drawable b2 = wig.b(this.w.a, shareTarget.b());
        if (textView2 != null) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(b2, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        a(this.y, (CharSequence) shareTarget.b);
        b(this.z, 8);
        Drawable drawable = (Drawable) this.w.g.get(shareTarget);
        if (drawable == null) {
            drawable = new vwp(context, shareTarget);
            this.w.g.put(shareTarget, drawable);
        }
        this.t.setImageDrawable(drawable);
        ProgressBar progressBar = this.u;
        if (progressBar != null) {
            progressBar.setMax(10000);
        }
        switch (this.w.b(shareTarget).a) {
            case 1:
            case 12:
                a(0.0f);
                c(this.v);
                Animator animator = this.E;
                if (animator != null) {
                    animator.cancel();
                }
                ProgressBar progressBar2 = this.u;
                if (progressBar2 != null) {
                    progressBar2.setIndeterminate(true);
                    this.u.animate().alpha(1.0f).start();
                }
                a((View) this.A);
                b(this.A, 8);
                return;
            case 2:
                a(context, this.w.b(shareTarget).c);
                a(0.0f);
                c(this.v);
                Animator animator2 = this.E;
                if (animator2 != null) {
                    animator2.cancel();
                }
                ProgressBar progressBar3 = this.u;
                if (progressBar3 != null) {
                    progressBar3.setIndeterminate(true);
                    this.u.animate().alpha(1.0f).start();
                }
                a((View) this.A);
                b(this.A, 8);
                return;
            case 3:
                a(context, this.w.b(shareTarget).c);
                a((View) this.u, 1.0f);
                d(this.B);
                a(0.0f);
                b(this.A, 8);
                return;
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                v();
                return;
            case 5:
                a((View) this.u, 1.0f);
                d(this.B);
                a(this.w.b(shareTarget).b);
                b(this.A, 8);
                return;
            case 6:
                a((View) this.u, 1.0f);
                a(100.0f);
                a(this.C);
                d(this.C);
                a((View) this.A, (int) R.drawable.sharing_bg_badge_success);
                a(this.A, (int) R.drawable.quantum_gm_ic_done_vd_theme_24);
                e(this.C);
                this.a.setEnabled(false);
                return;
            default:
                if (!ayni.g() || !this.w.b(shareTarget).e) {
                    a(0.0f);
                    a((View) this.u, 0.0f);
                    Animator animator3 = this.E;
                    if (animator3 != null) {
                        animator3.cancel();
                    }
                    c(this.v);
                    a((View) this.A);
                    b(this.A, 8);
                    this.a.setEnabled(true);
                    a(this.z, (CharSequence) "");
                    TextView textView3 = this.z;
                    int b3 = wid.b(context);
                    if (textView3 != null) {
                        textView3.setTextColor(b3);
                        return;
                    }
                    return;
                }
                v();
                return;
        }
    }

    public final void a(Drawable drawable) {
        ProgressBar progressBar = this.u;
        if (progressBar != null) {
            progressBar.setProgressDrawable(drawable);
            drawable.setLevel((this.u.getProgress() * 10000) / this.u.getMax());
        }
    }
}
