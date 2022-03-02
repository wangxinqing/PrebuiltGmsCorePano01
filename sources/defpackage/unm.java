package defpackage;

import android.net.wifi.WifiManager;
import java.util.Locale;

/* renamed from: unm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class unm extends WifiManager.LocalOnlyHotspotCallback {
    final /* synthetic */ aosh a;
    final /* synthetic */ uoh b;

    public unm(uoh uoh, aosh aosh) {
        this.b = uoh;
        this.a = aosh;
    }

    public final void onFailed(int i) {
        String str;
        aosh aosh = this.a;
        Object[] objArr = new Object[1];
        if (i != 1) {
            str = i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "ERROR_TETHERING_DISALLOWED" : "ERROR_INCOMPATIBLE_MODE" : "ERROR_GENERIC";
        } else {
            str = "ERROR_NO_CHANNEL";
        }
        objArr[0] = String.format(Locale.ENGLISH, "[%d]%s", new Object[]{Integer.valueOf(i), str});
        aosh.a((Throwable) new RuntimeException(String.format("Failed to start local only hotspot: %s.", objArr)));
    }

    public final void onStarted(WifiManager.LocalOnlyHotspotReservation localOnlyHotspotReservation) {
        this.a.b((Object) localOnlyHotspotReservation);
    }

    public final void onStopped() {
        ((anih) ((anih) ulh.a.b()).a("unm", "onStopped", 540, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Local only hotspot was stopped manually by the user.");
        this.b.e();
    }
}
