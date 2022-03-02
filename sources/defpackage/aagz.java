package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Response;

/* renamed from: aagz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aagz extends bhw implements aaha {
    private final acwd a;

    public aagz() {
        super("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
    }

    public final void a(Status status) {
        ihd.a(status, (Object) null, this.a);
    }

    public final void a(BundleResponse bundleResponse) {
        ihd.a(bundleResponse.a, bundleResponse.b, this.a);
    }

    public aagz(acwd acwd) {
        super("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
        this.a = acwd;
    }

    public final void a(ClearDebugUiCacheCall$Response clearDebugUiCacheCall$Response) {
        ihd.a(clearDebugUiCacheCall$Response.a, (Object) null, this.a);
    }

    public final void a(GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response) {
        ihd.a(getAppIndexingPackageDetailsCall$Response.a, new ick(getAppIndexingPackageDetailsCall$Response), this.a);
    }

    public final void a(GetAppIndexingPackagesCall$Response getAppIndexingPackagesCall$Response) {
        ihd.a(getAppIndexingPackagesCall$Response.a, new ick(getAppIndexingPackagesCall$Response), this.a);
    }

    public final void a(GetStorageStatsCall$Response getStorageStatsCall$Response) {
        ihd.a(getStorageStatsCall$Response.a, new ick(getStorageStatsCall$Response), this.a);
    }

    public final void a(RequestAppIndexingUpdateIndexCall$Response requestAppIndexingUpdateIndexCall$Response) {
        ihd.a(requestAppIndexingUpdateIndexCall$Response.a, Long.valueOf(requestAppIndexingUpdateIndexCall$Response.b), this.a);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                a((GetStorageStatsCall$Response) bhx.a(parcel, GetStorageStatsCall$Response.CREATOR));
                return true;
            case 3:
                a((BundleResponse) bhx.a(parcel, BundleResponse.CREATOR));
                return true;
            case 4:
                a((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 5:
                a((GetAppIndexingPackagesCall$Response) bhx.a(parcel, GetAppIndexingPackagesCall$Response.CREATOR));
                return true;
            case 6:
                a((GetAppIndexingPackageDetailsCall$Response) bhx.a(parcel, GetAppIndexingPackageDetailsCall$Response.CREATOR));
                return true;
            case 7:
                a((RequestAppIndexingUpdateIndexCall$Response) bhx.a(parcel, RequestAppIndexingUpdateIndexCall$Response.CREATOR));
                return true;
            case 8:
                a((ClearDebugUiCacheCall$Response) bhx.a(parcel, ClearDebugUiCacheCall$Response.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
