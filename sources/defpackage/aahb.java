package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;

/* renamed from: aahb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aahb extends bhv implements aahd {
    public aahb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.administration.internal.ISearchAdministrationService");
    }

    public final void a(aaha aaha) {
        throw null;
    }

    public final void a(Bundle bundle, aaha aaha) {
        throw null;
    }

    public final void a(ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, aaha aaha) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) clearDebugUiCacheCall$Request);
        bhx.a(aQ, (IInterface) aaha);
        b(8, aQ);
    }

    public final void a(GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, aaha aaha) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getAppIndexingPackageDetailsCall$Request);
        bhx.a(aQ, (IInterface) aaha);
        b(6, aQ);
    }

    public final void a(GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, aaha aaha) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getAppIndexingPackagesCall$Request);
        bhx.a(aQ, (IInterface) aaha);
        b(5, aQ);
    }

    public final void a(GetStorageStatsCall$Request getStorageStatsCall$Request, aaha aaha) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getStorageStatsCall$Request);
        bhx.a(aQ, (IInterface) aaha);
        b(2, aQ);
    }

    public final void a(RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, aaha aaha) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) requestAppIndexingUpdateIndexCall$Request);
        bhx.a(aQ, (IInterface) aaha);
        b(7, aQ);
    }
}
