package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.CreateFileRequest;

/* renamed from: kur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kur extends kuz {
    final /* synthetic */ jzv a;
    final /* synthetic */ DriveId b;
    final /* synthetic */ int c;
    final /* synthetic */ int m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kur(icc icc, jzv jzv, DriveId driveId, int i, int i2) {
        super(icc);
        this.a = jzv;
        this.b = driveId;
        this.c = i;
        this.m = i2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        kvf kvf = (kvf) ibf;
        this.a.a.a(kvf.c);
        kvf.A().a(new CreateFileRequest(this.b, this.a.a, (Contents) null, this.m, false, (String) null, 0, this.c), (kwg) new kup(this));
    }

    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new kuq(status, (DriveId) null);
    }
}
