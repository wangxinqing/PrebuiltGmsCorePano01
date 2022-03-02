package com.google.android.gms.ads.identifier.settings;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class g implements aoul {
    private final byte[] a;
    private final aoyw b;

    public g(byte[] bArr, aoyw aoyw) {
        this.a = bArr;
        this.b = aoyw;
    }

    public final aoza a() {
        boolean z;
        try {
            byte[] bArr = this.a;
            aoyw aoyw = this.b;
            EllipticCurve curve = apcd.a(1).getCurve();
            int b2 = apcd.b(curve);
            BigInteger a2 = apcd.a(curve);
            int length = bArr.length;
            if (length == b2 + 1) {
                byte b3 = bArr[0];
                if (b3 == 2) {
                    z = false;
                } else if (b3 == 3) {
                    z = true;
                } else {
                    throw new GeneralSecurityException("invalid format");
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length));
                if (bigInteger.signum() == -1 || bigInteger.compareTo(a2) >= 0) {
                    throw new GeneralSecurityException("x is out of range");
                }
                ECPoint eCPoint = new ECPoint(bigInteger, apcd.a(bigInteger, z, curve));
                aouk a3 = aouk.a();
                a3.b(aoyw);
                aoyy aoyy = (aoyy) aoza.c.a((aucj) a3.b().a().a);
                int i = 0;
                while (i < ((aoza) aoyy.b).b.size()) {
                    aoyz aoyz = (aoyz) ((aoza) aoyy.b).b.get(i);
                    aucd a4 = aoyz.e.a((aucj) aoyz);
                    aoyu aoyu = aoyz.a;
                    if (aoyu == null) {
                        aoyu = aoyu.d;
                    }
                    aucd a5 = aoyu.d.a((aucj) aoyu);
                    aoyu aoyu2 = aoyz.a;
                    if (aoyu2 == null) {
                        aoyu2 = aoyu.d;
                    }
                    auay auay = aoyu2.b;
                    aubs c = aubs.c();
                    aoyc aoyc = aoyc.e;
                    try {
                        aubc h = auay.h();
                        aucj aucj = (aucj) aoyc.c(4);
                        aueq a6 = aueh.a.a((Object) aucj);
                        a6.a(aucj, aubd.a(h), c);
                        a6.d(aucj);
                        h.a(0);
                        aucj.b(aucj);
                        aucd a7 = aoyc.e.a((aucj) (aoyc) aucj);
                        auay a8 = auay.a(eCPoint.getAffineX().toByteArray());
                        if (a7.c) {
                            a7.c();
                            a7.c = false;
                        }
                        a8.getClass();
                        ((aoyc) a7.b).c = a8;
                        auay a9 = auay.a(eCPoint.getAffineY().toByteArray());
                        if (a7.c) {
                            a7.c();
                            a7.c = false;
                        }
                        a9.getClass();
                        ((aoyc) a7.b).d = a9;
                        auay au = ((aoyc) a7.i()).au();
                        if (a5.c) {
                            a5.c();
                            a5.c = false;
                        }
                        au.getClass();
                        ((aoyu) a5.b).b = au;
                        if (a4.c) {
                            a4.c();
                            a4.c = false;
                        }
                        aoyu aoyu3 = (aoyu) a5.i();
                        aoyu3.getClass();
                        ((aoyz) a4.b).a = aoyu3;
                        aoyz aoyz2 = (aoyz) a4.i();
                        if (aoyy.c) {
                            aoyy.c();
                            aoyy.c = false;
                        }
                        aoza aoza = (aoza) aoyy.b;
                        aoyz2.getClass();
                        aoza.a();
                        aoza.b.set(i, aoyz2);
                        i++;
                    } catch (IOException e) {
                        if (!(e.getCause() instanceof auda)) {
                            throw new auda(e.getMessage());
                        }
                        throw ((auda) e.getCause());
                    } catch (RuntimeException e2) {
                        if (e2.getCause() instanceof auda) {
                            throw ((auda) e2.getCause());
                        }
                        throw e2;
                    } catch (auda e3) {
                        throw e3;
                    } catch (auda e4) {
                        throw e4;
                    }
                }
                return (aoza) aoyy.i();
            }
            throw new GeneralSecurityException("compressed point has wrong length");
        } catch (GeneralSecurityException e5) {
            throw new IOException(e5);
        }
    }
}
