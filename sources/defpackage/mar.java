package defpackage;

import java.io.IOException;

/* renamed from: mar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mar {
    public final mbh a;
    public final mas b;
    public final byte[] c;
    public final boolean d;
    public final mbl e;

    public mar(maw maw, lye lye) {
        byte[] bArr;
        auay auay = lye.a;
        auay auay2 = lye.b;
        try {
            aubs b2 = aubs.b();
            lyg lyg = lyg.j;
            try {
                aubc h = auay.h();
                aucj aucj = (aucj) lyg.c(4);
                aueq a2 = aueh.a.a((Object) aucj);
                a2.a(aucj, aubd.a(h), b2);
                a2.d(aucj);
                h.a(0);
                aucj.b(aucj);
                lyg lyg2 = (lyg) aucj;
                if (maw.a(auay.k(), auay2.k())) {
                    int i = lyg2.a;
                    if ((i & 1) == 0) {
                        throw new mbc("byteCode", lyg2.i.k());
                    } else if ((i & 2) == 0) {
                        throw new mbc("vmUrl", lyg2.i.k());
                    } else if ((i & 4) == 0) {
                        throw new mbc("vmChecksum", lyg2.i.k());
                    } else if ((i & 16) != 0) {
                        mbh mbh = new mbh(jjp.d(lyg2.c.k()));
                        this.a = mbh;
                        this.b = new mas(lyg2.b.k(), mbh, (long) lyg2.e, lyg2.i.k());
                        mbl mbl = null;
                        if ((lyg2.a & 8) != 0) {
                            bArr = lyg2.d.k();
                        } else {
                            bArr = null;
                        }
                        this.c = bArr;
                        int i2 = lyg2.a;
                        if (!((i2 & 64) == 0 && (i2 & 128) == 0)) {
                            long currentTimeMillis = System.currentTimeMillis();
                            mbl = new mbl((((long) lyg2.g) * 1000) + currentTimeMillis, currentTimeMillis + (((long) lyg2.h) * 1000));
                        }
                        this.e = mbl;
                        this.d = lyg2.f;
                    } else {
                        throw new mbc("expiryTimeSecs", lyg2.i.k());
                    }
                } else {
                    throw new mbc("Creation response signature verification failed.", lyg2.i.k());
                }
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
            throw new mbc("Couldn't parse response signature", (Throwable) e6);
        }
    }
}
