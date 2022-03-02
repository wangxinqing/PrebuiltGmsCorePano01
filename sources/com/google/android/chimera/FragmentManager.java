package com.google.android.chimera;

import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FragmentManager {
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    private static WeakHashMap a = new WeakHashMap();
    private final hl b;

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class BackStackEntry {
        hg a;

        public BackStackEntry(hg hgVar) {
            this.a = hgVar;
        }

        public CharSequence getBreadCrumbShortTitle() {
            return this.a.e();
        }

        public int getBreadCrumbShortTitleRes() {
            return this.a.c();
        }

        public CharSequence getBreadCrumbTitle() {
            return this.a.d();
        }

        public int getBreadCrumbTitleRes() {
            return this.a.b();
        }

        public int getId() {
            return this.a.a();
        }

        public String getName() {
            return this.a.j();
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface OnBackStackChangedListener {
        void onBackStackChanged();
    }

    private FragmentManager(hl hlVar) {
        this.b = hlVar;
    }

    static FragmentManager get(hl hlVar) {
        FragmentManager fragmentManager = null;
        if (hlVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) a.get(hlVar);
        if (weakReference != null) {
            fragmentManager = (FragmentManager) weakReference.get();
        }
        if (fragmentManager != null) {
            return fragmentManager;
        }
        FragmentManager fragmentManager2 = new FragmentManager(hlVar);
        a.put(hlVar, new WeakReference(fragmentManager2));
        return fragmentManager2;
    }

    public void addOnBackStackChangedListener(OnBackStackChangedListener onBackStackChangedListener) {
        hl hlVar = this.b;
        bjg a2 = bjg.a(onBackStackChangedListener, true);
        amrl.a((Object) a2);
        if (hlVar.g == null) {
            hlVar.g = new ArrayList();
        }
        hlVar.g.add(a2);
    }

    public FragmentTransaction beginTransaction() {
        return new FragmentTransaction(this.b.a());
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.a(str, fileDescriptor, printWriter, strArr);
    }

    public boolean executePendingTransactions() {
        return this.b.a(true);
    }

    public Fragment findFragmentById(int i) {
        Fragment.ProxyCallbacks proxyCallbacks = (Fragment.ProxyCallbacks) this.b.b(i);
        if (proxyCallbacks != null) {
            return proxyCallbacks.getModuleFragment();
        }
        return null;
    }

    public Fragment findFragmentByTag(String str) {
        Fragment.ProxyCallbacks proxyCallbacks = (Fragment.ProxyCallbacks) this.b.a(str);
        if (proxyCallbacks != null) {
            return proxyCallbacks.getModuleFragment();
        }
        return null;
    }

    public BackStackEntry getBackStackEntryAt(int i) {
        return new BackStackEntry((hg) this.b.b.get(i));
    }

    public int getBackStackEntryCount() {
        return this.b.d();
    }

    public Fragment getFragment(Bundle bundle, String str) {
        gj gjVar;
        hl hlVar = this.b;
        String string = bundle.getString(str);
        if (string != null) {
            gjVar = hlVar.c(string);
            if (gjVar == null) {
                hlVar.a((RuntimeException) new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
            }
        } else {
            gjVar = null;
        }
        Fragment.ProxyCallbacks proxyCallbacks = (Fragment.ProxyCallbacks) gjVar;
        if (proxyCallbacks != null) {
            return proxyCallbacks.getModuleFragment();
        }
        return null;
    }

    public List getFragments() {
        List<gj> e = this.b.e();
        ArrayList arrayList = new ArrayList(e.size());
        for (gj gjVar : e) {
            if (gjVar != null && (gjVar instanceof Fragment.ProxyCallbacks)) {
                Fragment moduleFragment = ((Fragment.ProxyCallbacks) gjVar).getModuleFragment();
                amrl.a((Object) moduleFragment);
                arrayList.add(moduleFragment);
            }
        }
        return arrayList;
    }

    public hl getNativeFragmentManager() {
        return this.b;
    }

    public boolean isDestroyed() {
        return this.b.q;
    }

    public void popBackStack() {
        hl hlVar = this.b;
        hlVar.a((hj) new hk(hlVar, (String) null, -1, 0), false);
    }

    public boolean popBackStackImmediate() {
        return this.b.c();
    }

    public void putFragment(Bundle bundle, String str, Fragment fragment) {
        hl hlVar = this.b;
        gj supportContainerFragment = fragment.getSupportContainerFragment();
        if (supportContainerFragment.D != hlVar) {
            hlVar.a((RuntimeException) new IllegalStateException("Fragment " + supportContainerFragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, supportContainerFragment.q);
    }

    public void removeOnBackStackChangedListener(OnBackStackChangedListener onBackStackChangedListener) {
        ArrayList arrayList;
        bjg a2 = bjg.a(onBackStackChangedListener, false);
        if (a2 != null && (arrayList = this.b.g) != null) {
            arrayList.remove(a2);
        }
    }

    public Fragment.SavedState saveFragmentInstanceState(Fragment fragment) {
        Fragment$SavedState fragment$SavedState;
        Bundle m;
        hl hlVar = this.b;
        gj supportContainerFragment = fragment.getSupportContainerFragment();
        hq b2 = hlVar.a.b(supportContainerFragment.q);
        if (b2 == null || !b2.a.equals(supportContainerFragment)) {
            hlVar.a((RuntimeException) new IllegalStateException("Fragment " + supportContainerFragment + " is not currently in the FragmentManager"));
        }
        if (b2.a.m < 0 || (m = b2.m()) == null) {
            fragment$SavedState = null;
        } else {
            fragment$SavedState = new Fragment$SavedState(m);
        }
        if (fragment$SavedState != null) {
            return new Fragment.SavedState(fragment$SavedState);
        }
        return null;
    }

    public boolean popBackStackImmediate(int i, int i2) {
        hl hlVar = this.b;
        if (i >= 0) {
            return hlVar.a((String) null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    public void popBackStack(int i, int i2) {
        this.b.a(i, i2);
    }

    public void popBackStack(String str, int i) {
        hl hlVar = this.b;
        hlVar.a((hj) new hk(hlVar, str, -1, i), false);
    }

    public boolean popBackStackImmediate(String str, int i) {
        return this.b.a(str, -1, i);
    }
}
