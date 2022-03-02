package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/* renamed from: acg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class acg {
    public final ach b = new ach();
    public boolean c = false;
    public final int d = 1;

    public long J(int i) {
        return -1;
    }

    public final void K(int i) {
        this.b.a(i, 1);
    }

    public final void L(int i) {
        this.b.b(i, 1);
    }

    public final void M(int i) {
        this.b.c(i, 1);
    }

    public abstract int a();

    public int a(int i) {
        return 0;
    }

    public abstract adl a(ViewGroup viewGroup, int i);

    public void a(adl adl) {
    }

    public abstract void a(adl adl, int i);

    public void a(RecyclerView recyclerView) {
    }

    public final void as() {
        this.b.b();
    }

    public final adl b(ViewGroup viewGroup, int i) {
        try {
            mv.a("RV CreateView");
            adl a = a(viewGroup, i);
            if (a.a.getParent() == null) {
                a.f = i;
                return a;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } finally {
            mv.a();
        }
    }

    public void b(adl adl) {
    }

    public final void c(int i, int i2) {
        this.b.b(i, i2);
    }

    public final void d(int i, int i2) {
        this.b.c(i, i2);
    }

    public final void h(int i, int i2) {
        this.b.a(i, i2);
    }

    public void a(aci aci) {
        this.b.registerObserver(aci);
    }

    public final void b(int i, int i2) {
        this.b.d(i, i2);
    }

    public void b(aci aci) {
        this.b.unregisterObserver(aci);
    }

    public final void a(boolean z) {
        if (!this.b.a()) {
            this.c = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final void b(adl adl, int i) {
        acg acg = adl.r;
        if (acg == null) {
            adl.c = i;
            if (this.c) {
                adl.e = J(i);
            }
            adl.a(1, 519);
            mv.a("RV OnBindView");
        }
        adl.r = this;
        adl.r();
        a(adl, i);
        if (acg == null) {
            adl.q();
            ViewGroup.LayoutParams layoutParams = adl.a.getLayoutParams();
            if (layoutParams instanceof acu) {
                ((acu) layoutParams).e = true;
            }
            mv.a();
        }
    }
}
