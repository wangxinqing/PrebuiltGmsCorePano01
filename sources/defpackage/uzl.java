package defpackage;

import android.content.Context;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import com.google.android.gms.audiomodem.TokenReceiver$Params;

/* renamed from: uzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uzl {
    public final String a;
    public int b = 0;
    public int c = 0;
    public final boolean d;
    public final arwg e;
    public TokenReceiver$Params f;
    public TokenBroadcaster$Params g;
    public uzn h;
    private final eet i = new uzj(this);
    private final eej j = new uzk();
    private final uzr k;
    private final uzt l;
    private final uzs m;

    public uzl(Context context, boolean z, String str) {
        this.e = (arwg) thl.a(context, arwg.class);
        uzh uzh = new uzh(context);
        this.d = z;
        this.a = str;
        this.k = new uzr(context, uzh, this.i, this.j);
        this.m = new uzs(uzh, this.j);
        this.l = new uzt(uzh, this.i);
    }

    private final void a() {
        if (this.d) {
            uzr uzr = this.k;
            if (uzr.g) {
                uzr.g = false;
                uzr.b();
                uzr.a();
                synchronized (uzr) {
                    uzr.a.e(uzr.h);
                }
            }
        }
    }

    public final void a(int i2) {
        jjg jjg = tgc.a;
        if (i2 == 0) {
            a();
            this.m.a();
            this.l.a();
        } else if (i2 == 1) {
            this.l.b();
            this.m.a();
            uzr uzr = this.k;
            TokenReceiver$Params tokenReceiver$Params = this.f;
            TokenBroadcaster$Params tokenBroadcaster$Params = this.g;
            uzr.d = tokenReceiver$Params;
            uzr.c = tokenBroadcaster$Params;
            if (!uzr.g) {
                uzr.g = true;
                uzr.a(1);
            }
        } else if (i2 != 2) {
            a();
            this.m.a();
            uzt uzt = this.l;
            TokenReceiver$Params tokenReceiver$Params2 = this.f;
            int i3 = this.b;
            uzt.c = tokenReceiver$Params2;
            uzt.a = i3;
            uzt.d.a(uzt.b, uzt.c, false, -1, (eeg) null);
        } else {
            a();
            this.l.a();
            uzs uzs = this.m;
            uzs.c.a(uzs.a, this.g);
            uzs.b = true;
        }
    }
}
