package defpackage;

import com.google.android.gms.drive.internal.ListParentsRequest;

/* renamed from: kvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kvk extends kuz {
    final /* synthetic */ kvp a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kvk(kvp kvp, icc icc) {
        super(icc);
        this.a = kvp;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((kvf) ibf).A().a(new ListParentsRequest(this.a.a), (kwg) new kvl(this));
    }
}
