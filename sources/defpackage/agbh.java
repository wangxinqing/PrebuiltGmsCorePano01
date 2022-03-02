package defpackage;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.util.Property;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.RingView;

/* renamed from: agbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agbh {
    public static final Property f = new agbg(Integer.class, "ringThickness");
    public final RingView a;
    public final int b;
    public final int c;
    public amri d = ampu.a;
    public AnimatorSet e = null;

    public agbh(RingView ringView, int i) {
        int i2;
        this.a = ringView;
        int dimensionPixelSize = ringView.getResources().getDimensionPixelSize(R.dimen.og_apd_min_avatar_size_for_large_ring);
        Resources resources = ringView.getResources();
        if (i < dimensionPixelSize) {
            i2 = R.dimen.og_apd_small_ring_width;
        } else {
            i2 = R.dimen.og_apd_large_ring_width;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
        this.c = dimensionPixelSize2;
        int i3 = i + (dimensionPixelSize2 * 4) + 2;
        this.b = i3;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 17;
        ringView.setLayoutParams(layoutParams);
        ringView.b = this.c;
        ringView.c = this.b / 2;
        ringView.setVisibility(0);
    }
}
