package defpackage;

import android.content.DialogInterface;
import com.google.android.location.network.NetworkConsentChimeraActivity;

/* renamed from: aist  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aist implements DialogInterface.OnCancelListener {
    private final NetworkConsentChimeraActivity a;

    public aist(NetworkConsentChimeraActivity networkConsentChimeraActivity) {
        this.a = networkConsentChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        NetworkConsentChimeraActivity networkConsentChimeraActivity = this.a;
        if (!networkConsentChimeraActivity.isFinishing()) {
            networkConsentChimeraActivity.finish();
        }
    }
}
