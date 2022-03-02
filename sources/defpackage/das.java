package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.view.BottomNavMenuScrollView;

/* renamed from: das  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class das implements View.OnLayoutChangeListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ AccessibilityManager b;
    final /* synthetic */ dau c;

    public das(dau dau, boolean z, AccessibilityManager accessibilityManager) {
        this.c = dau;
        this.a = z;
        this.b = accessibilityManager;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AccessibilityManager accessibilityManager;
        this.c.d.removeOnLayoutChangeListener(this);
        if (!this.a && ((accessibilityManager = this.b) == null || !accessibilityManager.isEnabled())) {
            dau dau = this.c;
            BottomNavMenuScrollView bottomNavMenuScrollView = dau.e;
            int height = dau.c.getHeight() / 2;
            Resources resources = dau.getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.as_bottom_drawer_top_padding);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.as_bottom_drawer_item_height);
            aucx aucx = dau.b.a;
            int size = aucx.size();
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                int i11 = ((aqqb) aucx.get(i9)).a;
                int i12 = 1;
                if (i11 == 1) {
                    i12 = dimensionPixelSize2;
                    i10 = 0;
                } else if (i11 != 2) {
                    i12 = 0;
                }
                int i13 = dimensionPixelSize + i12;
                if (i13 > height) {
                    int i14 = dimensionPixelSize - i10;
                    Context context = dau.getContext();
                    int dimensionPixelSize3 = (context.getResources().getDimensionPixelSize(R.dimen.as_bottom_drawer_item_height) / 2) + (context.getResources().getDimensionPixelSize(R.dimen.as_bottom_drawer_item_text_size) / 4);
                    int i15 = i14 + dimensionPixelSize3;
                    if (i15 > height) {
                        dimensionPixelSize = i14 - (dimensionPixelSize2 - dimensionPixelSize3);
                    } else {
                        dimensionPixelSize = i15;
                    }
                } else {
                    i10 += i12;
                    i9++;
                    dimensionPixelSize = i13;
                }
            }
            bottomNavMenuScrollView.a = Math.min(dimensionPixelSize, this.c.d.getHeight());
        } else {
            dau dau2 = this.c;
            dau2.e.a = dau2.c.getHeight();
        }
        dau dau3 = this.c;
        dau3.e.b = dau3.c.getHeight();
        new qvr(Looper.getMainLooper()).post(new daq(this, this.b));
    }
}
