package defpackage;

import android.content.Context;

/* renamed from: cqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cqh {
    private static cqg a;

    public static synchronized cql a(Context context, cqe cqe, hhj hhj) {
        cqg cqg;
        cqb cqb;
        synchronized (cqh.class) {
            if (a == null) {
                if (cqe != null) {
                    cqb = cqe;
                } else {
                    cqb = new cqb(context);
                }
                a = new cqg(context, cqb, new cqj(hhj.b), new cqf(context), hhj);
            }
            cqg = a;
        }
        return cqg;
    }
}
