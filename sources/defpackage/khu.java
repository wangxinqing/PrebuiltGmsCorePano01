package defpackage;

import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: khu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khu implements khy {
    private final kkz a;
    private final AppIdentity b;
    private final knc c;
    private final MetadataBundle d;
    private final kdb e;
    private final String f;
    private final kdo g;

    public khu(kkz kkz, AppIdentity appIdentity, knc knc, MetadataBundle metadataBundle, kdb kdb, String str, kdo kdo) {
        iva.a((Object) kkz);
        this.a = kkz;
        iva.a((Object) appIdentity);
        this.b = appIdentity;
        iva.a((Object) knc);
        this.c = knc;
        this.d = metadataBundle;
        iva.a((Object) kdb);
        this.e = kdb;
        this.f = str;
        iva.a((Object) kdo);
        this.g = kdo;
        MetadataBundle metadataBundle2 = this.d;
        boolean z = true;
        if (metadataBundle2 != null && metadataBundle2.c(lce.M)) {
            z = false;
        }
        iva.b(z);
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        kat kat = new kat(this.a, this.b, this.c, str, this.d, this.f, this.g);
        int a2 = this.e.a(kat);
        if (a2 != 0) {
            kat = null;
        }
        return new khs(a2, kat);
    }
}
