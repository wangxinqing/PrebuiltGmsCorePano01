package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Response;

/* renamed from: aaha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aaha extends IInterface {
    void a(Status status);

    void a(BundleResponse bundleResponse);

    void a(ClearDebugUiCacheCall$Response clearDebugUiCacheCall$Response);

    void a(GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response);

    void a(GetAppIndexingPackagesCall$Response getAppIndexingPackagesCall$Response);

    void a(GetStorageStatsCall$Response getStorageStatsCall$Response);

    void a(RequestAppIndexingUpdateIndexCall$Response requestAppIndexingUpdateIndexCall$Response);
}
