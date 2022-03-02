package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.AuthorizeAccessRequest;

/* renamed from: kvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kvg extends kuy {
    final /* synthetic */ long a;
    final /* synthetic */ DriveId b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kvg(icc icc, long j, DriveId driveId) {
        super(icc);
        this.a = j;
        this.b = driveId;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((kvf) ibf).A().a(new AuthorizeAccessRequest(this.a, this.b), (kwg) new kxn(this));
    }
}
