package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: khz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khz implements khy {
    private final kkz a;
    private final AppIdentity b;
    private final MetadataBundle c;
    private final DriveId d;
    private final kdb e;
    private final kdo f;

    public khz(kkz kkz, AppIdentity appIdentity, MetadataBundle metadataBundle, DriveId driveId, kdb kdb, kdo kdo) {
        this.a = kkz;
        this.b = appIdentity;
        this.c = metadataBundle;
        this.d = driveId;
        this.e = kdb;
        this.f = kdo;
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        kav kav = new kav(this.a, this.b, str, this.c, this.d, this.f);
        int a2 = this.e.a(kav);
        if (a2 != 0) {
            kav = null;
        }
        return new khs(a2, kav);
    }
}
