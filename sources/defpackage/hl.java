package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.BackStackState;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hl {
    private ArrayList A;
    private final Runnable B = new he(this);
    private final hb C = new hb(this);
    private final hd D = new hd();
    public final hr a = new hr();
    public ArrayList b;
    public final gy c = new gy(this);
    public age d;
    public final agb e = new agb(this);
    public final AtomicInteger f = new AtomicInteger();
    public ArrayList g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final ha i = new ha(this);
    int j = -1;
    public gx k;
    public gt l;
    public gj m;
    gj n;
    public boolean o;
    public boolean p;
    public boolean q;
    public ho r;
    private final ArrayList s = new ArrayList();
    private boolean t;
    private ArrayList u;
    private final gw v = new hc(this);
    private boolean w;
    private boolean x;
    private ArrayList y;
    private ArrayList z;

    static gj a(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof gj) {
            return (gj) tag;
        }
        return null;
    }

    private final void d(boolean z2) {
        if (this.t) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.k != null) {
            if (Looper.myLooper() == this.k.d.getLooper()) {
                if (!z2) {
                    s();
                }
                if (this.y == null) {
                    this.y = new ArrayList();
                    this.z = new ArrayList();
                }
                this.t = true;
                this.t = false;
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (this.q) {
            throw new IllegalStateException("FragmentManager has been destroyed");
        } else {
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
    }

    static final void m(gj gjVar) {
        if (a(2)) {
            "show: " + gjVar;
        }
        if (gjVar.K) {
            gjVar.K = false;
            gjVar.X = !gjVar.X;
        }
    }

    private final void n(gj gjVar) {
        HashSet hashSet = (HashSet) this.h.get(gjVar);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((mo) it.next()).b();
            }
            hashSet.clear();
            b(gjVar);
            this.h.remove(gjVar);
        }
    }

    private final void o(gj gjVar) {
        ViewGroup p2 = p(gjVar);
        if (p2 != null) {
            if (p2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                p2.setTag(R.id.visible_removing_fragment_view_tag, gjVar);
            }
            ((gj) p2.getTag(R.id.visible_removing_fragment_view_tag)).a(gjVar.e());
        }
    }

    private final ViewGroup p(gj gjVar) {
        if (gjVar.I > 0 && this.l.a()) {
            View a2 = this.l.a(gjVar.I);
            if (a2 instanceof ViewGroup) {
                return (ViewGroup) a2;
            }
        }
        return null;
    }

    private static final boolean q(gj gjVar) {
        if (gjVar.O && gjVar.P) {
            return true;
        }
        List d2 = gjVar.F.a.d();
        int size = d2.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            gj gjVar2 = (gj) d2.get(i2);
            if (gjVar2 != null) {
                z2 = q(gjVar2);
            }
            i2++;
            if (z2) {
                return true;
            }
        }
        return false;
    }

    private final void r() {
        List b2 = this.a.b();
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((hq) b2.get(i2));
        }
    }

    private final void s() {
        if (f()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void t() {
        this.t = false;
        this.z.clear();
        this.y.clear();
    }

    private final void u() {
        if (!this.h.isEmpty()) {
            for (gj gjVar : this.h.keySet()) {
                n(gjVar);
                c(gjVar);
            }
        }
    }

    private final void v() {
        if (this.x) {
            this.x = false;
            r();
        }
    }

    public final gj b(int i2) {
        hr hrVar = this.a;
        for (int size = hrVar.a.size() - 1; size >= 0; size--) {
            gj gjVar = (gj) hrVar.a.get(size);
            if (gjVar != null && gjVar.H == i2) {
                return gjVar;
            }
        }
        for (hq hqVar : hrVar.b.values()) {
            if (hqVar != null) {
                gj gjVar2 = hqVar.a;
                if (gjVar2.H == i2) {
                    return gjVar2;
                }
            }
        }
        return null;
    }

    public final gj c(String str) {
        return this.a.c(str);
    }

    /* access modifiers changed from: package-private */
    public final hq e(gj gjVar) {
        hq b2 = this.a.b(gjVar.q);
        if (b2 != null) {
            return b2;
        }
        hq hqVar = new hq(this.i, this.a, gjVar);
        hqVar.a(this.k.c.getClassLoader());
        hqVar.b = this.j;
        return hqVar;
    }

    /* access modifiers changed from: package-private */
    public final void f(gj gjVar) {
        if (a(2)) {
            "add: " + gjVar;
        }
        this.a.a(e(gjVar));
        if (!gjVar.L) {
            this.a.a(gjVar);
            gjVar.x = false;
            if (gjVar.S == null) {
                gjVar.X = false;
            }
            if (q(gjVar)) {
                this.w = true;
            }
        }
    }

    public final boolean f() {
        return this.o || this.p;
    }

    /* access modifiers changed from: package-private */
    public final Parcelable g() {
        ArrayList arrayList;
        int size;
        u();
        a(true);
        this.o = true;
        this.r.i = true;
        hr hrVar = this.a;
        ArrayList arrayList2 = new ArrayList(hrVar.b.size());
        for (hq hqVar : hrVar.b.values()) {
            if (hqVar != null) {
                gj gjVar = hqVar.a;
                FragmentState fragmentState = new FragmentState(gjVar);
                gj gjVar2 = hqVar.a;
                if (gjVar2.m >= 0 && fragmentState.m == null) {
                    fragmentState.m = hqVar.m();
                    if (hqVar.a.t != null) {
                        if (fragmentState.m == null) {
                            fragmentState.m = new Bundle();
                        }
                        fragmentState.m.putString("android:target_state", hqVar.a.t);
                        int i2 = hqVar.a.u;
                        if (i2 != 0) {
                            fragmentState.m.putInt("android:target_req_state", i2);
                        }
                    }
                } else {
                    fragmentState.m = gjVar2.n;
                }
                arrayList2.add(fragmentState);
                if (a(2)) {
                    "Saved state of " + gjVar + ": " + fragmentState.m;
                }
            }
        }
        BackStackState[] backStackStateArr = null;
        if (!arrayList2.isEmpty()) {
            hr hrVar2 = this.a;
            synchronized (hrVar2.a) {
                if (!hrVar2.a.isEmpty()) {
                    arrayList = new ArrayList(hrVar2.a.size());
                    Iterator it = hrVar2.a.iterator();
                    while (it.hasNext()) {
                        gj gjVar3 = (gj) it.next();
                        arrayList.add(gjVar3.q);
                        if (a(2)) {
                            "saveAllState: adding fragment (" + gjVar3.q + "): " + gjVar3;
                        }
                    }
                } else {
                    arrayList = null;
                }
            }
            ArrayList arrayList3 = this.b;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                backStackStateArr = new BackStackState[size];
                for (int i3 = 0; i3 < size; i3++) {
                    backStackStateArr[i3] = new BackStackState((fw) this.b.get(i3));
                    if (a(2)) {
                        "saveAllState: adding back stack #" + i3 + ": " + this.b.get(i3);
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.a = arrayList2;
            fragmentManagerState.b = arrayList;
            fragmentManagerState.c = backStackStateArr;
            fragmentManagerState.d = this.f.get();
            gj gjVar4 = this.n;
            if (gjVar4 != null) {
                fragmentManagerState.e = gjVar4.q;
            }
            return fragmentManagerState;
        }
        a(2);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.o = false;
        this.p = false;
        this.r.i = false;
        c(1);
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        this.o = false;
        this.p = false;
        this.r.i = false;
        c(2);
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        this.o = false;
        this.p = false;
        this.r.i = false;
        c(3);
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        this.o = false;
        this.p = false;
        this.r.i = false;
        c(4);
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        c(3);
    }

    public void noteStateNotSaved() {
        if (this.k != null) {
            this.o = false;
            this.p = false;
            this.r.i = false;
            for (gj gjVar : this.a.c()) {
                if (gjVar != null) {
                    gjVar.F.noteStateNotSaved();
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        gj gjVar = this.m;
        if (gjVar != null) {
            sb.append(gjVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.m)));
            sb.append("}");
        } else {
            gx gxVar = this.k;
            if (gxVar != null) {
                sb.append(gxVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.k)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    private final void a(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!((fw) arrayList.get(i2)).s) {
                    if (i3 != i2) {
                        a(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                        while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((fw) arrayList.get(i3)).s) {
                            i3++;
                        }
                    }
                    a(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                a(arrayList, arrayList2, i3, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    /* JADX INFO: finally extract failed */
    public final void c(int i2) {
        try {
            this.t = true;
            for (hq hqVar : this.a.b.values()) {
                if (hqVar != null) {
                    hqVar.b = i2;
                }
            }
            a(i2, false);
            this.t = false;
            a(true);
        } catch (Throwable th) {
            this.t = false;
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void h(gj gjVar) {
        if (a(2)) {
            "hide: " + gjVar;
        }
        if (!gjVar.K) {
            gjVar.K = true;
            gjVar.X = true ^ gjVar.X;
            o(gjVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void i(gj gjVar) {
        if (a(2)) {
            "detach: " + gjVar;
        }
        if (!gjVar.L) {
            gjVar.L = true;
            if (gjVar.w) {
                if (a(2)) {
                    "remove from detach: " + gjVar;
                }
                this.a.b(gjVar);
                if (q(gjVar)) {
                    this.w = true;
                }
                o(gjVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void j(gj gjVar) {
        if (a(2)) {
            "attach: " + gjVar;
        }
        if (gjVar.L) {
            gjVar.L = false;
            if (!gjVar.w) {
                this.a.a(gjVar);
                if (a(2)) {
                    "add from attach: " + gjVar;
                }
                if (q(gjVar)) {
                    this.w = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void k(gj gjVar) {
        if (gjVar != null && (!gjVar.equals(c(gjVar.q)) || !(gjVar.E == null || gjVar.D == this))) {
            throw new IllegalArgumentException("Fragment " + gjVar + " is not an active fragment of FragmentManager " + this);
        }
        gj gjVar2 = this.n;
        this.n = gjVar;
        l(gjVar2);
        l(this.n);
    }

    public final void l(gj gjVar) {
        if (gjVar != null && gjVar.equals(c(gjVar.q))) {
            boolean a2 = gjVar.D.a(gjVar);
            Boolean bool = gjVar.v;
            if (bool == null || bool.booleanValue() != a2) {
                gjVar.v = Boolean.valueOf(a2);
                hl hlVar = gjVar.F;
                hlVar.b();
                hlVar.l(hlVar.n);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        this.p = true;
        this.r.i = true;
        c(2);
    }

    public final List e() {
        return this.a.c();
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        this.q = true;
        a(true);
        u();
        c(-1);
        this.k = null;
        this.l = null;
        this.m = null;
        if (this.d != null) {
            Iterator it = this.e.b.iterator();
            while (it.hasNext()) {
                ((afu) it.next()).a();
            }
            this.d = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        for (gj gjVar : this.a.c()) {
            if (gjVar != null) {
                gjVar.onLowMemory();
                gjVar.F.o();
            }
        }
    }

    public final gw p() {
        gj gjVar = this.m;
        return gjVar != null ? gjVar.D.p() : this.v;
    }

    /* access modifiers changed from: package-private */
    public final hd q() {
        gj gjVar = this.m;
        return gjVar != null ? gjVar.D.q() : this.D;
    }

    /* access modifiers changed from: package-private */
    public final gj b(String str) {
        for (hq hqVar : this.a.b.values()) {
            if (hqVar != null) {
                gj gjVar = hqVar.a;
                if (!str.equals(gjVar.q)) {
                    gjVar = gjVar.F.b(str);
                }
                if (gjVar != null) {
                    return gjVar;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void c(gj gjVar) {
        a(gjVar, this.j);
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z2) {
        for (gj gjVar : this.a.c()) {
            if (gjVar != null) {
                gjVar.F.c(z2);
            }
        }
    }

    public final int d() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        r0 = r4.S;
        r3 = r9.R;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.gj r9) {
        /*
            r8 = this;
            hr r0 = r8.a
            java.lang.String r1 = r9.q
            boolean r0 = r0.a((java.lang.String) r1)
            if (r0 != 0) goto L_0x0034
            r0 = 3
            boolean r0 = a((int) r0)
            if (r0 == 0) goto L_0x0033
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " to state "
            r0.append(r9)
            int r9 = r8.j
            r0.append(r9)
            java.lang.String r9 = "since it is not added to "
            r0.append(r9)
            r0.append(r8)
            r0.toString()
        L_0x0033:
            return
        L_0x0034:
            r8.c((defpackage.gj) r9)
            android.view.View r0 = r9.S
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00b8
            hr r0 = r8.a
            android.view.ViewGroup r3 = r9.R
            r4 = 0
            if (r3 == 0) goto L_0x0064
            java.util.ArrayList r5 = r0.a
            int r5 = r5.indexOf(r9)
            int r5 = r5 + -1
        L_0x004c:
            if (r5 < 0) goto L_0x0064
            java.util.ArrayList r6 = r0.a
            java.lang.Object r6 = r6.get(r5)
            gj r6 = (defpackage.gj) r6
            android.view.ViewGroup r7 = r6.R
            if (r7 == r3) goto L_0x005b
        L_0x005a:
            goto L_0x0061
        L_0x005b:
            android.view.View r7 = r6.S
            if (r7 == 0) goto L_0x005a
            r4 = r6
            goto L_0x0065
        L_0x0061:
            int r5 = r5 + -1
            goto L_0x004c
        L_0x0064:
        L_0x0065:
            if (r4 == 0) goto L_0x007f
            android.view.View r0 = r4.S
            android.view.ViewGroup r3 = r9.R
            int r0 = r3.indexOfChild(r0)
            android.view.View r4 = r9.S
            int r4 = r3.indexOfChild(r4)
            if (r4 >= r0) goto L_0x007f
            r3.removeViewAt(r4)
            android.view.View r4 = r9.S
            r3.addView(r4, r0)
        L_0x007f:
            boolean r0 = r9.W
            if (r0 == 0) goto L_0x00b8
            android.view.ViewGroup r0 = r9.R
            if (r0 == 0) goto L_0x00b8
            float r0 = r9.Y
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            android.view.View r4 = r9.S
            r4.setAlpha(r0)
        L_0x0094:
            r9.Y = r3
            r9.W = r2
            gx r0 = r8.k
            android.content.Context r0 = r0.c
            gq r0 = defpackage.gs.a(r0, r9, r1)
            if (r0 == 0) goto L_0x00b8
            android.view.animation.Animation r3 = r0.a
            if (r3 != 0) goto L_0x00b3
            android.animation.Animator r3 = r0.b
            android.view.View r4 = r9.S
            r3.setTarget(r4)
            android.animation.Animator r0 = r0.b
            r0.start()
            goto L_0x00b8
        L_0x00b3:
            android.view.View r0 = r9.S
            r0.startAnimation(r3)
        L_0x00b8:
            boolean r0 = r9.X
            if (r0 == 0) goto L_0x0140
            android.view.View r0 = r9.S
            if (r0 == 0) goto L_0x012b
            gx r0 = r8.k
            android.content.Context r0 = r0.c
            boolean r3 = r9.K
            r3 = r3 ^ r1
            gq r0 = defpackage.gs.a(r0, r9, r3)
            if (r0 == 0) goto L_0x0101
            android.animation.Animator r3 = r0.b
            if (r3 == 0) goto L_0x0101
            android.view.View r4 = r9.S
            r3.setTarget(r4)
            boolean r3 = r9.K
            if (r3 == 0) goto L_0x00f6
            boolean r3 = r9.g()
            if (r3 == 0) goto L_0x00e4
            r9.a((boolean) r2)
            goto L_0x00fb
        L_0x00e4:
            android.view.ViewGroup r3 = r9.R
            android.view.View r4 = r9.S
            r3.startViewTransition(r4)
            android.animation.Animator r5 = r0.b
            hf r6 = new hf
            r6.<init>(r3, r4, r9)
            r5.addListener(r6)
            goto L_0x00fb
        L_0x00f6:
            android.view.View r3 = r9.S
            r3.setVisibility(r2)
        L_0x00fb:
            android.animation.Animator r0 = r0.b
            r0.start()
            goto L_0x012b
        L_0x0101:
            if (r0 == 0) goto L_0x010f
            android.view.View r3 = r9.S
            android.view.animation.Animation r4 = r0.a
            r3.startAnimation(r4)
            android.view.animation.Animation r0 = r0.a
            r0.start()
        L_0x010f:
            boolean r0 = r9.K
            if (r0 == 0) goto L_0x011c
            boolean r0 = r9.g()
            if (r0 != 0) goto L_0x011c
            r0 = 8
            goto L_0x011d
        L_0x011c:
            r0 = 0
        L_0x011d:
            android.view.View r3 = r9.S
            r3.setVisibility(r0)
            boolean r0 = r9.g()
            if (r0 == 0) goto L_0x012b
            r9.a((boolean) r2)
        L_0x012b:
            boolean r0 = r9.w
            if (r0 == 0) goto L_0x0138
            boolean r0 = q(r9)
            if (r0 != 0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r8.w = r1
        L_0x0138:
            r9.X = r2
            boolean r0 = r9.K
            r9.onHiddenChanged(r0)
            return
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl.d(gj):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (d() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (a(r4.m) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r4.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.s
            monitor-enter(r0)
            java.util.ArrayList r1 = r4.s     // Catch:{ all -> 0x0029 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0029 }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            agb r1 = r4.e     // Catch:{ all -> 0x0029 }
            r1.a = r2     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            agb r0 = r4.e
            int r1 = r4.d()
            r3 = 0
            if (r1 <= 0) goto L_0x0025
            gj r1 = r4.m
            boolean r1 = r4.a((defpackage.gj) r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.a = r2
            return
        L_0x0029:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl.b():void");
    }

    public final boolean c() {
        return a((String) null, -1, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: gj} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.ArrayList r20, java.util.ArrayList r21, int r22, int r23) {
        /*
            r19 = this;
            r0 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.Object r1 = r9.get(r11)
            fw r1 = (defpackage.fw) r1
            boolean r13 = r1.s
            java.util.ArrayList r1 = r0.A
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.A = r1
            goto L_0x0021
        L_0x001e:
            r1.clear()
        L_0x0021:
            java.util.ArrayList r1 = r0.A
            hr r2 = r0.a
            java.util.List r2 = r2.c()
            r1.addAll(r2)
            gj r1 = r0.n
            r2 = r11
            r15 = 0
        L_0x0030:
            r8 = 3
            r6 = -1
            r5 = 1
            if (r2 >= r12) goto L_0x0189
            java.lang.Object r3 = r9.get(r2)
            fw r3 = (defpackage.fw) r3
            java.lang.Object r4 = r10.get(r2)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x007f
            java.util.ArrayList r4 = r0.A
            java.util.ArrayList r7 = r3.d
            int r7 = r7.size()
            int r7 = r7 + r6
        L_0x0050:
            if (r7 < 0) goto L_0x007c
            java.util.ArrayList r6 = r3.d
            java.lang.Object r6 = r6.get(r7)
            hs r6 = (defpackage.hs) r6
            int r14 = r6.a
            if (r14 == r5) goto L_0x0074
            if (r14 == r8) goto L_0x006e
            switch(r14) {
                case 6: goto L_0x006e;
                case 7: goto L_0x0074;
                case 8: goto L_0x006c;
                case 9: goto L_0x0069;
                case 10: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0079
        L_0x0064:
            ad r14 = r6.g
            r6.h = r14
            goto L_0x0079
        L_0x0069:
            gj r1 = r6.b
            goto L_0x0079
        L_0x006c:
            r1 = 0
            goto L_0x0079
        L_0x006e:
            gj r6 = r6.b
            r4.add(r6)
            goto L_0x0079
        L_0x0074:
            gj r6 = r6.b
            r4.remove(r6)
        L_0x0079:
            int r7 = r7 + -1
            goto L_0x0050
        L_0x007c:
            r6 = 1
            goto L_0x0176
        L_0x007f:
            java.util.ArrayList r4 = r0.A
            r7 = 0
        L_0x0082:
            java.util.ArrayList r14 = r3.d
            int r14 = r14.size()
            if (r7 >= r14) goto L_0x0175
            java.util.ArrayList r14 = r3.d
            java.lang.Object r14 = r14.get(r7)
            hs r14 = (defpackage.hs) r14
            int r6 = r14.a
            if (r6 == r5) goto L_0x00c1
            r5 = 2
            r11 = 9
            if (r6 == r5) goto L_0x00e4
            if (r6 == r8) goto L_0x00c7
            r5 = 6
            if (r6 == r5) goto L_0x00c7
            r5 = 7
            if (r6 == r5) goto L_0x00c1
            r5 = 8
            if (r6 == r5) goto L_0x00ad
            r6 = 1
            r9 = 3
            r16 = -1
            goto L_0x0169
        L_0x00ad:
            java.util.ArrayList r5 = r3.d
            hs r6 = new hs
            r6.<init>(r11, r1)
            r5.add(r7, r6)
            int r7 = r7 + 1
            gj r1 = r14.b
            r6 = 1
            r9 = 3
            r16 = -1
            goto L_0x0169
        L_0x00c1:
            r6 = 1
            r9 = 3
            r16 = -1
            goto L_0x0164
        L_0x00c7:
            gj r5 = r14.b
            r4.remove(r5)
            gj r5 = r14.b
            if (r5 != r1) goto L_0x00e3
            java.util.ArrayList r1 = r3.d
            hs r6 = new hs
            r6.<init>(r11, r5)
            r1.add(r7, r6)
            int r7 = r7 + 1
            r1 = 0
        L_0x00dd:
            r6 = 1
            r9 = 3
            r16 = -1
            goto L_0x0169
        L_0x00e3:
            goto L_0x00dd
        L_0x00e4:
            gj r5 = r14.b
            int r6 = r5.I
            int r17 = r4.size()
            r16 = -1
            int r17 = r17 + -1
            r8 = r17
            r17 = 0
        L_0x00f4:
            if (r8 < 0) goto L_0x0151
            java.lang.Object r18 = r4.get(r8)
            r11 = r18
            gj r11 = (defpackage.gj) r11
            int r10 = r11.I
            if (r10 == r6) goto L_0x0106
            r18 = r6
            r9 = 3
            goto L_0x0146
        L_0x0106:
            if (r11 != r5) goto L_0x010e
            r18 = r6
            r9 = 3
            r17 = 1
            goto L_0x0146
        L_0x010e:
            if (r11 != r1) goto L_0x0122
            java.util.ArrayList r1 = r3.d
            hs r10 = new hs
            r18 = r6
            r6 = 9
            r10.<init>(r6, r11)
            r1.add(r7, r10)
            int r7 = r7 + 1
            r1 = 0
            goto L_0x0126
        L_0x0122:
            r18 = r6
            r6 = 9
        L_0x0126:
            hs r10 = new hs
            r9 = 3
            r10.<init>(r9, r11)
            int r6 = r14.c
            r10.c = r6
            int r6 = r14.e
            r10.e = r6
            int r6 = r14.d
            r10.d = r6
            int r6 = r14.f
            r10.f = r6
            java.util.ArrayList r6 = r3.d
            r6.add(r7, r10)
            r4.remove(r11)
            r6 = 1
            int r7 = r7 + r6
        L_0x0146:
            int r8 = r8 + -1
            r9 = r20
            r10 = r21
            r6 = r18
            r11 = 9
            goto L_0x00f4
        L_0x0151:
            r9 = 3
            if (r17 == 0) goto L_0x015d
            java.util.ArrayList r5 = r3.d
            r5.remove(r7)
            int r7 = r7 + -1
            r6 = 1
            goto L_0x0169
        L_0x015d:
            r6 = 1
            r14.a = r6
            r4.add(r5)
            goto L_0x0169
        L_0x0164:
            gj r5 = r14.b
            r4.add(r5)
        L_0x0169:
            int r7 = r7 + r6
            r9 = r20
            r10 = r21
            r11 = r22
            r5 = 1
            r6 = -1
            r8 = 3
            goto L_0x0082
        L_0x0175:
            r6 = 1
        L_0x0176:
            if (r15 != 0) goto L_0x017e
            boolean r3 = r3.j
            if (r3 != 0) goto L_0x017e
            r15 = 0
            goto L_0x017f
        L_0x017e:
            r15 = 1
        L_0x017f:
            int r2 = r2 + 1
            r9 = r20
            r10 = r21
            r11 = r22
            goto L_0x0030
        L_0x0189:
            r6 = 1
            r9 = 3
            r16 = -1
            java.util.ArrayList r1 = r0.A
            r1.clear()
            if (r13 != 0) goto L_0x01b0
            int r1 = r0.j
            if (r1 <= 0) goto L_0x01b0
            gx r1 = r0.k
            android.content.Context r1 = r1.c
            gt r2 = r0.l
            r7 = 0
            hb r8 = r0.C
            r3 = r20
            r4 = r21
            r10 = 1
            r5 = r22
            r11 = -1
            r6 = r23
            r14 = 0
            defpackage.ib.a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01b3
        L_0x01b0:
            r10 = 1
            r11 = -1
            r14 = 0
        L_0x01b3:
            r1 = r22
        L_0x01b5:
            if (r1 >= r12) goto L_0x0387
            r8 = r20
            java.lang.Object r2 = r8.get(r1)
            fw r2 = (defpackage.fw) r2
            r7 = r21
            java.lang.Object r3 = r7.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.String r4 = "Unknown cmd: "
            if (r3 == 0) goto L_0x02b5
            r2.a((int) r11)
            int r3 = r12 + -1
            java.util.ArrayList r5 = r2.d
            int r5 = r5.size()
            int r5 = r5 + r11
        L_0x01db:
            if (r5 < 0) goto L_0x029f
            java.util.ArrayList r6 = r2.d
            java.lang.Object r6 = r6.get(r5)
            hs r6 = (defpackage.hs) r6
            gj r11 = r6.b
            if (r11 == 0) goto L_0x0204
            int r9 = r2.i
            r14 = 4099(0x1003, float:5.744E-42)
            r10 = 4097(0x1001, float:5.741E-42)
            if (r9 == r10) goto L_0x01fd
            if (r9 == r14) goto L_0x01fc
            r10 = 8194(0x2002, float:1.1482E-41)
            if (r9 == r10) goto L_0x01f9
            r14 = 0
            goto L_0x0201
        L_0x01f9:
            r14 = 4097(0x1001, float:5.741E-42)
            goto L_0x0201
        L_0x01fc:
            goto L_0x0201
        L_0x01fd:
            r10 = 8194(0x2002, float:1.1482E-41)
            r14 = 8194(0x2002, float:1.1482E-41)
        L_0x0201:
            r11.b((int) r14)
        L_0x0204:
            int r9 = r6.a
            switch(r9) {
                case 1: goto L_0x0276;
                case 2: goto L_0x0209;
                case 3: goto L_0x026b;
                case 4: goto L_0x0262;
                case 5: goto L_0x0251;
                case 6: goto L_0x0246;
                case 7: goto L_0x0235;
                case 8: goto L_0x022e;
                case 9: goto L_0x0228;
                case 10: goto L_0x0220;
                default: goto L_0x0209;
            }
        L_0x0209:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            int r3 = r6.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0220:
            hl r9 = r2.a
            ad r10 = r6.g
            r9.a((defpackage.gj) r11, (defpackage.ad) r10)
            goto L_0x0286
        L_0x0228:
            hl r9 = r2.a
            r9.k(r11)
            goto L_0x0286
        L_0x022e:
            hl r9 = r2.a
            r10 = 0
            r9.k(r10)
            goto L_0x0286
        L_0x0235:
            int r9 = r6.f
            r11.a((int) r9)
            hl r9 = r2.a
            r10 = 1
            r9.a((defpackage.gj) r11, (boolean) r10)
            hl r9 = r2.a
            r9.i(r11)
            goto L_0x0286
        L_0x0246:
            int r9 = r6.e
            r11.a((int) r9)
            hl r9 = r2.a
            r9.j(r11)
            goto L_0x0286
        L_0x0251:
            int r9 = r6.f
            r11.a((int) r9)
            hl r9 = r2.a
            r10 = 1
            r9.a((defpackage.gj) r11, (boolean) r10)
            hl r9 = r2.a
            r9.h(r11)
            goto L_0x0286
        L_0x0262:
            int r9 = r6.e
            r11.a((int) r9)
            m(r11)
            goto L_0x0286
        L_0x026b:
            int r9 = r6.e
            r11.a((int) r9)
            hl r9 = r2.a
            r9.f(r11)
            goto L_0x0286
        L_0x0276:
            int r9 = r6.f
            r11.a((int) r9)
            hl r9 = r2.a
            r10 = 1
            r9.a((defpackage.gj) r11, (boolean) r10)
            hl r9 = r2.a
            r9.g(r11)
        L_0x0286:
            boolean r9 = r2.s
            if (r9 == 0) goto L_0x028b
            goto L_0x0297
        L_0x028b:
            int r6 = r6.a
            r9 = 3
            if (r6 == r9) goto L_0x0297
            if (r11 == 0) goto L_0x0297
            hl r6 = r2.a
            r6.d((defpackage.gj) r11)
        L_0x0297:
            int r5 = r5 + -1
            r9 = 3
            r10 = 1
            r11 = -1
            r14 = 0
            goto L_0x01db
        L_0x029f:
            boolean r4 = r2.s
            if (r4 == 0) goto L_0x02a6
        L_0x02a3:
            r11 = 0
            goto L_0x037f
        L_0x02a6:
            if (r1 != r3) goto L_0x02b3
            hl r2 = r2.a
            int r3 = r2.j
            r5 = 1
            r2.a((int) r3, (boolean) r5)
            r11 = 0
            goto L_0x037f
        L_0x02b3:
            r5 = 1
            goto L_0x02a3
        L_0x02b5:
            r5 = 1
            r2.a((int) r5)
            java.util.ArrayList r3 = r2.d
            int r3 = r3.size()
            r5 = 0
        L_0x02c0:
            if (r5 >= r3) goto L_0x0372
            java.util.ArrayList r6 = r2.d
            java.lang.Object r6 = r6.get(r5)
            hs r6 = (defpackage.hs) r6
            gj r9 = r6.b
            if (r9 == 0) goto L_0x02d3
            int r10 = r2.i
            r9.b((int) r10)
        L_0x02d3:
            int r10 = r6.a
            switch(r10) {
                case 1: goto L_0x034d;
                case 2: goto L_0x02d8;
                case 3: goto L_0x0341;
                case 4: goto L_0x0335;
                case 5: goto L_0x0325;
                case 6: goto L_0x0319;
                case 7: goto L_0x0307;
                case 8: goto L_0x0300;
                case 9: goto L_0x02f8;
                case 10: goto L_0x02ef;
                default: goto L_0x02d8;
            }
        L_0x02d8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            int r3 = r6.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x02ef:
            hl r10 = r2.a
            ad r11 = r6.h
            r10.a((defpackage.gj) r9, (defpackage.ad) r11)
            r11 = 0
            goto L_0x035d
        L_0x02f8:
            hl r10 = r2.a
            r11 = 0
            r10.k(r11)
            r11 = 0
            goto L_0x035d
        L_0x0300:
            hl r10 = r2.a
            r10.k(r9)
            r11 = 0
            goto L_0x035d
        L_0x0307:
            int r10 = r6.c
            r9.a((int) r10)
            hl r10 = r2.a
            r11 = 0
            r10.a((defpackage.gj) r9, (boolean) r11)
            hl r10 = r2.a
            r10.j(r9)
            r11 = 0
            goto L_0x035d
        L_0x0319:
            int r10 = r6.d
            r9.a((int) r10)
            hl r10 = r2.a
            r10.i(r9)
            r11 = 0
            goto L_0x035d
        L_0x0325:
            int r10 = r6.c
            r9.a((int) r10)
            hl r10 = r2.a
            r11 = 0
            r10.a((defpackage.gj) r9, (boolean) r11)
            m(r9)
            r11 = 0
            goto L_0x035d
        L_0x0335:
            int r10 = r6.d
            r9.a((int) r10)
            hl r10 = r2.a
            r10.h(r9)
            r11 = 0
            goto L_0x035d
        L_0x0341:
            int r10 = r6.d
            r9.a((int) r10)
            hl r10 = r2.a
            r10.g(r9)
            r11 = 0
            goto L_0x035d
        L_0x034d:
            int r10 = r6.c
            r9.a((int) r10)
            hl r10 = r2.a
            r11 = 0
            r10.a((defpackage.gj) r9, (boolean) r11)
            hl r10 = r2.a
            r10.f(r9)
        L_0x035d:
            boolean r10 = r2.s
            if (r10 == 0) goto L_0x0362
            goto L_0x036e
        L_0x0362:
            int r6 = r6.a
            r10 = 1
            if (r6 == r10) goto L_0x036e
            if (r9 == 0) goto L_0x036e
            hl r6 = r2.a
            r6.d((defpackage.gj) r9)
        L_0x036e:
            int r5 = r5 + 1
            goto L_0x02c0
        L_0x0372:
            r11 = 0
            boolean r3 = r2.s
            if (r3 != 0) goto L_0x037f
            hl r2 = r2.a
            int r3 = r2.j
            r4 = 1
            r2.a((int) r3, (boolean) r4)
        L_0x037f:
            int r1 = r1 + 1
            r9 = 3
            r10 = 1
            r11 = -1
            r14 = 0
            goto L_0x01b5
        L_0x0387:
            r8 = r20
            r7 = r21
            r11 = 0
            if (r13 == 0) goto L_0x0417
            ob r1 = new ob
            r1.<init>()
            int r2 = r0.j
            if (r2 <= 0) goto L_0x03c9
            r3 = 3
            int r2 = java.lang.Math.min(r2, r3)
            hr r3 = r0.a
            java.util.List r3 = r3.c()
            java.util.Iterator r3 = r3.iterator()
        L_0x03a6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03c9
            java.lang.Object r4 = r3.next()
            gj r4 = (defpackage.gj) r4
            int r5 = r4.m
            if (r5 >= r2) goto L_0x03a6
            r0.a((defpackage.gj) r4, (int) r2)
            android.view.View r5 = r4.S
            if (r5 == 0) goto L_0x03a6
            boolean r5 = r4.K
            if (r5 != 0) goto L_0x03a6
            boolean r5 = r4.W
            if (r5 == 0) goto L_0x03a6
            r1.add(r4)
            goto L_0x03a6
        L_0x03c9:
            int r2 = r12 + -1
        L_0x03cb:
            r9 = r22
            if (r2 < r9) goto L_0x03f7
            java.lang.Object r3 = r8.get(r2)
            fw r3 = (defpackage.fw) r3
            java.lang.Object r4 = r7.get(r2)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            r4 = 0
        L_0x03df:
            java.util.ArrayList r5 = r3.d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x03f4
            java.util.ArrayList r5 = r3.d
            java.lang.Object r5 = r5.get(r4)
            hs r5 = (defpackage.hs) r5
            gj r5 = r5.b
            int r4 = r4 + 1
            goto L_0x03df
        L_0x03f4:
            int r2 = r2 + -1
            goto L_0x03cb
        L_0x03f7:
            int r2 = r1.b
            r3 = 0
        L_0x03fa:
            if (r3 >= r2) goto L_0x0419
            java.lang.Object r4 = r1.b(r3)
            gj r4 = (defpackage.gj) r4
            boolean r5 = r4.w
            if (r5 != 0) goto L_0x0414
            android.view.View r5 = r4.requireView()
            float r6 = r5.getAlpha()
            r4.Y = r6
            r4 = 0
            r5.setAlpha(r4)
        L_0x0414:
            int r3 = r3 + 1
            goto L_0x03fa
        L_0x0417:
            r9 = r22
        L_0x0419:
            if (r12 != r9) goto L_0x041e
            r14 = r7
            r10 = r8
            goto L_0x0448
        L_0x041e:
            if (r13 == 0) goto L_0x0446
            int r1 = r0.j
            if (r1 <= 0) goto L_0x043d
            gx r1 = r0.k
            android.content.Context r1 = r1.c
            gt r2 = r0.l
            r10 = 1
            hb r13 = r0.C
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r14 = r7
            r7 = r10
            r10 = r8
            r8 = r13
            defpackage.ib.a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x043f
        L_0x043d:
            r14 = r7
            r10 = r8
        L_0x043f:
            int r1 = r0.j
            r2 = 1
            r0.a((int) r1, (boolean) r2)
            goto L_0x0448
        L_0x0446:
            r14 = r7
            r10 = r8
        L_0x0448:
            if (r9 >= r12) goto L_0x048a
            java.lang.Object r1 = r10.get(r9)
            fw r1 = (defpackage.fw) r1
            java.lang.Object r2 = r14.get(r9)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x045e
            r2 = -1
            goto L_0x0467
        L_0x045e:
            int r2 = r1.c
            if (r2 < 0) goto L_0x0466
            r2 = -1
            r1.c = r2
            goto L_0x0467
        L_0x0466:
            r2 = -1
        L_0x0467:
            java.util.ArrayList r3 = r1.t
            if (r3 != 0) goto L_0x046d
            r3 = 0
            goto L_0x0487
        L_0x046d:
            r3 = 0
        L_0x046e:
            java.util.ArrayList r4 = r1.t
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x0484
            java.util.ArrayList r4 = r1.t
            java.lang.Object r4 = r4.get(r3)
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r4.run()
            int r3 = r3 + 1
            goto L_0x046e
        L_0x0484:
            r3 = 0
            r1.t = r3
        L_0x0487:
            int r9 = r9 + 1
            goto L_0x0448
        L_0x048a:
            if (r15 == 0) goto L_0x04a7
            java.util.ArrayList r1 = r0.g
            if (r1 == 0) goto L_0x04a7
            r14 = 0
        L_0x0491:
            java.util.ArrayList r1 = r0.g
            int r1 = r1.size()
            if (r14 >= r1) goto L_0x04a7
            java.util.ArrayList r1 = r0.g
            java.lang.Object r1 = r1.get(r14)
            hi r1 = (defpackage.hi) r1
            r1.a()
            int r14 = r14 + 1
            goto L_0x0491
        L_0x04a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl.a(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* access modifiers changed from: package-private */
    public final void b(Menu menu) {
        if (this.j > 0) {
            for (gj gjVar : this.a.c()) {
                if (gjVar != null && !gjVar.K) {
                    if (gjVar.O && gjVar.P) {
                        gjVar.onOptionsMenuClosed(menu);
                    }
                    gjVar.F.b(menu);
                }
            }
        }
    }

    public final void b(gj gjVar) {
        gjVar.d();
        this.i.g(gjVar, false);
        gjVar.R = null;
        gjVar.S = null;
        gjVar.ad = null;
        gjVar.ae.b((Object) null);
        gjVar.z = false;
    }

    /* access modifiers changed from: package-private */
    public final void b(hj hjVar, boolean z2) {
        if (!z2 || (this.k != null && !this.q)) {
            d(z2);
            if (hjVar.a(this.y, this.z)) {
                this.t = true;
                try {
                    a(this.y, this.z);
                } finally {
                    t();
                }
            }
            b();
            v();
            this.a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z2) {
        for (gj gjVar : this.a.c()) {
            if (gjVar != null) {
                gjVar.F.b(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(MenuItem menuItem) {
        if (this.j > 0) {
            for (gj gjVar : this.a.c()) {
                if (gjVar != null && !gjVar.K) {
                    if (gjVar.onContextItemSelected(menuItem) || gjVar.F.b(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void g(gj gjVar) {
        if (a(2)) {
            "remove: " + gjVar + " nesting=" + gjVar.C;
        }
        boolean z2 = !gjVar.b();
        if (!gjVar.L || z2) {
            this.a.b(gjVar);
            if (q(gjVar)) {
                this.w = true;
            }
            gjVar.x = true;
            o(gjVar);
        }
    }

    static boolean a(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public final gj a(String str) {
        hr hrVar = this.a;
        if (str != null) {
            for (int size = hrVar.a.size() - 1; size >= 0; size--) {
                gj gjVar = (gj) hrVar.a.get(size);
                if (gjVar != null && str.equals(gjVar.J)) {
                    return gjVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (hq hqVar : hrVar.b.values()) {
            if (hqVar != null) {
                gj gjVar2 = hqVar.a;
                if (str.equals(gjVar2.J)) {
                    return gjVar2;
                }
            }
        }
        return null;
    }

    public final ht a() {
        return new fw(this);
    }

    public final void a(int i2, int i3) {
        if (i2 >= 0) {
            a((hj) new hk(this, (String) null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z2) {
        gx gxVar;
        if (this.k == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.j) {
            this.j = i2;
            for (gj d2 : this.a.c()) {
                d(d2);
            }
            List b2 = this.a.b();
            int size = b2.size();
            for (int i3 = 0; i3 < size; i3++) {
                gj gjVar = ((hq) b2.get(i3)).a;
                if (!gjVar.W) {
                    d(gjVar);
                }
            }
            r();
            if (this.w && (gxVar = this.k) != null && this.j == 4) {
                gxVar.b();
                this.w = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Configuration configuration) {
        for (gj gjVar : this.a.c()) {
            if (gjVar != null) {
                gjVar.onConfigurationChanged(configuration);
                gjVar.F.a(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Parcelable parcelable) {
        hq hqVar;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.a != null) {
                this.a.b.clear();
                ArrayList arrayList = fragmentManagerState.a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    FragmentState fragmentState = (FragmentState) arrayList.get(i2);
                    if (fragmentState != null) {
                        gj gjVar = (gj) this.r.d.get(fragmentState.b);
                        if (gjVar != null) {
                            if (a(2)) {
                                "restoreSaveState: re-attaching retained " + gjVar;
                            }
                            hqVar = new hq(this.i, this.a, gjVar, fragmentState);
                        } else {
                            hqVar = new hq(this.i, this.a, this.k.c.getClassLoader(), p(), fragmentState);
                        }
                        gj gjVar2 = hqVar.a;
                        gjVar2.D = this;
                        if (a(2)) {
                            "restoreSaveState: active (" + gjVar2.q + "): " + gjVar2;
                        }
                        hqVar.a(this.k.c.getClassLoader());
                        this.a.a(hqVar);
                        hqVar.b = this.j;
                    }
                }
                ArrayList arrayList2 = new ArrayList(this.r.d.values());
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    gj gjVar3 = (gj) arrayList2.get(i3);
                    if (!this.a.a(gjVar3.q)) {
                        if (a(2)) {
                            "Discarding retained Fragment " + gjVar3 + " that was not found in the set of active Fragments " + fragmentManagerState.a;
                        }
                        gjVar3.D = this;
                        hq hqVar2 = new hq(this.i, this.a, gjVar3);
                        hqVar2.b = 1;
                        hqVar2.b();
                        gjVar3.x = true;
                        hqVar2.b();
                    }
                }
                hr hrVar = this.a;
                ArrayList arrayList3 = fragmentManagerState.b;
                hrVar.a.clear();
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        String str = (String) arrayList3.get(i4);
                        gj c2 = hrVar.c(str);
                        if (c2 != null) {
                            if (a(2)) {
                                "restoreSaveState: added (" + str + "): " + c2;
                            }
                            hrVar.a(c2);
                            i4++;
                        } else {
                            throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                        }
                    }
                }
                BackStackState[] backStackStateArr = fragmentManagerState.c;
                if (backStackStateArr != null) {
                    this.b = new ArrayList(backStackStateArr.length);
                    int i5 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr2 = fragmentManagerState.c;
                        if (i5 >= backStackStateArr2.length) {
                            break;
                        }
                        BackStackState backStackState = backStackStateArr2[i5];
                        fw fwVar = new fw(this);
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < backStackState.a.length) {
                            hs hsVar = new hs();
                            int i8 = i6 + 1;
                            hsVar.a = backStackState.a[i6];
                            if (a(2)) {
                                "Instantiate " + fwVar + " op #" + i7 + " base fragment #" + backStackState.a[i8];
                            }
                            String str2 = (String) backStackState.b.get(i7);
                            if (str2 != null) {
                                hsVar.b = c(str2);
                            } else {
                                hsVar.b = null;
                            }
                            hsVar.g = ad.values()[backStackState.c[i7]];
                            hsVar.h = ad.values()[backStackState.d[i7]];
                            int i9 = i8 + 1;
                            int[] iArr = backStackState.a;
                            int i10 = iArr[i8];
                            hsVar.c = i10;
                            int i11 = i9 + 1;
                            int i12 = iArr[i9];
                            hsVar.d = i12;
                            int i13 = i11 + 1;
                            int i14 = iArr[i11];
                            hsVar.e = i14;
                            int i15 = iArr[i13];
                            hsVar.f = i15;
                            fwVar.e = i10;
                            fwVar.f = i12;
                            fwVar.g = i14;
                            fwVar.h = i15;
                            fwVar.a(hsVar);
                            i7++;
                            i6 = i13 + 1;
                        }
                        fwVar.i = backStackState.e;
                        fwVar.l = backStackState.f;
                        fwVar.c = backStackState.g;
                        fwVar.j = true;
                        fwVar.m = backStackState.h;
                        fwVar.n = backStackState.i;
                        fwVar.o = backStackState.j;
                        fwVar.p = backStackState.k;
                        fwVar.q = backStackState.l;
                        fwVar.r = backStackState.m;
                        fwVar.s = backStackState.n;
                        fwVar.a(1);
                        if (a(2)) {
                            "restoreAllState: back stack #" + i5 + " (index " + fwVar.c + "): " + fwVar;
                            PrintWriter printWriter = new PrintWriter(new iy());
                            fwVar.a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.b.add(fwVar);
                        i5++;
                    }
                } else {
                    this.b = null;
                }
                this.f.set(fragmentManagerState.d);
                String str3 = fragmentManagerState.e;
                if (str3 != null) {
                    gj c3 = c(str3);
                    this.n = c3;
                    l(c3);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r2 != 3) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.gj r14, int r15) {
        /*
            r13 = this;
            hr r0 = r13.a
            java.lang.String r1 = r14.q
            hq r0 = r0.b((java.lang.String) r1)
            r1 = 1
            if (r0 != 0) goto L_0x0016
            hq r0 = new hq
            ha r2 = r13.i
            hr r3 = r13.a
            r0.<init>(r2, r3, r14)
            r0.b = r1
        L_0x0016:
            int r2 = r0.a()
            int r15 = java.lang.Math.min(r15, r2)
            int r2 = r14.m
            r3 = 2
            r4 = 3
            if (r2 > r15) goto L_0x0066
            if (r2 >= r15) goto L_0x0031
            java.util.concurrent.ConcurrentHashMap r2 = r13.h
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0031
            r13.n(r14)
        L_0x0031:
            int r2 = r14.m
            r5 = -1
            if (r2 == r5) goto L_0x0040
            if (r2 == 0) goto L_0x0045
            if (r2 == r1) goto L_0x004a
            if (r2 == r3) goto L_0x005a
            if (r2 == r4) goto L_0x005f
            goto L_0x018e
        L_0x0040:
            if (r15 < 0) goto L_0x0045
            r0.d()
        L_0x0045:
            if (r15 <= 0) goto L_0x004a
            r0.e()
        L_0x004a:
            if (r15 < 0) goto L_0x004f
            r0.c()
        L_0x004f:
            if (r15 <= r1) goto L_0x005a
            r0.f()
            r0.g()
            r0.h()
        L_0x005a:
            if (r15 <= r3) goto L_0x005f
            r0.i()
        L_0x005f:
            if (r15 <= r4) goto L_0x0068
            r0.j()
            goto L_0x018e
        L_0x0066:
            if (r2 > r15) goto L_0x006a
        L_0x0068:
            goto L_0x018e
        L_0x006a:
            if (r2 == 0) goto L_0x0187
            if (r2 == r1) goto L_0x014e
            if (r2 == r3) goto L_0x0080
            if (r2 == r4) goto L_0x007b
            r5 = 4
            if (r2 == r5) goto L_0x0076
            goto L_0x0068
        L_0x0076:
            if (r15 >= r5) goto L_0x007b
            r0.k()
        L_0x007b:
            if (r15 >= r4) goto L_0x0080
            r0.l()
        L_0x0080:
            if (r15 >= r3) goto L_0x014e
            boolean r2 = a((int) r4)
            if (r2 == 0) goto L_0x0098
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "movefrom ACTIVITY_CREATED: "
            r2.append(r3)
            r2.append(r14)
            r2.toString()
        L_0x0098:
            android.view.View r2 = r14.S
            if (r2 == 0) goto L_0x00af
            gx r2 = r13.k
            gk r2 = (defpackage.gk) r2
            gl r2 = r2.a
            boolean r2 = r2.isFinishing()
            if (r2 != 0) goto L_0x00af
            android.util.SparseArray r2 = r14.o
            if (r2 != 0) goto L_0x00af
            r0.n()
        L_0x00af:
            android.view.View r2 = r14.S
            if (r2 == 0) goto L_0x0143
            android.view.ViewGroup r3 = r14.R
            if (r3 == 0) goto L_0x0143
            r3.endViewTransition(r2)
            android.view.View r2 = r14.S
            r2.clearAnimation()
            boolean r2 = r14.c()
            if (r2 != 0) goto L_0x0143
            int r2 = r13.j
            r3 = 0
            r5 = 0
            if (r2 < 0) goto L_0x00e7
            boolean r2 = r13.q
            if (r2 != 0) goto L_0x00e7
            android.view.View r2 = r14.S
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x00e7
            float r2 = r14.Y
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x00e7
            gx r2 = r13.k
            android.content.Context r2 = r2.c
            r5 = 0
            gq r5 = defpackage.gs.a(r2, r14, r5)
            goto L_0x00e8
        L_0x00e7:
        L_0x00e8:
            r14.Y = r3
            android.view.ViewGroup r2 = r14.R
            android.view.View r3 = r14.S
            if (r5 == 0) goto L_0x013a
            hb r10 = r13.C
            r2.startViewTransition(r3)
            mo r11 = new mo
            r11.<init>()
            gm r6 = new gm
            r6.<init>(r14)
            r11.a(r6)
            r10.a(r14, r11)
            android.view.animation.Animation r6 = r5.a
            if (r6 == 0) goto L_0x0121
            gr r5 = new gr
            r5.<init>(r6, r2, r3)
            android.view.View r6 = r14.S
            r14.a((android.view.View) r6)
            go r6 = new go
            r6.<init>(r2, r14, r10, r11)
            r5.setAnimationListener(r6)
            android.view.View r6 = r14.S
            r6.startAnimation(r5)
            goto L_0x013a
        L_0x0121:
            android.animation.Animator r5 = r5.b
            r14.a((android.animation.Animator) r5)
            gp r12 = new gp
            r6 = r12
            r7 = r2
            r8 = r3
            r9 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r5.addListener(r12)
            android.view.View r6 = r14.S
            r5.setTarget(r6)
            r5.start()
        L_0x013a:
            r2.removeView(r3)
            android.view.ViewGroup r3 = r14.R
            if (r2 != r3) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            return
        L_0x0143:
            java.util.concurrent.ConcurrentHashMap r2 = r13.h
            java.lang.Object r2 = r2.get(r14)
            if (r2 != 0) goto L_0x014e
            r0.o()
        L_0x014e:
            if (r15 > 0) goto L_0x0187
            boolean r2 = r14.x
            if (r2 == 0) goto L_0x015a
            boolean r2 = r14.b()
            if (r2 == 0) goto L_0x0162
        L_0x015a:
            ho r2 = r13.r
            boolean r2 = r2.b(r14)
            if (r2 == 0) goto L_0x0168
        L_0x0162:
            hr r2 = r13.a
            r2.b((defpackage.hq) r0)
            goto L_0x017a
        L_0x0168:
            java.lang.String r2 = r14.t
            if (r2 == 0) goto L_0x017a
            gj r2 = r13.c((java.lang.String) r2)
            if (r2 == 0) goto L_0x017a
            boolean r3 = r2.getRetainInstance()
            if (r3 == 0) goto L_0x017a
            r14.s = r2
        L_0x017a:
            java.util.concurrent.ConcurrentHashMap r2 = r13.h
            java.lang.Object r2 = r2.get(r14)
            if (r2 != 0) goto L_0x0186
            r0.p()
            goto L_0x0187
        L_0x0186:
            goto L_0x0188
        L_0x0187:
            r1 = r15
        L_0x0188:
            if (r1 >= 0) goto L_0x018d
            r0.q()
        L_0x018d:
            r15 = r1
        L_0x018e:
            int r0 = r14.m
            if (r0 == r15) goto L_0x01bc
            boolean r0 = a((int) r4)
            if (r0 == 0) goto L_0x01ba
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r14.m
            r0.append(r1)
            r0.toString()
        L_0x01ba:
            r14.m = r15
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl.a(gj, int):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(gj gjVar, ad adVar) {
        if (!gjVar.equals(c(gjVar.q)) || !(gjVar.E == null || gjVar.D == this)) {
            throw new IllegalArgumentException("Fragment " + gjVar + " is not an active fragment of FragmentManager " + this);
        }
        gjVar.ab = adVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(gj gjVar, boolean z2) {
        ViewGroup p2 = p(gjVar);
        if (p2 != null && (p2 instanceof gu)) {
            ((gu) p2).a = !z2;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [gx, bt] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.gx r5, defpackage.gt r6, defpackage.gj r7) {
        /*
            r4 = this;
            gx r0 = r4.k
            if (r0 != 0) goto L_0x0090
            r4.k = r5
            r4.l = r6
            r4.m = r7
            if (r7 != 0) goto L_0x000d
            goto L_0x0010
        L_0x000d:
            r4.b()
        L_0x0010:
            boolean r6 = r5 instanceof defpackage.agf
            if (r6 == 0) goto L_0x003a
            r6 = r5
            gk r6 = (defpackage.gk) r6
            gl r6 = r6.a
            age r6 = r6.j
            r4.d = r6
            if (r7 != 0) goto L_0x0021
            r6 = r5
            goto L_0x0022
        L_0x0021:
            r6 = r7
        L_0x0022:
            age r0 = r4.d
            agb r1 = r4.e
            ae r6 = r6.getLifecycle()
            ad r2 = r6.a()
            ad r3 = defpackage.ad.DESTROYED
            if (r2 == r3) goto L_0x003a
            agc r2 = new agc
            r2.<init>(r0, r6, r1)
            r1.a(r2)
        L_0x003a:
            if (r7 == 0) goto L_0x005f
            hl r5 = r7.D
            ho r5 = r5.r
            java.util.HashMap r6 = r5.e
            java.lang.String r0 = r7.q
            java.lang.Object r6 = r6.get(r0)
            ho r6 = (defpackage.ho) r6
            if (r6 != 0) goto L_0x005b
            ho r6 = new ho
            boolean r0 = r5.g
            r6.<init>(r0)
            java.util.HashMap r5 = r5.e
            java.lang.String r7 = r7.q
            r5.put(r7, r6)
            goto L_0x005c
        L_0x005b:
        L_0x005c:
            r4.r = r6
            goto L_0x0081
        L_0x005f:
            boolean r6 = r5 instanceof defpackage.bt
            if (r6 == 0) goto L_0x0079
            bs r5 = r5.getViewModelStore()
            br r6 = new br
            bn r7 = defpackage.ho.c
            r6.<init>(r5, r7)
            java.lang.Class<ho> r5 = defpackage.ho.class
            bl r5 = r6.a(r5)
            ho r5 = (defpackage.ho) r5
            r4.r = r5
            goto L_0x0081
        L_0x0079:
            ho r5 = new ho
            r6 = 0
            r5.<init>(r6)
            r4.r = r5
        L_0x0081:
            ho r5 = r4.r
            boolean r6 = r4.f()
            r5.i = r6
            hr r5 = r4.a
            ho r6 = r4.r
            r5.c = r6
            return
        L_0x0090:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl.a(gx, gt, gj):void");
    }

    public final void a(hj hjVar, boolean z2) {
        if (!z2) {
            if (this.k != null) {
                s();
            } else if (this.q) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.s) {
            if (this.k != null) {
                this.s.add(hjVar);
                synchronized (this.s) {
                    if (this.s.size() == 1) {
                        this.k.d.removeCallbacks(this.B);
                        this.k.d.post(this.B);
                        b();
                    }
                }
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(hq hqVar) {
        gj gjVar = hqVar.a;
        if (!gjVar.T) {
            return;
        }
        if (this.t) {
            this.x = true;
            return;
        }
        gjVar.T = false;
        c(gjVar);
    }

    public final void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new iy());
        gx gxVar = this.k;
        if (gxVar != null) {
            try {
                ((gk) gxVar).a.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw runtimeException;
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        hr hrVar = this.a;
        String str3 = str + "    ";
        if (!hrVar.b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (hq hqVar : hrVar.b.values()) {
                printWriter.print(str);
                if (hqVar != null) {
                    gj gjVar = hqVar.a;
                    printWriter.println(gjVar);
                    gjVar.dump(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = hrVar.a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((gj) hrVar.a.get(i2)).toString());
            }
        }
        ArrayList arrayList = this.u;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(((gj) this.u.get(i3)).toString());
            }
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                fw fwVar = (fw) this.b.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fwVar.toString());
                fwVar.a(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f.get());
        synchronized (this.s) {
            int size4 = this.s.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size4; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((hj) this.s.get(i5));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.k);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.l);
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.m);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.j);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.o);
        printWriter.print(" mStopped=");
        printWriter.print(this.p);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.q);
        if (this.w) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.w);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Menu menu) {
        boolean z2;
        if (this.j <= 0) {
            return false;
        }
        boolean z3 = false;
        for (gj gjVar : this.a.c()) {
            if (gjVar != null && !gjVar.K) {
                if (!gjVar.O || !gjVar.P) {
                    z2 = false;
                } else {
                    gjVar.onPrepareOptionsMenu(menu);
                    z2 = true;
                }
                if (gjVar.F.a(menu) || z2) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Menu menu, MenuInflater menuInflater) {
        boolean z2;
        if (this.j <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (gj gjVar : this.a.c()) {
            if (gjVar != null && !gjVar.K) {
                if (!gjVar.O || !gjVar.P) {
                    z2 = false;
                } else {
                    gjVar.onCreateOptionsMenu(menu, menuInflater);
                    z2 = true;
                }
                if (z2 || gjVar.F.a(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(gjVar);
                    z3 = true;
                }
            }
        }
        if (this.u != null) {
            for (int i2 = 0; i2 < this.u.size(); i2++) {
                gj gjVar2 = (gj) this.u.get(i2);
                if (arrayList == null || !arrayList.contains(gjVar2)) {
                    gjVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.u = arrayList;
        return z3;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(MenuItem menuItem) {
        if (this.j > 0) {
            for (gj gjVar : this.a.c()) {
                if (gjVar != null && !gjVar.K) {
                    if ((gjVar.O && gjVar.P && gjVar.onOptionsItemSelected(menuItem)) || gjVar.F.a(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(gj gjVar) {
        if (gjVar == null) {
            return true;
        }
        hl hlVar = gjVar.D;
        return gjVar.equals(hlVar.n) && a(hlVar.m);
    }

    public final boolean a(String str, int i2, int i3) {
        a(false);
        d(true);
        gj gjVar = this.n;
        if (gjVar != null && i2 < 0 && str == null && gjVar.getChildFragmentManager().c()) {
            return true;
        }
        boolean a2 = a(this.y, this.z, str, i2, i3);
        if (a2) {
            this.t = true;
            try {
                a(this.y, this.z);
            } finally {
                t();
            }
        }
        b();
        v();
        this.a.a();
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(ArrayList arrayList, ArrayList arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList arrayList3 = this.b;
        if (arrayList3 != null) {
            if (str == null && i2 < 0 && (i3 & 1) == 0) {
                int size = arrayList3.size() - 1;
                if (size < 0) {
                    return false;
                }
                arrayList.add(this.b.remove(size));
                arrayList2.add(true);
            } else {
                if (str == null && i2 < 0) {
                    i4 = -1;
                } else {
                    int size2 = arrayList3.size() - 1;
                    while (i4 >= 0) {
                        fw fwVar = (fw) this.b.get(i4);
                        if ((str != null && str.equals(fwVar.l)) || (i2 >= 0 && i2 == fwVar.c)) {
                            break;
                        }
                        size2 = i4 - 1;
                    }
                    if (i4 >= 0) {
                        if ((i3 & 1) != 0) {
                            i4--;
                            while (i4 >= 0) {
                                fw fwVar2 = (fw) this.b.get(i4);
                                if ((str == null || !str.equals(fwVar2.l)) && (i2 < 0 || i2 != fwVar2.c)) {
                                    break;
                                }
                                i4--;
                            }
                        }
                    }
                }
                if (i4 != this.b.size() - 1) {
                    for (int size3 = this.b.size() - 1; size3 > i4; size3--) {
                        arrayList.add(this.b.remove(size3));
                        arrayList2.add(true);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public final boolean a(boolean z2) {
        d(z2);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.y;
            ArrayList arrayList2 = this.z;
            synchronized (this.s) {
                if (this.s.isEmpty()) {
                    break;
                }
                int size = this.s.size();
                boolean z4 = false;
                for (int i2 = 0; i2 < size; i2++) {
                    z4 |= ((hj) this.s.get(i2)).a(arrayList, arrayList2);
                }
                this.s.clear();
                this.k.d.removeCallbacks(this.B);
                if (!z4) {
                    break;
                }
                this.t = true;
                try {
                    a(this.y, this.z);
                    t();
                    z3 = true;
                } catch (Throwable th) {
                    t();
                    throw th;
                }
            }
        }
        b();
        v();
        this.a.a();
        return z3;
    }
}
