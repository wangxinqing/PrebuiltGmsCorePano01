package defpackage;

import android.view.View;
import com.google.android.gms.R;
import com.google.android.pano.widget.ScrollAdapterView;

/* renamed from: akeb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class akeb implements akgs {
    private int a;
    private View b;
    private View c = null;
    public final akef g;
    public akge h;
    public ScrollAdapterView i;
    public volatile boolean j = true;

    public akeb(akef akef) {
        this.g = akef;
    }

    public final ScrollAdapterView a() {
        b();
        return this.i;
    }

    public final void b() {
        if (this.i == null) {
            View view = this.g.getView();
            if (view != null) {
                if (view instanceof ScrollAdapterView) {
                    this.i = (ScrollAdapterView) view;
                    this.b = null;
                } else {
                    ScrollAdapterView scrollAdapterView = (ScrollAdapterView) view.findViewById(R.id.list);
                    this.i = scrollAdapterView;
                    if (scrollAdapterView != null) {
                        this.b = view.findViewById(R.id.selector);
                    } else {
                        throw new IllegalStateException("No scroll adapter view exists.");
                    }
                }
                ScrollAdapterView scrollAdapterView2 = this.i;
                if (scrollAdapterView2 != null) {
                    scrollAdapterView2.requestFocusFromTouch();
                    akge akge = this.h;
                    if (akge != null) {
                        this.i.setAdapter(akge);
                    }
                    if (this.b != null) {
                        this.a = this.g.getActivity().getResources().getInteger(R.integer.dialog_animation_duration);
                        this.i.a((akgs) this);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Content view not created yet.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.view.View r6, float r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            double r0 = (double) r7
            r2 = 0
            r7 = 1073741824(0x40000000, float:2.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x003e
            android.view.View r6 = r5.c     // Catch:{ all -> 0x003b }
            if (r6 == 0) goto L_0x0039
            android.view.View r6 = r5.b     // Catch:{ all -> 0x003b }
            android.view.ViewPropertyAnimator r6 = r6.animate()     // Catch:{ all -> 0x003b }
            r0 = 0
            android.view.ViewPropertyAnimator r6 = r6.alpha(r0)     // Catch:{ all -> 0x003b }
            int r0 = r5.a     // Catch:{ all -> 0x003b }
            long r0 = (long) r0     // Catch:{ all -> 0x003b }
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r0)     // Catch:{ all -> 0x003b }
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator     // Catch:{ all -> 0x003b }
            r0.<init>(r7)     // Catch:{ all -> 0x003b }
            android.view.ViewPropertyAnimator r6 = r6.setInterpolator(r0)     // Catch:{ all -> 0x003b }
            akea r7 = new akea     // Catch:{ all -> 0x003b }
            r0 = 1
            r7.<init>(r5, r0)     // Catch:{ all -> 0x003b }
            android.view.ViewPropertyAnimator r6 = r6.setListener(r7)     // Catch:{ all -> 0x003b }
            r6.start()     // Catch:{ all -> 0x003b }
            r6 = 0
            r5.c = r6     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r5)
            return
        L_0x003b:
            r6 = move-exception
            goto L_0x00b7
        L_0x003e:
            r0 = 0
            if (r6 == 0) goto L_0x00a8
            android.view.View r1 = r5.b     // Catch:{ all -> 0x003b }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x003b }
            if (r1 != 0) goto L_0x0068
            android.view.View r1 = r5.b     // Catch:{ all -> 0x003b }
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch:{ all -> 0x003b }
            akef r2 = r5.g     // Catch:{ all -> 0x003b }
            com.google.android.chimera.Activity r2 = r2.getActivity()     // Catch:{ all -> 0x003b }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ all -> 0x003b }
            r3 = 2131165303(0x7f070077, float:1.794482E38)
            int r2 = r2.getDimensionPixelSize(r3)     // Catch:{ all -> 0x003b }
            r1.height = r2     // Catch:{ all -> 0x003b }
            android.view.View r3 = r5.b     // Catch:{ all -> 0x003b }
            r3.setLayoutParams(r1)     // Catch:{ all -> 0x003b }
            r1 = r2
        L_0x0068:
            int r2 = r6.getHeight()     // Catch:{ all -> 0x003b }
            float r2 = (float) r2     // Catch:{ all -> 0x003b }
            float r1 = (float) r1     // Catch:{ all -> 0x003b }
            float r2 = r2 / r1
            android.view.View r1 = r5.b     // Catch:{ all -> 0x003b }
            android.view.ViewPropertyAnimator r1 = r1.animate()     // Catch:{ all -> 0x003b }
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r1 = r1.alpha(r3)     // Catch:{ all -> 0x003b }
            akea r3 = new akea     // Catch:{ all -> 0x003b }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x003b }
            android.view.ViewPropertyAnimator r0 = r1.setListener(r3)     // Catch:{ all -> 0x003b }
            int r1 = r5.a     // Catch:{ all -> 0x003b }
            long r3 = (long) r1     // Catch:{ all -> 0x003b }
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)     // Catch:{ all -> 0x003b }
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator     // Catch:{ all -> 0x003b }
            r1.<init>(r7)     // Catch:{ all -> 0x003b }
            android.view.ViewPropertyAnimator r7 = r0.setInterpolator(r1)     // Catch:{ all -> 0x003b }
            boolean r0 = r5.j     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x009e
            android.view.View r0 = r5.b     // Catch:{ all -> 0x003b }
            r0.setScaleY(r2)     // Catch:{ all -> 0x003b }
            goto L_0x00a1
        L_0x009e:
            r7.scaleY(r2)     // Catch:{ all -> 0x003b }
        L_0x00a1:
            r7.start()     // Catch:{ all -> 0x003b }
            r5.c = r6     // Catch:{ all -> 0x003b }
            monitor-exit(r5)
            return
        L_0x00a8:
            android.view.View r6 = r5.b     // Catch:{ all -> 0x003b }
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()     // Catch:{ all -> 0x003b }
            r6.height = r0     // Catch:{ all -> 0x003b }
            android.view.View r7 = r5.b     // Catch:{ all -> 0x003b }
            r7.setLayoutParams(r6)     // Catch:{ all -> 0x003b }
            monitor-exit(r5)
            return
        L_0x00b7:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akeb.a(android.view.View, float):void");
    }
}
