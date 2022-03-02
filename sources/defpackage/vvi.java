package defpackage;

import android.os.Build;
import android.transition.TransitionValues;
import android.view.View;

/* renamed from: vvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vvi extends TransitionValues {
    public static TransitionValues a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new TransitionValues(view);
        }
        TransitionValues transitionValues = new TransitionValues();
        transitionValues.view = view;
        return transitionValues;
    }
}
