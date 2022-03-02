package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.audiomodem.DecodedToken;
import com.google.android.gms.audiomodem.DecodedTokensProtoHelper;
import com.google.android.gms.audiomodem.DsssEncoding;
import com.google.android.gms.audiomodem.DtmfEncoding;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.NativeDecoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: eel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eel implements ecf {
    public final egi a = new egi(ecy.class);
    public final egi b = new egi(ecz.class);
    private volatile int c = 0;
    private long d;
    private long e;
    private int f = 0;
    private int g;
    private int h;
    private int i;
    private final Encoding j;
    private final int k;
    private final int l;
    private final int m;
    private final long n;
    private final eew o;
    private final boolean p;

    public eel(Context context, Encoding encoding, int i2, int i3, int i4, boolean z) {
        this.j = encoding;
        this.k = i2;
        this.l = i3;
        this.m = i4;
        this.n = (long) a((long) ((int) aymc.a.a().d()));
        this.o = (eew) thl.a(context, eew.class);
        this.p = z;
        if (!d()) {
            this.o.a(14, encoding);
        }
    }

    private final int a(long j2) {
        double d2 = (double) j2;
        Double.isNaN(d2);
        double d3 = (double) this.l;
        Double.isNaN(d3);
        double d4 = (d2 / 1000.0d) * d3;
        double d5 = (double) this.m;
        Double.isNaN(d5);
        double d6 = d4 * d5;
        return (int) (d6 + d6);
    }

    private final boolean d() {
        if (this.f == 2) {
            ((anih) ((anih) edx.a.d()).a("eel", "d", 79, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("tryInitialize failed because TokenDecoder has been released");
            return false;
        } else if (!eea.a()) {
            return false;
        } else {
            if (this.f != 0) {
                return true;
            }
            Encoding encoding = this.j;
            int i2 = encoding.a;
            if (i2 == 0) {
                DsssEncoding dsssEncoding = encoding.b;
                jjg jjg = edx.a;
                aymc.d();
                if (NativeDecoder.nativeInitializeDsss(this.k, dsssEncoding.a(), dsssEncoding.b, dsssEncoding.c, dsssEncoding.d, dsssEncoding.e, dsssEncoding.f, dsssEncoding.g, dsssEncoding.h, dsssEncoding.i, dsssEncoding.j, dsssEncoding.k, aymc.d(), ((float) aymc.b()) / 1000.0f, (float) aymc.a.a().e(), (int) aymc.a.a().j(), (float) this.l, this.m, (float) aymc.a.a().f(), this.p)) {
                    this.h = dsssEncoding.a;
                    this.i = dsssEncoding.l;
                } else {
                    ((anih) ((anih) edx.a.b()).a("eel", "d", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Native initialization of DSSS decoder failed");
                    return false;
                }
            } else if (i2 != 1) {
                ((anih) ((anih) edx.a.c()).a("eel", "d", 155, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received an Encoding with unknown type");
                return false;
            } else {
                DtmfEncoding dtmfEncoding = encoding.c;
                if (NativeDecoder.nativeInitializeDtmf(this.k, dtmfEncoding.c(), dtmfEncoding.d, dtmfEncoding.e, dtmfEncoding.f, ((float) dtmfEncoding.g) / 1000.0f, dtmfEncoding.h, ((float) aymc.b()) / 1000.0f, (int) aymc.a.a().k(), (float) this.l, this.m, ((float) dtmfEncoding.a().a) / 1000.0f, ((float) dtmfEncoding.a().b) / 1000.0f, ((float) dtmfEncoding.a().c) / 1000.0f, ((float) dtmfEncoding.a().d) / 1000.0f, dtmfEncoding.a().e, (float) aymc.a.a().g(), dtmfEncoding.b())) {
                    this.h = dtmfEncoding.c;
                    this.i = dtmfEncoding.i;
                } else {
                    ((anih) ((anih) edx.a.b()).a("eel", "d", 147, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Native initialization of DTMF decoder failed");
                    return false;
                }
            }
            this.f = 1;
            this.g = NativeDecoder.nativeGetMaxSafeInputSize(this.k);
            return true;
        }
    }

    public final void b() {
        for (ecy a2 : (ecy[]) this.a.a) {
            a2.a(2);
        }
    }

    public final synchronized void c() {
        if (this.f == 1) {
            jjg jjg = edx.a;
            NativeDecoder.nativeWipeInternalData(this.k);
            NativeDecoder.nativeRelease(this.k);
        }
        this.f = 2;
    }

    public final synchronized void a() {
        if (this.f == 1) {
            jjg jjg = edx.a;
            NativeDecoder.nativeWipeInternalData(this.k);
        }
        this.c = 0;
        this.e = 0;
    }

    public final synchronized void a(ByteBuffer byteBuffer) {
        int i2;
        if (!d()) {
            this.o.a(14, this.j);
            return;
        }
        int remaining = byteBuffer.remaining();
        if (remaining > this.g) {
            this.o.a(15, this.j);
            ((anih) ((anih) edx.a.c()).a("eel", "a", 195, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Sample size %s exceeds maximum %s", remaining, this.g);
        }
        if (this.p) {
            NativeDecoder.nativeProcessSamplesWithHotsound(this.k, byteBuffer, byteBuffer.position(), remaining);
        } else {
            NativeDecoder.nativeProcessSamples(this.k, byteBuffer, byteBuffer.position(), remaining);
        }
        int i3 = 0;
        if (!NativeDecoder.nativeDetectBroadcaster(this.k)) {
            this.e += (long) remaining;
            if (this.c == 1) {
                this.c = 2;
            }
            for (ecz ecz : (ecz[]) this.b.a) {
                if (ecz.b && this.e > ((long) a(ecz.c))) {
                    this.b.b(ecz);
                    try {
                        ((efh) ecz.d).c();
                    } catch (RemoteException e2) {
                    }
                }
            }
        } else {
            if (this.c != 1) {
                this.c = 1;
                this.e = 0;
            }
            for (ecz ecz2 : (ecz[]) this.b.a) {
                if (ecz2.a) {
                    this.b.b(ecz2);
                    try {
                        ((efh) ecz2.d).b();
                    } catch (RemoteException e3) {
                    }
                }
            }
        }
        long j2 = this.d + ((long) remaining);
        this.d = j2;
        if (j2 >= this.n) {
            if (!d()) {
                this.o.a(14, this.j);
            } else {
                DecodedTokensProtoHelper decodedTokensProtoHelper = new DecodedTokensProtoHelper();
                NativeDecoder.nativeGetTokens(this.k, decodedTokensProtoHelper, this.h, this.i);
                aucx aucx = decodedTokensProtoHelper.build().a;
                HashSet hashSet = new HashSet();
                for (ecy ecy : (ecy[]) this.a.a) {
                    hashSet.add(ecy.e);
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < aucx.size(); i4++) {
                        arrayList.add(new DecodedToken(((avor) aucx.get(i4)).b.k(), i4));
                    }
                    try {
                        ((efo) ecy.d).a((List) arrayList);
                    } catch (RemoteException e4) {
                    }
                }
                int size = aucx.size();
                while (i3 < size) {
                    avor avor = (avor) aucx.get(i3);
                    Iterator it = hashSet.iterator();
                    while (true) {
                        i2 = i3 + 1;
                        if (!it.hasNext()) {
                            break;
                        }
                        this.o.a((String) it.next(), 7, this.j, avor.b.k());
                    }
                    i3 = i2;
                }
            }
            this.d = 0;
        }
    }
}
