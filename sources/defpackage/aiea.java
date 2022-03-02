package defpackage;

import android.content.Context;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: aiea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiea implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ LocationRequestInternal c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ ref f;
    final /* synthetic */ rge g;
    final /* synthetic */ aiei h;

    public aiea(aiei aiei, int i, String str, LocationRequestInternal locationRequestInternal, boolean z, boolean z2, ref ref, rge rge) {
        this.h = aiei;
        this.a = i;
        this.b = str;
        this.c = locationRequestInternal;
        this.d = z;
        this.e = z2;
        this.f = ref;
        this.g = rge;
    }

    public final void run() {
        Context context = this.h.f;
        int i = this.a;
        String str = this.b;
        LocationRequestInternal locationRequestInternal = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        aidz aidz = new aidz(this);
        ref ref = this.f;
        int i2 = aidd.p;
        aidb aidb = new aidb(context, i, str, locationRequestInternal, z, z2, aidz, ref);
        this.h.a((Object) this.f.asBinder(), (aidd) aidb);
    }
}
