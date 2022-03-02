package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;

/* renamed from: aahd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aahd extends IInterface {
    void a(aaha aaha);

    void a(Bundle bundle, aaha aaha);

    void a(ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, aaha aaha);

    void a(GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, aaha aaha);

    void a(GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, aaha aaha);

    void a(GetStorageStatsCall$Request getStorageStatsCall$Request, aaha aaha);

    void a(RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, aaha aaha);
}
