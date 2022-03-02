package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: wb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wb {
    public final ArrayList a = new ArrayList();
    qh b;
    public boolean c;
    private long d = -1;
    private Interpolator e;
    private final qi f = new wa(this);

    public final void a() {
        View view;
        if (!this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                qg qgVar = (qg) arrayList.get(i);
                long j = this.d;
                if (j >= 0) {
                    qgVar.a(j);
                }
                Interpolator interpolator = this.e;
                if (!(interpolator == null || (view = (View) qgVar.a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.b != null) {
                    qgVar.a((qh) this.f);
                }
                View view2 = (View) qgVar.a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.c = true;
        }
    }

    public final void a(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
    }

    public final void a(qh qhVar) {
        if (!this.c) {
            this.b = qhVar;
        }
    }

    public final void b() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((qg) arrayList.get(i)).a();
            }
            this.c = false;
        }
    }

    public final void c() {
        if (!this.c) {
            this.d = 250;
        }
    }

    public final void a(qg qgVar) {
        if (!this.c) {
            this.a.add(qgVar);
        }
    }
}
