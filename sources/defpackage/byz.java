package defpackage;

import android.app.PendingIntent;
import java.util.IdentityHashMap;

/* renamed from: byz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class byz {
    public final IdentityHashMap a = new IdentityHashMap();
    public final PendingIntent b;
    public final int c;

    public byz(PendingIntent pendingIntent, int i) {
        this.b = pendingIntent;
        this.c = i;
    }

    public final void a(bzv bzv) {
        this.a.put(bzv, bzv);
    }

    public final boolean a() {
        return !this.a.isEmpty();
    }
}
