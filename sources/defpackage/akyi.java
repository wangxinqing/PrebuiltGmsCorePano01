package defpackage;

import android.location.Location;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: akyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akyi extends reh {
    final /* synthetic */ akyn a;

    public akyi(akyn akyn) {
        this.a = akyn;
    }

    public final void a(LocationAvailability locationAvailability) {
        boolean a2 = locationAvailability.a();
    }

    public final void a(LocationResult locationResult) {
        akoh akoh;
        ActivityRecognitionResult activityRecognitionResult;
        akoh akoh2;
        ScanResult[] scanResultArr;
        this.a.o++;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        akyn akyn = this.a;
        if ((!akyn.t || elapsedRealtime - akyn.v > akyn.u) && locationResult.a() != null) {
            akyn akyn2 = this.a;
            akyn2.t = true;
            akyn2.v = elapsedRealtime;
            akyn2.p++;
            Location a2 = locationResult.a();
            akxz akxz = this.a.h;
            List<ScanResult> scanResults = akxz.a.getScanResults();
            if (scanResults != null) {
                ScanResult[] scanResultArr2 = (ScanResult[]) scanResults.toArray(new ScanResult[scanResults.size()]);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (akxz.b.b.a(elapsedRealtime2, scanResultArr2)) {
                    int length = scanResultArr2.length;
                    HashSet hashSet = new HashSet(length);
                    ArrayList arrayList = new ArrayList(length);
                    long j = Long.MIN_VALUE;
                    int i = 0;
                    while (i < length) {
                        ScanResult scanResult = scanResultArr2[i];
                        if (scanResult != null) {
                            long a3 = akuw.a(scanResult.BSSID);
                            if (akuw.a(a3, scanResult)) {
                                scanResultArr = scanResultArr2;
                                long j2 = scanResult.timestamp / 1000;
                                j = Math.max(j2, j);
                                if (elapsedRealtime2 - j2 <= akuw.a && hashSet.add(Long.valueOf(a3))) {
                                    arrayList.add(akuw.a(scanResult, a3, j2));
                                }
                                i++;
                                scanResultArr2 = scanResultArr;
                            }
                        }
                        scanResultArr = scanResultArr2;
                        i++;
                        scanResultArr2 = scanResultArr;
                    }
                    akoh2 = new akoh(j, arrayList);
                } else {
                    ScanResult[] scanResultArr3 = scanResultArr2;
                    ArrayList arrayList2 = new ArrayList(r3);
                    HashSet hashSet2 = new HashSet();
                    for (ScanResult scanResult2 : scanResultArr2) {
                        if (scanResult2 != null) {
                            long a4 = akuw.a(scanResult2.BSSID);
                            if (akuw.a(a4, scanResult2) && hashSet2.add(Long.valueOf(a4))) {
                                arrayList2.add(akuw.a(scanResult2, a4, elapsedRealtime2));
                            }
                        }
                    }
                    akoh2 = new akoh(elapsedRealtime2, arrayList2);
                }
                if (Log.isLoggable("Places", 4)) {
                    int a5 = akoh2.a();
                    int length2 = scanResultArr2.length;
                    StringBuilder sb = new StringBuilder(51);
                    sb.append("Converted ");
                    sb.append(a5);
                    sb.append(" out of ");
                    sb.append(length2);
                    sb.append(" WiFi scans");
                    Log.i("Places", sb.toString());
                }
                akoh = akoh2;
            } else {
                akoh = null;
            }
            WifiInfo connectionInfo = this.a.h.a.getConnectionInfo();
            boolean z = connectionInfo != null ? !"<unknown ssid>".equals(connectionInfo.getSSID()) : false;
            akxr akxr = this.a.i;
            if (akxr.a.i()) {
                rgu a6 = rcd.a(akxr.a);
                try {
                    a6.w();
                    activityRecognitionResult = ((rgk) a6.x()).a(a6.c.getPackageName());
                } catch (Exception e) {
                    activityRecognitionResult = null;
                }
                if (activityRecognitionResult != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (DetectedActivity detectedActivity : activityRecognitionResult.a) {
                        arrayList3.add(new aklm(detectedActivity.a(), ((float) detectedActivity.e) / 100.0f));
                    }
                    akxr.b = new aklh(arrayList3, activityRecognitionResult.b);
                }
            }
            aklh aklh = akxr.b;
            akyn akyn3 = this.a;
            if (akyn.c()) {
                List list = akyn3.e;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((akyl) list.get(i2)).a(a2, akoh, z, aklh);
                }
            }
        }
    }
}
