package defpackage;

import android.util.Log;

/* renamed from: ajpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ajpc implements acvp {
    public static final acvp a = new ajpc();

    private ajpc() {
    }

    public final void a(acwa acwa) {
        if (!acwa.b() && Log.isLoggable("WifiScanningPrePConsent", 6)) {
            Log.e("WifiScanningPrePConsent", "Exception writing audit record", acwa.e());
        }
    }
}
