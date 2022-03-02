package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: tyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tyx {
    public final Map a;
    private final DiscoveryChimeraService b;
    private final Context c;

    public tyx(Context context) {
        this.c = context;
        this.b = (DiscoveryChimeraService) thl.a(context, DiscoveryChimeraService.class);
        this.a = aymw.l() ? new ConcurrentHashMap() : new HashMap();
    }

    public final void a() {
        DiscoveryChimeraService discoveryChimeraService = this.b;
        amzt j = amzy.j();
        for (Map.Entry entry : aymw.l() ? anax.a((Collection) this.a.entrySet()) : this.a.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            tzf tzf = (tzf) entry.getValue();
            String str = tzf.b;
            String str2 = tzf.f;
            String b2 = tzb.b(this.c, tzf);
            avbx avbx = avbx.NEARBY_DEVICE;
            Intent a2 = tzb.a(this.c, Integer.valueOf(intValue), tzf);
            Bitmap a3 = tzb.a(this.c, tzf);
            DiscoveryListItem discoveryListItem = r6;
            DiscoveryListItem discoveryListItem2 = new DiscoveryListItem(str, str2, b2, (String) null, (String) null, 0.0f, false, avbx, a2, a3, false);
            j.c(discoveryListItem);
        }
        discoveryChimeraService.a(0, j.a());
    }

    public final void a(int i) {
        this.a.remove(Integer.valueOf(i));
        a();
    }
}
