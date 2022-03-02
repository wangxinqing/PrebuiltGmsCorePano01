package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: ic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ic extends Transition.EpicenterCallback {
    final /* synthetic */ Rect a;

    public ic(Rect rect) {
        this.a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}
