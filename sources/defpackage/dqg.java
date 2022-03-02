package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import java.util.Map;

/* renamed from: dqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqg extends atr implements SharedPreferences.OnSharedPreferenceChangeListener {
    private static final int[] c = {0, 1, 3};
    public Map b;
    private Context d;
    private Map e;
    private boolean f;
    private boolean g;
    private boolean h;
    private final FragmentManager i;
    private FragmentTransaction j = null;
    private final Map k = new nz();
    private Fragment l = null;

    public dqg(FragmentManager fragmentManager, Context context) {
        this.i = fragmentManager;
        this.d = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("NetworkUsagePrefs", 0);
        this.f = sharedPreferences.getBoolean("CELLULAR_TAB_ENABLE", false);
        this.g = sharedPreferences.getBoolean("WIFI_TAB_ENABLE", false);
        this.h = sharedPreferences.getBoolean("ETHERNET_TAB_ENABLE", false);
        this.b = new nz();
        this.e = new nz();
        for (int valueOf : c) {
            this.e.put(Integer.valueOf(valueOf), -1);
        }
        c(0);
        c(1);
        c(3);
    }

    private final Fragment e(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_NETWORK_TYPE", i2);
        dqf dqf = new dqf();
        dqf.setArguments(bundle);
        this.b.put(Integer.valueOf(i2), dqf);
        return dqf;
    }

    public final int a() {
        int i2 = this.f;
        if (this.g) {
            i2++;
        }
        return this.h ? i2 + 1 : i2;
    }

    /* access modifiers changed from: protected */
    public final int b(int i2) {
        if (i2 < 0 || i2 >= c.length) {
            return -1;
        }
        if (((ou) this.b).h >= 3) {
            return c[i2];
        }
        int i3 = 0;
        if (d(0)) {
            if (i2 == 0) {
                return 0;
            }
            i3 = 1;
        }
        if (d(1)) {
            if (i2 == i3) {
                return 1;
            }
            i3++;
        }
        return (!d(3) || i2 != i3) ? -1 : 3;
    }

    /* access modifiers changed from: protected */
    public final void c(int i2) {
        if (this.b.get(Integer.valueOf(i2)) == null && d(i2)) {
            e(i2);
            c();
        }
    }

    public final void d() {
        FragmentTransaction fragmentTransaction = this.j;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitAllowingStateLoss();
            this.j = null;
            this.i.executePendingTransactions();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean d(int i2) {
        if (i2 == 0) {
            return this.f;
        }
        if (i2 == 1) {
            return this.g;
        }
        if (i2 != 3) {
            return false;
        }
        return this.h;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z;
        boolean z2;
        boolean equals = str.equals("CELLULAR_TAB_ENABLE");
        boolean equals2 = str.equals("WIFI_TAB_ENABLE");
        boolean equals3 = str.equals("ETHERNET_TAB_ENABLE");
        int i2 = 1;
        int i3 = 0;
        if (equals) {
            z = sharedPreferences.getBoolean(str, false);
            boolean z3 = this.f;
            if (z != z3) {
                this.f = z;
            } else {
                z = z3;
                i2 = 0;
            }
            i3 = i2;
            i2 = 0;
        } else if (equals2) {
            z = sharedPreferences.getBoolean(str, false);
            boolean z4 = this.g;
            if (z != z4) {
                this.g = z;
                i3 = 1;
            } else {
                z = z4;
            }
        } else if (equals3) {
            boolean z5 = sharedPreferences.getBoolean(str, false);
            boolean z6 = this.h;
            if (z5 != z6) {
                this.h = z5;
                z2 = z5;
            } else {
                z2 = z6;
                i2 = 0;
            }
            z = z2;
            i3 = i2;
            i2 = 3;
        } else {
            i2 = -1;
            z = false;
        }
        if (i2 >= 0 && i3 != 0) {
            if (z) {
                c(i2);
            } else if (!d(i2)) {
                this.b.remove(Integer.valueOf(i2));
                c();
            }
        }
    }

    public final int a(Object obj) {
        int i2;
        int i3;
        try {
            int i4 = ((dqf) obj).a;
            Map map = this.e;
            Integer valueOf = Integer.valueOf(i4);
            Integer num = (Integer) map.get(valueOf);
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = -1;
            }
            int i5 = -2;
            if (i4 != 0) {
                if (i4 == 1) {
                    i3 = this.f;
                    if (!this.g) {
                    }
                } else if (i4 != 3) {
                    i5 = -1;
                } else {
                    i3 = this.f;
                    if (this.g) {
                        i3++;
                    }
                    if (!this.h) {
                    }
                }
                i5 = i3;
            } else if (this.f) {
                i5 = 0;
            }
            this.e.put(valueOf, Integer.valueOf(i5));
            if (i5 != i2) {
                return i5;
            }
            return -1;
        } catch (ClassCastException e2) {
            return -1;
        }
    }

    public final Parcelable b() {
        Bundle bundle;
        int i2 = 0;
        if (!this.k.isEmpty()) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[c.length];
            int i3 = 0;
            while (true) {
                int[] iArr = c;
                if (i3 >= iArr.length) {
                    break;
                }
                savedStateArr[i3] = (Fragment.SavedState) this.k.get(Integer.valueOf(iArr[i3]));
                i3++;
            }
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        while (true) {
            int[] iArr2 = c;
            if (i2 >= iArr2.length) {
                return bundle;
            }
            Fragment fragment = (Fragment) this.b.get(Integer.valueOf(iArr2[i2]));
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                int i4 = c[i2];
                StringBuilder sb = new StringBuilder(12);
                sb.append("f");
                sb.append(i4);
                this.i.putFragment(bundle, sb.toString(), fragment);
            }
            i2++;
        }
    }

    public final /* bridge */ /* synthetic */ CharSequence a(int i2) {
        int b2 = b(i2);
        if (b2 == -1) {
            return null;
        }
        if (b2 == 0) {
            return this.d.getResources().getString(R.string.data_usage_tab_mobile);
        }
        if (b2 == 1) {
            return this.d.getResources().getString(R.string.data_usage_tab_wifi);
        }
        if (b2 != 3) {
            return null;
        }
        return this.d.getResources().getString(R.string.data_usage_tab_ethernet);
    }

    public final Object a(ViewGroup viewGroup, int i2) {
        Fragment fragment;
        int b2 = b(i2);
        Fragment fragment2 = null;
        if (b2 != -1) {
            fragment = (Fragment) this.b.get(Integer.valueOf(b2));
        } else {
            fragment = null;
        }
        if (fragment != null && this.i.equals(fragment.getFragmentManager())) {
            return fragment;
        }
        if (this.j == null) {
            this.j = this.i.beginTransaction();
        }
        if (fragment == null) {
            int b3 = b(i2);
            if (b3 != -1 && (fragment2 = (Fragment) this.b.get(Integer.valueOf(b3))) == null) {
                fragment2 = e(b3);
            }
        } else {
            fragment2 = fragment;
        }
        Fragment.SavedState savedState = (Fragment.SavedState) this.k.get(Integer.valueOf(b2));
        if (savedState != null) {
            fragment2.setInitialSavedState(savedState);
        }
        fragment2.setMenuVisibility(false);
        fragment2.setUserVisibleHint(false);
        this.j.add(viewGroup.getId(), fragment2);
        return fragment2;
    }

    public final void b(Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.l;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.l.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.l = fragment;
        }
    }

    public final void a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.k.clear();
            this.b.clear();
            if (parcelableArray != null && parcelableArray.length == c.length) {
                for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                    this.k.put(Integer.valueOf(c[i2]), (Fragment.SavedState) parcelableArray[i2]);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment fragment = this.i.getFragment(bundle, str);
                    if (fragment != null) {
                        try {
                            fragment.setMenuVisibility(false);
                            this.b.put(Integer.valueOf(parseInt), (dqf) fragment);
                        } catch (ClassCastException e2) {
                        }
                    }
                }
            }
        }
    }

    public final void a(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.j == null) {
            this.j = this.i.beginTransaction();
        }
        if (fragment != null && this.i.equals(fragment.getFragmentManager())) {
            int b2 = b(i2);
            if (b2 >= 0) {
                Map map = this.k;
                Integer valueOf = Integer.valueOf(b2);
                map.put(valueOf, this.i.saveFragmentInstanceState(fragment));
                this.b.remove(valueOf);
            }
            this.j.remove(fragment);
        }
    }

    public final boolean a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }
}
