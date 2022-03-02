package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenReceiver$Params;
import java.util.HashSet;
import java.util.Set;

/* renamed from: uzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uzo implements vgt {
    public final avch a;
    public vgr b;
    public boolean c;
    public final Set d = new HashSet();
    private final uza e;
    private final Context f;
    private boolean g;
    private final vav h;
    private final uzn i = new uzn(this);

    public uzo(Context context, uza uza, avch avch) {
        boolean z = true;
        if (!(avch == avch.AUDIO_AUDIBLE_DTMF || avch == avch.AUDIO_ULTRASOUND_PASSBAND)) {
            z = false;
        }
        iva.b(z);
        this.h = (vav) thl.a(context, vav.class);
        this.e = uza;
        this.a = avch;
        this.f = context;
    }

    private final boolean d() {
        return this.f.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public final void a(vgr vgr, auzb auzb) {
        TokenReceiver$Params tokenReceiver$Params;
        if (!a()) {
            throw new vgs();
        } else if (!this.c) {
            this.b = vgr;
            int checkPermission = this.f.getPackageManager().checkPermission("android.permission.CAPTURE_AUDIO_HOTWORD", this.f.getPackageName());
            boolean equals = "HOTWORD".equals(aymc.c());
            int i2 = 1;
            if ((!d() || checkPermission != 0 || !equals) && !this.g) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                this.g = true;
            }
            jjg jjg = tgc.a;
            vgu.a(this.a);
            this.d.clear();
            this.c = true;
            uzl a2 = this.e.a("AudioTokenListener: ");
            avch avch = this.a;
            avch avch2 = avch.TOKEN_MEDIUM_UNKNOWN;
            int ordinal = avch.ordinal();
            if (ordinal == 1) {
                tokenReceiver$Params = new TokenReceiver$Params(new Encoding[]{uzh.a(this.f, auzb.b)});
            } else if (ordinal != 8) {
                int i3 = auzb.b;
                eds eds = new eds();
                eds.b(i3);
                eds.a(1);
                tokenReceiver$Params = new TokenReceiver$Params(new Encoding[]{eds.a()});
            } else {
                tokenReceiver$Params = new TokenReceiver$Params(new Encoding[]{uzh.b(this.f, auzb.b)});
            }
            uzn uzn = this.i;
            String str = a2.a;
            a2.b = 1;
            a2.f = tokenReceiver$Params;
            a2.h = uzn;
            int i4 = a2.c;
            if (i4 == 0) {
                a2.c = 3;
                i2 = 3;
            } else if (i4 == 2 && a2.d) {
                a2.c = 1;
            } else {
                i2 = i4;
            }
            a2.a(i2);
        } else {
            jjg jjg2 = tgc.a;
        }
    }

    public final void b() {
        if (this.c) {
            jjg jjg = tgc.a;
            vgu.a(this.a);
            this.d.clear();
            uzl a2 = this.e.a("AudioTokenListener: ");
            String str = a2.a;
            a2.b = 0;
            a2.f = null;
            int i2 = a2.c;
            if (i2 != 0) {
                if (i2 == 1) {
                    a2.c = 2;
                    i2 = 2;
                } else if (i2 != 2) {
                    a2.c = 0;
                    i2 = 0;
                }
            }
            a2.a(i2);
            uzn uzn = a2.h;
            if (uzn != null) {
                vgu.a(uzn.a.a);
                uzn.a.c();
                uzn.a.c = false;
            }
            this.e.b("AudioTokenListener: ");
            this.c = false;
            c();
        }
    }

    public final void c() {
        try {
            this.g = false;
        } catch (IllegalArgumentException e2) {
        }
    }

    public final boolean a() {
        if (!d()) {
            return false;
        }
        avch avch = avch.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = this.a.ordinal();
        if (ordinal == 1) {
            return this.h.f();
        }
        if (ordinal != 8) {
            return false;
        }
        return this.h.h();
    }
}
