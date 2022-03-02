package defpackage;

import android.animation.Animator;
import android.content.Intent;
import com.google.android.gms.plus.audience.UpdateCirclesChimeraActivity;

/* renamed from: yqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yqx extends ypz {
    final /* synthetic */ Intent b;
    final /* synthetic */ UpdateCirclesChimeraActivity c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yqx(UpdateCirclesChimeraActivity updateCirclesChimeraActivity, Intent intent) {
        super(updateCirclesChimeraActivity);
        this.c = updateCirclesChimeraActivity;
        this.b = intent;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.c.startActivityForResult(this.b, 1);
    }
}
