package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.CreateFolderRequest;

/* renamed from: kvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kvj extends kuz {
    final /* synthetic */ jzv a;
    final /* synthetic */ kvp b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kvj(kvp kvp, icc icc, jzv jzv) {
        super(icc);
        this.b = kvp;
        this.a = jzv;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        kvf kvf = (kvf) ibf;
        this.a.a.a(kvf.c);
        kvf.A().a(new CreateFolderRequest(this.b.a, this.a.a), (kwg) new kvh(this));
    }

    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new kvi(status, (kvp) null);
    }
}
