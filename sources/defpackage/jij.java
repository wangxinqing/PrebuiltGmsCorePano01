package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: jij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jij {
    public static boolean a(Context context, iby iby) {
        if (!aekv.b(context)) {
            return false;
        }
        try {
            return ((ick) acws.a(iby.o(), 5, TimeUnit.SECONDS)).p();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("CheckboxUtil", "Could not retrieve Usage & Diagnostics setting. Giving up.", e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r0.getAll().isEmpty() != false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r4, boolean r5) {
        /*
            boolean r0 = defpackage.aekv.a()
            java.lang.String r1 = "usagereporting"
            r2 = 0
            if (r0 == 0) goto L_0x0032
            awyz r0 = defpackage.awyz.a
            awza r0 = r0.a()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0029
            android.content.Context r0 = defpackage.aekv.c(r4)
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.util.Map r3 = r0.getAll()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            goto L_0x0037
        L_0x0029:
            boolean r0 = defpackage.aekv.b(r4)
            if (r0 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r0 = 0
            goto L_0x0037
        L_0x0032:
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r1, r2)
        L_0x0037:
            if (r0 == 0) goto L_0x0040
            java.lang.String r4 = "OptInUsageReporting"
            boolean r4 = r0.getBoolean(r4, r2)
            return r4
        L_0x0040:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jij.a(android.content.Context, boolean):boolean");
    }
}
