package defpackage;

import android.graphics.Path;

/* renamed from: azt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class azt {
    private static final bar a = bar.a("nm", "g", "o", "t", "s", "e", "r", "hd");
    private static final bar b = bar.a("p", "k");

    static aye a(bat bat, auk auk) {
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        axp axp = null;
        axq axq = null;
        axs axs = null;
        axs axs2 = null;
        int i = 0;
        boolean z = false;
        while (bat.e()) {
            switch (bat.a(a)) {
                case 0:
                    str = bat.h();
                    break;
                case 1:
                    bat.c();
                    int i2 = -1;
                    while (bat.e()) {
                        int a2 = bat.a(b);
                        if (a2 == 0) {
                            i2 = bat.k();
                        } else if (a2 != 1) {
                            bat.g();
                            bat.l();
                        } else {
                            axp = azk.a(bat, auk, i2);
                        }
                    }
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
                    if (bat.k() == 1) {
                        fillType = Path.FillType.WINDING;
                        break;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                        break;
                    }
                case 7:
                    z = bat.i();
                    break;
                default:
                    bat.g();
                    bat.l();
                    break;
            }
        }
        return new aye(str, i, fillType, axp, axq, axs, axs2, z);
    }
}
