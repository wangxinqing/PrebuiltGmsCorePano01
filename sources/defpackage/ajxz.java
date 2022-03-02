package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* renamed from: ajxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajxz extends arn {
    private static final void d(arw arw) {
        View view = arw.b;
        if (view instanceof TextView) {
            arw.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    public final Animator a(ViewGroup viewGroup, arw arw, arw arw2) {
        float f;
        if (arw == null || arw2 == null || !(arw.b instanceof TextView)) {
            return null;
        }
        View view = arw2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = arw.a;
        Map map2 = arw2.a;
        float f2 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f = ((Float) map.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f2 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new ajxy(textView));
        return ofFloat;
    }

    public final void b(arw arw) {
        d(arw);
    }

    public final void a(arw arw) {
        d(arw);
    }
}
