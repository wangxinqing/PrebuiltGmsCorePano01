package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: azxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azxy {
    public static final azxy a = new azxy(new azxu(), azxv.a);
    public final ConcurrentMap b = new ConcurrentHashMap();

    public azxy(azxx... azxxArr) {
        for (int i = 0; i < 2; i++) {
            azxx azxx = azxxArr[i];
            this.b.put(azxx.a(), azxx);
        }
    }
}
