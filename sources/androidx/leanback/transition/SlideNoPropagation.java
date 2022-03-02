package androidx.leanback.transition;

import android.content.Context;
import android.transition.Slide;
import android.transition.TransitionPropagation;
import android.util.AttributeSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SlideNoPropagation extends Slide {
    public SlideNoPropagation() {
    }

    public final void setSlideEdge(int i) {
        super.setSlideEdge(i);
        setPropagation((TransitionPropagation) null);
    }

    public SlideNoPropagation(int i) {
        super(i);
    }

    public SlideNoPropagation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
