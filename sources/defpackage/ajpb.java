package defpackage;

import android.content.DialogInterface;
import com.google.android.location.settings.WifiScanningPrePConsentChimeraActivity;

/* renamed from: ajpb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ajpb implements DialogInterface.OnCancelListener {
    private final WifiScanningPrePConsentChimeraActivity a;

    public ajpb(WifiScanningPrePConsentChimeraActivity wifiScanningPrePConsentChimeraActivity) {
        this.a = wifiScanningPrePConsentChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        WifiScanningPrePConsentChimeraActivity wifiScanningPrePConsentChimeraActivity = this.a;
        if (!wifiScanningPrePConsentChimeraActivity.isFinishing()) {
            wifiScanningPrePConsentChimeraActivity.finish();
        }
    }
}
