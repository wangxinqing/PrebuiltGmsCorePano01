package defpackage;

import com.airbnb.lottie.LottieAnimationView;

/* renamed from: aui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aui implements ave {
    final /* synthetic */ LottieAnimationView a;

    public aui(LottieAnimationView lottieAnimationView) {
        this.a = lottieAnimationView;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Throwable th = (Throwable) obj;
        LottieAnimationView lottieAnimationView = this.a;
        int i = lottieAnimationView.b;
        if (i != 0) {
            lottieAnimationView.setImageResource(i);
        }
        LottieAnimationView.a.a(th);
    }
}
