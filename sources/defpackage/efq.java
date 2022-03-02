package defpackage;

import android.content.Context;
import com.google.android.gms.audiomodem.service.AudioModemChimeraService;

/* renamed from: efq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class efq extends irg {
    final /* synthetic */ AudioModemChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public efq(AudioModemChimeraService audioModemChimeraService, Context context) {
        super(context, 48, new int[0]);
        this.a = audioModemChimeraService;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (defpackage.thh.b(r4.a, r6) == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.isv r5, com.google.android.gms.common.internal.GetServiceRequest r6) {
        /*
            r4 = this;
            java.lang.String r6 = r6.d
            boolean r0 = defpackage.jhg.b()
            r1 = 0
            if (r0 != 0) goto L_0x006f
            com.google.android.gms.audiomodem.service.AudioModemChimeraService r0 = r4.a
            defpackage.jhg.c(r0, r6)
            com.google.android.gms.audiomodem.service.AudioModemChimeraService r0 = r4.a
            hya r0 = defpackage.hya.a((android.content.Context) r0)
            boolean r0 = r0.b((java.lang.String) r6)
            if (r0 != 0) goto L_0x006f
            boolean r0 = defpackage.aynf.f()
            if (r0 == 0) goto L_0x0029
            com.google.android.gms.audiomodem.service.AudioModemChimeraService r0 = r4.a
            boolean r0 = defpackage.thh.b(r0, r6)
            if (r0 != 0) goto L_0x006f
            goto L_0x0053
        L_0x0029:
            r0 = 44
            amsk r0 = defpackage.amsk.a((char) r0)
            aymc r2 = defpackage.aymc.a
            aymd r2 = r2.a()
            java.lang.String r2 = r2.w()
            java.util.List r0 = r0.c(r2)
            r2 = 0
        L_0x003e:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x0053
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x006f
            int r2 = r2 + 1
            goto L_0x003e
        L_0x0053:
            java.lang.SecurityException r5 = new java.lang.SecurityException
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "Not allowed: "
            int r1 = r6.length()
            if (r1 != 0) goto L_0x0067
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            goto L_0x006b
        L_0x0067:
            java.lang.String r6 = r0.concat(r6)
        L_0x006b:
            r5.<init>(r6)
            throw r5
        L_0x006f:
            com.google.android.gms.audiomodem.service.AudioModemChimeraService r6 = r4.a
            monitor-enter(r6)
            com.google.android.gms.audiomodem.service.AudioModemChimeraService r0 = r4.a     // Catch:{ all -> 0x0087 }
            efz r0 = r0.e()     // Catch:{ all -> 0x0087 }
            r2 = 0
            if (r0 != 0) goto L_0x0081
            r0 = 8
            r5.a((int) r0, (android.os.IBinder) r2, (android.os.Bundle) r2)     // Catch:{ all -> 0x0087 }
            goto L_0x0085
        L_0x0081:
            r5.a((int) r1, (android.os.IBinder) r0, (android.os.Bundle) r2)     // Catch:{ all -> 0x0087 }
        L_0x0085:
            monitor-exit(r6)     // Catch:{ all -> 0x0087 }
            return
        L_0x0087:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0087 }
            goto L_0x008b
        L_0x008a:
            throw r5
        L_0x008b:
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efq.a(isv, com.google.android.gms.common.internal.GetServiceRequest):void");
    }
}
