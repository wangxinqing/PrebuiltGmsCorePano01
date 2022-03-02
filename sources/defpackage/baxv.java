package defpackage;

import java.util.List;
import org.webrtc.NetworkMonitor;
import org.webrtc.NetworkMonitorAutoDetect$NetworkInformation;

/* renamed from: baxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baxv {
    final /* synthetic */ NetworkMonitor a;

    public baxv(NetworkMonitor networkMonitor) {
        this.a = networkMonitor;
    }

    public final void a(long j) {
        NetworkMonitor networkMonitor = this.a;
        List a2 = networkMonitor.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            networkMonitor.nativeNotifyOfNetworkDisconnect(((Long) a2.get(i)).longValue(), j);
        }
    }

    public final void a(NetworkMonitorAutoDetect$NetworkInformation networkMonitorAutoDetect$NetworkInformation) {
        NetworkMonitor networkMonitor = this.a;
        List a2 = networkMonitor.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            networkMonitor.nativeNotifyOfNetworkConnect(((Long) a2.get(i)).longValue(), networkMonitorAutoDetect$NetworkInformation);
        }
    }
}
