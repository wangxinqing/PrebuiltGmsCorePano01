package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.mdi.download.ui.DebugUiChimeraActivity;

/* renamed from: sdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class sdk implements View.OnClickListener {
    private final DebugUiChimeraActivity a;

    public sdk(DebugUiChimeraActivity debugUiChimeraActivity) {
        this.a = debugUiChimeraActivity;
    }

    public void onClick(View view) {
        DebugUiChimeraActivity debugUiChimeraActivity = this.a;
        iby iby = new iby((Context) debugUiChimeraActivity, (int[]) null);
        iby.a(true).a((acvv) new sdr(debugUiChimeraActivity, iby));
    }
}
