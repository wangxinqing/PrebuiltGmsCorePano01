package defpackage;

import java.util.Comparator;

/* renamed from: aetf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aetf implements Comparator {
    public static final aetf a = new aetf();

    private aetf() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        aetg aetg = (aetg) obj;
        aetg aetg2 = (aetg) obj2;
        byte[] a2 = aetg.a();
        byte[] a3 = aetg2.a();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = a2.length;
            if (i2 < length && i3 < a3.length) {
                byte b = a2[i2] & 255;
                byte b2 = a3[i3] & 255;
                if (b != b2) {
                    i = b - b2;
                    break;
                }
                i2++;
                i3++;
            } else {
                i = length - a3.length;
            }
        }
        if (i != 0) {
            return i;
        }
        if (aetg.b() != aetg2.b()) {
            return aetg.b() == 2 ? -1 : 1;
        }
        return 0;
    }
}
