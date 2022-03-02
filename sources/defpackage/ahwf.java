package defpackage;

import android.content.Context;
import android.hardware.SensorEvent;
import android.net.wifi.RttManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ahwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ahwf extends ahuo {
    protected final Context a;
    protected final WifiManager b;
    protected final ahwc c;
    protected final ahyy d;
    final long e;
    protected final Runnable f = new ahwd(this);
    private WifiManager.WifiLock l;
    private int m = 0;

    public ahwf(Context context, ahsr ahsr, ahyy ahyy, ahss ahss, ajrh ajrh, long j, ahwc ahwc) {
        super(ahsr, ahss, ajrh);
        amrl.a((Object) context);
        this.a = context;
        this.d = ahyy;
        this.b = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.c = ahwc;
        this.e = j;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        WifiManager.WifiLock createWifiLock = this.b.createWifiLock(2, "WifiScanner");
        this.l = createWifiLock;
        createWifiLock.setReferenceCounted(false);
        this.l.acquire();
        d();
        f();
    }

    /* access modifiers changed from: protected */
    public final void b() {
        try {
            WifiManager.WifiLock wifiLock = this.l;
            if (wifiLock != null && wifiLock.isHeld()) {
                this.l.release();
            }
            e();
        } catch (IllegalArgumentException e2) {
        }
        ahss ahss = this.i;
        if (ahss != null) {
            ahss.g();
        }
    }

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public final void f() {
        this.h.removeCallbacks(this.f);
        c();
        ahss ahss = this.i;
        if (ahss != null) {
            int i = this.m;
            this.m = i + 1;
            ahss.a(i);
        }
        this.h.postDelayed(this.f, this.e + 2000);
    }

    /* access modifiers changed from: protected */
    public final void a(long j, List list, List list2) {
        synchronized (this) {
            if (list != null) {
                ahsr ahsr = this.h;
                amrl.a((Object) list);
                ahsr.post(new ahsj(ahsr, list, list2, j));
                a(ahup.WIFI, j, (SensorEvent) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(List list) {
        long j;
        int i;
        boolean z;
        RttManager rttManager;
        RttManager.RttCapabilities rttCapabilities;
        int i2;
        List<ScanResult> scanResults = list == null ? this.b.getScanResults() : list;
        int i3 = 0;
        if (scanResults != null) {
            Iterator it = scanResults.iterator();
            while (it.hasNext()) {
                if (((ScanResult) it.next()) == null) {
                    it.remove();
                }
            }
            this.d.a(scanResults);
            i = scanResults.size();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
            i = 0;
        }
        if (this.c != null) {
            Context context = this.a;
            ahwe ahwe = new ahwe(this, j, scanResults);
            if (!(scanResults == null || (rttManager = (RttManager) context.getSystemService("rttmanager")) == null || (rttCapabilities = rttManager.getRttCapabilities()) == null || !rttCapabilities.twoSided11McRttSupported)) {
                ArrayList arrayList = new ArrayList();
                for (ScanResult scanResult : scanResults) {
                    if (!scanResult.is80211mcResponder() || arrayList.size() == 10) {
                        i3 = 0;
                    } else {
                        RttManager.RttParams rttParams = new RttManager.RttParams();
                        rttParams.deviceType = 1;
                        rttParams.requestType = 2;
                        rttParams.bssid = scanResult.BSSID;
                        rttParams.frequency = scanResult.frequency;
                        rttParams.numSamplesPerBurst = 5;
                        rttParams.numRetriesPerFTMR = i3;
                        rttParams.channelWidth = scanResult.channelWidth;
                        rttParams.centerFreq0 = scanResult.centerFreq0;
                        rttParams.centerFreq1 = scanResult.centerFreq1;
                        int i4 = scanResult.channelWidth;
                        if ((rttCapabilities.preambleSupported & 4) == 0) {
                            i2 = 2;
                        } else {
                            i2 = i4 < 2 ? 2 : 4;
                        }
                        rttParams.preamble = i2;
                        int i5 = scanResult.channelWidth;
                        int i6 = rttCapabilities.bwSupported;
                        rttParams.bandwidth = ((i6 & 16) != 0 && i5 >= 2) ? 16 : ((i6 & 8) != 0 && i5 > 0) ? 8 : (i6 & 4) == 0 ? 0 : i5 < 0 ? 0 : 4;
                        if (rttParams.bandwidth != 0) {
                            arrayList.add(rttParams);
                            i3 = 0;
                        } else {
                            i3 = 0;
                        }
                    }
                }
                RttManager.RttParams[] rttParamsArr = (RttManager.RttParams[]) arrayList.toArray(new RttManager.RttParams[arrayList.size()]);
                if (rttParamsArr.length != 0) {
                    rttManager.startRanging(rttParamsArr, new ahwa(ahwe));
                    return;
                }
            }
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        a(z);
        a(j, scanResults, (List) null);
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        this.h.removeCallbacks(this.f);
        long j = this.e;
        if (!z) {
            j = Math.max(5000, j);
        }
        this.h.postDelayed(this.f, j);
    }
}
