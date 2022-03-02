package defpackage;

import android.net.MacAddress;
import android.net.wifi.RttManager;
import android.net.wifi.rtt.RangingResult;
import android.net.wifi.rtt.RangingResultCallback;
import java.util.Iterator;
import java.util.List;

/* renamed from: aiyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiyd extends RangingResultCallback {
    private final RttManager.RttListener a;
    private final aicn b;

    public aiyd(RttManager.RttListener rttListener, aicn aicn) {
        this.a = rttListener;
        this.b = aicn;
    }

    private final void a(RttManager.RttResult[] rttResultArr) {
        this.a.onSuccess(rttResultArr);
    }

    public final void onRangingFailure(int i) {
        a(new RttManager.RttResult[0]);
    }

    public final void onRangingResults(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((RangingResult) it.next()).getStatus() == 0) {
                i++;
            }
        }
        RttManager.RttResult[] rttResultArr = new RttManager.RttResult[i];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            RangingResult rangingResult = (RangingResult) it2.next();
            if (rangingResult.getStatus() == 0) {
                MacAddress macAddress = rangingResult.getMacAddress();
                amrl.a((Object) macAddress);
                RttManager.RttResult rttResult = new RttManager.RttResult();
                rttResult.bssid = macAddress.toString();
                rttResult.measurementFrameNumber = rangingResult.getNumAttemptedMeasurements();
                rttResult.successMeasurementFrameNumber = rangingResult.getNumSuccessfulMeasurements();
                rttResult.distance = rangingResult.getDistanceMm() / 10;
                rttResult.distanceStandardDeviation = rangingResult.getDistanceStdDevMm() / 10;
                rttResult.rssi = rangingResult.getRssi();
                rttResult.status = rangingResult.getStatus();
                rttResult.measurementType = 2;
                aicn aicn = this.b;
                long j = 0;
                for (byte b2 : macAddress.toByteArray()) {
                    j = (j << 8) + ((long) (b2 & 255));
                }
                int i2 = rttResult.rssi;
                int i3 = rttResult.distance;
                int i4 = (i2 & 255) | (((rttResult.distanceStandardDeviation / 8) << 8) & 65280) | ((rttResult.successMeasurementFrameNumber << 16) & 16711680);
                aicm aicm = r15;
                aicm aicm2 = new aicm(aico.RTT_SCAN_ENTRY, aicn.b(), "a0=%2$d, a1=%3$d, a2=%4$d", (Object) null, (int) j, ((int) (j >>> 32)) | (i3 << 16), i4);
                aicn.a((aicl) aicm);
                rttResult.ts = rangingResult.getRangingTimestampMillis() * 1000;
                i--;
                rttResultArr[i] = rttResult;
            }
        }
        a(rttResultArr);
    }
}
