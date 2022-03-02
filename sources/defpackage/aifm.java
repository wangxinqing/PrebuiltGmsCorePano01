package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: aifm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aifm extends aics implements ajqh {
    private final ajqi a;
    private Collection b = Collections.emptyList();
    private final ArrayList c = new ArrayList();
    private boolean d = false;
    private boolean f = false;

    public aifm(Context context, Looper looper, aiex aiex) {
        super(aiex);
        this.a = new ajqi(context, this, looper);
    }

    private final void c(boolean z) {
        Collection collection = this.b;
        if (this.d) {
            if (!collection.isEmpty() && this.c.isEmpty()) {
                this.c.ensureCapacity(this.b.size());
                int minPriority = (int) axxj.a.a().minPriority();
                for (LocationRequestInternal locationRequestInternal : this.b) {
                    LocationRequest locationRequest = locationRequestInternal.b;
                    int i = locationRequest.a;
                    if (i != 100) {
                        if (i == 102) {
                            if (locationRequest.b >= (locationRequest.c() ? axxj.b() : axxj.c())) {
                            }
                        }
                    }
                    long b2 = locationRequest.c() ? axxj.b() : axxj.c();
                    if (locationRequest.b < b2 && locationRequest.a >= minPriority) {
                        LocationRequest locationRequest2 = new LocationRequest(locationRequest);
                        locationRequestInternal = LocationRequestInternal.a(locationRequestInternal);
                        locationRequestInternal.a(locationRequest2);
                        locationRequest2.c(b2);
                    }
                    this.c.add(locationRequestInternal);
                }
                collection = this.c;
            } else {
                collection = this.c;
            }
        }
        aiex aiex = this.e;
        boolean z2 = false;
        if (!this.d && z) {
            z2 = true;
        }
        aiex.a(collection, z2);
    }

    public final void a() {
        if (!this.f) {
            this.f = true;
            this.a.a();
            this.e.a();
        }
    }

    public final void b() {
        if (this.f) {
            this.f = false;
            this.a.b();
            this.e.b();
        }
    }

    public final void a(Collection collection, boolean z) {
        this.b = collection;
        this.c.clear();
        c(z);
    }

    public final void b(boolean z) {
        if (z != this.d) {
            this.d = z;
            c(false);
        }
    }
}
