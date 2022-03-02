package defpackage;

import androidx.viewpager.widget.ViewPager;

/* renamed from: atu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atu implements Runnable {
    final /* synthetic */ ViewPager a;

    public atu(ViewPager viewPager) {
        this.a = viewPager;
    }

    public final void run() {
        this.a.a(0);
        this.a.c();
    }
}
