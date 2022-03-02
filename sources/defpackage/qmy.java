package defpackage;

import android.animation.Animator;

/* renamed from: qmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qmy extends qmz {
    final /* synthetic */ qna a;

    public qmy(qna qna) {
        this.a = qna;
    }

    public final void onAnimationEnd(Animator animator) {
        qna qna = this.a;
        qna.f = 4;
        qna.b.finish();
    }
}
