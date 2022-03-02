package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.List;

/* renamed from: aabl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aabl {
    private final Context a;

    public aabl(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public final void a(nxi nxi) {
        iwu iwu;
        if (axbo.a.a().f()) {
            iwu = iwv.a(this.a, true, true);
        } else {
            iwu = iwv.a(this.a, true);
        }
        if (iwu.b()) {
            List a2 = iwu.a(this.a, "GMSCORE_SCHEDULER_EVENT");
            if (a2.size() <= 0) {
                Log.e("NetworkScheduler.Stats", "Unable to log scheduler event because OptInLoggerCreator did not return any functional loggers.");
            } else if (axbo.a.a().b()) {
                hoi a3 = ((hol) a2.get(0)).a(nxi.k());
                a3.f = avsd.UNMETERED_OR_DAILY;
                a3.b();
            } else {
                hoi a4 = ((hol) a2.get(0)).a(nxi.k());
                a4.f = avsd.UNMETERED_ONLY;
                a4.b();
            }
        }
    }
}
