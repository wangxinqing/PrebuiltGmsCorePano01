package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: wey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wey implements Runnable {
    private final wgu a;
    private final wbq b;
    private final String c;
    private final vtx d;

    public wey(wgu wgu, wbq wbq, String str, vtx vtx) {
        this.a = wgu;
        this.b = wbq;
        this.c = str;
        this.d = vtx;
    }

    public final void run() {
        int i;
        String str;
        wgu wgu = this.a;
        wbq wbq = this.b;
        String str2 = this.c;
        vtx vtx = this.d;
        wbw wbw = wbq.a;
        int i2 = wbq.b;
        wgu.s = (long) vva.a();
        wgu.g.d();
        int a2 = wgu.g.a(wgu.e(str2), (wdm) wgu, wbq);
        int i3 = 3;
        if (a2 == 0) {
            wgu.i = vtx;
            wgu.j = wbw;
            anih anih = (anih) ((anih) vvj.a.d()).a("wgu", "a", 474, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            int i4 = wgu.A;
            String str3 = "UNKNOWN";
            if (i4 != 0) {
                str = i4 != 1 ? i4 != 2 ? str3 : "SELECTED_CONTACTS" : "ALL_CONTACTS";
            } else {
                str = "NO_ONE";
            }
            if (i2 == 1) {
                str3 = "OFFLINE";
            } else if (i2 == 2) {
                str3 = "ONLINE";
            } else if (i2 == 3) {
                str3 = "WIFI_ONLY";
            }
            anih.a("Successfully started advertising over Nearby Connections: %s, %s, %s", (Object) wbw, (Object) str, (Object) str3);
            i = 2;
        } else {
            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 479, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to advertise over Nearby Connections: %s", (Object) tit.g(a2));
            i = 3;
        }
        if (wbw.HIGH_POWER.equals(wbw) || wbw.MEDIUM_POWER.equals(wbw)) {
            wgu.g();
        }
        if (str2 == null) {
            int i5 = wgu.A;
            i3 = i5 != 1 ? i5 != 2 ? 1 : 4 : 2;
        }
        wgu.o.b = vva.a();
        vva vva = wgu.o;
        long j = wgu.s;
        aucd d2 = vvb.d(8);
        aucd o = aslc.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aslc aslc = (aslc) o.b;
        int i6 = 1 | aslc.a;
        aslc.a = i6;
        aslc.b = j;
        aslc.c = i3 - 1;
        int i7 = i6 | 2;
        aslc.a = i7;
        aslc.d = i - 1;
        aslc.a = i7 | 4;
        aslc aslc2 = (aslc) o.i();
        if (d2.c) {
            d2.c();
            d2.c = false;
        }
        asmc asmc = (asmc) d2.b;
        asmc asmc2 = asmc.B;
        aslc2.getClass();
        asmc.i = aslc2;
        asmc.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        vva.a(new vut((asmc) d2.i()));
    }
}
