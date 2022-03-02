package defpackage;

import android.view.View;
import com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationChimeraActivity;

/* renamed from: gmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class gmp implements View.OnClickListener {
    private final UncertifiedNotificationChimeraActivity a;

    public gmp(UncertifiedNotificationChimeraActivity uncertifiedNotificationChimeraActivity) {
        this.a = uncertifiedNotificationChimeraActivity;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
