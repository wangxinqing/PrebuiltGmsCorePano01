package com.google.android.gms.recaptcha;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RecaptchaApiChimeraService extends nio {
    protected aufc a;
    protected lya b;
    private final zqv k;

    static {
        RecaptchaApiChimeraService.class.getSimpleName();
    }

    public RecaptchaApiChimeraService() {
        this(zqw.a(), new zop());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (defpackage.augk.a(r5.a, r5.k.a()).a <= defpackage.azdk.a.e().a()) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.lya a() {
        /*
            r5 = this;
            monitor-enter(r5)
            lya r0 = r5.b     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0006
            goto L_0x0028
        L_0x0006:
            boolean r0 = r0.a()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0028
            aufc r0 = r5.a     // Catch:{ all -> 0x003c }
            zqv r1 = r5.k     // Catch:{ all -> 0x003c }
            aufc r1 = r1.a()     // Catch:{ all -> 0x003c }
            aubn r0 = defpackage.augk.a((defpackage.aufc) r0, (defpackage.aufc) r1)     // Catch:{ all -> 0x003c }
            long r0 = r0.a     // Catch:{ all -> 0x003c }
            azdk r2 = defpackage.azdk.a     // Catch:{ all -> 0x003c }
            azdl r2 = r2.a()     // Catch:{ all -> 0x003c }
            long r2 = r2.a()     // Catch:{ all -> 0x003c }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0038
        L_0x0028:
            java.lang.String r0 = "recaptcha-android"
            lya r0 = defpackage.lxz.a((android.content.Context) r5, (java.lang.String) r0)     // Catch:{ all -> 0x003c }
            r5.b = r0     // Catch:{ all -> 0x003c }
            zqv r0 = r5.k     // Catch:{ all -> 0x003c }
            aufc r0 = r0.a()     // Catch:{ all -> 0x003c }
            r5.a = r0     // Catch:{ all -> 0x003c }
        L_0x0038:
            lya r0 = r5.b     // Catch:{ all -> 0x003c }
            monitor-exit(r5)
            return r0
        L_0x003c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.recaptcha.RecaptchaApiChimeraService.a():lya");
    }

    public final synchronized boolean b() {
        boolean z;
        lya lya = this.b;
        if (lya == null || !lya.a()) {
            z = false;
        } else {
            this.b.b();
            this.b = null;
            z = true;
        }
        return z;
    }

    protected RecaptchaApiChimeraService(zqv zqv, zop zop) {
        super(205, "com.google.android.gms.recaptcha.service.START", (Set) anfv.a, 3, 9);
        this.k = zqv;
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit.a(new zpe(this, new nix(this, this.e, this.f), getServiceRequest.d));
    }
}
