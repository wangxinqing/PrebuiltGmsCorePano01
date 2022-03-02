package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.RecordConsentRequest;

/* renamed from: abcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abcx extends abdb {
    final /* synthetic */ RecordConsentRequest a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abcx(icc icc, RecordConsentRequest recordConsentRequest) {
        super(icc);
        this.a = recordConsentRequest;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((abdu) ((abdy) ibf).x()).a(this.a, (abdr) new abcw(this));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return status;
    }
}
