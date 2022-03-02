package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: baa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baa {
    static final bar a = bar.a("id", "layers", "w", "h", "p", "u");
    private static final bar b = bar.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    private static final bar c = bar.a("list");
    private static final bar d = bar.a("cm", "tm", "dr");

    public static auk a(bat bat) {
        int i;
        int i2;
        float f;
        float f2;
        ov ovVar;
        ArrayList arrayList;
        HashMap hashMap;
        float f3;
        int i3;
        int i4;
        bat bat2 = bat;
        float a2 = bbb.a();
        oh ohVar = new oh();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ov ovVar2 = new ov();
        auk auk = new auk();
        bat.c();
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i5 = 0;
        int i6 = 0;
        while (bat.e()) {
            float f7 = f6;
            int i7 = 1;
            switch (bat2.a(b)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    ov ovVar3 = ovVar2;
                    float f8 = f4;
                    float f9 = f5;
                    int i8 = i6;
                    i5 = bat.k();
                    f6 = f7;
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    ov ovVar4 = ovVar2;
                    float f10 = f4;
                    float f11 = f5;
                    int i9 = i5;
                    i6 = bat.k();
                    f6 = f7;
                    continue;
                case 2:
                    ov ovVar5 = ovVar2;
                    float f12 = f5;
                    int i10 = i5;
                    int i11 = i6;
                    f4 = (float) bat.j();
                    f6 = f7;
                    hashMap4 = hashMap4;
                    arrayList3 = arrayList3;
                    continue;
                case 3:
                    ov ovVar6 = ovVar2;
                    float f13 = f4;
                    int i12 = i5;
                    int i13 = i6;
                    f5 = ((float) bat.j()) - 440.32f;
                    f6 = f7;
                    hashMap4 = hashMap4;
                    arrayList3 = arrayList3;
                    continue;
                case 4:
                    ov ovVar7 = ovVar2;
                    float f14 = f4;
                    float f15 = f5;
                    int i14 = i5;
                    int i15 = i6;
                    f6 = (float) bat.j();
                    hashMap4 = hashMap4;
                    arrayList3 = arrayList3;
                    continue;
                case 5:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    ovVar = ovVar2;
                    f = f4;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    String[] split = bat.h().split("\\.");
                    if (!bbb.a(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]))) {
                        auk.a("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 6:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    ovVar = ovVar2;
                    f = f4;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    bat.a();
                    int i16 = 0;
                    while (bat.e()) {
                        ayx a3 = azz.a(bat2, auk);
                        if (a3.u == 3) {
                            i16++;
                        }
                        arrayList2.add(a3);
                        ohVar.b(a3.d, a3);
                        if (i16 > 4) {
                            bay.a("You have " + i16 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    bat.b();
                    break;
                case 7:
                    bat.a();
                    while (bat.e()) {
                        ArrayList arrayList6 = new ArrayList();
                        oh ohVar2 = new oh();
                        bat.c();
                        ArrayList arrayList7 = arrayList3;
                        ov ovVar8 = ovVar2;
                        float f16 = f5;
                        String str = null;
                        String str2 = null;
                        int i17 = 0;
                        HashMap hashMap7 = hashMap4;
                        int i18 = 0;
                        while (bat.e()) {
                            float f17 = f3;
                            int a4 = bat2.a(a);
                            if (a4 != 0) {
                                int i19 = i6;
                                if (a4 == 1) {
                                    bat.a();
                                    while (bat.e()) {
                                        ayx a5 = azz.a(bat2, auk);
                                        ohVar2.b(a5.d, a5);
                                        arrayList6.add(a5);
                                        i5 = i5;
                                    }
                                    i3 = i5;
                                    bat.b();
                                } else if (a4 == 2) {
                                    i17 = bat.k();
                                    f3 = f17;
                                    i6 = i19;
                                } else if (a4 == 3) {
                                    i18 = bat.k();
                                    f3 = f17;
                                    i6 = i19;
                                } else if (a4 == 4) {
                                    str = bat.h();
                                    f3 = f17;
                                    i6 = i19;
                                } else if (a4 != 5) {
                                    bat.g();
                                    bat.l();
                                    i3 = i5;
                                } else {
                                    bat.h();
                                    i3 = i5;
                                }
                                f3 = f17;
                                i6 = i19;
                                i5 = i3;
                            } else {
                                int i20 = i5;
                                int i21 = i6;
                                str2 = bat.h();
                                f3 = f17;
                            }
                        }
                        float f18 = f3;
                        int i22 = i5;
                        int i23 = i6;
                        bat.d();
                        if (str != null) {
                            avd avd = new avd(i17, i18, str2, str);
                            hashMap3.put(avd.c, avd);
                            hashMap4 = hashMap7;
                            arrayList3 = arrayList7;
                            ovVar2 = ovVar8;
                            f5 = f16;
                            f4 = f18;
                            i6 = i23;
                            i5 = i22;
                        } else {
                            hashMap2.put(str2, arrayList6);
                            hashMap4 = hashMap7;
                            arrayList3 = arrayList7;
                            ovVar2 = ovVar8;
                            f5 = f16;
                            f4 = f18;
                            i6 = i23;
                            i5 = i22;
                        }
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    ovVar = ovVar2;
                    f = f3;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    bat.b();
                    break;
                case 8:
                    bat.c();
                    while (bat.e()) {
                        if (bat2.a(c) != 0) {
                            bat.g();
                            bat.l();
                        } else {
                            bat.a();
                            while (bat.e()) {
                                axg a6 = azr.a(bat);
                                hashMap4.put(a6.b, a6);
                            }
                            bat.b();
                        }
                    }
                    bat.d();
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    ovVar = ovVar2;
                    f = f4;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    break;
                case 9:
                    bat.a();
                    while (bat.e()) {
                        axh a7 = azq.a(bat2, auk);
                        ovVar2.b(a7.hashCode(), a7);
                    }
                    bat.b();
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    ovVar = ovVar2;
                    f = f4;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    break;
                case 10:
                    bat.a();
                    while (bat.e()) {
                        bat.c();
                        while (bat.e()) {
                            int a8 = bat2.a(d);
                            if (a8 == 0) {
                                bat.h();
                                i4 = 1;
                            } else if (a8 == i4) {
                                bat.j();
                                i4 = 1;
                            } else if (a8 != 2) {
                                bat.g();
                                bat.l();
                                i4 = 1;
                            } else {
                                bat.j();
                                i4 = 1;
                            }
                        }
                        bat.d();
                        arrayList3.add(new axl());
                        i7 = 1;
                    }
                    bat.b();
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    ovVar = ovVar2;
                    f = f4;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    ovVar = ovVar2;
                    f = f4;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    bat.g();
                    bat.l();
                    break;
            }
            f6 = f7;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            ovVar2 = ovVar;
            f5 = f2;
            f4 = f;
            i6 = i2;
            i5 = i;
        }
        float f19 = f4;
        int i24 = i6;
        auk.g = new Rect(0, 0, (int) (((float) i5) * a2), (int) (((float) i6) * a2));
        auk.h = f4;
        auk.i = f5;
        auk.j = f6;
        auk.f = arrayList2;
        auk.e = ohVar;
        auk.a = hashMap2;
        auk.b = hashMap3;
        auk.d = ovVar2;
        auk.c = hashMap4;
        return auk;
    }
}
