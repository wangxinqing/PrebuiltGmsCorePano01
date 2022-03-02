package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dev extends des {
    private boolean a;
    public long m;

    private static boolean a(Fragment fragment) {
        if (fragment.isRemoving()) {
            return true;
        }
        if (fragment.getParentFragment() != null) {
            return a(fragment.getParentFragment());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void a(long j) {
    }

    public abstract void a(dhj dhj);

    public abstract boolean a(csl csl);

    public abstract aqsr aC();

    /* access modifiers changed from: protected */
    public abstract View aD();

    public final void b(long j) {
        this.a = true;
        this.m = j;
    }

    public abstract dhh c();

    /* access modifiers changed from: protected */
    public final boolean e() {
        return awgy.a.a().i() && this.a;
    }

    public final void f() {
        List list;
        djh djh = new djh(aD());
        View view = (View) djh.a.get();
        if (view != null) {
            akax a2 = akax.a(view, (int) R.string.as_offline_snackbar, 0);
            TextView textView = (TextView) a2.e.findViewById(R.id.snackbar_text);
            if (textView != null) {
                a2.c(que.b(view.getContext(), R.attr.colorOnBackground, R.color.google_grey900));
                textView.setTextColor(que.b(view.getContext(), 16842801, R.color.google_white));
            }
            djg djg = new djg(djh);
            akap akap = a2.n;
            if (!(akap == null || (list = a2.k) == null)) {
                list.remove(akap);
            }
            if (a2.k == null) {
                a2.k = new ArrayList();
            }
            a2.k.add(djg);
            a2.n = djg;
            synchronized (djh.e) {
                djh.b = new WeakReference(a2);
                qb.b((View) a2.e, 1);
                qb.f(a2.e, 1);
                WeakReference weakReference = djh.c;
                if (weakReference != null) {
                    if (weakReference.get() != null) {
                        djh.d.removeCallbacks((Runnable) djh.c.get());
                    }
                }
                a2.getClass();
                djh.c = new WeakReference(new djf(a2));
                djh.d.postDelayed((Runnable) djh.c.get(), 500);
            }
        }
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z || getParentFragment() == null || !a(getParentFragment())) {
            return super.onCreateAnimation(i, z, i2);
        }
        return AnimationUtils.loadAnimation(getContext(), R.anim.as_stay_put);
    }

    public final void onResume() {
        super.onResume();
        if (e()) {
            this.a = false;
            View view = getView();
            view.addOnLayoutChangeListener(new deu(this, view));
            view.requestLayout();
        }
    }
}
