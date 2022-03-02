package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Response;

/* renamed from: aagy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aagy extends bhv implements aaha {
    public aagy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(4, aQ);
    }

    public final void a(BundleResponse bundleResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bundleResponse);
        c(3, aQ);
    }

    public final void a(ClearDebugUiCacheCall$Response clearDebugUiCacheCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) clearDebugUiCacheCall$Response);
        c(8, aQ);
    }

    public final void a(GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getAppIndexingPackageDetailsCall$Response);
        c(6, aQ);
    }

    public final void a(GetAppIndexingPackagesCall$Response getAppIndexingPackagesCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getAppIndexingPackagesCall$Response);
        c(5, aQ);
    }

    public final void a(GetStorageStatsCall$Response getStorageStatsCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getStorageStatsCall$Response);
        c(2, aQ);
    }

    public final void a(RequestAppIndexingUpdateIndexCall$Response requestAppIndexingUpdateIndexCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) requestAppIndexingUpdateIndexCall$Response);
        c(7, aQ);
    }
}
