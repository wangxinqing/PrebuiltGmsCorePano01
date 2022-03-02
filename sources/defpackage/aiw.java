package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* renamed from: aiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiw extends aja {
    public final float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        int width = iArr[0] + (view.getWidth() / 2);
        viewGroup.getLocationOnScreen(iArr);
        Rect epicenter = fadeAndShortSlide.getEpicenter();
        if (width >= (epicenter == null ? iArr[0] + (viewGroup.getWidth() / 2) : epicenter.centerX())) {
            return view.getTranslationX() + fadeAndShortSlide.a(viewGroup);
        }
        return view.getTranslationX() - fadeAndShortSlide.a(viewGroup);
    }
}
