package defpackage;

import android.os.HandlerThread;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: ajfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajfj {
    public static final jjg a = jjg.a("QMonitor", iyc.LOCATION);
    private static ajfj g;
    public final ihs b;
    public ajgu c;
    public HandlerThread d;
    private final jiq e = new ajgr();
    private final Random f = new SecureRandom();

    private ajfj(ihs ihs) {
        this.b = ihs;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: ampu} */
    /* JADX WARNING: type inference failed for: r3v19, types: [ajef, ajgo] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01fe  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a() {
        /*
            boolean r0 = defpackage.ajfl.d()
            if (r0 == 0) goto L_0x0251
            java.lang.Class<ajfj> r0 = defpackage.ajfj.class
            monitor-enter(r0)
            ajfj r1 = g     // Catch:{ all -> 0x024e }
            if (r1 != 0) goto L_0x024c
            ajfj r1 = new ajfj     // Catch:{ all -> 0x024e }
            ihs r2 = defpackage.ihs.b()     // Catch:{ all -> 0x024e }
            r1.<init>(r2)     // Catch:{ all -> 0x024e }
            g = r1     // Catch:{ all -> 0x024e }
            android.os.HandlerThread r2 = new android.os.HandlerThread     // Catch:{ all -> 0x024e }
            java.lang.String r3 = "QMon"
            r4 = 9
            r2.<init>(r3, r4)     // Catch:{ all -> 0x024e }
            r1.d = r2     // Catch:{ all -> 0x024e }
            r2.start()     // Catch:{ all -> 0x024e }
            ajgu r2 = new ajgu     // Catch:{ all -> 0x024e }
            java.lang.String r3 = "Q"
            android.os.HandlerThread r4 = r1.d     // Catch:{ all -> 0x024e }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x024e }
            r1.c = r2     // Catch:{ all -> 0x024e }
            ajfl r2 = new ajfl     // Catch:{ all -> 0x024e }
            ihs r3 = r1.b     // Catch:{ all -> 0x024e }
            ajgu r4 = r1.c     // Catch:{ all -> 0x024e }
            r5 = 1
            ajgd r4 = r4.a((int) r5)     // Catch:{ all -> 0x024e }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x024e }
            ajgu r3 = r1.c     // Catch:{ all -> 0x024e }
            ajgp r4 = new ajgp     // Catch:{ all -> 0x024e }
            java.lang.String r6 = "QSettings"
            r4.<init>(r6, r2)     // Catch:{ all -> 0x024e }
            r3.b(r4)     // Catch:{ all -> 0x024e }
            ayek r2 = defpackage.ayek.a     // Catch:{ all -> 0x024e }
            ayeo r2 = r2.a()     // Catch:{ all -> 0x024e }
            boolean r2 = r2.seismicUseNewLocationApi()     // Catch:{ all -> 0x024e }
            r3 = 2
            if (r2 != 0) goto L_0x0066
            ajde r2 = new ajde     // Catch:{ all -> 0x024e }
            ihs r4 = r1.b     // Catch:{ all -> 0x024e }
            ajgu r6 = r1.c     // Catch:{ all -> 0x024e }
            ajgd r3 = r6.a((int) r3)     // Catch:{ all -> 0x024e }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x024e }
            goto L_0x0073
        L_0x0066:
            ajdd r2 = new ajdd     // Catch:{ all -> 0x024e }
            ihs r4 = r1.b     // Catch:{ all -> 0x024e }
            ajgu r6 = r1.c     // Catch:{ all -> 0x024e }
            ajgd r3 = r6.a((int) r3)     // Catch:{ all -> 0x024e }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x024e }
        L_0x0073:
            ajgu r3 = r1.c     // Catch:{ all -> 0x024e }
            ajgp r4 = new ajgp     // Catch:{ all -> 0x024e }
            java.lang.String r6 = "QLocation"
            r4.<init>(r6, r2)     // Catch:{ all -> 0x024e }
            r3.b(r4)     // Catch:{ all -> 0x024e }
            ayek r3 = defpackage.ayek.a     // Catch:{ all -> 0x024e }
            ayeo r3 = r3.a()     // Catch:{ all -> 0x024e }
            boolean r3 = r3.seismicDebugBypassBattery()     // Catch:{ all -> 0x024e }
            if (r3 != 0) goto L_0x00a7
            ajdg r3 = new ajdg     // Catch:{ all -> 0x024e }
            ihs r4 = r1.b     // Catch:{ all -> 0x024e }
            android.os.HandlerThread r6 = r1.d     // Catch:{ all -> 0x024e }
            ajgu r7 = r1.c     // Catch:{ all -> 0x024e }
            r8 = 3
            ajgd r7 = r7.a((int) r8)     // Catch:{ all -> 0x024e }
            r3.<init>(r4, r6, r7)     // Catch:{ all -> 0x024e }
            ajgu r4 = r1.c     // Catch:{ all -> 0x024e }
            ajgp r6 = new ajgp     // Catch:{ all -> 0x024e }
            java.lang.String r7 = "QPower"
            r6.<init>(r7, r3)     // Catch:{ all -> 0x024e }
            r4.b(r6)     // Catch:{ all -> 0x024e }
        L_0x00a7:
            ayek r3 = defpackage.ayek.a     // Catch:{ all -> 0x024e }
            ayeo r3 = r3.a()     // Catch:{ all -> 0x024e }
            boolean r3 = r3.seismicDebugBypassMotion()     // Catch:{ all -> 0x024e }
            if (r3 != 0) goto L_0x00cd
            ajcv r3 = new ajcv     // Catch:{ all -> 0x024e }
            ihs r4 = r1.b     // Catch:{ all -> 0x024e }
            ajgu r6 = r1.c     // Catch:{ all -> 0x024e }
            r7 = 4
            ajgd r6 = r6.a((int) r7)     // Catch:{ all -> 0x024e }
            r3.<init>(r4, r6)     // Catch:{ all -> 0x024e }
            ajgu r4 = r1.c     // Catch:{ all -> 0x024e }
            ajgp r6 = new ajgp     // Catch:{ all -> 0x024e }
            java.lang.String r7 = "QMotion"
            r6.<init>(r7, r3)     // Catch:{ all -> 0x024e }
            r4.b(r6)     // Catch:{ all -> 0x024e }
        L_0x00cd:
            ayek r3 = defpackage.ayek.a     // Catch:{ all -> 0x024e }
            ayeo r3 = r3.a()     // Catch:{ all -> 0x024e }
            boolean r3 = r3.seismicEnableStartupDelay()     // Catch:{ all -> 0x024e }
            if (r3 == 0) goto L_0x00fa
            ajgu r3 = r1.c     // Catch:{ all -> 0x024e }
            ajgv r4 = new ajgv     // Catch:{ all -> 0x024e }
            ayek r6 = defpackage.ayek.a     // Catch:{ all -> 0x024e }
            ayeo r6 = r6.a()     // Catch:{ all -> 0x024e }
            long r7 = r6.seismicMinStartupDelayMillis()     // Catch:{ all -> 0x024e }
            ayek r6 = defpackage.ayek.a     // Catch:{ all -> 0x024e }
            ayeo r6 = r6.a()     // Catch:{ all -> 0x024e }
            long r9 = r6.seismicMaxStartupDelayMillis()     // Catch:{ all -> 0x024e }
            java.util.Random r11 = r1.f     // Catch:{ all -> 0x024e }
            r6 = r4
            r6.<init>(r7, r9, r11)     // Catch:{ all -> 0x024e }
            r3.b(r4)     // Catch:{ all -> 0x024e }
        L_0x00fa:
            long r3 = defpackage.ayek.x()     // Catch:{ all -> 0x024e }
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0120
            ajef r3 = new ajef     // Catch:{ all -> 0x024e }
            ihs r4 = r1.b     // Catch:{ all -> 0x024e }
            ajgu r6 = r1.c     // Catch:{ all -> 0x024e }
            r7 = 11
            ajgd r6 = r6.a((int) r7)     // Catch:{ all -> 0x024e }
            r3.<init>(r4, r6)     // Catch:{ all -> 0x024e }
            ajgu r4 = r1.c     // Catch:{ all -> 0x024e }
            ajgp r6 = new ajgp     // Catch:{ all -> 0x024e }
            java.lang.String r7 = "QScreen"
            r6.<init>(r7, r3)     // Catch:{ all -> 0x024e }
            r4.b(r6)     // Catch:{ all -> 0x024e }
            goto L_0x0125
        L_0x0120:
            ajfi r3 = new ajfi     // Catch:{ all -> 0x024e }
            r3.<init>()     // Catch:{ all -> 0x024e }
        L_0x0125:
            ajfo r4 = new ajfo     // Catch:{ all -> 0x024e }
            r4.<init>(r3)     // Catch:{ all -> 0x024e }
            ajex r3 = new ajex     // Catch:{ all -> 0x024e }
            jiq r6 = r1.e     // Catch:{ all -> 0x024e }
            ajeg r7 = new ajeg     // Catch:{ all -> 0x024e }
            r7.<init>(r1, r4)     // Catch:{ all -> 0x024e }
            r3.<init>(r2, r6, r7)     // Catch:{ all -> 0x024e }
            ayel r4 = defpackage.ayel.a     // Catch:{ all -> 0x024e }
            ayem r4 = r4.a()     // Catch:{ all -> 0x024e }
            boolean r4 = r4.quakeApiEnable()     // Catch:{ all -> 0x024e }
            if (r4 != 0) goto L_0x0144
            goto L_0x0213
        L_0x0144:
            ayel r4 = defpackage.ayel.a     // Catch:{ all -> 0x024e }
            ayem r4 = r4.a()     // Catch:{ all -> 0x024e }
            boolean r4 = r4.quakeApiV2Enable()     // Catch:{ all -> 0x024e }
            if (r4 != 0) goto L_0x0161
            ajgu r4 = r1.c     // Catch:{ all -> 0x024e }
            ajfb r5 = new ajfb     // Catch:{ all -> 0x024e }
            ajej r6 = new ajej     // Catch:{ all -> 0x024e }
            r6.<init>(r1)     // Catch:{ all -> 0x024e }
            r5.<init>(r2, r6)     // Catch:{ all -> 0x024e }
            r4.b(r5)     // Catch:{ all -> 0x024e }
            goto L_0x0213
        L_0x0161:
            ayel r4 = defpackage.ayel.a     // Catch:{ all -> 0x024e }
            ayem r4 = r4.a()     // Catch:{ all -> 0x024e }
            boolean r4 = r4.quakeApiBackoffEnable()     // Catch:{ all -> 0x024e }
            if (r4 != 0) goto L_0x0171
            ampu r4 = defpackage.ampu.a     // Catch:{ all -> 0x024e }
            r9 = r4
            goto L_0x0198
        L_0x0171:
            ajct r4 = new ajct     // Catch:{ all -> 0x024e }
            amsv r6 = defpackage.ajel.a     // Catch:{ all -> 0x024e }
            ajgu r7 = r1.c     // Catch:{ all -> 0x024e }
            r8 = 14
            ajgd r7 = r7.a((int) r8)     // Catch:{ all -> 0x024e }
            r4.<init>(r6, r7)     // Catch:{ all -> 0x024e }
            amri r4 = defpackage.amri.b(r4)     // Catch:{ all -> 0x024e }
            ajgu r6 = r1.c     // Catch:{ all -> 0x024e }
            ajgp r7 = new ajgp     // Catch:{ all -> 0x024e }
            java.lang.String r8 = "QBackoff"
            r9 = r4
            amrt r9 = (defpackage.amrt) r9     // Catch:{ all -> 0x024e }
            java.lang.Object r9 = r9.a     // Catch:{ all -> 0x024e }
            ajgo r9 = (defpackage.ajgo) r9     // Catch:{ all -> 0x024e }
            r7.<init>(r8, r9)     // Catch:{ all -> 0x024e }
            r6.b(r7)     // Catch:{ all -> 0x024e }
            r9 = r4
        L_0x0198:
            ajed r10 = new ajed     // Catch:{ all -> 0x024e }
            amsv r4 = defpackage.ajem.a     // Catch:{ all -> 0x024e }
            amsv r6 = defpackage.ajen.a     // Catch:{ all -> 0x024e }
            r10.<init>(r4, r6)     // Catch:{ all -> 0x024e }
            boolean r4 = defpackage.ayel.e()     // Catch:{ all -> 0x024e }
            if (r4 == 0) goto L_0x01a8
            goto L_0x01b7
        L_0x01a8:
            boolean r4 = defpackage.ayel.f()     // Catch:{ all -> 0x024e }
            if (r4 != 0) goto L_0x01b7
            boolean r4 = defpackage.ayel.d()     // Catch:{ all -> 0x024e }
            if (r4 != 0) goto L_0x01b7
            ajdw r4 = defpackage.ajer.a     // Catch:{ all -> 0x024e }
            goto L_0x01d1
        L_0x01b7:
            ajev r4 = new ajev     // Catch:{ all -> 0x024e }
            ajeo r6 = new ajeo     // Catch:{ all -> 0x024e }
            r6.<init>(r1)     // Catch:{ all -> 0x024e }
            amsv r7 = defpackage.ajep.a     // Catch:{ all -> 0x024e }
            r4.<init>(r6, r7)     // Catch:{ all -> 0x024e }
            r4.getClass()     // Catch:{ all -> 0x024e }
            ajeq r6 = new ajeq     // Catch:{ all -> 0x024e }
            r6.<init>(r4)     // Catch:{ all -> 0x024e }
            ajgu r7 = r1.c     // Catch:{ all -> 0x024e }
            r7.b(r4)     // Catch:{ all -> 0x024e }
            r4 = r6
        L_0x01d1:
            ajfa r14 = new ajfa     // Catch:{ all -> 0x024e }
            boolean r6 = defpackage.ayel.b()     // Catch:{ all -> 0x024e }
            r7 = r6 ^ 1
            r3.getClass()     // Catch:{ all -> 0x024e }
            ajes r11 = new ajes     // Catch:{ all -> 0x024e }
            r11.<init>(r3)     // Catch:{ all -> 0x024e }
            r3.getClass()     // Catch:{ all -> 0x024e }
            ajet r12 = new ajet     // Catch:{ all -> 0x024e }
            r12.<init>(r3)     // Catch:{ all -> 0x024e }
            ajeh r13 = new ajeh     // Catch:{ all -> 0x024e }
            r13.<init>(r1, r9, r4, r10)     // Catch:{ all -> 0x024e }
            r6 = r14
            r8 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x024e }
            ajgu r4 = r1.c     // Catch:{ all -> 0x024e }
            r4.b(r14)     // Catch:{ all -> 0x024e }
            boolean r4 = defpackage.ayel.b()     // Catch:{ all -> 0x024e }
            if (r4 == 0) goto L_0x0213
            ajey r4 = new ajey     // Catch:{ all -> 0x024e }
            ihs r5 = r1.b     // Catch:{ all -> 0x024e }
            amsv r6 = defpackage.ajei.a     // Catch:{ all -> 0x024e }
            jbs r7 = new jbs     // Catch:{ all -> 0x024e }
            ihs r8 = r1.b     // Catch:{ all -> 0x024e }
            r7.<init>(r8)     // Catch:{ all -> 0x024e }
            r4.<init>(r5, r6, r7, r14)     // Catch:{ all -> 0x024e }
            ajgu r5 = r1.c     // Catch:{ all -> 0x024e }
            r5.b(r4)     // Catch:{ all -> 0x024e }
        L_0x0213:
            ajfh r4 = new ajfh     // Catch:{ all -> 0x024e }
            ihs r5 = r1.b     // Catch:{ all -> 0x024e }
            jiq r6 = r1.e     // Catch:{ all -> 0x024e }
            r4.<init>(r5, r6, r2)     // Catch:{ all -> 0x024e }
            ayek r5 = defpackage.ayek.a     // Catch:{ all -> 0x024e }
            ayeo r5 = r5.a()     // Catch:{ all -> 0x024e }
            boolean r5 = r5.seismicEnableGls()     // Catch:{ all -> 0x024e }
            if (r5 == 0) goto L_0x023d
            ajgu r5 = r1.c     // Catch:{ all -> 0x024e }
            ajfc r12 = new ajfc     // Catch:{ all -> 0x024e }
            ihs r7 = r1.b     // Catch:{ all -> 0x024e }
            ajek r11 = new ajek     // Catch:{ all -> 0x024e }
            r11.<init>(r1)     // Catch:{ all -> 0x024e }
            r6 = r12
            r8 = r2
            r9 = r4
            r10 = r3
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x024e }
            r5.b(r12)     // Catch:{ all -> 0x024e }
        L_0x023d:
            ajgu r2 = r1.c     // Catch:{ all -> 0x024e }
            r2.b(r4)     // Catch:{ all -> 0x024e }
            ajgu r2 = r1.c     // Catch:{ all -> 0x024e }
            r2.b(r3)     // Catch:{ all -> 0x024e }
            ajgu r1 = r1.c     // Catch:{ all -> 0x024e }
            r1.a()     // Catch:{ all -> 0x024e }
        L_0x024c:
            monitor-exit(r0)     // Catch:{ all -> 0x024e }
            return
        L_0x024e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x024e }
            throw r1
        L_0x0251:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajfj.a():void");
    }
}
