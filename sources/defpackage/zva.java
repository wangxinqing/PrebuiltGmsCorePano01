package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: zva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zva implements Runnable {
    private final zuk a;
    private final SharedPreferences b;
    private final zty c;

    static {
        zsg.a("DeviceInfoLoggerTask");
    }

    public zva(Context context, zuk zuk) {
        SharedPreferences a2 = zti.a(context);
        zuz zuz = new zuz(context);
        this.a = zuk;
        this.b = a2;
        this.c = zuz;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: aucd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: avdk} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            zty r0 = r7.c     // Catch:{ Exception -> 0x0098 }
            zuk r1 = r7.a     // Catch:{ Exception -> 0x0098 }
            avdq r2 = defpackage.avdq.A     // Catch:{ Exception -> 0x0098 }
            aucd r2 = r2.o()     // Catch:{ Exception -> 0x0098 }
            avdk r2 = (defpackage.avdk) r2     // Catch:{ Exception -> 0x0098 }
            boolean r3 = defpackage.azdq.p()     // Catch:{ Exception -> 0x0098 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x005a
            r3 = r0
            zuz r3 = (defpackage.zuz) r3     // Catch:{ Exception -> 0x0098 }
            zvd r3 = r3.b     // Catch:{ Exception -> 0x0098 }
            java.lang.String r6 = r1.a     // Catch:{ Exception -> 0x0098 }
            boolean r3 = r3.a(r6)     // Catch:{ Exception -> 0x0098 }
            if (r3 == 0) goto L_0x005a
            r2 = r0
            zuz r2 = (defpackage.zuz) r2     // Catch:{ Exception -> 0x0098 }
            android.content.Context r2 = r2.a     // Catch:{ Exception -> 0x0098 }
            avdq r2 = defpackage.zuj.a(r2)     // Catch:{ Exception -> 0x0098 }
            r3 = 5
            java.lang.Object r3 = r2.c(r3)     // Catch:{ Exception -> 0x0098 }
            aucd r3 = (defpackage.aucd) r3     // Catch:{ Exception -> 0x0098 }
            r3.a((defpackage.aucj) r2)     // Catch:{ Exception -> 0x0098 }
            r2 = r3
            avdk r2 = (defpackage.avdk) r2     // Catch:{ Exception -> 0x0098 }
            boolean r3 = r2.c     // Catch:{ Exception -> 0x0098 }
            if (r3 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            r2.c()     // Catch:{ Exception -> 0x0098 }
            r2.c = r5     // Catch:{ Exception -> 0x0098 }
        L_0x0041:
            aucj r3 = r2.b     // Catch:{ Exception -> 0x0098 }
            avdq r3 = (defpackage.avdq) r3     // Catch:{ Exception -> 0x0098 }
            int r6 = r3.a     // Catch:{ Exception -> 0x0098 }
            r6 = r6 | 64
            r3.a = r6     // Catch:{ Exception -> 0x0098 }
            r3.g = r4     // Catch:{ Exception -> 0x0098 }
            r4 = r6 | 128(0x80, float:1.794E-43)
            r3.a = r4     // Catch:{ Exception -> 0x0098 }
            r3.h = r5     // Catch:{ Exception -> 0x0098 }
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r3.a = r4     // Catch:{ Exception -> 0x0098 }
            r3.l = r5     // Catch:{ Exception -> 0x0098 }
            goto L_0x0070
        L_0x005a:
            boolean r3 = r2.c     // Catch:{ Exception -> 0x0098 }
            if (r3 != 0) goto L_0x005f
            goto L_0x0064
        L_0x005f:
            r2.c()     // Catch:{ Exception -> 0x0098 }
            r2.c = r5     // Catch:{ Exception -> 0x0098 }
        L_0x0064:
            aucj r3 = r2.b     // Catch:{ Exception -> 0x0098 }
            avdq r3 = (defpackage.avdq) r3     // Catch:{ Exception -> 0x0098 }
            int r5 = r3.a     // Catch:{ Exception -> 0x0098 }
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            r3.a = r5     // Catch:{ Exception -> 0x0098 }
            r3.l = r4     // Catch:{ Exception -> 0x0098 }
        L_0x0070:
            aucj r2 = r2.i()     // Catch:{ Exception -> 0x0098 }
            avdq r2 = (defpackage.avdq) r2     // Catch:{ Exception -> 0x0098 }
            byte[] r2 = r2.k()     // Catch:{ Exception -> 0x0098 }
            java.lang.String r1 = r1.a     // Catch:{ Exception -> 0x0098 }
            zuz r0 = (defpackage.zuz) r0     // Catch:{ Exception -> 0x0098 }
            ztj r0 = r0.e     // Catch:{ Exception -> 0x0098 }
            boolean r0 = defpackage.zty.a((byte[]) r2, (java.lang.String) r1, (defpackage.ztj) r0)     // Catch:{ Exception -> 0x0098 }
            if (r0 == 0) goto L_0x0097
            android.content.SharedPreferences r0 = r7.b     // Catch:{ Exception -> 0x0098 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x0098 }
            java.lang.String r1 = "romanesco-contacts-logger-full-upload-timestamp"
            r2 = 0
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)     // Catch:{ Exception -> 0x0098 }
            r0.apply()     // Catch:{ Exception -> 0x0098 }
        L_0x0097:
            return
        L_0x0098:
            r0 = move-exception
            zsi r0 = defpackage.zsi.a()
            java.lang.String r1 = "DeviceLoggerTask.logData_failure"
            r0.a((java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zva.run():void");
    }
}
