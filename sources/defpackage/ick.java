package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.android.gms.search.administration.CorpusConfigParcelable;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import java.util.List;

/* renamed from: ick  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ick {
    public icl a;

    public ick() {
    }

    public final jtk d() {
        return ((juf) this.a).b();
    }

    public final List e() {
        return ((AliasedPlacesResult) this.a).b;
    }

    public final String f() {
        return ((rpy) this.a).b();
    }

    public final CorpusConfigParcelable[] g() {
        return ((GetAppIndexingPackageDetailsCall$Response) this.a).b;
    }

    public final long h() {
        return ((GetAppIndexingPackageDetailsCall$Response) this.a).c;
    }

    public final AppIndexingErrorInfo[] i() {
        return ((GetAppIndexingPackageDetailsCall$Response) this.a).d;
    }

    public final AppIndexingUserActionInfo[] j() {
        return ((GetAppIndexingPackageDetailsCall$Response) this.a).e;
    }

    public final GetStorageStatsCall$PackageStats[] k() {
        return ((GetStorageStatsCall$Response) this.a).b;
    }

    public final long l() {
        return ((GetStorageStatsCall$Response) this.a).d;
    }

    public final long m() {
        return ((GetStorageStatsCall$Response) this.a).e;
    }

    public final boolean n() {
        return ((adbt) this.a).a();
    }

    public final boolean o() {
        return ((adbt) this.a).b();
    }

    public final boolean p() {
        return ((adsw) this.a).b();
    }

    public final Status q() {
        return ((adww) this.a).a;
    }

    public ick(icl icl) {
        this.a = icl;
    }
}
