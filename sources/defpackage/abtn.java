package defpackage;

import com.google.android.gms.smartdevice.d2d.TargetDeviceChimeraService;
import java.util.Collections;
import java.util.Set;

/* renamed from: abtn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abtn extends irg {
    public abva a;
    final /* synthetic */ TargetDeviceChimeraService b;
    private acgy h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abtn(TargetDeviceChimeraService targetDeviceChimeraService) {
        super(targetDeviceChimeraService, 76, new int[0]);
        this.b = targetDeviceChimeraService;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.isv r12, com.google.android.gms.common.internal.GetServiceRequest r13) {
        /*
            r11 = this;
            com.google.android.gms.smartdevice.d2d.TargetDeviceChimeraService r4 = r11.b
            java.lang.String r6 = r13.d
            acpo r0 = new acpo
            r0.<init>(r4)
            acpo r1 = new acpo
            r1.<init>(r4)
            boolean r2 = defpackage.azlf.c()
            if (r2 == 0) goto L_0x003c
            defpackage.jix.h(r4)
            boolean r2 = defpackage.jkr.g()
            if (r2 == 0) goto L_0x001e
            goto L_0x003c
        L_0x001e:
            boolean r2 = r1.b(r6)
            if (r2 == 0) goto L_0x0025
            goto L_0x002b
        L_0x0025:
            boolean r1 = r1.a(r6)
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            goto L_0x0044
        L_0x002c:
            java.lang.SecurityException r12 = new java.lang.SecurityException
            java.lang.String r13 = java.lang.String.valueOf(r6)
            java.lang.String r0 = " not authorized"
            java.lang.String r13 = r13.concat(r0)
            r12.<init>(r13)
            throw r12
        L_0x003c:
            isq r1 = new isq
            r1.<init>(r6)
            r1.b()
        L_0x0044:
            com.google.android.gms.common.Feature[] r13 = r13.i
            r9 = 0
            r10 = 0
            if (r13 == 0) goto L_0x0075
            int r1 = r13.length
            if (r1 == 0) goto L_0x0075
            r13 = r13[r10]
            com.google.android.gms.common.Feature r1 = defpackage.abmo.a
            boolean r13 = r13.equals(r1)
            if (r13 == 0) goto L_0x0074
            acgy r13 = r11.h
            if (r13 != 0) goto L_0x006c
            acgy r13 = new acgy
            com.google.android.gms.smartdevice.d2d.TargetDeviceChimeraService r1 = r11.b
            int r2 = com.google.android.gms.smartdevice.d2d.TargetDeviceChimeraService.e
            com.google.android.gms.common.apiservice.LifecycleSynchronizer r1 = r1.d
            boolean r0 = r0.b(r6)
            r13.<init>(r1, r4, r6, r0)
            r11.h = r13
        L_0x006c:
            acgy r13 = r11.h
            r13.asBinder()
            r12.a((int) r10, (android.os.IBinder) r13, (android.os.Bundle) r9)
        L_0x0074:
            return
        L_0x0075:
            abva r13 = r11.a
            if (r13 != 0) goto L_0x0097
            abva r13 = new abva
            com.google.android.gms.smartdevice.d2d.TargetDeviceChimeraService r1 = r11.b
            int r2 = com.google.android.gms.smartdevice.d2d.TargetDeviceChimeraService.e
            com.google.android.gms.common.apiservice.LifecycleSynchronizer r1 = r1.d
            abpn r2 = com.google.android.gms.smartdevice.d2d.TargetDeviceChimeraService.a
            acab r3 = com.google.android.gms.smartdevice.d2d.TargetDeviceChimeraService.b
            com.google.android.gms.smartdevice.d2d.TargetDeviceChimeraService r5 = r11.b
            android.os.Handler r5 = r5.c
            boolean r7 = r0.b(r6)
            boolean r8 = r0.a(r6)
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.a = r13
        L_0x0097:
            abva r13 = r11.a
            r13.asBinder()
            r12.a((int) r10, (android.os.IBinder) r13, (android.os.Bundle) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abtn.a(isv, com.google.android.gms.common.internal.GetServiceRequest):void");
    }
}
