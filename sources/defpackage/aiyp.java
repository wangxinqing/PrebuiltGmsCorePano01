package defpackage;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiScanner;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aiyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiyp implements WifiScanner.ScanListener {
    public final WifiScanner a;
    public final List b = new ArrayList();
    private final aixt c;
    private final boolean d;

    static {
        aiyp.class.getSimpleName();
    }

    public aiyp(WifiScanner wifiScanner, aixt aixt, boolean z) {
        this.a = wifiScanner;
        this.c = aixt;
        this.d = z;
    }

    public final void onFailure(int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37);
        sb.append("onFailure, c is ");
        sb.append(i);
        sb.append(" and s is ");
        sb.append(str);
        sb.toString();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new aixs[0]);
        this.c.a(arrayList, (aibv[]) null);
    }

    public final void onFullResult(ScanResult scanResult) {
        String valueOf = String.valueOf(scanResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("onFullResult: returned ");
        sb.append(valueOf);
        sb.toString();
        if (this.d && this.b.size() < 150) {
            this.b.add(scanResult);
        }
    }

    public final void onPeriodChanged(int i) {
        StringBuilder sb = new StringBuilder(35);
        sb.append("onPeriodChanged: new is ");
        sb.append(i);
        sb.toString();
    }

    public final void onResults(WifiScanner.ScanData[] scanDataArr) {
        aiyk aiyk = aiyk.g;
        StringBuilder sb = new StringBuilder(47);
        sb.append("onResults: returned array of length ");
        sb.append(r1);
        sb.toString();
        ArrayList arrayList = new ArrayList(r1);
        int i = 0;
        if (this.d) {
            aixs[] aixsArr = new aixs[this.b.size()];
            List list = this.b;
            int size = list.size();
            int i2 = 0;
            while (i < size) {
                aixsArr[i2] = aiyk.a((ScanResult) list.get(i));
                i++;
                i2++;
            }
            arrayList.add(aixsArr);
            this.b.clear();
        } else {
            for (WifiScanner.ScanData results : scanDataArr) {
                ScanResult[] results2 = results.getResults();
                int length = results2.length;
                aixs[] aixsArr2 = new aixs[length];
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("onResults: ScanResult is of length ");
                sb2.append(length);
                sb2.toString();
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    ScanResult scanResult = results2[i3];
                    int i5 = i4 + 1;
                    aixsArr2[i4] = aiyk.a(scanResult);
                    String valueOf = String.valueOf(scanResult);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 26);
                    sb3.append("  onResults, one entry is ");
                    sb3.append(valueOf);
                    sb3.toString();
                    i3++;
                    i4 = i5;
                }
                arrayList.add(aixsArr2);
            }
        }
        this.c.a(arrayList, (aibv[]) null);
    }

    public final void onSuccess() {
    }
}
