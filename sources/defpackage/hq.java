package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentState;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import java.util.UUID;

/* renamed from: hq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hq {
    public final gj a;
    public int b = -1;
    private final ha c;
    private final hr d;
    private boolean e = false;
    private mo f;
    private mo g;

    public hq(ha haVar, hr hrVar, gj gjVar) {
        this.c = haVar;
        this.d = hrVar;
        this.a = gjVar;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        gj gjVar = this.a;
        if (gjVar.D == null) {
            return gjVar.m;
        }
        int i = this.b;
        if (gjVar.y) {
            if (gjVar.z) {
                i = Math.max(i, 1);
            } else if (i < 2) {
                i = Math.min(i, gjVar.m);
            } else {
                i = Math.min(i, 1);
            }
        }
        if (!this.a.w) {
            i = Math.min(i, 1);
        }
        gj gjVar2 = this.a;
        if (gjVar2.x) {
            if (gjVar2.b()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        gj gjVar3 = this.a;
        if (gjVar3.T && gjVar3.m < 3) {
            i = Math.min(i, 2);
        }
        ad adVar = ad.DESTROYED;
        int ordinal = this.a.ab.ordinal();
        if (ordinal == 2) {
            return Math.min(i, 1);
        }
        if (ordinal != 3) {
            return ordinal != 4 ? Math.min(i, -1) : i;
        }
        return Math.min(i, 3);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        gj c2;
        if (!this.e) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    int a2 = a();
                    int i = this.a.m;
                    if (a2 == i) {
                        this.e = z;
                        return;
                    } else if (a2 <= i) {
                        int i2 = i - 1;
                        mo moVar = this.f;
                        if (moVar != null) {
                            moVar.b();
                        }
                        if (i2 == -1) {
                            q();
                        } else if (i2 == 0) {
                            gj gjVar = this.a;
                            if (!gjVar.x || gjVar.b()) {
                                if (!this.d.c.b(this.a)) {
                                    String str = this.a.t;
                                    if (!(str == null || (c2 = this.d.c(str)) == null || !c2.M)) {
                                        this.a.s = c2;
                                    }
                                    p();
                                }
                            }
                            this.d.b(this);
                            p();
                        } else if (i2 == z) {
                            if (hl.a(3)) {
                                "movefrom ACTIVITY_CREATED: " + this.a;
                            }
                            gj gjVar2 = this.a;
                            ViewGroup viewGroup = gjVar2.R;
                            if (viewGroup != null) {
                                jy a3 = jy.a(viewGroup, gjVar2.getParentFragmentManager());
                                mo moVar2 = new mo();
                                this.g = moVar2;
                                a3.a(this, moVar2);
                            }
                            o();
                        } else if (i2 == 2) {
                            l();
                        } else if (i2 == 3) {
                            k();
                        }
                    } else {
                        int i3 = i + 1;
                        mo moVar3 = this.g;
                        if (moVar3 != null) {
                            moVar3.b();
                        }
                        if (i3 == 0) {
                            d();
                        } else if (i3 == z) {
                            e();
                        } else if (i3 == 2) {
                            c();
                            f();
                            g();
                            h();
                            gj gjVar3 = this.a;
                            ViewGroup viewGroup2 = gjVar3.R;
                            if (viewGroup2 != null) {
                                jy a4 = jy.a(viewGroup2, gjVar3.getParentFragmentManager());
                                mo moVar4 = new mo();
                                this.f = moVar4;
                                a4.a(this, moVar4);
                            }
                        } else if (i3 == 3) {
                            i();
                        } else if (i3 == 4) {
                            j();
                        }
                    }
                }
            } finally {
                this.e = z;
            }
        } else if (hl.a(2)) {
            "Ignoring re-entrant call to moveToExpectedState() for " + this.a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        gj gjVar = this.a;
        if (gjVar.y && gjVar.z && !gjVar.B) {
            if (hl.a(3)) {
                "moveto CREATE_VIEW: " + this.a;
            }
            gj gjVar2 = this.a;
            gjVar2.a(gjVar2.a(gjVar2.n), (ViewGroup) null, this.a.n);
            View view = this.a.S;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                gj gjVar3 = this.a;
                gjVar3.S.setTag(R.id.fragment_container_view_tag, gjVar3);
                gj gjVar4 = this.a;
                if (gjVar4.K) {
                    gjVar4.S.setVisibility(8);
                }
                gj gjVar5 = this.a;
                gjVar5.onViewCreated(gjVar5.S, gjVar5.n);
                ha haVar = this.c;
                gj gjVar6 = this.a;
                haVar.a(gjVar6, gjVar6.S, gjVar6.n, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (hl.a(3)) {
            "moveto ATTACHED: " + this.a;
        }
        gj gjVar = this.a;
        gj gjVar2 = gjVar.s;
        hq hqVar = null;
        if (gjVar2 != null) {
            hq b2 = this.d.b(gjVar2.q);
            if (b2 != null) {
                gj gjVar3 = this.a;
                gjVar3.t = gjVar3.s.q;
                gjVar3.s = null;
                hqVar = b2;
            } else {
                throw new IllegalStateException("Fragment " + this.a + " declared target fragment " + this.a.s + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = gjVar.t;
            if (str != null && (hqVar = this.d.b(str)) == null) {
                throw new IllegalStateException("Fragment " + this.a + " declared target fragment " + this.a.t + " that does not belong to this FragmentManager!");
            }
        }
        if (hqVar != null) {
            hqVar.b();
        }
        gj gjVar4 = this.a;
        hl hlVar = gjVar4.D;
        gjVar4.E = hlVar.k;
        gjVar4.G = hlVar.m;
        this.c.a(gjVar4, false);
        gj gjVar5 = this.a;
        gjVar5.F.a(gjVar5.E, (gt) new gf(gjVar5), gjVar5);
        gjVar5.m = 0;
        gjVar5.Q = false;
        gjVar5.onAttach(gjVar5.E.c);
        if (gjVar5.Q) {
            if (gjVar5.G == null) {
                ((gk) gjVar5.E).a.a(gjVar5);
            }
            hl hlVar2 = gjVar5.F;
            hlVar2.o = false;
            hlVar2.p = false;
            hlVar2.r.i = false;
            hlVar2.c(0);
            this.c.b(this.a, false);
            return;
        }
        throw new jz("Fragment " + gjVar5 + " did not call through to super.onAttach()");
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (hl.a(3)) {
            "moveto CREATED: " + this.a;
        }
        gj gjVar = this.a;
        if (!gjVar.aa) {
            this.c.a(gjVar, gjVar.n, false);
            gj gjVar2 = this.a;
            Bundle bundle = gjVar2.n;
            gjVar2.F.noteStateNotSaved();
            gjVar2.m = 1;
            gjVar2.Q = false;
            gjVar2.af.a(bundle);
            gjVar2.onCreate(bundle);
            gjVar2.aa = true;
            if (gjVar2.Q) {
                gjVar2.ac.a(ac.ON_CREATE);
                ha haVar = this.c;
                gj gjVar3 = this.a;
                haVar.b(gjVar3, gjVar3.n, false);
                return;
            }
            throw new jz("Fragment " + gjVar2 + " did not call through to super.onCreate()");
        }
        gjVar.b(gjVar.n);
        this.a.m = 1;
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r5 = this;
            gj r0 = r5.a
            boolean r0 = r0.y
            if (r0 != 0) goto L_0x010b
            r0 = 3
            boolean r0 = defpackage.hl.a((int) r0)
            if (r0 == 0) goto L_0x001f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.append(r1)
            gj r1 = r5.a
            r0.append(r1)
            r0.toString()
        L_0x001f:
            gj r0 = r5.a
            android.view.ViewGroup r1 = r0.R
            if (r1 != 0) goto L_0x00a1
            int r1 = r0.I
            if (r1 == 0) goto L_0x009f
            r2 = -1
            if (r1 == r2) goto L_0x0081
            hl r0 = r0.D
            gt r0 = r0.l
            android.view.View r0 = r0.a(r1)
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 != 0) goto L_0x00a2
            gj r0 = r5.a
            boolean r2 = r0.A
            if (r2 == 0) goto L_0x0040
            goto L_0x00a2
        L_0x0040:
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x004d }
            gj r1 = r5.a     // Catch:{ NotFoundException -> 0x004d }
            int r1 = r1.I     // Catch:{ NotFoundException -> 0x004d }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x004d }
            goto L_0x0050
        L_0x004d:
            r0 = move-exception
            java.lang.String r0 = "unknown"
        L_0x0050:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            gj r3 = r5.a
            int r3 = r3.I
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            gj r0 = r5.a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0081:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            gj r2 = r5.a
            r1.append(r2)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009f:
            r1 = 0
            goto L_0x00a2
        L_0x00a1:
        L_0x00a2:
            gj r0 = r5.a
            r0.R = r1
            android.os.Bundle r2 = r0.n
            android.view.LayoutInflater r2 = r0.a((android.os.Bundle) r2)
            gj r3 = r5.a
            android.os.Bundle r3 = r3.n
            r0.a(r2, r1, r3)
            gj r0 = r5.a
            android.view.View r0 = r0.S
            if (r0 == 0) goto L_0x010b
            r2 = 0
            r0.setSaveFromParentEnabled(r2)
            gj r0 = r5.a
            android.view.View r3 = r0.S
            r4 = 2131428348(0x7f0b03fc, float:1.8478338E38)
            r3.setTag(r4, r0)
            if (r1 == 0) goto L_0x00d0
            gj r0 = r5.a
            android.view.View r0 = r0.S
            r1.addView(r0)
        L_0x00d0:
            gj r0 = r5.a
            boolean r1 = r0.K
            if (r1 == 0) goto L_0x00dd
            android.view.View r0 = r0.S
            r1 = 8
            r0.setVisibility(r1)
        L_0x00dd:
            gj r0 = r5.a
            android.view.View r0 = r0.S
            defpackage.qb.r(r0)
            gj r0 = r5.a
            android.view.View r1 = r0.S
            android.os.Bundle r3 = r0.n
            r0.onViewCreated(r1, r3)
            ha r0 = r5.c
            gj r1 = r5.a
            android.view.View r3 = r1.S
            android.os.Bundle r4 = r1.n
            r0.a(r1, r3, r4, r2)
            gj r0 = r5.a
            android.view.View r1 = r0.S
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0109
            gj r1 = r5.a
            android.view.ViewGroup r1 = r1.R
            if (r1 == 0) goto L_0x0109
            r2 = 1
        L_0x0109:
            r0.W = r2
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq.f():void");
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        if (hl.a(3)) {
            "moveto ACTIVITY_CREATED: " + this.a;
        }
        gj gjVar = this.a;
        Bundle bundle = gjVar.n;
        gjVar.F.noteStateNotSaved();
        gjVar.m = 2;
        gjVar.Q = false;
        gjVar.onActivityCreated(bundle);
        if (gjVar.Q) {
            gjVar.F.i();
            ha haVar = this.c;
            gj gjVar2 = this.a;
            haVar.c(gjVar2, gjVar2.n, false);
            return;
        }
        throw new jz("Fragment " + gjVar + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        if (hl.a(3)) {
            "moveto RESTORE_VIEW_STATE: " + this.a;
        }
        gj gjVar = this.a;
        View view = gjVar.S;
        if (view != null) {
            Bundle bundle = gjVar.n;
            SparseArray sparseArray = gjVar.o;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                gjVar.o = null;
            }
            gjVar.Q = false;
            gjVar.onViewStateRestored(bundle);
            if (!gjVar.Q) {
                throw new jz("Fragment " + gjVar + " did not call through to super.onViewStateRestored()");
            } else if (gjVar.S != null) {
                gjVar.ad.a(ac.ON_CREATE);
            }
        }
        this.a.n = null;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        if (hl.a(3)) {
            "moveto STARTED: " + this.a;
        }
        gj gjVar = this.a;
        gjVar.F.noteStateNotSaved();
        gjVar.F.a(true);
        gjVar.m = 3;
        gjVar.Q = false;
        gjVar.onStart();
        if (gjVar.Q) {
            gjVar.ac.a(ac.ON_START);
            if (gjVar.S != null) {
                gjVar.ad.a(ac.ON_START);
            }
            gjVar.F.j();
            this.c.c(this.a, false);
            return;
        }
        throw new jz("Fragment " + gjVar + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        if (hl.a(3)) {
            "moveto RESUMED: " + this.a;
        }
        gj gjVar = this.a;
        gjVar.F.noteStateNotSaved();
        gjVar.F.a(true);
        gjVar.m = 4;
        gjVar.Q = false;
        gjVar.onResume();
        if (gjVar.Q) {
            gjVar.ac.a(ac.ON_RESUME);
            if (gjVar.S != null) {
                gjVar.ad.a(ac.ON_RESUME);
            }
            gjVar.F.k();
            this.c.d(this.a, false);
            gj gjVar2 = this.a;
            gjVar2.n = null;
            gjVar2.o = null;
            return;
        }
        throw new jz("Fragment " + gjVar + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        if (hl.a(3)) {
            "movefrom RESUMED: " + this.a;
        }
        gj gjVar = this.a;
        gjVar.F.l();
        if (gjVar.S != null) {
            gjVar.ad.a(ac.ON_PAUSE);
        }
        gjVar.ac.a(ac.ON_PAUSE);
        gjVar.m = 3;
        gjVar.Q = false;
        gjVar.onPause();
        if (gjVar.Q) {
            this.c.e(this.a, false);
            return;
        }
        throw new jz("Fragment " + gjVar + " did not call through to super.onPause()");
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        if (hl.a(3)) {
            "movefrom STARTED: " + this.a;
        }
        gj gjVar = this.a;
        gjVar.F.m();
        if (gjVar.S != null) {
            gjVar.ad.a(ac.ON_STOP);
        }
        gjVar.ac.a(ac.ON_STOP);
        gjVar.m = 2;
        gjVar.Q = false;
        gjVar.onStop();
        if (gjVar.Q) {
            this.c.f(this.a, false);
            return;
        }
        throw new jz("Fragment " + gjVar + " did not call through to super.onStop()");
    }

    public final Bundle m() {
        Bundle bundle = new Bundle();
        gj gjVar = this.a;
        gjVar.onSaveInstanceState(bundle);
        gjVar.af.b(bundle);
        Parcelable g2 = gjVar.F.g();
        if (g2 != null) {
            bundle.putParcelable("android:support:fragments", g2);
        }
        this.c.d(this.a, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.a.S != null) {
            n();
        }
        if (this.a.o != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.a.o);
        }
        if (!this.a.U) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.a.U);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        if (this.a.S != null) {
            SparseArray sparseArray = new SparseArray();
            this.a.S.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.a.o = sparseArray;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        this.a.d();
        this.c.g(this.a, false);
        gj gjVar = this.a;
        gjVar.R = null;
        gjVar.S = null;
        gjVar.ad = null;
        gjVar.ae.b((Object) null);
        this.a.z = false;
    }

    /* access modifiers changed from: package-private */
    public final void p() {
        boolean z;
        if (hl.a(3)) {
            "movefrom CREATED: " + this.a;
        }
        gj gjVar = this.a;
        boolean z2 = true;
        if (!gjVar.x || gjVar.b()) {
            z = false;
        } else {
            z = true;
        }
        if (z || this.d.c.b(this.a)) {
            gx gxVar = this.a.E;
            if (gxVar instanceof bt) {
                z2 = this.d.c.h;
            } else if (((Activity) gxVar.c).isChangingConfigurations()) {
                z2 = false;
            }
            if (z || z2) {
                ho hoVar = this.d.c;
                gj gjVar2 = this.a;
                if (hl.a(3)) {
                    "Clearing non-config state for " + gjVar2;
                }
                ho hoVar2 = (ho) hoVar.e.get(gjVar2.q);
                if (hoVar2 != null) {
                    hoVar2.f();
                    hoVar.e.remove(gjVar2.q);
                }
                bs bsVar = (bs) hoVar.f.get(gjVar2.q);
                if (bsVar != null) {
                    bsVar.a();
                    hoVar.f.remove(gjVar2.q);
                }
            }
            gj gjVar3 = this.a;
            gjVar3.F.n();
            gjVar3.ac.a(ac.ON_DESTROY);
            gjVar3.m = 0;
            gjVar3.Q = false;
            gjVar3.aa = false;
            gjVar3.onDestroy();
            if (gjVar3.Q) {
                this.c.h(this.a, false);
                return;
            }
            throw new jz("Fragment " + gjVar3 + " did not call through to super.onDestroy()");
        }
        this.a.m = 0;
    }

    /* access modifiers changed from: package-private */
    public final void q() {
        if (hl.a(3)) {
            "movefrom ATTACHED: " + this.a;
        }
        gj gjVar = this.a;
        gjVar.m = -1;
        gjVar.Q = false;
        gjVar.onDetach();
        gjVar.Z = null;
        if (gjVar.Q) {
            hl hlVar = gjVar.F;
            if (!hlVar.q) {
                hlVar.n();
                gjVar.F = new hl();
            }
            this.c.i(this.a, false);
            gj gjVar2 = this.a;
            gjVar2.m = -1;
            gjVar2.E = null;
            gjVar2.G = null;
            gjVar2.D = null;
            if ((gjVar2.x && !gjVar2.b()) || this.d.c.b(this.a)) {
                if (hl.a(3)) {
                    "initState called for fragment: " + this.a;
                }
                gj gjVar3 = this.a;
                gjVar3.aN();
                gjVar3.q = UUID.randomUUID().toString();
                gjVar3.w = false;
                gjVar3.x = false;
                gjVar3.y = false;
                gjVar3.z = false;
                gjVar3.A = false;
                gjVar3.C = 0;
                gjVar3.D = null;
                gjVar3.F = new hl();
                gjVar3.E = null;
                gjVar3.H = 0;
                gjVar3.I = 0;
                gjVar3.J = null;
                gjVar3.K = false;
                gjVar3.L = false;
                return;
            }
            return;
        }
        throw new jz("Fragment " + gjVar + " did not call through to super.onDetach()");
    }

    public hq(ha haVar, hr hrVar, gj gjVar, FragmentState fragmentState) {
        String str;
        this.c = haVar;
        this.d = hrVar;
        this.a = gjVar;
        gjVar.o = null;
        gjVar.C = 0;
        gjVar.z = false;
        gjVar.w = false;
        gj gjVar2 = gjVar.s;
        if (gjVar2 != null) {
            str = gjVar2.q;
        } else {
            str = null;
        }
        gjVar.t = str;
        gjVar.s = null;
        Bundle bundle = fragmentState.m;
        gjVar.n = bundle == null ? new Bundle() : bundle;
    }

    public hq(ha haVar, hr hrVar, ClassLoader classLoader, gw gwVar, FragmentState fragmentState) {
        this.c = haVar;
        this.d = hrVar;
        this.a = gwVar.c(classLoader, fragmentState.a);
        Bundle bundle = fragmentState.j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.a.setArguments(fragmentState.j);
        gj gjVar = this.a;
        gjVar.q = fragmentState.b;
        gjVar.y = fragmentState.c;
        gjVar.A = true;
        gjVar.H = fragmentState.d;
        gjVar.I = fragmentState.e;
        gjVar.J = fragmentState.f;
        gjVar.M = fragmentState.g;
        gjVar.x = fragmentState.h;
        gjVar.L = fragmentState.i;
        gjVar.K = fragmentState.k;
        gjVar.ab = ad.values()[fragmentState.l];
        Bundle bundle2 = fragmentState.m;
        if (bundle2 == null) {
            this.a.n = new Bundle();
        } else {
            this.a.n = bundle2;
        }
        if (hl.a(2)) {
            "Instantiated fragment " + this.a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ClassLoader classLoader) {
        Bundle bundle = this.a.n;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            gj gjVar = this.a;
            gjVar.o = gjVar.n.getSparseParcelableArray("android:view_state");
            gj gjVar2 = this.a;
            gjVar2.t = gjVar2.n.getString("android:target_state");
            gj gjVar3 = this.a;
            if (gjVar3.t != null) {
                gjVar3.u = gjVar3.n.getInt("android:target_req_state", 0);
            }
            gj gjVar4 = this.a;
            Boolean bool = gjVar4.p;
            if (bool != null) {
                gjVar4.U = bool.booleanValue();
                this.a.p = null;
            } else {
                gjVar4.U = gjVar4.n.getBoolean("android:user_visible_hint", true);
            }
            gj gjVar5 = this.a;
            if (!gjVar5.U) {
                gjVar5.T = true;
            }
        }
    }
}
