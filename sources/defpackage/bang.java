package defpackage;

import java.util.List;
import java.util.logging.Logger;

/* renamed from: bang  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bang {
    static {
        Logger.getLogger(bang.class.getName());
    }

    private bang() {
    }

    public static byte[][] a(List list) {
        int size = list.size();
        byte[][] bArr = new byte[(size + size)][];
        int size2 = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            baob baob = (baob) list.get(i2);
            int i3 = i + 1;
            bArr[i] = baob.f.f();
            i = i3 + 1;
            bArr[i3] = baob.g.f();
        }
        return balr.a(bArr);
    }
}
