package defpackage;

import android.os.IBinder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: vae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vae {
    public final Map a = new ConcurrentHashMap();
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());

    public final void a(String str) {
        vad vad = (vad) this.a.remove(str);
        if (vad != null) {
            jjg jjg = tgc.a;
            vad.c = false;
            for (IBinder unlinkToDeath : vad.b.values()) {
                unlinkToDeath.unlinkToDeath(vad, 0);
            }
        }
    }
}
