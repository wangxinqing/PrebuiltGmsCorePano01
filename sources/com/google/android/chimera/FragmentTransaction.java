package com.google.android.chimera;

import android.view.View;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.ArrayList;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FragmentTransaction {
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;
    private final ht a;

    public FragmentTransaction(ht htVar) {
        this.a = htVar;
    }

    public FragmentTransaction add(int i, Fragment fragment) {
        this.a.a(i, fragment.getSupportContainerFragment(), (String) null, 1);
        return this;
    }

    public FragmentTransaction addSharedElement(View view, String str) {
        ht htVar = this.a;
        if (!(ib.a == null && ib.b == null)) {
            String p = qb.p(view);
            if (p != null) {
                if (htVar.q == null) {
                    htVar.q = new ArrayList();
                    htVar.r = new ArrayList();
                } else if (htVar.r.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                } else if (htVar.q.contains(p)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + p + "' has already been added to the transaction.");
                }
                htVar.q.add(p);
                htVar.r.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    public FragmentTransaction addToBackStack(String str) {
        ht htVar = this.a;
        if (htVar.k) {
            htVar.j = true;
            htVar.l = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public FragmentTransaction attach(Fragment fragment) {
        this.a.a(new hs(7, fragment.getSupportContainerFragment()));
        return this;
    }

    public int commit() {
        return this.a.f();
    }

    public int commitAllowingStateLoss() {
        return this.a.g();
    }

    public void commitNow() {
        this.a.h();
    }

    public void commitNowAllowingStateLoss() {
        this.a.i();
    }

    public FragmentTransaction detach(Fragment fragment) {
        this.a.a(fragment.getSupportContainerFragment());
        return this;
    }

    public FragmentTransaction disallowAddToBackStack() {
        this.a.l();
        return this;
    }

    public ht getNativeFragmentTransaction() {
        return this.a;
    }

    public FragmentTransaction hide(Fragment fragment) {
        this.a.b(fragment.getSupportContainerFragment());
        return this;
    }

    public boolean isAddToBackStackAllowed() {
        return this.a.k;
    }

    public boolean isEmpty() {
        return this.a.k();
    }

    public FragmentTransaction remove(Fragment fragment) {
        this.a.c(fragment.getSupportContainerFragment());
        return this;
    }

    public FragmentTransaction replace(int i, Fragment fragment) {
        this.a.a(i, fragment.getSupportContainerFragment());
        return this;
    }

    public FragmentTransaction runOnCommit(Runnable runnable) {
        ht htVar = this.a;
        htVar.l();
        if (htVar.t == null) {
            htVar.t = new ArrayList();
        }
        htVar.t.add(runnable);
        return this;
    }

    public FragmentTransaction setBreadCrumbShortTitle(int i) {
        ht htVar = this.a;
        htVar.o = i;
        htVar.p = null;
        return this;
    }

    public FragmentTransaction setBreadCrumbShortTitle(CharSequence charSequence) {
        ht htVar = this.a;
        htVar.o = 0;
        htVar.p = charSequence;
        return this;
    }

    public FragmentTransaction setBreadCrumbTitle(int i) {
        ht htVar = this.a;
        htVar.m = i;
        htVar.n = null;
        return this;
    }

    public FragmentTransaction setBreadCrumbTitle(CharSequence charSequence) {
        ht htVar = this.a;
        htVar.m = 0;
        htVar.n = charSequence;
        return this;
    }

    public FragmentTransaction setCustomAnimations(int i, int i2) {
        this.a.a(i, i2, 0, 0);
        return this;
    }

    public FragmentTransaction setPrimaryNavigationFragment(Fragment fragment) {
        this.a.d(fragment.getSupportContainerFragment());
        return this;
    }

    public FragmentTransaction setTransition(int i) {
        this.a.i = i;
        return this;
    }

    public FragmentTransaction setTransitionStyle(int i) {
        return this;
    }

    public FragmentTransaction show(Fragment fragment) {
        this.a.e(fragment.getSupportContainerFragment());
        return this;
    }

    public FragmentTransaction replace(int i, Fragment fragment, String str) {
        this.a.b(i, fragment.getSupportContainerFragment(), str);
        return this;
    }

    public FragmentTransaction add(int i, Fragment fragment, String str) {
        this.a.a(i, fragment.getSupportContainerFragment(), str);
        return this;
    }

    public FragmentTransaction setCustomAnimations(int i, int i2, int i3, int i4) {
        this.a.a(i, i2, i3, i4);
        return this;
    }

    public FragmentTransaction add(Fragment fragment, String str) {
        this.a.a(fragment.getSupportContainerFragment(), str);
        return this;
    }
}
