package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* renamed from: aiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiz extends aja {
    final /* synthetic */ FadeAndShortSlide a;

    public aiz(FadeAndShortSlide fadeAndShortSlide) {
        this.a = fadeAndShortSlide;
    }

    public final float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        int height = iArr[1] + (view.getHeight() / 2);
        viewGroup.getLocationOnScreen(iArr);
        Rect epicenter = this.a.getEpicenter();
        if (height >= (epicenter == null ? iArr[1] + (viewGroup.getHeight() / 2) : epicenter.centerY())) {
            return view.getTranslationY() + fadeAndShortSlide.b(viewGroup);
        }
        return view.getTranslationY() - fadeAndShortSlide.b(viewGroup);
    }
}
