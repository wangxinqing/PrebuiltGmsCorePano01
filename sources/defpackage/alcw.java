package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: alcw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alcw extends icn {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ alda c;

    public alcw(alda alda, int i, String str) {
        this.c = alda;
        this.a = i;
        this.b = str;
    }

    public final void a(Status status) {
        if (Log.isLoggable("Places", 6)) {
            String valueOf = String.valueOf(status.toString());
            Log.e("Places", valueOf.length() == 0 ? new String("Failed to get location details: ") : "Failed to get location details: ".concat(valueOf));
        }
        int i = status.i;
        if (!(i == 7 || i == 8) || this.a <= 1) {
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Giving up fetching location details.");
            }
            alcx alcx = this.c.f;
            if (alcx != null) {
                alcx.a(false);
                return;
            }
            return;
        }
        this.c.l = new alcv(this);
        alda alda = this.c;
        alda.e.postDelayed(alda.l, alda.a);
    }

    public final /* bridge */ /* synthetic */ void b(icl icl) {
        rhr rhr = (rhr) icl;
        if (rhr.a() > 0) {
            this.c.i = ((rkr) rhr.a(0)).r();
            alda alda = this.c;
            alda.j = null;
            alda.a();
        } else {
            a(new Status(13, "Zero results returned"));
        }
        rhr.c();
    }
}
