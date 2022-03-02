package defpackage;

import android.os.Bundle;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;

/* renamed from: aagx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aagx extends aahc implements jbh {
    private final osf a;
    private final ozc b;

    public aagx(osf osf, ozc ozc) {
        iva.a((Object) osf);
        this.a = osf;
        this.b = ozc;
    }

    public final void a(aaha aaha) {
        osf osf = this.a;
        osf.c.d(new aags(osf, this.b, aaha));
    }

    public final void a(Bundle bundle, aaha aaha) {
        osf osf = this.a;
        osf.c.d(new aagr(osf, bundle, this.b, aaha));
    }

    public final void a(ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, aaha aaha) {
        osf osf = this.a;
        osf.c.d(new aagw(osf, clearDebugUiCacheCall$Request, this.b, aaha));
    }

    public final void a(GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, aaha aaha) {
        osf osf = this.a;
        osf.c.d(new aagu(osf, getAppIndexingPackageDetailsCall$Request, this.b, aaha));
    }

    public final void a(GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, aaha aaha) {
        osf osf = this.a;
        osf.c.d(new aagt(osf, getAppIndexingPackagesCall$Request, this.b, aaha));
    }

    public final void a(GetStorageStatsCall$Request getStorageStatsCall$Request, aaha aaha) {
        osf osf = this.a;
        osf.c.d(new aagq(osf, getStorageStatsCall$Request, this.b, aaha));
    }

    public final void a(RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, aaha aaha) {
        osf osf = this.a;
        osf.c.d(new aagv(osf, requestAppIndexingUpdateIndexCall$Request, this.b, aaha));
    }
}
