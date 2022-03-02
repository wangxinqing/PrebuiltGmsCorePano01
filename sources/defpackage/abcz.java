package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.signin.internal.AuthAccountResult;

/* renamed from: abcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abcz extends abdb {
    final /* synthetic */ AuthAccountRequest a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abcz(icc icc, AuthAccountRequest authAccountRequest) {
        super(icc);
        this.a = authAccountRequest;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((abdu) ((abdy) ibf).x()).a(this.a, (abdr) new abcy(this));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new AuthAccountResult(8, (Intent) null);
    }
}
