package com.google.android.location.reporting.service;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
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

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationReportingController$WifiStatusReceiver extends nla {
    public boolean a = false;
    boolean b = false;
    final /* synthetic */ ajlm c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationReportingController$WifiStatusReceiver(ajlm ajlm) {
        super("location");
        this.c = ajlm;
    }

    private final void a(long j, String str) {
        String str2 = str;
        if (aztb.a.a().bD()) {
            ApiWifiConnectivityStatus apiWifiConnectivityStatus = new ApiWifiConnectivityStatus(Long.valueOf(j), str2);
            jiq jiq = this.c.a;
            ApiMetadata apiMetadata = r3;
            ApiMetadata apiMetadata2 = new ApiMetadata((ApiActivationChange) null, (ApiBleScanReport) null, (ApiDeviceConnectivitySetting) null, (ApiInternalState) null, (LocationHistorianBatchData) null, (ApiLocationStatus) null, (ApiPlaceInferenceResult) null, (ApiPlaceReport) null, (ApiRate) null, (ApiStepCountsEntry) null, Long.valueOf(System.currentTimeMillis()), apiWifiConnectivityStatus, (ArrayList) null);
            this.c.b.a(this.c.c.a().b(), apiMetadata, "ApiWifiConnectivityStatus");
            StringBuilder sb = new StringBuilder(str.length() + 53);
            sb.append("Logging wifi event, mac=");
            sb.append(j);
            sb.append(", status=");
            sb.append(str2);
            sb.toString();
        }
    }

    private final void a(boolean z) {
        if (aztb.a.a().aB()) {
            ajlm ajlm = this.c;
            if (ajlm.g == null) {
                return;
            }
            if (!z) {
                ajlm.j.a(8);
            } else {
                ajlm.j.a(7);
            }
        }
    }

    public final void a(Context context, Intent intent) {
        NetworkInfo networkInfo;
        long j;
        if (!aztb.s() && "android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            WifiInfo wifiInfo = null;
            if (extras == null || !extras.containsKey("networkInfo") || (networkInfo = (NetworkInfo) extras.get("networkInfo")) == null) {
                networkInfo = null;
            }
            boolean isConnected = networkInfo.isConnected();
            if (!this.a && isConnected) {
                boolean z = true;
                a(true);
                if (aztb.a.a().aC()) {
                    if (!aztb.a.a().aI()) {
                        ajme.c(context);
                    } else {
                        ajnw.a(context, ajme.a(context, "com.google.android.location.reporting.WIFI_TRIGGERED_FLUSH_AND_UPLOAD"));
                    }
                }
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (wifiManager != null) {
                    wifiInfo = wifiManager.getConnectionInfo();
                }
                if (wifiInfo != null) {
                    String bssid = wifiInfo.getBSSID();
                    try {
                        if (agxx.a(bssid, wifiInfo.getSSID())) {
                            z = false;
                        }
                    } catch (RuntimeException e) {
                        z = false;
                    }
                    this.b = z;
                    if (z) {
                        if (bssid != null) {
                            j = arvy.a(bssid);
                        } else {
                            j = -1;
                        }
                        a(j, "CONNECTED");
                    }
                }
            }
            if (this.a && !isConnected) {
                a(false);
                if (this.b) {
                    a(-1, "DISCONNECTED");
                }
            }
            this.a = isConnected;
        }
    }
}
