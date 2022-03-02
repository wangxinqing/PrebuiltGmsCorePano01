package defpackage;

import com.google.android.gms.common.stats.radio.NetworkLatencyContract;
import com.google.android.gms.location.LocationAvailability;
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
import com.google.android.ulr.BleSensorData;
import com.google.android.ulr.BleStrengthProto;
import com.google.android.ulr.LocationHistorianBatchData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ajnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnz {
    public static ApiLocationStatus a(LocationAvailability locationAvailability) {
        return new ApiLocationStatus(a(locationAvailability.a), false, a(locationAvailability.b));
    }

    public static String a(int i) {
        switch (i) {
            case 0:
                return NetworkLatencyContract.NetworkLatencyColumns.SUCCESSFUL;
            case 1:
                return "unknown";
            case 2:
                return "timedOutOnScan";
            case 3:
                return "noInfoInDatabase";
            case 4:
                return "invalidScan";
            case 5:
                return "unableToQueryDatabase";
            case 6:
                return "scansDisabledInSettings";
            case 7:
                return "locationDisabledInSettings";
            case 8:
                return "inProgress";
            default:
                return "indeterminate";
        }
    }

    public static ApiMetadata b(boolean z, long j) {
        return new ApiMetadata((ApiActivationChange) null, (ApiBleScanReport) null, new ApiDeviceConnectivitySetting(Boolean.valueOf(z), (Boolean) null, (Boolean) null), (ApiInternalState) null, (LocationHistorianBatchData) null, (ApiLocationStatus) null, (ApiPlaceInferenceResult) null, (ApiPlaceReport) null, (ApiRate) null, (ApiStepCountsEntry) null, Long.valueOf(j), (ApiWifiConnectivityStatus) null, (ArrayList) null);
    }

    public static ApiMetadata a(ApiBleScanReport apiBleScanReport, long j) {
        return new ApiMetadata((ApiActivationChange) null, apiBleScanReport, (ApiDeviceConnectivitySetting) null, (ApiInternalState) null, (LocationHistorianBatchData) null, (ApiLocationStatus) null, (ApiPlaceInferenceResult) null, (ApiPlaceReport) null, (ApiRate) null, (ApiStepCountsEntry) null, Long.valueOf(j), (ApiWifiConnectivityStatus) null, (ArrayList) null);
    }

    public static ApiMetadata a(ApiRate apiRate) {
        iva.a((Object) apiRate);
        return new ApiMetadata((ApiActivationChange) null, (ApiBleScanReport) null, (ApiDeviceConnectivitySetting) null, (ApiInternalState) null, (LocationHistorianBatchData) null, (ApiLocationStatus) null, (ApiPlaceInferenceResult) null, (ApiPlaceReport) null, apiRate, (ApiStepCountsEntry) null, apiRate.g(), (ApiWifiConnectivityStatus) null, (ArrayList) null);
    }

    public static ApiMetadata a(boolean z, long j) {
        return new ApiMetadata((ApiActivationChange) null, (ApiBleScanReport) null, new ApiDeviceConnectivitySetting((Boolean) null, (Boolean) null, Boolean.valueOf(z)), (ApiInternalState) null, (LocationHistorianBatchData) null, (ApiLocationStatus) null, (ApiPlaceInferenceResult) null, (ApiPlaceReport) null, (ApiRate) null, (ApiStepCountsEntry) null, Long.valueOf(j), (ApiWifiConnectivityStatus) null, (ArrayList) null);
    }

    public static List a(List list) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ajml ajml = (ajml) it.next();
                ArrayList arrayList3 = null;
                if (ajml.f == null) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new BleStrengthProto(ajml.a, ajml.b, ajml.c, ajml.d, ajob.a(ajml.e)));
                    arrayList3 = arrayList4;
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    arrayList.add(new BleSensorData(ajml.f, ajml.b, ajob.a(ajml.e)));
                }
                arrayList2.add(a(new ApiBleScanReport(arrayList3, arrayList), ajml.g.longValue()));
            }
        }
        return arrayList2;
    }
}
