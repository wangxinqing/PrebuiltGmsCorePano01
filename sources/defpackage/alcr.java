package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: alcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alcr extends aai {
    final ArrayList j = new ArrayList();
    final ArrayList k = new ArrayList();
    final ArrayList l = new ArrayList();
    private final int m;

    public alcr(Resources resources) {
        this.m = resources.getDimensionPixelSize(R.dimen.place_autocomplete_vertical_dropdown);
    }

    public static final void a(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    private final void i(adl adl) {
        View view = adl.a;
        this.l.add(adl);
        long j2 = 250;
        if (adl instanceof alct) {
            j2 = 250 + ((long) (((alct) adl).s * 67));
        }
        view.setTranslationY((float) (-this.m));
        view.setAlpha(0.0f);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.translationY(0.0f).alpha(1.0f).setDuration(133).setInterpolator(new aiq()).setStartDelay(j2);
        animate.setListener(new alcq(this, view, adl, animate)).start();
    }

    public final boolean b() {
        return super.b() || !this.j.isEmpty() || !this.l.isEmpty();
    }

    public final void d() {
        for (int size = this.j.size() - 1; size >= 0; size--) {
            adl adl = (adl) this.j.get(size);
            a(adl.a);
            e(adl);
            this.j.remove(size);
        }
        ArrayList arrayList = this.l;
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((adl) arrayList.get(size2)).a.animate().cancel();
        }
        super.d();
    }

    public final void g() {
        if (!b()) {
            e();
        }
    }

    public final void a() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            super.b((adl) arrayList.get(i));
        }
        this.k.clear();
        super.a();
        if (!this.j.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(this.j);
            this.j.clear();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                adl adl = (adl) arrayList2.get(i2);
                View view = adl.a;
                this.l.add(adl);
                long j2 = 250;
                if (adl instanceof alct) {
                    j2 = 250 + ((long) (((alct) adl).s * 67));
                }
                view.setTranslationY((float) (-this.m));
                view.setAlpha(0.0f);
                ViewPropertyAnimator animate = view.animate();
                animate.cancel();
                animate.translationY(0.0f).alpha(1.0f).setDuration(133).setInterpolator(new aiq()).setStartDelay(j2);
                animate.setListener(new alcq(this, view, adl, animate)).start();
            }
        }
    }

    public final boolean b(adl adl) {
        d(adl);
        qb.J(adl.a);
        if (!(adl instanceof alct) || !((alct) adl).t) {
            this.k.add(adl);
            return true;
        }
        this.j.add(adl);
        return true;
    }

    public final void d(adl adl) {
        super.d(adl);
        View view = adl.a;
        if (this.j.remove(adl)) {
            a(view);
            e(adl);
        }
        g();
    }
}
