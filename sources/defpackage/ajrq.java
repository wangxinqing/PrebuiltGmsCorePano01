package defpackage;

import com.google.android.gms.location.LocationResult;
import com.google.android.location.wearable.WearableLocationChimeraService;
import java.util.Collection;
import java.util.Collections;

/* renamed from: ajrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajrq extends reh {
    public final String a;
    final /* synthetic */ WearableLocationChimeraService b;
    private final roo c;

    public ajrq(WearableLocationChimeraService wearableLocationChimeraService, String str) {
        this.b = wearableLocationChimeraService;
        this.a = str;
        iby iby = wearableLocationChimeraService.k;
        if (iby != null) {
            this.c = new roo(iby, (reh) this, wearableLocationChimeraService.g);
        } else {
            this.c = new roo(wearableLocationChimeraService.a(), (reh) this, wearableLocationChimeraService.g);
        }
    }

    public final void a() {
        a(Collections.emptyList(), false);
    }

    public final Collection b() {
        return this.c.a;
    }

    public final void a(LocationResult locationResult) {
        synchronized (this.b.f) {
            if (!ayap.j()) {
                WearableLocationChimeraService wearableLocationChimeraService = this.b;
                ajrn ajrn = wearableLocationChimeraService.h;
                aebd.a(wearableLocationChimeraService.b(), this.a, "com/google/android/location/fused/wearable/LOCATIONS", ajri.a(locationResult.b).a());
            } else {
                WearableLocationChimeraService wearableLocationChimeraService2 = this.b;
                ajrp ajrp = wearableLocationChimeraService2.j;
                wearableLocationChimeraService2.l.a(this.a, "com/google/android/location/fused/wearable/LOCATIONS", ajri.a(locationResult.b).a());
            }
        }
    }

    public final void a(Collection collection, boolean z) {
        this.c.a(collection, z);
        WearableLocationChimeraService wearableLocationChimeraService = this.b;
        if (wearableLocationChimeraService.k == null) {
            int i = 0;
            while (true) {
                ou ouVar = wearableLocationChimeraService.i;
                if (i >= ouVar.h) {
                    wearableLocationChimeraService.a().b();
                    return;
                } else if (((ajrq) ouVar.c(i)).b().isEmpty()) {
                    i++;
                } else {
                    wearableLocationChimeraService.a().a();
                    return;
                }
            }
        }
    }
}
