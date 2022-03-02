package defpackage;

import android.content.Context;

/* renamed from: usz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class usz {
    public static String a(Context context, String str) {
        nz nzVar = new nz();
        nzVar.put("APP_NAME", "Nearby");
        nzVar.put("ID", str);
        aosh f = aosh.f();
        new usy(f, context, nzVar).start();
        return (String) thr.c("DroidGuard.getResult", f, aymi.a.a().aT());
    }
}
