package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: aowt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aowt implements apbo {
    public final String a;
    public final int b;
    public aoxu c;
    public aoxm d;
    public int e;

    public aowt(aoyw aoyw) {
        String str = aoyw.a;
        this.a = str;
        if (str.equals(aovd.b)) {
            try {
                auay auay = aoyw.b;
                aubs b2 = aubs.b();
                aoxv aoxv = aoxv.b;
                try {
                    aubc h = auay.h();
                    aucj aucj = (aucj) aoxv.c(4);
                    aueq a2 = aueh.a.a((Object) aucj);
                    a2.a(aucj, aubd.a(h), b2);
                    a2.d(aucj);
                    h.a(0);
                    aucj.b(aucj);
                    this.c = (aoxu) aovb.b(aoyw);
                    this.b = ((aoxv) aucj).a;
                } catch (IOException e2) {
                    if (!(e2.getCause() instanceof auda)) {
                        throw new auda(e2.getMessage());
                    }
                    throw ((auda) e2.getCause());
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof auda) {
                        throw ((auda) e3.getCause());
                    }
                    throw e3;
                } catch (auda e4) {
                    throw e4;
                } catch (auda e5) {
                    throw e5;
                }
            } catch (auda e6) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e6);
            }
        } else if (!this.a.equals(aovd.a)) {
            String valueOf = String.valueOf(this.a);
            throw new GeneralSecurityException(valueOf.length() == 0 ? new String("unsupported AEAD DEM key type: ") : "unsupported AEAD DEM key type: ".concat(valueOf));
        } else {
            try {
                auay auay2 = aoyw.b;
                aubs b3 = aubs.b();
                aoxn aoxn = aoxn.c;
                try {
                    aubc h2 = auay2.h();
                    aucj aucj2 = (aucj) aoxn.c(4);
                    aueq a3 = aueh.a.a((Object) aucj2);
                    a3.a(aucj2, aubd.a(h2), b3);
                    a3.d(aucj2);
                    h2.a(0);
                    aucj.b(aucj2);
                    aoxn aoxn2 = (aoxn) aucj2;
                    this.d = (aoxm) aovb.b(aoyw);
                    aoxp aoxp = aoxn2.a;
                    if (aoxp == null) {
                        aoxp = aoxp.c;
                    }
                    this.e = aoxp.b;
                    aoyr aoyr = aoxn2.b;
                    if (aoyr == null) {
                        aoyr = aoyr.c;
                    }
                    this.b = this.e + aoyr.b;
                } catch (IOException e7) {
                    if (!(e7.getCause() instanceof auda)) {
                        throw new auda(e7.getMessage());
                    }
                    throw ((auda) e7.getCause());
                } catch (RuntimeException e8) {
                    if (e8.getCause() instanceof auda) {
                        throw ((auda) e8.getCause());
                    }
                    throw e8;
                } catch (auda e9) {
                    throw e9;
                } catch (auda e10) {
                    throw e10;
                }
            } catch (auda e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        }
    }
}
