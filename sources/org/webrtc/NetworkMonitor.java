package org.webrtc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkMonitor {
    public volatile NetworkMonitorAutoDetect$ConnectionType a = NetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN;
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private final Object d = new Object();
    private baye e;
    private int f = 0;

    private static int androidSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    public static NetworkMonitor getInstance() {
        return baxw.a;
    }

    private native void nativeNotifyConnectionTypeChanged(long j);

    private native void nativeNotifyOfActiveNetworkList(long j, NetworkMonitorAutoDetect$NetworkInformation[] networkMonitorAutoDetect$NetworkInformationArr);

    private boolean networkBindingSupported() {
        boolean z;
        synchronized (this.d) {
            baye baye = this.e;
            z = false;
            if (baye != null && baye.d.b()) {
                z = true;
            }
        }
        return z;
    }

    private void startMonitoring(Context context, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List list;
        Network[] networkArr;
        StringBuilder sb = new StringBuilder(58);
        sb.append("Start monitoring with native observer ");
        sb.append(j);
        Logging.a("NetworkMonitor", sb.toString());
        if (context == null) {
            context = ContextUtils.getApplicationContext();
        }
        synchronized (this.d) {
            this.f++;
            if (this.e == null) {
                this.e = new baye(new baxv(this), context);
            }
            this.a = baye.a(this.e.a());
        }
        synchronized (this.b) {
            this.b.add(Long.valueOf(j));
        }
        synchronized (this.d) {
            baye baye = this.e;
            arrayList = null;
            if (baye != null) {
                baxy baxy = baye.d;
                if (baxy.b()) {
                    arrayList2 = new ArrayList();
                    ConnectivityManager connectivityManager = baxy.a;
                    if (connectivityManager != null) {
                        networkArr = connectivityManager.getAllNetworks();
                    } else {
                        networkArr = new Network[0];
                    }
                    for (Network a2 : networkArr) {
                        NetworkMonitorAutoDetect$NetworkInformation a3 = baxy.a(a2);
                        if (a3 != null) {
                            arrayList2.add(a3);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    arrayList = new ArrayList(arrayList2);
                    bayc bayc = baye.e;
                    if (bayc != null) {
                        NetworkMonitorAutoDetect$NetworkInformation networkMonitorAutoDetect$NetworkInformation = bayc.b;
                        if (networkMonitorAutoDetect$NetworkInformation != null) {
                            list = Collections.singletonList(networkMonitorAutoDetect$NetworkInformation);
                        } else {
                            list = Collections.emptyList();
                        }
                        arrayList.addAll(list);
                    }
                }
            }
        }
        if (!(arrayList == null || arrayList.size() == 0)) {
            nativeNotifyOfActiveNetworkList(j, (NetworkMonitorAutoDetect$NetworkInformation[]) arrayList.toArray(new NetworkMonitorAutoDetect$NetworkInformation[arrayList.size()]));
        }
        b();
    }

    private void stopMonitoring(long j) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("Stop monitoring with native observer ");
        sb.append(j);
        Logging.a("NetworkMonitor", sb.toString());
        synchronized (this.d) {
            int i = this.f - 1;
            this.f = i;
            if (i == 0) {
                baye baye = this.e;
                ConnectivityManager.NetworkCallback networkCallback = baye.c;
                if (networkCallback != null) {
                    baye.d.a(networkCallback);
                }
                ConnectivityManager.NetworkCallback networkCallback2 = baye.b;
                if (networkCallback2 != null) {
                    baye.d.a(networkCallback2);
                }
                bayc bayc = baye.e;
                if (bayc != null) {
                    bayc.a.unregisterReceiver(bayc);
                }
                if (baye.f) {
                    baye.f = false;
                    baye.a.unregisterReceiver(baye);
                }
                this.e = null;
            }
        }
        synchronized (this.b) {
            this.b.remove(Long.valueOf(j));
        }
    }

    public final List a() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
        }
        return arrayList;
    }

    public final void b() {
        ArrayList arrayList;
        List a2 = a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            nativeNotifyConnectionTypeChanged(((Long) a2.get(i)).longValue());
        }
        synchronized (this.c) {
            arrayList = new ArrayList(this.c);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((baxx) arrayList.get(i2)).a();
        }
    }

    public native void nativeNotifyOfNetworkConnect(long j, NetworkMonitorAutoDetect$NetworkInformation networkMonitorAutoDetect$NetworkInformation);

    public native void nativeNotifyOfNetworkDisconnect(long j, long j2);
}
