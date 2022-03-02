package defpackage;

import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.List;

/* renamed from: wfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfg implements Runnable {
    private final wgu a;
    private final wcx b;
    private final vtx c;
    private final String d;
    private final ShareTarget e;
    private final vnw f;

    public wfg(wgu wgu, wcx wcx, vtx vtx, String str, ShareTarget shareTarget, vnw vnw) {
        this.a = wgu;
        this.b = wcx;
        this.c = vtx;
        this.d = str;
        this.e = shareTarget;
        this.f = vnw;
    }

    public final void run() {
        wgu wgu = this.a;
        wcx wcx = this.b;
        vtx vtx = this.c;
        String str = this.d;
        ShareTarget shareTarget = this.e;
        vnw vnw = this.f;
        if (vnw != null) {
            wgu.e.a();
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1922, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully read the response frame");
            vne vne = vnw.d;
            if (vne == null) {
                vne = vne.c;
            }
            vnv vnv = vnv.UNKNOWN_FRAME_TYPE;
            vnz vnz = vnz.UNKNOWN_SECURITY_TYPE;
            wgn wgn = wgn.SUCCESS;
            int b2 = vnd.b(vne.b);
            if (b2 == 0) {
                b2 = 1;
            }
            int i = b2 - 1;
            if (i == 1) {
                wgu.b(wcx);
                vva vva = wgu.o;
                long j = wgu.t;
                List b3 = shareTarget.b();
                aucd d2 = vvb.d(16);
                aucd o = aslt.d.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aslt aslt = (aslt) o.b;
                aslt.a |= 1;
                aslt.b = j;
                asld a2 = vvb.a(b3);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aslt aslt2 = (aslt) o.b;
                a2.getClass();
                aslt2.c = a2;
                aslt2.a |= 2;
                aslt aslt3 = (aslt) o.i();
                if (d2.c) {
                    d2.c();
                    d2.c = false;
                }
                asmc asmc = (asmc) d2.b;
                asmc asmc2 = asmc.B;
                aslt3.getClass();
                asmc.q = aslt3;
                asmc.a |= 65536;
                vva.a(new vuu((asmc) d2.i()));
                wgu.v = SystemClock.uptimeMillis();
                vtx.a(shareTarget, new vtv(5).a());
                wgt wgt = new wgt(wgu, shareTarget, vtx);
                for (tjc a3 : wgu.p(shareTarget)) {
                    wgu.g.a(str, a3, (wdn) wgt);
                }
                for (tjc a4 : wgu.q(shareTarget)) {
                    wgu.g.a(str, a4, (wdn) wgt);
                }
                for (tjc a5 : wgu.r(shareTarget)) {
                    wgu.g.a(str, a5, (wdn) wgt);
                }
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1943, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The connection was accepted. Payloads are now being sent.");
            } else if (i == 2) {
                vtx.a(shareTarget, new vtv(8).a());
                wcx.b();
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1948, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The connection was rejected. The connection has been closed.");
            } else if (i == 3) {
                vtx.a(shareTarget, new vtv(13).a());
                wcx.b();
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1954, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The connection was rejected because the remote device does not have enough space for our attachments. The connection has been closed.");
            } else if (i != 4) {
                vtx.a(shareTarget, new vtv(7).a());
                wcx.b();
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1969, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The connection failed. The connection has been closed.");
            } else {
                vtx.a(shareTarget, new vtv(14).a());
                wcx.b();
                ((anih) ((anih) vvj.a.d()).a("wgu", "a", 1962, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The connection was rejected because the remote device does not support the attachments we were sending. The connection has been closed.");
            }
        } else {
            vtx.a(shareTarget, new vtv(7).a());
            wcx.b();
            ((anih) ((anih) vvj.a.b()).a("wgu", "a", 1914, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read a response from the remote device. Disconnecting.");
        }
    }
}
