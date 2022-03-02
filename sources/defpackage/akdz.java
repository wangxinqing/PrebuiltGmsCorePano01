package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.gms.R;
import com.google.android.pano.widget.FrameLayoutWithShadows;

/* renamed from: akdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akdz {
    public final int a = R.id.content_fragment;
    public final int b = R.id.action_fragment;
    public FrameLayoutWithShadows c;
    public boolean d = true;
    public final akef e;
    public final ColorDrawable f = new ColorDrawable();

    public akdz(akef akef) {
        this.e = akef;
    }

    public final void a(View view, float f2, Interpolator interpolator, boolean z) {
        if (view != null && view.getWindowToken() != null) {
            view.setLayerType(2, (Paint) null);
            view.buildLayer();
            view.setAlpha(0.0f);
            view.setTranslationX(f2);
            view.animate().alpha(1.0f).translationX(0.0f).setDuration(250).setStartDelay(120);
            view.animate().setInterpolator(interpolator);
            view.animate().setListener(new akdy(this, view, z));
            view.animate().start();
        }
    }
}
