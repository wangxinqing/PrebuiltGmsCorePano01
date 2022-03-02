package defpackage;

/* renamed from: azo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azo implements bao {
    public static final azo a = new azo();
    private static final bar b = bar.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private azo() {
    }

    public final /* bridge */ /* synthetic */ Object a(bat bat, float f) {
        bat.c();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i = 3;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = true;
        while (bat.e()) {
            switch (bat.a(b)) {
                case 0:
                    str = bat.h();
                    break;
                case 1:
                    str2 = bat.h();
                    break;
                case 2:
                    d = bat.j();
                    break;
                case 3:
                    int k = bat.k();
                    if (k > 2 || k < 0) {
                        i = 3;
                        break;
                    } else {
                        i = new int[]{1, 2, 3}[k];
                        break;
                    }
                case 4:
                    i2 = bat.k();
                    break;
                case 5:
                    d2 = bat.j();
                    break;
                case 6:
                    d3 = bat.j();
                    break;
                case 7:
                    i3 = azw.a(bat);
                    break;
                case 8:
                    i4 = azw.a(bat);
                    break;
                case 9:
                    d4 = bat.j();
                    break;
                case 10:
                    z = bat.i();
                    break;
                default:
                    bat.g();
                    bat.l();
                    break;
            }
        }
        bat bat2 = bat;
        bat.d();
        return new axf(str, str2, d, i, i2, d2, d3, i3, i4, d4, z);
    }
}
