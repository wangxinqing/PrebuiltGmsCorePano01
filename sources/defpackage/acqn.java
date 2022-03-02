package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Handler;
import com.google.android.gms.smartdevice.utils.wifi.WifiDiscoveryManager$WifiScanResultsReceiver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: acqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acqn {
    public final Handler a = new qvr();
    public final Runnable b = new acql(this);
    public final WifiManager c;
    private final Context d;
    private final Pattern e;
    private final acqm f;
    private BroadcastReceiver g;
    private final Set h = new HashSet();

    public acqn(Context context, Pattern pattern, acqm acqm) {
        WifiManager a2 = acqo.a(context);
        iva.a((Object) context);
        this.d = context;
        iva.a((Object) pattern);
        this.e = pattern;
        iva.a((Object) acqm);
        this.f = acqm;
        iva.a((Object) a2);
        this.c = a2;
    }

    public final synchronized void a() {
        if (!c()) {
            a(this.c.getScanResults());
            WifiDiscoveryManager$WifiScanResultsReceiver wifiDiscoveryManager$WifiScanResultsReceiver = new WifiDiscoveryManager$WifiScanResultsReceiver(this);
            this.g = wifiDiscoveryManager$WifiScanResultsReceiver;
            this.d.registerReceiver(wifiDiscoveryManager$WifiScanResultsReceiver, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
            this.a.post(this.b);
        }
    }

    public final synchronized void b() {
        if (c()) {
            BroadcastReceiver broadcastReceiver = this.g;
            if (broadcastReceiver != null) {
                this.d.unregisterReceiver(broadcastReceiver);
                this.g = null;
            }
            this.a.removeCallbacksAndMessages(this.b);
            this.h.clear();
        }
    }

    public final synchronized boolean c() {
        return this.g != null;
    }

    public final synchronized void a(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ScanResult scanResult = (ScanResult) it.next();
                if (this.e.matcher(scanResult.SSID).matches()) {
                    hashMap.put(scanResult.SSID, scanResult);
                }
            }
        }
        Set<String> b2 = iko.b(hashMap.keySet(), this.h);
        Set<String> b3 = iko.b(hashMap.keySet(), b2);
        Set<String> b4 = iko.b(this.h, hashMap.keySet());
        if (!b2.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (String str : b2) {
                ScanResult scanResult2 = (ScanResult) hashMap.get(str);
                if (scanResult2 != null) {
                    hashSet.add(scanResult2);
                }
            }
            this.f.a(hashSet);
        }
        if (!b3.isEmpty()) {
            HashSet hashSet2 = new HashSet();
            for (String str2 : b3) {
                ScanResult scanResult3 = (ScanResult) hashMap.get(str2);
                if (scanResult3 != null) {
                    hashSet2.add(scanResult3);
                }
            }
            ((acnt) this.f).a((Set) hashSet2);
        }
        if (!b4.isEmpty()) {
            acqm acqm = this.f;
            synchronized (((acnt) acqm).d) {
                for (String str3 : b4) {
                    ackb ackb = ((acnt) acqm).b;
                    synchronized (ackb.a) {
                        ackb.b.remove(str3);
                    }
                }
            }
            ((acnt) acqm).b.notifyDataSetChanged();
        }
        this.h.addAll(b2);
        this.h.removeAll(b4);
    }
}
