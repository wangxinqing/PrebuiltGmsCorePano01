package com.google.android.gms.auth.api.credentials.credentialsaving;

import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CredentialSavingChimeraService extends nio {
    public static Status a(qbf qbf) {
        int i = qbf.a;
        if (i == 7) {
            return new Status(7);
        }
        if (i == 28433) {
            return new Status(16, "Cannot find a matching credential.");
        }
        if (i == 28436) {
            return new Status(16, "Caller has been temporarily blacklisted due to too many canceled sign-in prompts");
        }
        if (i == 28442) {
            return new Status(10, "Invalid calling package");
        }
        if (i != 28443) {
            return Status.c;
        }
        return new Status(10, "Caller not whitelisted to call CredentialSaving APIs");
    }

    public CredentialSavingChimeraService() {
        super(223, "com.google.android.gms.auth.api.identity.service.credentialsaving.START", (Set) anfv.a, 3, 9);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0053, code lost:
        r12 = (android.view.autofill.AutofillManager) getSystemService(android.view.autofill.AutofillManager.class);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.nit r11, com.google.android.gms.common.internal.GetServiceRequest r12) {
        /*
            r10 = this;
            java.lang.String r0 = r12.d
            amri r0 = defpackage.hiq.a(r10, r0)
            boolean r1 = r0.a()
            r2 = 0
            if (r1 != 0) goto L_0x0013
            r12 = 10
            r11.a((int) r12, (android.os.Bundle) r2)
            return
        L_0x0013:
            fdn r1 = new fdn
            nix r5 = new nix
            com.google.android.gms.common.apiservice.LifecycleSynchronizer r3 = r10.e
            aoru r4 = r10.f
            r5.<init>(r10, r3, r4)
            hol r3 = new hol
            ihs r4 = defpackage.ihs.b()
            java.lang.String r6 = "IDENTITY_GMSCORE"
            r3.<init>(r4, r6, r2)
            java.lang.Object r0 = r0.b()
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r12.d
            android.os.Bundle r12 = r12.g
            fsb r0 = new fsb
            r0.<init>()
            java.lang.String r2 = "session_id"
            java.lang.String r12 = r12.getString(r2)
            if (r12 == 0) goto L_0x0046
            defpackage.iva.c(r12)
            r0.a = r12
        L_0x0046:
            fsc r8 = new fsc
            java.lang.String r12 = r0.a
            r8.<init>(r12)
            boolean r12 = defpackage.jkr.e()
            if (r12 == 0) goto L_0x0068
            java.lang.Class<android.view.autofill.AutofillManager> r12 = android.view.autofill.AutofillManager.class
            java.lang.Object r12 = r10.getSystemService(r12)
            android.view.autofill.AutofillManager r12 = (android.view.autofill.AutofillManager) r12
            if (r12 == 0) goto L_0x0068
            pzr r0 = new pzr
            r0.<init>(r12)
            amri r12 = defpackage.amri.b(r0)
            r9 = r12
            goto L_0x006b
        L_0x0068:
            ampu r12 = defpackage.ampu.a
            r9 = r12
        L_0x006b:
            r3 = r1
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.credentialsaving.CredentialSavingChimeraService.a(nit, com.google.android.gms.common.internal.GetServiceRequest):void");
    }
}
