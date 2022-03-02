package defpackage;

import android.graphics.drawable.Drawable;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: auh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auh implements ave {
    final /* synthetic */ LottieAnimationView a;

    public auh(LottieAnimationView lottieAnimationView) {
        this.a = lottieAnimationView;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        auk auk = (auk) obj;
        LottieAnimationView lottieAnimationView = this.a;
        lottieAnimationView.c.setCallback(lottieAnimationView);
        lottieAnimationView.e = auk;
        avc avc = lottieAnimationView.c;
        boolean z = false;
        if (avc.a != auk) {
            avc.l = false;
            avc.b();
            avc.a = auk;
            avc.a();
            baz baz = avc.b;
            auk auk2 = baz.h;
            baz.h = auk;
            if (auk2 != null) {
                baz.a((float) ((int) auk.h), (float) ((int) auk.i));
            } else {
                baz.a((float) ((int) Math.max(baz.f, auk.h)), (float) ((int) Math.min(baz.g, auk.i)));
            }
            float f = baz.d;
            baz.d = 0.0f;
            baz.a((float) ((int) f));
            avc.a(avc.b.getAnimatedFraction());
            avc.b(avc.c);
            avc.k();
            Iterator it = new ArrayList(avc.e).iterator();
            while (it.hasNext()) {
                ((avb) it.next()).a();
                it.remove();
            }
            avc.e.clear();
            z = true;
        }
        lottieAnimationView.e();
        if (lottieAnimationView.getDrawable() != lottieAnimationView.c || z) {
            lottieAnimationView.setImageDrawable((Drawable) null);
            lottieAnimationView.setImageDrawable(lottieAnimationView.c);
            lottieAnimationView.onVisibilityChanged(lottieAnimationView, lottieAnimationView.getVisibility());
            lottieAnimationView.requestLayout();
            for (avg a2 : lottieAnimationView.d) {
                a2.a();
            }
        }
    }
}
