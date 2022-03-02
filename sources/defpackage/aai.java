package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aai extends aek {
    private static TimeInterpolator j;
    final ArrayList a = new ArrayList();
    final ArrayList b = new ArrayList();
    final ArrayList c = new ArrayList();
    final ArrayList d = new ArrayList();
    final ArrayList e = new ArrayList();
    final ArrayList f = new ArrayList();
    final ArrayList g = new ArrayList();
    private final ArrayList k = new ArrayList();
    private final ArrayList l = new ArrayList();
    private final ArrayList m = new ArrayList();
    private final ArrayList n = new ArrayList();

    private final void a(aag aag) {
        adl adl = aag.a;
        if (adl != null) {
            a(aag, adl);
        }
        adl adl2 = aag.b;
        if (adl2 != null) {
            a(aag, adl2);
        }
    }

    private final void i(adl adl) {
        if (j == null) {
            j = new ValueAnimator().getInterpolator();
        }
        adl.a.animate().setInterpolator(j);
        d(adl);
    }

    public boolean b() {
        return !this.l.isEmpty() || !this.n.isEmpty() || !this.m.isEmpty() || !this.k.isEmpty() || !this.e.isEmpty() || !this.f.isEmpty() || !this.d.isEmpty() || !this.g.isEmpty() || !this.b.isEmpty() || !this.a.isEmpty() || !this.c.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (!b()) {
            e();
        }
    }

    public void d() {
        int size = this.m.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            aah aah = (aah) this.m.get(size);
            View view = aah.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            e(aah.a);
            this.m.remove(size);
        }
        for (int size2 = this.k.size() - 1; size2 >= 0; size2--) {
            e((adl) this.k.get(size2));
            this.k.remove(size2);
        }
        int size3 = this.l.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            adl adl = (adl) this.l.get(size3);
            adl.a.setAlpha(1.0f);
            e(adl);
            this.l.remove(size3);
        }
        for (int size4 = this.n.size() - 1; size4 >= 0; size4--) {
            a((aag) this.n.get(size4));
        }
        this.n.clear();
        if (b()) {
            for (int size5 = this.b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    aah aah2 = (aah) arrayList.get(size6);
                    View view2 = aah2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    e(aah2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    adl adl2 = (adl) arrayList2.get(size8);
                    adl2.a.setAlpha(1.0f);
                    e(adl2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    a((aag) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.c.remove(arrayList3);
                    }
                }
            }
            a((List) this.f);
            a((List) this.e);
            a((List) this.d);
            a((List) this.g);
            e();
        }
    }

    public boolean b(adl adl) {
        i(adl);
        adl.a.setAlpha(0.0f);
        this.l.add(adl);
        return true;
    }

    public void c(adl adl) {
        View view = adl.a;
        ViewPropertyAnimator animate = view.animate();
        this.d.add(adl);
        animate.alpha(1.0f).setDuration(120).setListener(new aac(this, adl, view, animate)).start();
    }

    static final void a(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((adl) list.get(size)).a.animate().cancel();
        }
    }

    private final void a(List list, adl adl) {
        for (int size = list.size() - 1; size >= 0; size--) {
            aag aag = (aag) list.get(size);
            if (a(aag, adl) && aag.a == null && aag.b == null) {
                list.remove(aag);
            }
        }
    }

    private final boolean a(aag aag, adl adl) {
        if (aag.b == adl) {
            aag.b = null;
        } else if (aag.a != adl) {
            return false;
        } else {
            aag.a = null;
        }
        adl.a.setAlpha(1.0f);
        adl.a.setTranslationX(0.0f);
        adl.a.setTranslationY(0.0f);
        e(adl);
        return true;
    }

    public void a() {
        long j2;
        long j3;
        boolean isEmpty = this.k.isEmpty();
        boolean z = !isEmpty;
        boolean isEmpty2 = this.m.isEmpty();
        boolean z2 = !isEmpty2;
        boolean isEmpty3 = this.n.isEmpty();
        boolean z3 = !isEmpty3;
        boolean z4 = !this.l.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                adl adl = (adl) arrayList.get(i);
                View view = adl.a;
                ViewPropertyAnimator animate = view.animate();
                this.f.add(adl);
                animate.setDuration(120).alpha(0.0f).setListener(new aab(this, adl, animate, view)).start();
            }
            this.k.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.m);
                this.b.add(arrayList2);
                this.m.clear();
                zy zyVar = new zy(this, arrayList2);
                if (z) {
                    qb.a(((aah) arrayList2.get(0)).a.a, (Runnable) zyVar, 120);
                } else {
                    zyVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.n);
                this.c.add(arrayList3);
                this.n.clear();
                zz zzVar = new zz(this, arrayList3);
                if (z) {
                    j2 = 120;
                    qb.a(((aag) arrayList3.get(0)).a.a, (Runnable) zzVar, 120);
                } else {
                    j2 = 120;
                    zzVar.run();
                }
            } else {
                j2 = 120;
            }
            if (z4) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.l);
                this.a.add(arrayList4);
                this.l.clear();
                aaa aaa = new aaa(this, arrayList4);
                if (!z && !z2 && !z3) {
                    aaa.run();
                    return;
                }
                long j4 = 0;
                if (isEmpty) {
                    j2 = 0;
                }
                if (!isEmpty2) {
                    j3 = 250;
                } else {
                    j3 = 0;
                }
                if (!isEmpty3) {
                    j4 = 250;
                }
                qb.a(((adl) arrayList4.get(0)).a, (Runnable) aaa, j2 + Math.max(j3, j4));
            }
        }
    }

    public final boolean a(adl adl) {
        i(adl);
        this.k.add(adl);
        return true;
    }

    public final boolean a(adl adl, int i, int i2, int i3, int i4) {
        View view = adl.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) adl.a.getTranslationY());
        i(adl);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            e(adl);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.m.add(new aah(adl, translationX, translationY, i3, i4));
        return true;
    }

    public final boolean a(adl adl, adl adl2, int i, int i2, int i3, int i4) {
        if (adl == adl2) {
            return a(adl, i, i2, i3, i4);
        }
        float translationX = adl.a.getTranslationX();
        float translationY = adl.a.getTranslationY();
        float alpha = adl.a.getAlpha();
        i(adl);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        adl.a.setTranslationX(translationX);
        adl.a.setTranslationY(translationY);
        adl.a.setAlpha(alpha);
        if (adl2 != null) {
            i(adl2);
            adl2.a.setTranslationX((float) (-i5));
            adl2.a.setTranslationY((float) (-i6));
            adl2.a.setAlpha(0.0f);
        }
        this.n.add(new aag(adl, adl2, i, i2, i3, i4));
        return true;
    }

    public void d(adl adl) {
        View view = adl.a;
        view.animate().cancel();
        int size = this.m.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((aah) this.m.get(size)).a == adl) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                e(adl);
                this.m.remove(size);
            }
        }
        a((List) this.n, adl);
        if (this.k.remove(adl)) {
            view.setAlpha(1.0f);
            e(adl);
        }
        if (this.l.remove(adl)) {
            view.setAlpha(1.0f);
            e(adl);
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.c.get(size2);
            a((List) arrayList, adl);
            if (arrayList.isEmpty()) {
                this.c.remove(size2);
            }
        }
        for (int size3 = this.b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((aah) arrayList2.get(size4)).a == adl) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    e(adl);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.a.get(size5);
            if (arrayList3.remove(adl)) {
                view.setAlpha(1.0f);
                e(adl);
                if (arrayList3.isEmpty()) {
                    this.a.remove(size5);
                }
            }
        }
        this.f.remove(adl);
        this.d.remove(adl);
        this.g.remove(adl);
        this.e.remove(adl);
        c();
    }

    public final boolean a(adl adl, List list) {
        return !list.isEmpty() || f(adl);
    }
}
