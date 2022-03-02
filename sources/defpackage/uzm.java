package defpackage;

import android.content.Context;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;

/* renamed from: uzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uzm implements vgq {
    private final uza a;
    private final avch b;
    private final vav c;
    private final Context d;
    private tgh e;
    private boolean f;

    public uzm(Context context, uza uza, avch avch) {
        this.d = context;
        this.c = (vav) thl.a(context, vav.class);
        boolean z = true;
        if (!(avch == avch.AUDIO_AUDIBLE_DTMF || avch == avch.AUDIO_ULTRASOUND_PASSBAND)) {
            z = false;
        }
        iva.b(z);
        this.a = uza;
        this.b = avch;
    }

    public final boolean a() {
        avch avch = avch.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = this.b.ordinal();
        if (ordinal == 1) {
            return this.c.g();
        }
        if (ordinal != 8) {
            return false;
        }
        return this.c.i();
    }

    public final void b() {
        if (this.f) {
            jjg jjg = tgc.a;
            tgh tgh = this.e;
            if (tgh != null) {
                tgh.a();
            }
            vgu.a(this.b);
            uzl a2 = this.a.a("AudioTokenBeacon: ");
            String str = a2.a;
            a2.g = null;
            int i = a2.c;
            if (i == 1) {
                a2.c = 3;
                i = 3;
            } else if (i == 2) {
                a2.c = 0;
                i = 0;
            }
            a2.a(i);
            this.a.b("AudioTokenBeacon: ");
            this.e = null;
            this.f = false;
        }
    }

    public final String toString() {
        return String.format("%s beacon (token=%s)", new Object[]{vgu.a(this.b), this.e.a()});
    }

    public final boolean a(vgo vgo) {
        return vgo.a.equals(this.e);
    }

    public final void b(vgo vgo) {
        TokenBroadcaster$Params tokenBroadcaster$Params;
        tgh tgh = vgo.a;
        if (tgh.a == null) {
            ((anih) ((anih) tgc.a.c()).a("uzm", "b", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Audio: null tokenId");
        } else if (!a()) {
            throw new vgp();
        } else if (!this.f || !tgh.equals(this.e)) {
            jjg jjg = tgc.a;
            tgh.a();
            vgu.a(this.b);
            int i = 1;
            this.f = true;
            this.e = tgh;
            uzl a2 = this.a.a("AudioTokenBeacon: ");
            avch avch = avch.TOKEN_MEDIUM_UNKNOWN;
            int ordinal = this.b.ordinal();
            if (ordinal == 1) {
                Encoding a3 = uzh.a(this.d, tgh.a.length);
                byte[] bArr = tgh.a;
                auyi auyi = this.c.f.f;
                if (auyi == null) {
                    auyi = auyi.p;
                }
                tokenBroadcaster$Params = new TokenBroadcaster$Params(bArr, auyi.b, new Encoding[]{a3});
            } else if (ordinal != 8) {
                byte[] bArr2 = tgh.a;
                eds eds = new eds();
                eds.b(bArr2.length);
                eds.a(1);
                tokenBroadcaster$Params = new TokenBroadcaster$Params(bArr2, -1, new Encoding[]{eds.a()}, -1);
            } else {
                Encoding b2 = uzh.b(this.d, tgh.a.length);
                tokenBroadcaster$Params = new TokenBroadcaster$Params(tgh.a, -1, new Encoding[]{b2});
            }
            String str = a2.a;
            a2.g = tokenBroadcaster$Params;
            int i2 = a2.c;
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2) {
                    i = i2;
                    a2.a(i);
                } else if (a2.d && a2.b == 1) {
                    a2.c = 1;
                    a2.a(i);
                }
            }
            a2.c = 2;
            i = 2;
            a2.a(i);
        }
    }
}
