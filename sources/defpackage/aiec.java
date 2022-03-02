package defpackage;

import android.content.Context;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: aiec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiec implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ LocationRequestInternal c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ rec f;
    final /* synthetic */ rge g;
    final /* synthetic */ aiei h;

    public aiec(aiei aiei, int i, String str, LocationRequestInternal locationRequestInternal, boolean z, boolean z2, rec rec, rge rge) {
        this.h = aiei;
        this.a = i;
        this.b = str;
        this.c = locationRequestInternal;
        this.d = z;
        this.e = z2;
        this.f = rec;
        this.g = rge;
    }

    public final void run() {
        Context context = this.h.f;
        int i = this.a;
        String str = this.b;
        LocationRequestInternal locationRequestInternal = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        aieb aieb = new aieb(this);
        rec rec = this.f;
        int i2 = aidd.p;
        aida aida = new aida(context, i, str, locationRequestInternal, z, z2, aieb, rec);
        this.h.a((Object) this.f.asBinder(), (aidd) aida);
    }
}
