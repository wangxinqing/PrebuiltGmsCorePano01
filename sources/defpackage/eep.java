package defpackage;

import android.media.AudioTrack;
import com.google.android.gms.audiomodem.DsssEncoding;
import com.google.android.gms.audiomodem.DtmfEncoding;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.NativeEncoder;

/* renamed from: eep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eep {
    public boolean a;
    public final Encoding b;
    public byte[] c;
    public avou d;
    public int e;

    public eep(Encoding encoding) {
        this.b = encoding;
    }

    public final boolean a() {
        if (!eea.a()) {
            return false;
        }
        if (this.a) {
            return true;
        }
        Encoding encoding = this.b;
        int i = encoding.a;
        if (i == 0) {
            DsssEncoding dsssEncoding = encoding.b;
            jjg jjg = edx.a;
            aymc.d();
            int a2 = dsssEncoding.a();
            boolean z = dsssEncoding.b;
            boolean z2 = dsssEncoding.c;
            int i2 = dsssEncoding.d;
            int i3 = dsssEncoding.e;
            float f = dsssEncoding.f;
            int i4 = dsssEncoding.g;
            float f2 = dsssEncoding.h;
            int i5 = dsssEncoding.i;
            int i6 = dsssEncoding.j;
            String str = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)";
            String str2 = "a";
            if (NativeEncoder.nativeInitializeDsss(a2, z, z2, i2, i3, f, i4, f2, i5, i6, dsssEncoding.k, aymc.d(), AudioTrack.getNativeOutputSampleRate(3), ((float) aymc.a.a().u()) / 1000.0f)) {
                this.e = dsssEncoding.l;
            } else {
                ((anih) ((anih) edx.a.b()).a("eep", str2, 73, str)).a("Native initialization of DSSS encoder failed");
                return false;
            }
        } else if (i != 1) {
            ((anih) ((anih) edx.a.c()).a("eep", "a", 101, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received an Encoder with unknown type");
            return false;
        } else {
            DtmfEncoding dtmfEncoding = encoding.c;
            if (NativeEncoder.nativeInitializeDtmf(dtmfEncoding.c(), dtmfEncoding.d, dtmfEncoding.e, dtmfEncoding.f, ((float) dtmfEncoding.g) / 1000.0f, dtmfEncoding.h, ((float) dtmfEncoding.a().a) / 1000.0f, ((float) dtmfEncoding.a().b) / 1000.0f, ((float) dtmfEncoding.a().c) / 1000.0f, ((float) dtmfEncoding.a().d) / 1000.0f, dtmfEncoding.a().e, dtmfEncoding.b())) {
                this.e = dtmfEncoding.i;
            } else {
                ((anih) ((anih) edx.a.b()).a("eep", "a", 95, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Native initialization of DTMF encoder failed");
                return false;
            }
        }
        this.a = true;
        return true;
    }
}
