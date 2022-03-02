package defpackage;

import android.location.Location;
import android.os.SystemClock;

/* renamed from: aivr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aivr extends qvw {
    final /* synthetic */ aivs a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aivr(aivs aivs, String str, String str2) {
        super(str, str2);
        this.a = aivs;
    }

    /* access modifiers changed from: protected */
    public final void a(Location location) {
        aivu aivu;
        if ("gps".equals(location.getProvider())) {
            aiyk aiyk = aiyk.g;
            long a2 = aiyk.a(location);
            if (a2 == 0) {
                a2 = SystemClock.elapsedRealtime();
            }
            if (!ahyi.a(location) && (aivu = (aivu) this.a.a.get()) != null && !aiyk.b(location)) {
                aivu.a(this.a.b, 0, new aiwz(location, a2, aivu.e.a()), false);
            }
        }
    }
}
