package defpackage;

import android.util.Log;

/* renamed from: akik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akik implements aksb {
    final /* synthetic */ aknh a;

    public akik(aknh aknh) {
        this.a = aknh;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.a((assl) obj);
    }

    public final void a(Throwable th) {
        if (Log.isLoggable("Places", 5)) {
            alfy.b("Places", "Failed to download inference model weights PlacesServer", th);
        }
        this.a.a();
    }
}
