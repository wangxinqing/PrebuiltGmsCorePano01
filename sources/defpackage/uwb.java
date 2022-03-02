package defpackage;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: uwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uwb extends jfx {
    final /* synthetic */ long a;
    final /* synthetic */ WifiP2pManager.Channel e;
    final /* synthetic */ String f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uwb(int i, long j, WifiP2pManager.Channel channel, String str) {
        super(i);
        this.a = j;
        this.e = channel;
        this.f = str;
    }

    public final void run() {
        WifiP2pManager.Channel channel;
        try {
            Thread.sleep(this.a);
            channel = this.e;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            channel = this.e;
        } catch (Throwable th) {
            this.e.close();
            ((anih) ((anih) ulh.a.d()).a("uwb", "run", 165, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Closed channel %s", (Object) this.f);
            throw th;
        }
        channel.close();
        ((anih) ((anih) ulh.a.d()).a("uwb", "run", 165, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Closed channel %s", (Object) this.f);
    }
}
