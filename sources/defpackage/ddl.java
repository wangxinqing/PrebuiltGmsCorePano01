package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.accountsettings.widget.PagerTabLayout;

/* renamed from: ddl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ddl implements View.OnLayoutChangeListener {
    final /* synthetic */ ddp a;

    public ddl(ddp ddp) {
        this.a = ddp;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.d.removeOnLayoutChangeListener(this);
        if (this.a.d.getWidth() < this.a.getResources().getDisplayMetrics().widthPixels) {
            PagerTabLayout pagerTabLayout = this.a.d;
            if (pagerTabLayout.v != 1) {
                pagerTabLayout.b(1);
                PagerTabLayout pagerTabLayout2 = this.a.d;
                if (pagerTabLayout2.s != 1) {
                    pagerTabLayout2.s = 1;
                    pagerTabLayout2.e();
                }
                ViewGroup.LayoutParams layoutParams = this.a.d.getLayoutParams();
                layoutParams.width = -1;
                this.a.d.setLayoutParams(layoutParams);
                return;
            }
        }
        if (this.a.d.getWidth() >= this.a.getResources().getDisplayMetrics().widthPixels) {
            PagerTabLayout pagerTabLayout3 = this.a.d;
            if (pagerTabLayout3.v != 0) {
                pagerTabLayout3.b(0);
            }
        }
    }
}
