package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import com.google.android.gms.R;

/* renamed from: vum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vum extends vvc {
    final /* synthetic */ Drawable a;
    final /* synthetic */ vup b;

    public vum(vup vup, Drawable drawable) {
        this.b = vup;
        this.a = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.u.setIndeterminate(false);
        this.b.a(this.a);
        if (this.b.u.getTag(R.id.progress_bar) != null) {
            ProgressBar progressBar = this.b.u;
            progressBar.setProgress(((Integer) progressBar.getTag(R.id.progress_bar)).intValue());
        }
        vwn vwn = this.b.v;
        vwn.a = 8000;
        vwn.a().setLevel(8000);
        this.b.E = null;
    }
}
