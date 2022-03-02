package defpackage;

import android.view.View;
import com.google.android.gms.auth.frp.PreFactoryResetChimeraActivity;

/* renamed from: gfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gfr extends gfs {
    final /* synthetic */ PreFactoryResetChimeraActivity a;

    public gfr(PreFactoryResetChimeraActivity preFactoryResetChimeraActivity) {
        this.a = preFactoryResetChimeraActivity;
    }

    public void onClick(View view) {
        this.a.startActivity(PreFactoryResetChimeraActivity.d());
    }
}
