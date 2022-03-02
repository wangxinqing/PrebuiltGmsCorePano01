package defpackage;

import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: bog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bog {
    public static int a(apxe apxe, bnm bnm) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        apxe apxe2 = apxe;
        bnm bnm2 = bnm;
        int i7 = 1;
        int a = a(apxe2, bnm2.c, true);
        int a2 = a(apxe2, bnm2.e, true);
        int a3 = a(apxe2, bnm2.f, true);
        int a4 = a(apxe2, bnm2.g);
        aucx aucx = bnm2.j;
        if (!aucx.isEmpty()) {
            int[] iArr = new int[aucx.size()];
            for (int i8 = 0; i8 < aucx.size(); i8++) {
                bnp bnp = (bnp) aucx.get(i8);
                if (!bnp.c.isEmpty()) {
                    int[] iArr2 = new int[bnp.c.size()];
                    for (int i9 = 0; i9 < bnp.c.size(); i9++) {
                        iArr2[i9] = bnp.c.c(i9);
                    }
                    i6 = apxg.b(apxe2, iArr2);
                } else {
                    i6 = 0;
                }
                iArr[i8] = apxg.a(apxe2, bnp.b, i6);
            }
            i = boy.a(apxe2, iArr);
        } else {
            i = 0;
        }
        if ((bnm2.a & 2048) != 0) {
            i2 = apxe2.a((CharSequence) bnm2.n);
        } else {
            i2 = 0;
        }
        if ((bnm2.a & FragmentTransaction.TRANSIT_ENTER_MASK) != 0) {
            i3 = apxe2.a((CharSequence) bnm2.o);
        } else {
            i3 = 0;
        }
        if ((bnm2.a & FragmentTransaction.TRANSIT_EXIT_MASK) != 0) {
            i4 = apxe2.a((CharSequence) bnm2.p);
        } else {
            i4 = 0;
        }
        if ((bnm2.a & 16384) != 0) {
            i5 = apxe2.a((CharSequence) bnm2.q);
        } else {
            i5 = 0;
        }
        int a5 = bnj.a(bnm2.b);
        if (a5 == 0) {
            a5 = 1;
        }
        int i10 = a5 - 1;
        long j = bnm2.d;
        int i11 = bnm2.h;
        int a6 = bpc.a(bnm2.i);
        if (a6 == 0) {
            a6 = 1;
        }
        int i12 = a6 - 1;
        int a7 = bnl.a(bnm2.k);
        if (a7 != 0) {
            i7 = a7;
        }
        return boy.a(apxe, i10, a, j, a2, a3, a4, i11, i12, i, i7 - 1, bnm2.l, bnm2.m, i2, i3, i4, i5);
    }

    private static int[] b(apxe apxe, List list) {
        if (list.isEmpty()) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = a(apxe, (String) list.get(i), true);
        }
        return iArr;
    }

    public static int a(apxe apxe, boy boy) {
        int i;
        int i2;
        apxe apxe2 = apxe;
        boy boy2 = boy;
        if (boy2 == null) {
            return 0;
        }
        int a = a(apxe2, boy.b(), true);
        int a2 = a(apxe2, boy.e(), true);
        int a3 = a(apxe2, boy.f(), true);
        int a4 = a(apxe2, boy.g());
        int j = boy.j();
        if (j != 0) {
            int[] iArr = new int[j];
            apxg apxg = new apxg();
            for (int i3 = 0; i3 < j; i3++) {
                boy2.a(apxg, i3);
                if (apxg.B() != 0) {
                    int[] iArr2 = new int[apxg.B()];
                    for (int i4 = 0; i4 < apxg.B(); i4++) {
                        iArr2[i4] = apxg.j(i4);
                    }
                    i2 = apxg.b(apxe2, iArr2);
                } else {
                    i2 = 0;
                }
                iArr[i3] = apxg.a(apxe2, apxg.S(), i2);
            }
            i = boy.a(apxe2, iArr);
        } else {
            i = 0;
        }
        int a5 = a(apxe2, boy.n());
        int a6 = a(apxe2, boy.o());
        int a7 = a(apxe2, boy.p());
        int a8 = a(apxe2, boy.q());
        return boy.a(apxe, boy.a(), a, boy.d(), a2, a3, a4, boy.h(), boy.i(), i, boy.k(), boy.l(), boy.m(), a5, a6, a7, a8);
    }

    private static int a(apxe apxe, String str) {
        return a(apxe, str, false);
    }

    private static int a(apxe apxe, String str, boolean z) {
        if (!z && TextUtils.isEmpty(str)) {
            return 0;
        }
        amtf.a((Object) str);
        return apxe.a((CharSequence) str);
    }

    public static int a(apxe apxe, ByteBuffer byteBuffer, long j, ByteBuffer byteBuffer2) {
        byteBuffer.mark();
        byteBuffer2.mark();
        int a = apxe.a(byteBuffer);
        int a2 = apxe.a(byteBuffer2);
        byteBuffer.reset();
        byteBuffer2.reset();
        ThreadLocal threadLocal = apxg.b;
        apxe.d(3);
        apxe.a(1, j, 0);
        apxe.c(2, a2);
        apxe.c(0, a);
        int e = apxe.e();
        apxe.b(e, 4);
        apxe.b(e, 8);
        return e;
    }

    private static int a(apxe apxe, List list) {
        int i;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < list.size(); i2++) {
            brm brm = (brm) list.get(i2);
            int a = a(apxe, brm.b, true);
            int[] b = b(apxe, brm.d);
            if (b != null) {
                int length = b.length;
                int i3 = bry.a;
                apxe.a(4, length, 4);
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    apxe.c(b[length]);
                }
                i = apxe.b();
            } else {
                i = 0;
            }
            int i4 = brm.c;
            int i5 = brm.e;
            int i6 = bry.a;
            apxe.d(4);
            apxe.b(3, i5, 0);
            apxe.c(2, i);
            apxe.b(1, i4, 0);
            apxe.c(0, a);
            int e = apxe.e();
            apxe.b(e, 4);
            iArr[i2] = e;
        }
        ThreadLocal threadLocal = apxg.b;
        apxe.a(4, size, 4);
        while (true) {
            size--;
            if (size < 0) {
                return apxe.b();
            }
            apxe.c(iArr[size]);
        }
    }

    public static bob a(apxg apxg) {
        aucd o = bob.f.o();
        String Q = apxg.Q();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bob bob = (bob) o.b;
        Q.getClass();
        bob.a |= 1;
        bob.b = Q;
        long s = apxg.s();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bob bob2 = (bob) o.b;
        bob2.a |= 2;
        bob2.c = s;
        boolean t = apxg.t();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bob bob3 = (bob) o.b;
        bob3.a |= 4;
        bob3.d = t;
        boolean u = apxg.u();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bob bob4 = (bob) o.b;
        bob4.a |= 8;
        bob4.e = u;
        return (bob) o.i();
    }

    public static boz a(int i, List list, List list2, brl brl, String str, List list3, List list4, List list5, String str2, List list6) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        String str3;
        auay auay;
        int i34;
        aucx aucx;
        int i35;
        int i36;
        int[] iArr;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int[] iArr2;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        brl brl2 = brl;
        apxe apxe = new apxe(i);
        if (!list.isEmpty()) {
            int size = list.size();
            int[] iArr3 = new int[size];
            for (int i54 = 0; i54 < list.size(); i54++) {
                iArr3[i54] = a(apxe, (bnm) list.get(i54));
            }
            int i55 = boz.a;
            apxe.a(4, size, 4);
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                apxe.c(iArr3[size]);
            }
            i2 = apxe.b();
        } else {
            i2 = 0;
        }
        int i56 = 3;
        boolean z = true;
        if (!list2.isEmpty()) {
            int size2 = list2.size();
            int[] iArr4 = new int[size2];
            for (int i57 = 0; i57 < list2.size(); i57++) {
                bnn bnn = (bnn) list2.get(i57);
                int a = a(apxe, bnn.b, true);
                int i58 = bnn.c;
                int i59 = bnn.d;
                int i60 = bpa.a;
                apxe.d(3);
                apxe.b(2, i59, 0);
                apxe.b(1, i58, 0);
                apxe.c(0, a);
                int e = apxe.e();
                apxe.b(e, 4);
                iArr4[i57] = e;
            }
            int i61 = boz.a;
            apxe.a(4, size2, 4);
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                apxe.c(iArr4[size2]);
            }
            i3 = apxe.b();
        } else {
            i3 = 0;
        }
        int a2 = a(apxe, brl2.b, true);
        int[] b = b(apxe, brl2.c);
        if (b != null) {
            int length = b.length;
            ThreadLocal threadLocal = apxg.b;
            apxe.a(4, length, 4);
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                apxe.c(b[length]);
            }
            i4 = apxe.b();
        } else {
            i4 = 0;
        }
        int a3 = a(apxe, brl2.e);
        aucx aucx2 = brl2.f;
        if (!aucx2.isEmpty()) {
            int size3 = aucx2.size();
            int[] iArr5 = new int[size3];
            int i62 = 0;
            while (i62 < aucx2.size()) {
                brp brp = (brp) aucx2.get(i62);
                int a4 = a(apxe, brp.b, z);
                int i63 = brp.c;
                int i64 = brp.d;
                ThreadLocal threadLocal2 = apxg.b;
                apxe.d(i56);
                apxe.b(2, i64, Integer.MAX_VALUE);
                apxe.b(1, i63, 0);
                apxe.c(0, a4);
                int e2 = apxe.e();
                apxe.b(e2, 4);
                iArr5[i62] = e2;
                i62++;
                i56 = 3;
                z = true;
            }
            ThreadLocal threadLocal3 = apxg.b;
            apxe.a(4, size3, 4);
            while (true) {
                size3--;
                if (size3 < 0) {
                    break;
                }
                apxe.c(iArr5[size3]);
            }
            i5 = apxe.b();
        } else {
            i5 = 0;
        }
        int a5 = a(apxe, (List) brl2.h);
        aucx aucx3 = brl2.i;
        if (!aucx3.isEmpty()) {
            int size4 = aucx3.size();
            int[] iArr6 = new int[size4];
            int i65 = 0;
            while (i65 < aucx3.size()) {
                brq brq = (brq) aucx3.get(i65);
                int a6 = a(apxe, brq.b, true);
                aucx aucx4 = aucx3;
                int a7 = a(apxe, brq.c, true);
                int i66 = brq.d;
                int i67 = bsb.a;
                apxe.d(3);
                int i68 = i2;
                apxe.b(2, i66, 0);
                apxe.c(1, a7);
                apxe.c(0, a6);
                int e3 = apxe.e();
                apxe.b(e3, 4);
                apxe.b(e3, 6);
                iArr6[i65] = e3;
                i65++;
                aucx3 = aucx4;
                i2 = i68;
            }
            i6 = i2;
            ThreadLocal threadLocal4 = apxg.b;
            apxe.a(4, size4, 4);
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                apxe.c(iArr6[size4]);
            }
            i7 = apxe.b();
        } else {
            i6 = i2;
            i7 = 0;
        }
        aucx aucx5 = brl2.j;
        if (!aucx5.isEmpty()) {
            int size5 = aucx5.size();
            int[] iArr7 = new int[size5];
            int i69 = 0;
            while (i69 < aucx5.size()) {
                bro bro = (bro) aucx5.get(i69);
                int a8 = a(apxe, bro.b, true);
                aucx aucx6 = aucx5;
                int a9 = a(apxe, bro.c, true);
                int i70 = bro.d;
                int i71 = bsa.a;
                apxe.d(3);
                int i72 = i3;
                apxe.b(2, i70, 0);
                apxe.c(1, a9);
                apxe.c(0, a8);
                int e4 = apxe.e();
                apxe.b(e4, 4);
                apxe.b(e4, 6);
                iArr7[i69] = e4;
                i69++;
                aucx5 = aucx6;
                i3 = i72;
            }
            i8 = i3;
            ThreadLocal threadLocal5 = apxg.b;
            apxe.a(4, size5, 4);
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                apxe.c(iArr7[size5]);
            }
            i9 = apxe.b();
        } else {
            i8 = i3;
            i9 = 0;
        }
        aucx aucx7 = brl2.k;
        if (!aucx7.isEmpty()) {
            int size6 = aucx7.size();
            int[] iArr8 = new int[size6];
            int i73 = 0;
            while (i73 < aucx7.size()) {
                brn brn = (brn) aucx7.get(i73);
                int a10 = a(apxe, brn.b, true);
                aucx aucx8 = aucx7;
                int a11 = a(apxe, brn.c, true);
                int i74 = brn.e;
                boolean z2 = brn.d;
                int i75 = brz.a;
                apxe.d(4);
                apxe.b(2, i74, 0);
                apxe.c(1, a11);
                apxe.c(0, a10);
                apxe.a(3, z2);
                int e5 = apxe.e();
                apxe.b(e5, 4);
                apxe.b(e5, 6);
                iArr8[i73] = e5;
                i73++;
                aucx7 = aucx8;
                a2 = a2;
                i4 = i4;
            }
            i10 = a2;
            i11 = i4;
            ThreadLocal threadLocal6 = apxg.b;
            apxe.a(4, size6, 4);
            while (true) {
                size6--;
                if (size6 < 0) {
                    break;
                }
                apxe.c(iArr8[size6]);
            }
            i12 = apxe.b();
        } else {
            i10 = a2;
            i11 = i4;
            i12 = 0;
        }
        aucx aucx9 = brl2.m;
        if (!aucx9.isEmpty()) {
            int size7 = aucx9.size();
            int[] iArr9 = new int[size7];
            int i76 = 0;
            while (i76 < aucx9.size()) {
                bqz bqz = (bqz) aucx9.get(i76);
                int a12 = a(apxe, bqz.b, true);
                int a13 = a(apxe, bqz.c, true);
                int a14 = a(apxe, bqz.d);
                int i77 = bqz.e;
                ThreadLocal threadLocal7 = apxg.b;
                aucx aucx10 = aucx9;
                apxe.d(4);
                apxe.b(3, i77, 0);
                apxe.c(2, a14);
                apxe.c(1, a13);
                apxe.c(0, a12);
                int e6 = apxe.e();
                apxe.b(e6, 4);
                apxe.b(e6, 6);
                iArr9[i76] = e6;
                i76++;
                a3 = a3;
                aucx9 = aucx10;
            }
            i13 = a3;
            ThreadLocal threadLocal8 = apxg.b;
            apxe.a(4, size7, 4);
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                apxe.c(iArr9[size7]);
            }
            i14 = apxe.b();
        } else {
            i13 = a3;
            i14 = 0;
        }
        aucx aucx11 = brl2.n;
        if (!aucx11.isEmpty()) {
            int size8 = aucx11.size();
            int[] iArr10 = new int[size8];
            int i78 = 0;
            while (i78 < aucx11.size()) {
                brg brg = (brg) aucx11.get(i78);
                int a15 = a(apxe, brg.b, true);
                aucx aucx12 = brg.c;
                if (!aucx12.isEmpty()) {
                    int size9 = aucx12.size();
                    int[] iArr11 = new int[size9];
                    aucx = aucx11;
                    int i79 = 0;
                    while (i79 < size9) {
                        aucx aucx13 = aucx12;
                        brf brf = (brf) aucx12.get(i79);
                        int i80 = i5;
                        int i81 = a5;
                        int a16 = a(apxe, brf.b, true);
                        aucx aucx14 = brf.c;
                        if (!aucx14.isEmpty()) {
                            int size10 = aucx14.size();
                            i52 = i7;
                            int[] iArr12 = new int[size10];
                            i51 = i9;
                            int i82 = 0;
                            while (i82 < size10) {
                                aucx aucx15 = aucx14;
                                bre bre = (bre) aucx14.get(i82);
                                int i83 = i12;
                                int a17 = a(apxe, bre.b);
                                int i84 = i14;
                                int i85 = bre.c;
                                boolean z3 = bre.d;
                                int i86 = size8;
                                boolean z4 = bre.e;
                                int[] iArr13 = iArr10;
                                boolean z5 = bre.f;
                                int i87 = i78;
                                boolean z6 = bre.g;
                                int i88 = bre.h;
                                int i89 = brx.a;
                                apxe.d(7);
                                apxe.b(6, i88, 0);
                                apxe.b(1, i85, 0);
                                apxe.c(0, a17);
                                apxe.a(5, z6);
                                apxe.a(4, z5);
                                apxe.a(3, z4);
                                apxe.a(2, z3);
                                iArr12[i82] = apxe.e();
                                i82++;
                                brl brl3 = brl;
                                i12 = i83;
                                aucx14 = aucx15;
                                i14 = i84;
                                size8 = i86;
                                iArr10 = iArr13;
                                i78 = i87;
                                a15 = a15;
                                size9 = size9;
                            }
                            i50 = i12;
                            i49 = i14;
                            i48 = size8;
                            iArr2 = iArr10;
                            i47 = i78;
                            i45 = size9;
                            i46 = a15;
                            ThreadLocal threadLocal9 = apxg.b;
                            apxe.a(4, size10, 4);
                            while (true) {
                                size10--;
                                if (size10 < 0) {
                                    break;
                                }
                                apxe.c(iArr12[size10]);
                            }
                            i53 = apxe.b();
                        } else {
                            i52 = i7;
                            i51 = i9;
                            i50 = i12;
                            i49 = i14;
                            i48 = size8;
                            iArr2 = iArr10;
                            i47 = i78;
                            i45 = size9;
                            i46 = a15;
                            i53 = 0;
                        }
                        ThreadLocal threadLocal10 = apxg.b;
                        apxe.d(2);
                        apxe.c(1, i53);
                        apxe.c(0, a16);
                        int e7 = apxe.e();
                        apxe.b(e7, 4);
                        iArr11[i79] = e7;
                        i79++;
                        brl brl4 = brl;
                        i5 = i80;
                        aucx12 = aucx13;
                        a5 = i81;
                        i7 = i52;
                        i9 = i51;
                        i12 = i50;
                        i14 = i49;
                        size8 = i48;
                        iArr10 = iArr2;
                        i78 = i47;
                        a15 = i46;
                        size9 = i45;
                    }
                    i41 = i7;
                    i43 = i5;
                    i42 = a5;
                    i40 = i9;
                    i39 = i12;
                    i38 = i14;
                    i37 = size8;
                    iArr = iArr10;
                    i36 = i78;
                    i35 = a15;
                    int i90 = brv.a;
                    int i91 = size9;
                    apxe.a(4, i91, 4);
                    for (int i92 = i91 - 1; i92 >= 0; i92--) {
                        apxe.c(iArr11[i92]);
                    }
                    i44 = apxe.b();
                } else {
                    i41 = i7;
                    i43 = i5;
                    i42 = a5;
                    i40 = i9;
                    i39 = i12;
                    i38 = i14;
                    aucx = aucx11;
                    i37 = size8;
                    iArr = iArr10;
                    i36 = i78;
                    i35 = a15;
                    i44 = 0;
                }
                int i93 = brv.a;
                apxe.d(2);
                apxe.c(1, i44);
                apxe.c(0, i35);
                int e8 = apxe.e();
                apxe.b(e8, 4);
                iArr[i36] = e8;
                i78 = i36 + 1;
                aucx11 = aucx;
                brl brl5 = brl;
                i5 = i43;
                a5 = i42;
                i7 = i41;
                i9 = i40;
                i12 = i39;
                i14 = i38;
                size8 = i37;
                iArr10 = iArr;
            }
            i18 = i7;
            i20 = i5;
            i19 = a5;
            i17 = i9;
            i16 = i12;
            i15 = i14;
            int[] iArr14 = iArr10;
            ThreadLocal threadLocal11 = apxg.b;
            int i94 = size8;
            apxe.a(4, i94, 4);
            for (int i95 = i94 - 1; i95 >= 0; i95--) {
                apxe.c(iArr14[i95]);
            }
            i21 = apxe.b();
        } else {
            i18 = i7;
            i20 = i5;
            i19 = a5;
            i17 = i9;
            i16 = i12;
            i15 = i14;
            i21 = 0;
        }
        brl brl6 = brl;
        int a18 = a(apxe, brl6.o, true);
        aucx aucx16 = brl6.p;
        if (!aucx16.isEmpty()) {
            int size11 = aucx16.size();
            int[] iArr15 = new int[size11];
            for (int i96 = 0; i96 < aucx16.size(); i96++) {
                brb brb = (brb) aucx16.get(i96);
                int a19 = a(apxe, brb.b, true);
                int a20 = a(apxe, brb.c);
                int a21 = a(apxe, brb.d);
                boolean z7 = brb.e;
                int i97 = brb.f;
                ThreadLocal threadLocal12 = apxg.b;
                apxe.d(5);
                apxe.b(4, i97, 0);
                apxe.c(2, a21);
                apxe.c(1, a20);
                apxe.c(0, a19);
                apxe.a(3, z7);
                int e9 = apxe.e();
                apxe.b(e9, 4);
                iArr15[i96] = e9;
            }
            ThreadLocal threadLocal13 = apxg.b;
            apxe.a(4, size11, 4);
            while (true) {
                size11--;
                if (size11 < 0) {
                    break;
                }
                apxe.c(iArr15[size11]);
            }
            i22 = apxe.b();
        } else {
            i22 = 0;
        }
        aucx aucx17 = brl6.r;
        if (!aucx17.isEmpty()) {
            int size12 = aucx17.size();
            int[] iArr16 = new int[size12];
            int i98 = 0;
            while (i98 < aucx17.size()) {
                brk brk = (brk) aucx17.get(i98);
                int a22 = a(apxe, brk.d);
                if (brk.b == 6) {
                    str3 = (String) brk.c;
                } else {
                    str3 = "";
                }
                int a23 = a(apxe, str3);
                if (brk.b == 7) {
                    auay = (auay) brk.c;
                } else {
                    auay = auay.b;
                }
                byte[] k = auay.k();
                if (k == null || k.length == 0) {
                    i34 = 0;
                } else {
                    int i99 = brw.a;
                    i34 = apxe.a(k);
                }
                int a24 = brj.a(brk.e);
                if (a24 == 0) {
                    a24 = 1;
                }
                int i100 = a24 - 1;
                int intValue = brk.b == 3 ? ((Integer) brk.c).intValue() : 0;
                aucx aucx18 = aucx17;
                float floatValue = brk.b == 4 ? ((Float) brk.c).floatValue() : 0.0f;
                int i101 = i21;
                boolean booleanValue = brk.b == 5 ? ((Boolean) brk.c).booleanValue() : false;
                int i102 = brk.f;
                int i103 = brw.a;
                apxe.d(8);
                int i104 = a18;
                apxe.b(7, i102, 0);
                apxe.c(6, i34);
                apxe.c(5, a23);
                if (((double) floatValue) != 0.0d) {
                    apxe.a(floatValue);
                    apxe.e(3);
                }
                apxe.b(2, intValue, 0);
                apxe.b(1, i100, 0);
                apxe.c(0, a22);
                apxe.a(4, booleanValue);
                iArr16[i98] = apxe.e();
                i98++;
                a18 = i104;
                aucx17 = aucx18;
                i21 = i101;
            }
            i24 = i21;
            i23 = a18;
            ThreadLocal threadLocal14 = apxg.b;
            apxe.a(4, size12, 4);
            while (true) {
                size12--;
                if (size12 < 0) {
                    break;
                }
                apxe.c(iArr16[size12]);
            }
            i25 = apxe.b();
        } else {
            i24 = i21;
            i23 = a18;
            i25 = 0;
        }
        aucx aucx19 = brl6.s;
        if (!aucx19.isEmpty()) {
            int size13 = aucx19.size();
            int[] iArr17 = new int[size13];
            for (int i105 = 0; i105 < aucx19.size(); i105++) {
                brc brc = (brc) aucx19.get(i105);
                int a25 = a(apxe, brc.b);
                int i106 = brc.c;
                int i107 = bru.a;
                apxe.d(2);
                apxe.b(1, i106, 0);
                apxe.c(0, a25);
                iArr17[i105] = apxe.e();
            }
            ThreadLocal threadLocal15 = apxg.b;
            apxe.a(4, size13, 4);
            while (true) {
                size13--;
                if (size13 < 0) {
                    break;
                }
                apxe.c(iArr17[size13]);
            }
            i26 = apxe.b();
        } else {
            i26 = 0;
        }
        aucx aucx20 = brl6.t;
        if (!aucx20.isEmpty()) {
            int size14 = aucx20.size();
            int[] iArr18 = new int[size14];
            for (int i108 = 0; i108 < aucx20.size(); i108++) {
                brr brr = (brr) aucx20.get(i108);
                int a26 = a(apxe, brr.b, true);
                int a27 = a(apxe, brr.c, true);
                int[] b2 = b(apxe, brr.d);
                if (b2 != null) {
                    int length2 = b2.length;
                    int i109 = bsc.a;
                    apxe.a(4, length2, 4);
                    while (true) {
                        length2--;
                        if (length2 < 0) {
                            break;
                        }
                        apxe.c(b2[length2]);
                    }
                    i33 = apxe.b();
                } else {
                    i33 = 0;
                }
                int i110 = brr.e;
                int i111 = bsc.a;
                apxe.d(4);
                apxe.b(3, i110, 0);
                apxe.c(2, i33);
                apxe.c(1, a27);
                apxe.c(0, a26);
                int e10 = apxe.e();
                apxe.b(e10, 4);
                apxe.b(e10, 6);
                iArr18[i108] = e10;
            }
            ThreadLocal threadLocal16 = apxg.b;
            apxe.a(4, size14, 4);
            while (true) {
                size14--;
                if (size14 < 0) {
                    break;
                }
                apxe.c(iArr18[size14]);
            }
            i27 = apxe.b();
        } else {
            i27 = 0;
        }
        if ((brl6.a & 16) != 0) {
            bra bra = brl6.u;
            if (bra == null) {
                bra = bra.d;
            }
            int a28 = a(apxe, bra.b);
            int i112 = bra.c;
            ThreadLocal threadLocal17 = apxg.b;
            apxe.d(2);
            apxe.b(1, i112, 0);
            apxe.c(0, a28);
            i28 = apxe.e();
        } else {
            i28 = 0;
        }
        int i113 = brl6.d;
        ThreadLocal threadLocal18 = apxg.b;
        apxe.d(17);
        apxe.c(16, i28);
        apxe.c(15, i27);
        apxe.c(14, i26);
        apxe.c(13, i25);
        apxe.c(12, i22);
        apxe.c(11, i23);
        apxe.c(10, i24);
        apxe.c(9, i15);
        apxe.c(8, i16);
        apxe.c(7, i17);
        apxe.c(6, i18);
        apxe.c(5, i19);
        apxe.c(4, i20);
        apxe.c(3, i13);
        apxe.b(2, i113, 0);
        apxe.c(1, i11);
        apxe.c(0, i10);
        int e11 = apxe.e();
        apxe.b(e11, 4);
        apxe.b(e11, 26);
        int a29 = a(apxe, str, true);
        if (!list3.isEmpty()) {
            aucd o = ansh.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ansh ansh = (ansh) o.b;
            ansh.a();
            auab.a((Iterable) list3, (List) ansh.b);
            i29 = apxe.a(((ansh) o.i()).k());
        } else {
            i29 = 0;
        }
        int[] b3 = b(apxe, list5);
        if (b3 != null) {
            int length3 = b3.length;
            apxe.a(4, length3, 4);
            while (true) {
                length3--;
                if (length3 < 0) {
                    break;
                }
                apxe.c(b3[length3]);
            }
            i30 = apxe.b();
        } else {
            i30 = 0;
        }
        int a30 = a(apxe, str2, true);
        if (!list6.isEmpty()) {
            int size15 = list6.size();
            int[] iArr19 = new int[size15];
            int i114 = 0;
            while (i114 < list6.size()) {
                bob bob = (bob) list6.get(i114);
                int a31 = a(apxe, bob.b, true);
                long j = bob.c;
                boolean z8 = bob.d;
                boolean z9 = bob.e;
                apxe.d(4);
                apxe.a(1, j, 0);
                apxe.c(0, a31);
                apxe.a(3, z9);
                apxe.a(2, z8);
                iArr19[i114] = apxe.e();
                i114++;
                a29 = a29;
            }
            i31 = a29;
            apxe.a(4, size15, 4);
            while (true) {
                size15--;
                if (size15 < 0) {
                    break;
                }
                apxe.c(iArr19[size15]);
            }
            i32 = apxe.b();
        } else {
            i31 = a29;
            i32 = 0;
        }
        int a32 = a(apxe, list4);
        apxe.d(10);
        apxe.c(9, a32);
        apxe.c(8, i32);
        apxe.c(7, a30);
        apxe.c(6, i30);
        apxe.c(5, i29);
        apxe.c(4, i31);
        apxe.c(3, e11);
        apxe.c(2, i8);
        apxe.c(1, i6);
        apxe.b(0, 15, 0);
        int e12 = apxe.e();
        apxe.b(e12, 10);
        apxe.b(e12, 12);
        apxe.b(e12, 18);
        apxe.a(e12, "CHMR");
        ByteBuffer f = apxe.f();
        f.remaining();
        return boz.a(f);
    }

    public static ByteBuffer a(String str) {
        return ByteBuffer.wrap(str.getBytes((Charset) apxg.b.get()));
    }
}
