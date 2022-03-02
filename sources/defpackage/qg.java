package defpackage;

import android.animation.Animator;
import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: qg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qg {
    public final WeakReference a;

    public qg(View view) {
        this.a = new WeakReference(view);
    }

    public final void a() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void a(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void a(qh qhVar) {
        View view = (View) this.a.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            if (qhVar != null) {
                view.animate().setListener(new qe(qhVar));
            } else {
                view.animate().setListener((Animator.AnimatorListener) null);
            }
        }
    }

    public final void a(ue ueVar) {
        qf qfVar;
        View view = (View) this.a.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            if (ueVar != null) {
                qfVar = new qf(ueVar);
            } else {
                qfVar = null;
            }
            view.animate().setUpdateListener(qfVar);
        }
    }
}
