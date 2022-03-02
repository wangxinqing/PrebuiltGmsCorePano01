package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: ucg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ucg implements aora {
    final /* synthetic */ byte[] a;
    final /* synthetic */ uaj b;
    final /* synthetic */ uch c;

    public ucg(uch uch, byte[] bArr, uaj uaj) {
        this.c = uch;
        this.a = bArr;
        this.b = uaj;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        uch uch = this.c;
        tws tws = uch.e.j;
        String str = uch.c;
        byte[] bArr = this.a;
        uaj uaj = this.b;
        Context context = tws.a;
        tvo tvo = new tvo(context, new ttg(context, uaj), true);
        String a2 = tvq.a(uaj);
        if (!aymt.s().equals(a2)) {
            Intent a3 = arym.a(tws.a, str, bArr);
            if (a3 == null) {
                ((anih) tsp.a.c()).a("RetroactivePairManager: Can't create retroactive launch intent");
                return;
            }
            tso tso = (tso) thl.a(tvo.d, tso.class);
            String a4 = tso.a("fast_pair_retroactive_device_ready_description", new Object[0]);
            udg b2 = tvo.b();
            b2.b(a4);
            b2.s = "recommendation";
            b2.e(tso.a("fast_pair_retroactive_device_ready_title", new Object[0]));
            b2.b((CharSequence) a4);
            b2.a(tvo.b(a3));
            tvo.a(b2.b(), tvo.a);
            return;
        }
        tvo.a(a2, arww.a(str), arww.c(str), str);
    }

    public final void a(Throwable th) {
        tws tws = this.c.e.j;
        uaj uaj = this.b;
        Context context = tws.a;
        tvo tvo = new tvo(context, new ttg(context, uaj), true);
        tso tso = (tso) thl.a(tvo.d, tso.class);
        String a2 = tso.a("fast_pair_retroactive_could_not_save_description", new Object[0]);
        udg b2 = tvo.b();
        b2.b(a2);
        b2.s = "err";
        b2.e(tso.a("fast_pair_retroactive_could_not_save_title", tvo.e.k()));
        b2.b((CharSequence) a2);
        b2.a(tvo.a(false, (Intent) null));
        b2.b(tvo.a(false, (Intent) null));
        tvo.a(b2.b(), tvo.a);
    }
}
