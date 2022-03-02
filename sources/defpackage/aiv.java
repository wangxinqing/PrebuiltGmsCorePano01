package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* renamed from: aiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiv extends aja {
    public final float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        if (viewGroup.getLayoutDirection() == 1) {
            return view.getTranslationX() - fadeAndShortSlide.a(viewGroup);
        }
        return view.getTranslationX() + fadeAndShortSlide.a(viewGroup);
    }
}
