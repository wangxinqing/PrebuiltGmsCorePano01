package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* renamed from: aub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aub extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    public aub(ViewPager viewPager) {
        this.a = viewPager;
    }

    public final void onChanged() {
        this.a.b();
    }

    public final void onInvalidated() {
        this.a.b();
    }
}
