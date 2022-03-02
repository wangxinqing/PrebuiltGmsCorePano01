package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.auth.frp.FreUnlockChimeraActivity;

/* renamed from: gfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gfb implements View.OnClickListener {
    final /* synthetic */ FreUnlockChimeraActivity a;

    public gfb(FreUnlockChimeraActivity freUnlockChimeraActivity) {
        this.a = freUnlockChimeraActivity;
    }

    public void onClick(View view) {
        this.a.getSupportLoaderManager().initLoader(2, (Bundle) null, this.a);
    }
}
