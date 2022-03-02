package defpackage;

import java.util.ArrayList;

/* renamed from: azu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class azu {
    private static final bar a = bar.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final bar b = bar.a("p", "k");
    private static final bar c = bar.a("n", "v");

    static ayf a(bat bat, auk auk) {
        bat bat2 = bat;
        ArrayList arrayList = new ArrayList();
        String str = null;
        int i = 0;
        axp axp = null;
        axq axq = null;
        axs axs = null;
        axs axs2 = null;
        axo axo = null;
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        axo axo2 = null;
        boolean z = false;
        while (bat.e()) {
            switch (bat2.a(a)) {
                case 0:
                    auk auk2 = auk;
                    str = bat.h();
                    break;
                case 1:
                    bat.c();
                    int i4 = -1;
                    while (bat.e()) {
                        int a2 = bat2.a(b);
                        if (a2 == 0) {
                            auk auk3 = auk;
                            i4 = bat.k();
                        } else if (a2 != 1) {
                            bat.g();
                            bat.l();
                        } else {
                            axp = azk.a(bat2, auk, i4);
                        }
                    }
                    auk auk4 = auk;
                    bat.d();
                    break;
                case 2:
                    axq = azk.b(bat, auk);
                    break;
                case 3:
                    if (bat.k() == 1) {
                        i = 1;
                        break;
                    } else {
                        i = 2;
                        break;
                    }
                case 4:
                    axs = azk.c(bat, auk);
                    break;
                case 5:
                    axs2 = azk.c(bat, auk);
                    break;
                case 6:
                    axo = azk.a(bat, auk);
                    break;
                case 7:
                    i2 = ayp.a()[bat.k() - 1];
                    break;
                case 8:
                    i3 = ayq.a()[bat.k() - 1];
                    break;
                case 9:
                    f = (float) bat.j();
                    break;
                case 10:
                    z = bat.i();
                    break;
                case 11:
                    bat.a();
                    while (bat.e()) {
                        bat.c();
                        String str2 = null;
                        axo axo3 = null;
                        while (bat.e()) {
                            int a3 = bat2.a(c);
                            if (a3 != 0) {
                                axo axo4 = axo2;
                                if (a3 != 1) {
                                    bat.g();
                                    bat.l();
                                    axo2 = axo4;
                                } else {
                                    axo3 = azk.a(bat, auk);
                                    axo2 = axo4;
                                }
                            } else {
                                axo axo5 = axo2;
                                str2 = bat.h();
                            }
                        }
                        axo axo6 = axo2;
                        bat.d();
                        if (!str2.equals("o")) {
                            if (str2.equals("d") || str2.equals("g")) {
                                auk.c();
                                arrayList.add(axo3);
                            }
                            axo2 = axo6;
                        } else {
                            axo2 = axo3;
                        }
                    }
                    axo axo7 = axo2;
                    bat.b();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    axo2 = axo7;
                    break;
                default:
                    auk auk5 = auk;
                    bat.g();
                    bat.l();
                    break;
            }
        }
        return new ayf(str, i, axp, axq, axs, axs2, axo, i2, i3, f, arrayList, axo2, z);
    }
}
