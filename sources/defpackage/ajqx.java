package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ajqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajqx {
    public static aqek a(InputStream inputStream, aqem aqem) {
        aqek aqek = new aqek(aqem);
        try {
            aqek.a(inputStream, Integer.MAX_VALUE);
            aqek.b();
            if (aqek.a()) {
                return aqek;
            }
            throw new IOException("Missing required field or has more than one value for no repeated field.");
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException("Runtime exception while parsing.");
        }
    }

    public static List a(aqek aqek, int i) {
        if (aqek == null) {
            return null;
        }
        int j = aqek.j(i);
        ArrayList arrayList = new ArrayList(j);
        for (int i2 = 0; i2 < j; i2++) {
            arrayList.add(aqek.f(i, i2));
        }
        return arrayList;
    }
}
