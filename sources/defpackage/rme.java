package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.ReportingState;

/* renamed from: rme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rme extends idf {
    final /* synthetic */ Account a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rme(icc icc, Account account) {
        super(rmf.a, icc);
        this.a = account;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        rmq rmq = (rmq) ibf;
        Account account = this.a;
        rmq.w();
        a((icl) new rmr(Status.a, ((rmo) rmq.x()).a(account)));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new rmr(status, (ReportingState) null);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        super.a((icl) obj);
    }
}
