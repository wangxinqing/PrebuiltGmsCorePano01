package defpackage;

import android.view.View;

/* renamed from: ge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ge implements ah {
    final /* synthetic */ gj a;

    public ge(gj gjVar) {
        this.a = gjVar;
    }

    public final void a(aj ajVar, ac acVar) {
        View view;
        if (acVar == ac.ON_STOP && (view = this.a.S) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
