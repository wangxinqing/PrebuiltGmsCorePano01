package defpackage;

import android.content.Context;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.TimeUnit;

/* renamed from: mxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mxl extends oga {
    private final ErrorReport a;

    public mxl(Context context, HelpConfig helpConfig, aoru aoru, ErrorReport errorReport) {
        super(context, helpConfig, aoru);
        this.a = errorReport;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair a(android.content.Context r4, com.google.android.gms.googlehelp.common.HelpConfig r5, defpackage.aoru r6, com.google.android.gms.feedback.ErrorReport r7) {
        /*
            java.lang.String r0 = "gF_SuggestionsCReq"
            java.lang.String r1 = "Must be called from a worker thread."
            defpackage.iva.b((java.lang.String) r1)
            mxl r1 = new mxl
            r1.<init>(r4, r5, r6, r7)
            r4 = 0
            ogi r5 = r1.k()     // Catch:{ InterruptedException -> 0x00a9, ExecutionException -> 0x00a7, TimeoutException -> 0x00a5 }
            boolean r6 = r1.a((defpackage.ogi) r5)
            if (r6 == 0) goto L_0x00a3
            byte[] r5 = r5.c     // Catch:{ IOException -> 0x009c }
            aubs r6 = defpackage.aubs.c()     // Catch:{ IOException -> 0x009c }
            avlw r7 = defpackage.avlw.b     // Catch:{ IOException -> 0x009c }
            aucj r5 = defpackage.aucj.a((defpackage.aucj) r7, (byte[]) r5, (defpackage.aubs) r6)     // Catch:{ IOException -> 0x009c }
            avlw r5 = (defpackage.avlw) r5     // Catch:{ IOException -> 0x009c }
            com.google.android.gms.googlehelp.common.HelpConfig r6 = r1.d     // Catch:{ IOException -> 0x009c }
            if (r5 == 0) goto L_0x003e
            aucx r7 = r5.a     // Catch:{ IOException -> 0x009c }
            int r7 = r7.size()     // Catch:{ IOException -> 0x009c }
            if (r7 == 0) goto L_0x003e
            defpackage.ofn.e()     // Catch:{ IOException -> 0x009c }
            java.lang.String r7 = "unknownId"
            aucx r2 = r5.a     // Catch:{ IOException -> 0x009c }
            r3 = 0
            java.util.Map r6 = defpackage.oab.a((java.lang.String) r7, (java.util.List) r2, (com.google.android.gms.googlehelp.common.HelpConfig) r6, (boolean) r3)     // Catch:{ IOException -> 0x009c }
            goto L_0x003f
        L_0x003e:
            r6 = r4
        L_0x003f:
            aucx r5 = r5.a     // Catch:{ IOException -> 0x009c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x009c }
        L_0x0045:
            boolean r7 = r5.hasNext()     // Catch:{ IOException -> 0x009c }
            if (r7 == 0) goto L_0x0061
            java.lang.Object r7 = r5.next()     // Catch:{ IOException -> 0x009c }
            avok r7 = (defpackage.avok) r7     // Catch:{ IOException -> 0x009c }
            int r2 = r7.a     // Catch:{ IOException -> 0x009c }
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0045
            avoi r5 = r7.h     // Catch:{ IOException -> 0x009c }
            if (r5 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            avoi r5 = defpackage.avoi.d     // Catch:{ IOException -> 0x009c }
        L_0x005e:
            java.lang.String r5 = r5.b     // Catch:{ IOException -> 0x009c }
            goto L_0x0062
        L_0x0061:
            r5 = r4
        L_0x0062:
            if (r6 == 0) goto L_0x007f
            java.util.Collection r6 = r6.values()     // Catch:{ IOException -> 0x009c }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IOException -> 0x009c }
        L_0x006c:
            boolean r7 = r6.hasNext()     // Catch:{ IOException -> 0x009c }
            if (r7 == 0) goto L_0x007f
            java.lang.Object r7 = r6.next()     // Catch:{ IOException -> 0x009c }
            oab r7 = (defpackage.oab) r7     // Catch:{ IOException -> 0x009c }
            boolean r2 = r7.t()     // Catch:{ IOException -> 0x009c }
            if (r2 == 0) goto L_0x006c
            goto L_0x0080
        L_0x007f:
            r7 = r4
        L_0x0080:
            if (r7 == 0) goto L_0x0093
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0093
            android.content.Context r4 = r1.c
            com.google.android.gms.googlehelp.common.HelpConfig r6 = r1.d
            aoru r1 = r1.g
            android.util.Pair r4 = defpackage.mxw.a(r4, r6, r1, r7, r5)
            goto L_0x0094
        L_0x0093:
        L_0x0094:
            if (r4 != 0) goto L_0x00a4
            java.lang.String r5 = "Unsupported/empty response received"
            android.util.Log.e(r0, r5)
            return r4
        L_0x009c:
            r5 = move-exception
            java.lang.String r6 = "Parsing suggestion response data failed."
            android.util.Log.e(r0, r6, r5)
            goto L_0x00a4
        L_0x00a3:
        L_0x00a4:
            return r4
        L_0x00a5:
            r5 = move-exception
            goto L_0x00aa
        L_0x00a7:
            r5 = move-exception
            goto L_0x00aa
        L_0x00a9:
            r5 = move-exception
        L_0x00aa:
            java.lang.String r6 = "Fetching suggestion failed."
            android.util.Log.e(r0, r6, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxl.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, aoru, com.google.android.gms.feedback.ErrorReport):android.util.Pair");
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return axgy.a.a().C();
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return (int) TimeUnit.SECONDS.convert(axgy.k(), TimeUnit.MILLISECONDS);
    }

    public final void onPreNetworkDispatch() {
        izj.b(3074);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ogg.a(axhb.a.a().b());
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        nzw.c = this.a.b;
        nzw.d = axgy.d();
    }
}
