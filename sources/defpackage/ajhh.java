package defpackage;

import android.net.wifi.WifiManager;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.ulr.ApiActivationChange;
import com.google.android.ulr.ApiBleScanReport;
import com.google.android.ulr.ApiDeviceConnectivitySetting;
import com.google.android.ulr.ApiInternalState;
import com.google.android.ulr.ApiLocationStatus;
import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiPlaceInferenceResult;
import com.google.android.ulr.ApiPlaceReport;
import com.google.android.ulr.ApiRate;
import com.google.android.ulr.ApiStepCountsEntry;
import com.google.android.ulr.ApiWifiConnectivityStatus;
import com.google.android.ulr.LocationHistorianBatchData;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: ajhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajhh {
    public final ajmn a;
    public final ajin b;
    public final ajnn c;
    public final ajlm d;
    public final WifiManager e;

    public ajhh(ajmn ajmn, ajin ajin, ajnn ajnn, ajlm ajlm, WifiManager wifiManager) {
        this.a = ajmn;
        this.b = ajin;
        this.c = ajnn;
        this.d = ajlm;
        this.e = wifiManager;
    }

    public static long a(ajmn ajmn) {
        if (ajmn.h) {
            return aztb.a.a().aY();
        }
        return aztb.C();
    }

    public static void a(ReportingConfig reportingConfig, ajlm ajlm) {
        String valueOf = String.valueOf(reportingConfig.e());
        if (valueOf.length() == 0) {
            new String("Location reporting no longer active, stopping; reasons: ");
        } else {
            "Location reporting no longer active, stopping; reasons: ".concat(valueOf);
        }
        ajlm.a(reportingConfig, "LocationReceiver.handleInactive");
    }

    public static final boolean a(long j, long j2, long j3) {
        return j3 - j2 < TimeUnit.MILLISECONDS.toNanos(j);
    }

    public final boolean a(long j) {
        ApiRate k = this.a.k();
        if (k == null || System.currentTimeMillis() - k.g().longValue() >= j) {
            return false;
        }
        return true;
    }

    public final boolean a(NetworkLocationStatus networkLocationStatus, ReportingConfig reportingConfig, boolean z) {
        NetworkLocationStatus networkLocationStatus2 = networkLocationStatus;
        NetworkLocationStatus j = this.a.j();
        if (!z && j != null) {
            long C = aztb.C();
            if (!a(C) && a(C, j.d, networkLocationStatus2.d)) {
                String valueOf = String.valueOf(j);
                long j2 = j.c;
                String valueOf2 = String.valueOf(networkLocationStatus);
                long j3 = networkLocationStatus2.c;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 123 + String.valueOf(valueOf2).length());
                sb.append("Received location statuses too frequently: [");
                sb.append(valueOf);
                sb.append(", timeStamp(ms): ");
                sb.append(j2);
                sb.append("], [");
                sb.append(valueOf2);
                sb.append(", timeStamp(ms): ");
                sb.append(j3);
                sb.append("]");
                ajix.b("GCoreUlr", sb.toString());
                return false;
            }
        }
        NetworkLocationStatus j4 = this.a.j();
        if (j4 != null && networkLocationStatus2.b == j4.b && networkLocationStatus2.a == j4.a) {
            String valueOf3 = String.valueOf(networkLocationStatus);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 37);
            sb2.append("skip locationStatus:");
            sb2.append(valueOf3);
            sb2.append(" due to duplicate");
            sb2.toString();
            return false;
        }
        this.a.a(networkLocationStatus2);
        ApiMetadata apiMetadata = new ApiMetadata((ApiActivationChange) null, (ApiBleScanReport) null, (ApiDeviceConnectivitySetting) null, (ApiInternalState) null, (LocationHistorianBatchData) null, new ApiLocationStatus(ajnz.a(networkLocationStatus2.b), true, ajnz.a(networkLocationStatus2.a)), (ApiPlaceInferenceResult) null, (ApiPlaceReport) null, (ApiRate) null, (ApiStepCountsEntry) null, Long.valueOf(networkLocationStatus2.c), (ApiWifiConnectivityStatus) null, (ArrayList) null);
        String valueOf4 = String.valueOf(networkLocationStatus);
        String a2 = rmp.a((Iterable) reportingConfig.b());
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 31 + String.valueOf(a2).length());
        sb3.append("Storing location status '");
        sb3.append(valueOf4);
        sb3.append("' for ");
        sb3.append(a2);
        sb3.toString();
        this.b.a(reportingConfig.b(), apiMetadata, "location status");
        return true;
    }
}
