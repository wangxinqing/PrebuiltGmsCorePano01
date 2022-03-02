package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* renamed from: akmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akmj implements Runnable {
    private final akmn a;
    private final auac[] b;

    public akmj(akmn akmn, auac[] auacArr) {
        this.a = akmn;
        this.b = auacArr;
    }

    public final void run() {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        akmn akmn = this.a;
        auac[] auacArr = this.b;
        akmn.c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(azcf.b());
        asve asve = ((asve[]) auacArr)[0];
        if (asve != null) {
            int i6 = asve.U;
            int i7 = -1;
            if (i6 == -1) {
                i6 = aueh.a.a((Object) asve).b(asve);
                asve.U = i6;
            }
            apxe apxe = new apxe(i6);
            int i8 = 1;
            if ((asve.a & 1) != 0) {
                asvc asvc = asve.b;
                if (asvc == null) {
                    asvc = asvc.b;
                }
                int size = asvc.a.size();
                if (size > 0) {
                    int[] iArr = new int[size];
                    int i9 = 0;
                    while (i9 < size) {
                        asvc asvc2 = asve.b;
                        if (asvc2 == null) {
                            asvc2 = asvc.b;
                        }
                        asvb asvb = (asvb) asvc2.a.get(i9);
                        int size2 = asvb.a.size();
                        float[] fArr = new float[size2];
                        for (int i10 = 0; i10 < asvb.a.size(); i10++) {
                            fArr[i10] = asvb.a.c(i10);
                        }
                        if (size2 > 0) {
                            ThreadLocal threadLocal = apxg.b;
                            apxe.a(4, size2, 4);
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    break;
                                }
                                apxe.a(fArr[size2]);
                            }
                            i4 = apxe.b();
                        } else {
                            i4 = 0;
                        }
                        int size3 = asvb.b.size();
                        float[] fArr2 = new float[size3];
                        for (int i11 = 0; i11 < asvb.b.size(); i11++) {
                            fArr2[i11] = asvb.b.c(i11);
                        }
                        if (size3 > 0) {
                            ThreadLocal threadLocal2 = apxg.b;
                            apxe.a(4, size3, 4);
                            while (true) {
                                size3--;
                                if (size3 < 0) {
                                    break;
                                }
                                apxe.a(fArr2[size3]);
                            }
                            i5 = apxe.b();
                        } else {
                            i5 = 0;
                        }
                        ThreadLocal threadLocal3 = apxg.b;
                        apxe.d(5);
                        apxe.c(0, i4);
                        apxe.c(1, i5);
                        apxe.b(2, asvb.c, 0);
                        apxe.a(3, asvb.d);
                        apxe.b(4, asvb.e, 0);
                        iArr[i9] = apxe.e();
                        i9++;
                        i7 = -1;
                        i8 = 1;
                    }
                    ThreadLocal threadLocal4 = apxg.b;
                    apxe.a(4, size, 4);
                    for (int i12 = size + i7; i12 >= 0; i12--) {
                        apxe.c(iArr[i12]);
                    }
                    int b2 = apxe.b();
                    apxe.d(i8);
                    apxe.c(0, b2);
                    i = apxe.e();
                } else {
                    i = 0;
                }
            } else {
                i = 0;
            }
            if (asve.c.size() > 0) {
                int size4 = asve.c.size();
                int[] iArr2 = new int[size4];
                for (int i13 = 0; i13 < asve.c.size(); i13++) {
                    asvh asvh = (asvh) asve.c.get(i13);
                    int a2 = apxe.a((CharSequence) asvh.a);
                    double d = asvh.b;
                    ThreadLocal threadLocal5 = apxg.b;
                    apxe.d(2);
                    if (d != 0.0d) {
                        apxe.a(8, 0);
                        ByteBuffer byteBuffer = apxe.a;
                        int i14 = apxe.b - 8;
                        apxe.b = i14;
                        byteBuffer.putDouble(i14, d);
                        apxe.e(1);
                    }
                    apxe.c(0, a2);
                    iArr2[i13] = apxe.e();
                }
                ThreadLocal threadLocal6 = apxg.b;
                apxe.a(4, size4, 4);
                for (int i15 = size4 - 1; i15 >= 0; i15--) {
                    apxe.c(iArr2[i15]);
                }
                i2 = apxe.b();
            } else {
                i2 = 0;
            }
            asva asva = asve.f;
            if (asva == null) {
                asva = asva.c;
            }
            if (asva.b.size() > 0) {
                asva asva2 = asve.f;
                if (asva2 == null) {
                    asva2 = asva.c;
                }
                int size5 = asva2.b.size();
                int[] iArr3 = new int[size5];
                for (int i16 = 0; i16 < size5; i16++) {
                    asva asva3 = asve.f;
                    if (asva3 == null) {
                        asva3 = asva.c;
                    }
                    asvd asvd = (asvd) asva3.b.get(i16);
                    int i17 = asvd.a;
                    int i18 = asvd.b;
                    ThreadLocal threadLocal7 = apxg.b;
                    apxe.d(2);
                    apxe.b(1, i18, 0);
                    apxe.b(0, i17, 0);
                    iArr3[i16] = apxe.e();
                }
                ThreadLocal threadLocal8 = apxg.b;
                apxe.a(4, size5, 4);
                for (int i19 = size5 - 1; i19 >= 0; i19--) {
                    apxe.c(iArr3[i19]);
                }
                int b3 = apxe.b();
                apxe.d(2);
                asva asva4 = asve.f;
                if (asva4 == null) {
                    asva4 = asva.c;
                }
                int a3 = astg.a(asva4.a);
                if (a3 == 0) {
                    a3 = 1;
                }
                apxe.b(0, a3 - 1, 0);
                apxe.c(1, b3);
                i3 = apxe.e();
            } else {
                i3 = 0;
            }
            ThreadLocal threadLocal9 = apxg.b;
            apxe.d(5);
            apxe.c(0, i);
            apxe.c(1, i2);
            apxe.b(2, asve.d, 0);
            apxe.b(3, asve.e, 0);
            apxe.c(4, i3);
            apxe.f(apxe.e());
            int i20 = apxe.b;
            int capacity = apxe.a.capacity();
            int i21 = apxe.b;
            apxe.c();
            bArr = new byte[(capacity - i21)];
            apxe.a.position(i20);
            apxe.a.get(bArr);
        } else {
            bArr = new byte[0];
        }
        int length = bArr.length;
        ByteBuffer a4 = akmn.a(akmn.g.getPath(), ((long) length) + akmn.a.longValue(), false);
        if (a4 != null) {
            a4.put((byte) 4);
            a4.putLong(akmn.c);
            a4.putInt(length);
            a4.putLong(akmn.a(bArr).longValue());
            a4.put(bArr);
            akmn.b = 0;
            return;
        }
        aklz.a().b("Failed to write model weights to disk.");
    }
}
