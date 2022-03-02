package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: ig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ig extends Transition.EpicenterCallback {
    final /* synthetic */ Rect a;

    public ig(Rect rect) {
        this.a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        Rect rect = this.a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.a;
    }
}
