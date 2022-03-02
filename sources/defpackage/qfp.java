package defpackage;

import android.content.Context;

/* renamed from: qfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfp {
    public static void a(Context context, String str, Throwable th, qfn qfn) {
        String str2;
        Object[] objArr = new Object[1];
        if (str == null) {
            str2 = "null";
        } else {
            str2 = str;
        }
        objArr[0] = str2;
        qfn.a(th, "%s", objArr);
        if (Math.random() <= axuy.a.a().K()) {
            mwd mwd = new mwd(th);
            mwd.i = "com.google.android.gms.instantapps";
            mwd.c = "com.google.android.gms.instantapps.SILENT_FEEDBACK";
            mwd.b();
            if (str != null) {
                mwd.b = str;
            }
            mvd.a(context).b(mwd.a()).a((acvp) new qfo(qfn));
        }
    }
}
