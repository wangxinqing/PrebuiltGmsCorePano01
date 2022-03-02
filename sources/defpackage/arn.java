package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.os.Build;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: arn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class arn implements Cloneable {
    private static final int[] o = {2, 1, 3, 4};
    private static final arg p = new arg();
    private static final ThreadLocal r = new ThreadLocal();
    public long a = -1;
    long b = -1;
    public TimeInterpolator c = null;
    final ArrayList d = new ArrayList();
    final ArrayList e = new ArrayList();
    public arx f = new arx();
    public arx g = new arx();
    aru h = null;
    public final int[] i = o;
    public ArrayList j;
    public ArrayList k;
    final ArrayList l = new ArrayList();
    public arl m;
    public arg n = p;
    private final String q = getClass().getName();
    private int s = 0;
    private boolean t = false;
    private boolean u = false;
    private ArrayList v = null;
    private ArrayList w = new ArrayList();

    private static void a(arx arx, View view, arw arw) {
        arx.a.put(view, arw);
        int id = view.getId();
        if (id >= 0) {
            if (arx.b.indexOfKey(id) >= 0) {
                arx.b.put(id, (Object) null);
            } else {
                arx.b.put(id, view);
            }
        }
        String p2 = qb.p(view);
        if (p2 != null) {
            if (arx.d.containsKey(p2)) {
                arx.d.put(p2, (Object) null);
            } else {
                arx.d.put(p2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (arx.c.b(itemIdAtPosition) >= 0) {
                    View view2 = (View) arx.c.a(itemIdAtPosition);
                    if (view2 != null) {
                        qb.a(view2, false);
                        arx.c.b(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                qb.a(view, true);
                arx.c.b(itemIdAtPosition, view);
            }
        }
    }

    public static nz b() {
        nz nzVar = (nz) r.get();
        if (nzVar != null) {
            return nzVar;
        }
        nz nzVar2 = new nz();
        r.set(nzVar2);
        return nzVar2;
    }

    private final void c(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                arw arw = new arw(view);
                if (z) {
                    a(arw);
                } else {
                    b(arw);
                }
                arw.c.add(this);
                c(arw);
                if (z) {
                    a(this.f, view, arw);
                } else {
                    a(this.g, view, arw);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    c(viewGroup.getChildAt(i2), z);
                }
            }
        }
    }

    public Animator a(ViewGroup viewGroup, arw arw, arw arw2) {
        return null;
    }

    public void a(long j2) {
        this.b = j2;
    }

    public void a(TimeInterpolator timeInterpolator) {
        this.c = timeInterpolator;
    }

    public void a(arg arg) {
        if (arg == null) {
            this.n = p;
        } else {
            this.n = arg;
        }
    }

    public void a(arl arl) {
        this.m = arl;
    }

    public abstract void a(arw arw);

    public String[] a() {
        return null;
    }

    public void b(long j2) {
        this.a = j2;
    }

    public abstract void b(arw arw);

    public void c(arw arw) {
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (this.s == 0) {
            ArrayList arrayList = this.v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.v.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((arm) arrayList2.get(i2)).b(this);
                }
            }
            this.u = false;
        }
        this.s++;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        int i2;
        int i3 = this.s - 1;
        this.s = i3;
        if (i3 == 0) {
            ArrayList arrayList = this.v;
            if (arrayList == null || arrayList.size() <= 0) {
                i2 = 0;
            } else {
                ArrayList arrayList2 = (ArrayList) this.v.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((arm) arrayList2.get(i4)).a(this);
                }
                i2 = 0;
            }
            while (i2 < this.f.c.b()) {
                View view = (View) this.f.c.b(i2);
                if (view != null) {
                    qb.a(view, false);
                }
                i2++;
            }
            for (int i5 = 0; i5 < this.g.c.b(); i5++) {
                View view2 = (View) this.g.c.b(i5);
                if (view2 != null) {
                    qb.a(view2, false);
                }
            }
            this.u = true;
        }
    }

    /* access modifiers changed from: protected */
    public void f() {
        for (int size = this.l.size() - 1; size >= 0; size--) {
            ((Animator) this.l.get(size)).cancel();
        }
        ArrayList arrayList = this.v;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.v.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((arm) arrayList2.get(i2)).a();
            }
        }
    }

    /* renamed from: g */
    public arn clone() {
        try {
            arn arn = (arn) super.clone();
            arn.w = new ArrayList();
            arn.f = new arx();
            arn.g = new arx();
            arn.j = null;
            arn.k = null;
            return arn;
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public void h() {
    }

    public final String toString() {
        return a("");
    }

    /* access modifiers changed from: package-private */
    public final arw b(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        aru aru = this.h;
        if (aru != null) {
            return aru.b(view, z);
        }
        if (!z) {
            arrayList = this.k;
        } else {
            arrayList = this.j;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            arw arw = (arw) arrayList.get(i2);
            if (arw != null) {
                if (arw.b == view) {
                    break;
                }
                i2++;
            } else {
                return null;
            }
        }
        if (i2 < 0) {
            return null;
        }
        if (!z) {
            arrayList2 = this.j;
        } else {
            arrayList2 = this.k;
        }
        return (arw) arrayList2.get(i2);
    }

    public void d(View view) {
        this.e.add(view);
    }

    public void b(View view) {
        if (!this.u) {
            nz b2 = b();
            int i2 = b2.h;
            asn b3 = asc.b(view);
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                ark ark = (ark) b2.c(i3);
                if (ark.a != null && b3.equals(ark.e)) {
                    int i4 = Build.VERSION.SDK_INT;
                    ((Animator) b2.b(i3)).pause();
                }
            }
            ArrayList arrayList = this.v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.v.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((arm) arrayList2.get(i5)).b();
                }
            }
            this.t = true;
        }
    }

    public void e(View view) {
        this.e.remove(view);
    }

    /* access modifiers changed from: protected */
    public void c() {
        d();
        nz b2 = b();
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            if (b2.containsKey(animator)) {
                d();
                if (animator != null) {
                    animator.addListener(new ari(this, b2));
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.a;
                    if (j3 >= 0) {
                        animator.setStartDelay(j3 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.c;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new arj(this));
                    animator.start();
                }
            }
        }
        this.w.clear();
        e();
    }

    private static boolean a(arw arw, arw arw2, String str) {
        Object obj = arw.a.get(str);
        Object obj2 = arw2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        return obj == null || obj2 == null || !obj.equals(obj2);
    }

    public final void b(arm arm) {
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            arrayList.remove(arm);
            if (this.v.size() == 0) {
                this.v = null;
            }
        }
    }

    public final arw a(View view, boolean z) {
        arx arx;
        aru aru = this.h;
        if (aru != null) {
            return aru.a(view, z);
        }
        if (!z) {
            arx = this.g;
        } else {
            arx = this.f;
        }
        return (arw) arx.a.get(view);
    }

    public String a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.b != -1) {
            str2 = str2 + "dur(" + this.b + ") ";
        }
        if (this.a != -1) {
            str2 = str2 + "dly(" + this.a + ") ";
        }
        if (this.c != null) {
            str2 = str2 + "interp(" + this.c + ") ";
        }
        if (this.d.size() <= 0 && this.e.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.d.size() > 0) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.d.get(i2);
            }
        }
        if (this.e.size() > 0) {
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.e.get(i3);
            }
        }
        return str3 + ")";
    }

    public void c(View view) {
        if (this.t) {
            if (!this.u) {
                nz b2 = b();
                int i2 = b2.h;
                asn b3 = asc.b(view);
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    ark ark = (ark) b2.c(i3);
                    if (ark.a != null && b3.equals(ark.e)) {
                        int i4 = Build.VERSION.SDK_INT;
                        ((Animator) b2.b(i3)).resume();
                    }
                }
                ArrayList arrayList = this.v;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.v.clone();
                    int size = arrayList2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ((arm) arrayList2.get(i5)).c();
                    }
                }
            }
            this.t = false;
        }
    }

    /* access modifiers changed from: protected */
    public void a(ViewGroup viewGroup, arx arx, arx arx2, ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        Animator animator;
        arw arw;
        View view;
        Animator animator2;
        nz b2 = b();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            arw arw2 = (arw) arrayList.get(i3);
            arw arw3 = (arw) arrayList2.get(i3);
            if (arw2 != null && !arw2.c.contains(this)) {
                arw2 = null;
            }
            if (arw3 != null && !arw3.c.contains(this)) {
                arw3 = null;
            }
            if (arw2 == null && arw3 == null) {
                ViewGroup viewGroup2 = viewGroup;
                arx arx3 = arx2;
                i2 = size;
            } else if (arw2 == null || arw3 == null || a(arw2, arw3)) {
                Animator a2 = a(viewGroup, arw2, arw3);
                if (a2 != null) {
                    if (arw3 == null) {
                        arx arx4 = arx2;
                        view = arw2.b;
                        animator = a2;
                        arw = null;
                    } else {
                        View view2 = arw3.b;
                        String[] a3 = a();
                        if (a3 == null) {
                            arx arx5 = arx2;
                            view = view2;
                            animator = a2;
                            arw = null;
                        } else if (a3.length > 0) {
                            arw arw4 = new arw(view2);
                            arw arw5 = (arw) arx2.a.get(view2);
                            if (arw5 == null) {
                                animator2 = a2;
                            } else {
                                int i4 = 0;
                                while (i4 < a3.length) {
                                    Map map = arw4.a;
                                    Animator animator3 = a2;
                                    String str = a3[i4];
                                    map.put(str, arw5.a.get(str));
                                    i4++;
                                    a2 = animator3;
                                    a3 = a3;
                                }
                                animator2 = a2;
                            }
                            int i5 = b2.h;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    view = view2;
                                    arw = arw4;
                                    animator = animator2;
                                    break;
                                }
                                ark ark = (ark) b2.get((Animator) b2.b(i6));
                                if (ark.c != null && ark.a == view2 && ark.b.equals(this.q) && ark.c.equals(arw4)) {
                                    view = view2;
                                    arw = arw4;
                                    animator = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            arx arx6 = arx2;
                            view = view2;
                            animator = a2;
                            arw = null;
                        }
                    }
                    if (animator != null) {
                        i2 = size;
                        ark ark2 = r0;
                        ark ark3 = new ark(view, this.q, this, asc.b(viewGroup), arw);
                        b2.put(animator, ark2);
                        this.w.add(animator);
                    } else {
                        i2 = size;
                    }
                } else {
                    arx arx7 = arx2;
                    i2 = size;
                }
            } else {
                ViewGroup viewGroup3 = viewGroup;
                arx arx8 = arx2;
                i2 = size;
            }
            i3++;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator4 = (Animator) this.w.get(sparseIntArray.keyAt(i7));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i7)) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ViewGroup viewGroup, boolean z) {
        int i2;
        a(z);
        if (this.d.size() > 0) {
            i2 = 0;
        } else if (this.e.size() > 0) {
            i2 = 0;
        } else {
            c(viewGroup, z);
            return;
        }
        while (i2 < this.d.size()) {
            View findViewById = viewGroup.findViewById(((Integer) this.d.get(i2)).intValue());
            if (findViewById != null) {
                arw arw = new arw(findViewById);
                if (z) {
                    a(arw);
                } else {
                    b(arw);
                }
                arw.c.add(this);
                c(arw);
                if (z) {
                    a(this.f, findViewById, arw);
                } else {
                    a(this.g, findViewById, arw);
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            View view = (View) this.e.get(i3);
            arw arw2 = new arw(view);
            if (z) {
                a(arw2);
            } else {
                b(arw2);
            }
            arw2.c.add(this);
            c(arw2);
            if (z) {
                a(this.f, view, arw2);
            } else {
                a(this.g, view, arw2);
            }
        }
    }

    public final void a(arm arm) {
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(arm);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (!z) {
            this.g.a.clear();
            this.g.b.clear();
            this.g.c.c();
            return;
        }
        this.f.a.clear();
        this.f.b.clear();
        this.f.c.c();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view) {
        int id = view.getId();
        if ((this.d.size() != 0 || this.e.size() != 0) && !this.d.contains(Integer.valueOf(id)) && !this.e.contains(view)) {
            return false;
        }
        return true;
    }

    public boolean a(arw arw, arw arw2) {
        if (!(arw == null || arw2 == null)) {
            String[] a2 = a();
            if (a2 == null) {
                for (String a3 : arw.a.keySet()) {
                    if (a(arw, arw2, a3)) {
                        return true;
                    }
                }
                return false;
            }
            for (String a4 : a2) {
                if (a(arw, arw2, a4)) {
                    return true;
                }
            }
        }
        return false;
    }
}
