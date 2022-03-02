package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* renamed from: abcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abcv extends abdb {
    final /* synthetic */ int a;
    final /* synthetic */ Account b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abcv(icc icc, int i, Account account) {
        super(icc);
        this.a = i;
        this.b = account;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((abdu) ((abdy) ibf).x()).a(this.a, this.b, (abdr) new abcu(this));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return status;
    }
}
