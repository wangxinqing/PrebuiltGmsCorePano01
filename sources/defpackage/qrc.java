package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: qrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qrc {
    public static aorr a(qrm qrm, qrk qrk, qrn qrn, qrl qrl, Executor executor) {
        return aopr.a(aorl.a((Iterable) amzy.a(qrm.a(), qrk.a(), qrl.a(), qrn.a())), (amqy) new qrb(), executor);
    }

    public static String a(long j, long j2, Boolean bool) {
        return String.format("%d %d %s", new Object[]{Long.valueOf(j), Long.valueOf(j2), bool});
    }

    public static void a(qrm qrm, qrk qrk, qrl qrl, qrn qrn) {
        if (!axvz.e()) {
            qrm.a();
        }
        if (!axvz.f()) {
            qrk.a();
            qrl.a();
            qrn.a();
        }
    }

    public static boolean a(Context context) {
        return axvz.i() && kf.a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }
}
