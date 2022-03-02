package defpackage;

import android.content.Context;
import android.net.wifi.RttManager;
import android.net.wifi.WifiScanner;
import android.os.WorkSource;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: aiya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aiya extends aixz {
    static final int a(int i, int i2) {
        if ((i2 & 16) != 0 && i >= 2) {
            return 16;
        }
        if ((i2 & 8) != 0 && i > 0) {
            return 8;
        }
        return ((i2 & 4) == 0 || i < 0) ? 0 : 4;
    }

    static final int b(int i, int i2) {
        return ((i2 & 4) == 0 || i < 2) ? 2 : 4;
    }

    public final aibv a(RttManager.RttResult rttResult) {
        aibv aibv = new aibv();
        aibv.a = arvy.a(rttResult.bssid);
        aibv.e = rttResult.distance;
        aibv.f = rttResult.distanceStandardDeviation;
        if (rttResult.rssi > 10) {
            aibv.d = -(rttResult.rssi / 2);
        } else {
            aibv.d = rttResult.rssi;
        }
        int i = rttResult.rssi;
        int i2 = aibv.d;
        StringBuilder sb = new StringBuilder(60);
        sb.append("wifi rtt rssi is ");
        sb.append(i);
        sb.append(", generated value is ");
        sb.append(i2);
        sb.toString();
        aibv.b = rttResult.status;
        aibv.c = rttResult.ts;
        aibv.g = rttResult.measurementType;
        aibv.h = rttResult.measurementFrameNumber;
        aibv.i = rttResult.successMeasurementFrameNumber;
        return aibv;
    }

    public final ajao a(ajbg ajbg, arnf arnf, Context context) {
        return new aiwy(ajbg, arnf, context);
    }

    public final void a(Context context, aixt aixt, boolean z, aizx aizx, boolean z2, aicn aicn, Executor executor) {
        WifiScanner wifiScanner = (WifiScanner) context.getSystemService("wifiscanner");
        if (wifiScanner == null) {
            super.a(context, aixt, z, aizx, true, aicn, executor);
            return;
        }
        WifiScanner.ScanSettings a = a(true, 10000, 0, z);
        aiyp aiyp = new aiyp(wifiScanner, aixt, true);
        if (aizx instanceof ajrb) {
            WorkSource workSource = ((ajrc) aizx).a;
            if (workSource == null) {
                wifiScanner.startScan(a, aiyp);
            } else {
                wifiScanner.startScan(a, aiyp, workSource);
            }
        } else {
            wifiScanner.startScan(a, aiyp);
        }
    }

    public void a(Context context, aibp[] aibpArr, RttManager.RttListener rttListener, aicn aicn, Executor executor) {
        String a;
        RttManager rttManager = (RttManager) context.getSystemService("rttmanager");
        RttManager.RttCapabilities rttCapabilities = rttManager.getRttCapabilities();
        if (rttCapabilities != null && rttCapabilities.twoSided11McRttSupported) {
            ArrayList arrayList = new ArrayList();
            for (aibp aibp : aibpArr) {
                if (arrayList.size() < 10 && (a = arvy.a(aibp.e)) != null) {
                    RttManager.RttParams rttParams = new RttManager.RttParams();
                    rttParams.deviceType = 1;
                    rttParams.requestType = 2;
                    rttParams.bssid = a;
                    rttParams.frequency = aibp.h;
                    rttParams.numSamplesPerBurst = 8;
                    rttParams.numRetriesPerFTMR = 2;
                    rttParams.channelWidth = aibp.a;
                    rttParams.centerFreq0 = aibp.c;
                    rttParams.centerFreq1 = aibp.d;
                    rttParams.preamble = b(aibp.a, rttCapabilities.preambleSupported);
                    rttParams.bandwidth = a(aibp.a, rttCapabilities.bwSupported);
                    arrayList.add(rttParams);
                }
            }
            if (!arrayList.isEmpty()) {
                try {
                    rttManager.startRanging((RttManager.RttParams[]) arrayList.toArray(new RttManager.RttParams[arrayList.size()]), rttListener);
                } catch (IllegalArgumentException | IllegalStateException e) {
                }
            }
        }
    }

    public void a(TelephonyManager telephonyManager, int i, long j, aivo aivo, aizx aizx, Executor executor) {
        aiaj aiaj;
        try {
            aiaj = a((List) telephonyManager.getAllCellInfo(), j, aiaj.a);
        } catch (IllegalArgumentException e) {
            aiaj = null;
        }
        if (aiaj != null) {
            aivo.a(new aiaj[]{aiaj});
            return;
        }
        aivo.a(new aiaj[0]);
    }

    public boolean a(Context context) {
        return ((RttManager) context.getSystemService("rttmanager")) != null;
    }

    public boolean a(Context context, List list, RttManager.RttListener rttListener, aicn aicn, Executor executor) {
        RttManager.RttCapabilities rttCapabilities;
        int i;
        String a;
        RttManager rttManager = (RttManager) context.getSystemService("rttmanager");
        if (!(rttManager == null || (rttCapabilities = rttManager.getRttCapabilities()) == null || !rttCapabilities.twoSided11McRttSupported)) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                aixs[] aixsArr = (aixs[]) list.get(i2);
                int length = aixsArr.length;
                int i3 = 0;
                while (true) {
                    i = i2 + 1;
                    if (i3 >= length) {
                        break;
                    }
                    aixs aixs = aixsArr[i3];
                    if (aixs.f && !agxx.a(aixs.b, amrk.b(aixs.c)) && arrayList.size() < 10 && (a = arvy.a(aixs.b)) != null) {
                        RttManager.RttParams rttParams = new RttManager.RttParams();
                        rttParams.deviceType = 1;
                        rttParams.requestType = 2;
                        rttParams.bssid = a;
                        rttParams.frequency = aixs.g;
                        rttParams.numSamplesPerBurst = 8;
                        rttParams.numRetriesPerFTMR = 2;
                        rttParams.channelWidth = aixs.e;
                        rttParams.centerFreq0 = aixs.i;
                        rttParams.centerFreq1 = aixs.j;
                        rttParams.preamble = b(aixs.e, rttCapabilities.preambleSupported);
                        rttParams.bandwidth = a(aixs.e, rttCapabilities.bwSupported);
                        arrayList.add(rttParams);
                    }
                    i3++;
                }
                i2 = i;
            }
            if (!arrayList.isEmpty()) {
                try {
                    rttManager.startRanging((RttManager.RttParams[]) arrayList.toArray(new RttManager.RttParams[arrayList.size()]), rttListener);
                    return true;
                } catch (IllegalArgumentException | IllegalStateException e) {
                }
            }
        }
        return false;
    }
}
