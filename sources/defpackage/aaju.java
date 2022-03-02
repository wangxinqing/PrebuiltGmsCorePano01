package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;

/* renamed from: aaju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaju extends bhv implements aajw {
    public aaju(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
    }

    public final void a(GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getCurrentExperimentIdsCall$Response);
        c(4, aQ);
    }

    public final void a(GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getGlobalSearchSourcesCall$Response);
        c(2, aQ);
    }

    public final void a(GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getPendingExperimentIdsCall$Response);
        c(5, aQ);
    }

    public final void a(SetExperimentIdsCall$Response setExperimentIdsCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) setExperimentIdsCall$Response);
        c(3, aQ);
    }

    public final void a(SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) setIncludeInGlobalSearchCall$Response);
        c(8, aQ);
    }
}
