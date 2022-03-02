package defpackage;

import com.google.android.gms.audit.LogAuditRecordsRequest;

/* renamed from: ehn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ehn extends egx implements niz {
    private final aqof a;
    private final nix b;

    public ehn(aqof aqof, nix nix) {
        this.a = aqof;
        this.b = nix;
    }

    public final void a(LogAuditRecordsRequest logAuditRecordsRequest, ifu ifu) {
        this.b.a(new eho(this.a, logAuditRecordsRequest, ifu));
    }
}
