package defpackage;

import android.content.IntentFilter;
import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider$4;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* renamed from: wfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfw implements Runnable {
    private final wgu a;
    private final vsh b;
    private final wbt c;

    public wfw(wgu wgu, vsh vsh, wbt wbt) {
        this.a = wgu;
        this.b = vsh;
        this.c = wbt;
    }

    public final void run() {
        int i;
        wgu wgu = this.a;
        vsh vsh = this.b;
        wbt wbt = this.c;
        wgu.g();
        wgu.q.b = new wfn(wgu);
        wgu.j();
        wgu.m();
        int a2 = wgu.g.a((wdl) wgu);
        int i2 = 3;
        if (a2 != 0) {
            ((anih) ((anih) vvj.a.c()).a("wgu", "b", 952, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to discover over Nearby Connections: %s", (Object) tit.g(a2));
            i = 3;
        } else {
            wgu.a.clear();
            wgu.z = new NearbySharingProvider$4(wgu, "nearby");
            thp.a(wgu.f, wgu.z, new IntentFilter("com.google.android.gms.nearby.sharing.CERTIFICATES_DOWNLOAD"));
            wgu.h = vsh;
            wgu.k = wbt.a;
            ScheduledFuture scheduledFuture = wgu.y;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            wgu.q.b();
            List a3 = wgu.q.a();
            int size = a3.size();
            for (int i3 = 0; i3 < size; i3++) {
                wct wct = (wct) a3.get(i3);
                wgu.a(wct.a, wct.b, false);
                jjg jjg = vvj.a;
                String str = wct.a;
            }
            wgu.w = SystemClock.uptimeMillis();
            ((anih) ((anih) vvj.a.d()).a("wgu", "b", 949, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully started discovery over Nearby Connections");
            i = 2;
        }
        wgu.o.a = vva.a();
        long a4 = (long) vva.a();
        wgu.r = a4;
        vva vva = wgu.o;
        int i4 = wbt.b.a;
        aucd d = vvb.d(6);
        aucd o = aslr.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aslr aslr = (aslr) o.b;
        int i5 = aslr.a | 1;
        aslr.a = i5;
        aslr.b = a4;
        aslr.c = i - 1;
        aslr.a = i5 | 2;
        if (ayni.a.a().c()) {
            if (i4 == 1) {
                i2 = 2;
            } else if (i4 == 2) {
                i2 = 4;
            } else if (i4 != 3) {
                i2 = 1;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aslr aslr2 = (aslr) o.b;
            aslr2.d = i2 - 1;
            aslr2.a = 4 | aslr2.a;
        }
        aslr aslr3 = (aslr) o.i();
        if (d.c) {
            d.c();
            d.c = false;
        }
        asmc asmc = (asmc) d.b;
        asmc asmc2 = asmc.B;
        aslr3.getClass();
        asmc.g = aslr3;
        asmc.a |= 64;
        vva.a(new vuu((asmc) d.i()));
    }
}
