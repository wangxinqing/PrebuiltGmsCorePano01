package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfj implements Runnable {
    private final wgu a;
    private final byte[] b;
    private final wcx c;
    private final String d;

    public wfj(wgu wgu, byte[] bArr, wcx wcx, String str) {
        this.a = wgu;
        this.b = bArr;
        this.c = wcx;
        this.d = str;
    }

    public final void run() {
        String str;
        wgu wgu = this.a;
        byte[] bArr = this.b;
        wcx wcx = this.c;
        String str2 = this.d;
        wgu.u = (long) vva.a();
        wgu.l.clear();
        vtx vtx = wgu.i;
        if (vtx == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 532, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring incoming connection from endpoint %s because we're no longer advertising. Disconnecting.", (Object) whu.b(bArr));
            wcx.b();
            return;
        }
        wby a2 = wby.a(bArr);
        if (a2 == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 542, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse incoming connection from endpoint %s. Disconnecting.", (Object) whu.b(bArr));
            wcx.b();
            return;
        }
        ShareTarget a3 = wgu.a(a2, true);
        if (a3 == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 553, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to convert advertisement %s to share target from incoming connection. Disconnecting.", (Object) whu.b(bArr));
            wcx.b();
            return;
        }
        ((anih) ((anih) vvj.a.d()).a("wgu", "a", 561, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received incoming connection from %s", (Object) a3);
        wgu.h(a3).c = wcx;
        vtx a4 = wgu.a(vtx);
        wgu.h(a3).d = a4;
        wgu.h(a3).a = str2;
        wcx.a((wcw) new wfq(wgu, a3));
        byte[] d2 = wgu.g.d(str2);
        if (d2 != null) {
            str = whu.c(d2);
        } else {
            str = null;
        }
        vnv vnv = vnv.UNKNOWN_FRAME_TYPE;
        vnz vnz = vnz.UNKNOWN_SECURITY_TYPE;
        wgn wgn = wgn.SUCCESS;
        int ordinal = wgu.f(a3).ordinal();
        if (ordinal == 0) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 587, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Paired key handshake succeeded when receiving connection from %s.", (Object) a3);
            wgu.g.f(str2);
            wgu.a(a3, (String) null);
            if (wgu.g.e(str2)) {
                wgu.e(a3);
            }
        } else if (ordinal == 1) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 579, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Paired key handshake failed when receiving connection from %s. Disconnecting.", (Object) a3);
            wcx.b();
            return;
        } else if (ordinal == 2) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "a", 603, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to verify paired key encryption when receiving connection from %s. Verify tokens on devices.", (Object) a3);
            if (wgu.g.e(str2)) {
                wgu.g.f(str2);
                wgu.a(a3, (String) null);
            } else {
                wgu.h(a3).f = str;
                wgu.a(a3, str);
            }
        }
        wcx.a((wcw) new wfr(wgu, a4, a3));
    }
}
