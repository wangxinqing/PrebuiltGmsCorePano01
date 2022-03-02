package defpackage;

import android.app.PendingIntent;
import com.google.android.location.internal.server.GoogleLocationChimeraService;
import java.util.Map;

/* renamed from: aipp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aipp {
    final /* synthetic */ PendingIntent a;
    final /* synthetic */ GoogleLocationChimeraService b;

    public aipp(GoogleLocationChimeraService googleLocationChimeraService, PendingIntent pendingIntent) {
        this.b = googleLocationChimeraService;
        this.a = pendingIntent;
    }

    public final void a(boolean z, Map map, Map map2) {
        int i;
        if (!z) {
            i = 3;
        } else {
            i = 1;
        }
        int size = map.size();
        int size2 = map2.size();
        StringBuilder sb = new StringBuilder(77);
        sb.append("OK Response, CacheResults size ");
        sb.append(size);
        sb.append(", cellCacheResults size ");
        sb.append(size2);
        sb.toString();
        GoogleLocationChimeraService.a(this.b.getApplicationContext(), this.a, i, map, map2);
    }
}
