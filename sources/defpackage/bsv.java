package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import java.util.ArrayList;

/* renamed from: bsv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bsv extends atr {
    private final FragmentManager b;
    private FragmentTransaction c = null;
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private Fragment f = null;

    public bsv(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    public final Object a(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.e.size() > i && (fragment = (Fragment) this.e.get(i)) != null) {
            return fragment;
        }
        if (this.c == null) {
            this.c = this.b.beginTransaction();
        }
        Fragment b2 = b(i);
        if (this.d.size() > i && (savedState = (Fragment.SavedState) this.d.get(i)) != null) {
            b2.setInitialSavedState(savedState);
        }
        while (this.e.size() <= i) {
            this.e.add((Object) null);
        }
        b2.setMenuVisibility(false);
        b2.setUserVisibleHint(false);
        this.e.set(i, b2);
        this.c.add(viewGroup.getId(), b2);
        return b2;
    }

    public final Parcelable b() {
        Bundle bundle;
        if (this.d.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.d.size()];
            this.d.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.e.size(); i++) {
            Fragment fragment = (Fragment) this.e.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder sb = new StringBuilder(12);
                sb.append("f");
                sb.append(i);
                this.b.putFragment(bundle, sb.toString(), fragment);
            }
        }
        return bundle;
    }

    public abstract Fragment b(int i);

    public final void d() {
        FragmentTransaction fragmentTransaction = this.c;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitNowAllowingStateLoss();
            this.c = null;
        }
    }

    public final void b(Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f = fragment;
        }
    }

    public final void a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.d.clear();
            this.e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.d.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment fragment = this.b.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.e.size() <= parseInt) {
                            this.e.add((Object) null);
                        }
                        fragment.setMenuVisibility(false);
                        this.e.set(parseInt, fragment);
                    } else {
                        String valueOf = String.valueOf(str);
                        Log.w("FragmentStatePagerAdapter", valueOf.length() == 0 ? new String("Bad fragment at key ") : "Bad fragment at key ".concat(valueOf));
                    }
                }
            }
        }
    }

    public final void a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("ViewPager with adapter ");
            sb.append(valueOf);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.c == null) {
            this.c = this.b.beginTransaction();
        }
        while (this.d.size() <= i) {
            this.d.add((Object) null);
        }
        ArrayList arrayList = this.d;
        if (fragment.isAdded()) {
            savedState = this.b.saveFragmentInstanceState(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.e.set(i, (Object) null);
        this.c.remove(fragment);
    }

    public final boolean a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }
}
