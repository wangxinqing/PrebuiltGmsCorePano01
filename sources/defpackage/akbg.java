package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* renamed from: akbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akbg extends DataSetObserver {
    final /* synthetic */ TabLayout a;

    public akbg(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    public final void onChanged() {
        this.a.d();
    }

    public final void onInvalidated() {
        this.a.d();
    }
}
