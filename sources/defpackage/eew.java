package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.audiomodem.Encoding;

/* renamed from: eew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eew extends arwa {
    public eew(Context context) {
        super(context);
    }

    public final void a(int i) {
        a("", i, (Encoding) null, (byte[]) null);
    }

    public final void a(int i, Encoding encoding) {
        a("", i, encoding, (byte[]) null);
    }

    public final void a(String str, int i, Encoding encoding, byte[] bArr) {
        aucd o = auwa.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwa auwa = (auwa) o.b;
        auwa.b = i - 1;
        auwa.a |= 1;
        if (encoding != null) {
            aucd o2 = auwb.c.o();
            int i2 = encoding.a;
            if (i2 == 0) {
                avch avch = avch.AUDIO_ULTRASOUND_PASSBAND;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auwb auwb = (auwb) o2.b;
                auwb.b = avch.k;
                auwb.a |= 1;
            } else if (i2 != 1) {
                avch avch2 = avch.TOKEN_MEDIUM_UNKNOWN;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auwb auwb2 = (auwb) o2.b;
                auwb2.b = avch2.k;
                auwb2.a |= 1;
            } else {
                avch avch3 = avch.AUDIO_AUDIBLE_DTMF;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auwb auwb3 = (auwb) o2.b;
                auwb3.b = avch3.k;
                auwb3.a |= 1;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwa auwa2 = (auwa) o.b;
            auwb auwb4 = (auwb) o2.i();
            auwb4.getClass();
            auwa2.c = auwb4;
            auwa2.a |= 2;
        }
        if (bArr != null) {
            String encodeToString = Base64.encodeToString(bArr, 11);
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwa auwa3 = (auwa) o.b;
            encodeToString.getClass();
            auwa3.a |= 4;
            auwa3.d = encodeToString;
        }
        jjg jjg = edx.a;
        auwa auwa4 = (auwa) o.i();
        int a = avau.a(auwa4.b);
        if (a == 0) {
            a = 1;
        }
        String valueOf = String.valueOf(Integer.toString(a - 1));
        auwb auwb5 = auwa4.c;
        if (auwb5 == null) {
            auwb5 = auwb.c;
        }
        avch a2 = avch.a(auwb5.b);
        if (a2 == null) {
            a2 = avch.TOKEN_MEDIUM_UNKNOWN;
        }
        String valueOf2 = String.valueOf(a2);
        String str2 = auwa4.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(valueOf2).length() + String.valueOf(str2).length());
        sb.append("LoggedAudioModem{type=");
        sb.append(valueOf);
        sb.append(", medium=");
        sb.append(valueOf2);
        sb.append(", token=");
        sb.append(str2);
        sb.append("}");
        sb.toString();
        auwa auwa5 = (auwa) o.i();
        auvz a3 = arwa.a(str, (String) null, 8);
        aucd aucd = (aucd) a3.c(5);
        aucd.a((aucj) a3);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        auvz auvz = (auvz) aucd.b;
        auvz auvz2 = auvz.k;
        auwa5.getClass();
        auvz.j = auwa5;
        auvz.a |= 1024;
        a((auvz) aucd.i(), true);
    }

    public final void a(String str, int i, eem eem) {
        a(str, i, eem.b, (byte[]) null);
    }

    public final void a(String str, int i, eeq eeq) {
        a(str, i, eeq.b, eeq.d);
    }
}
