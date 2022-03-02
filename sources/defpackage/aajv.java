package defpackage;

import android.os.Parcel;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;

/* renamed from: aajv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aajv extends bhw implements aajw {
    private final acwd a;

    public aajv() {
        super("com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
    }

    public final void a(GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response) {
        ihd.a(getCurrentExperimentIdsCall$Response.a, getCurrentExperimentIdsCall$Response.b, this.a);
    }

    public final void a(GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response) {
        ihd.a(getGlobalSearchSourcesCall$Response.a, getGlobalSearchSourcesCall$Response.b, this.a);
    }

    public aajv(acwd acwd) {
        super("com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
        this.a = acwd;
    }

    public final void a(GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response) {
        ihd.a(getPendingExperimentIdsCall$Response.a, getPendingExperimentIdsCall$Response.b, this.a);
    }

    public final void a(SetExperimentIdsCall$Response setExperimentIdsCall$Response) {
        ihd.a(setExperimentIdsCall$Response.a, (Object) null, this.a);
    }

    public final void a(SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response) {
        ihd.a(setIncludeInGlobalSearchCall$Response.a, (Object) null, this.a);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            a((GetGlobalSearchSourcesCall$Response) bhx.a(parcel, GetGlobalSearchSourcesCall$Response.CREATOR));
            return true;
        } else if (i == 3) {
            a((SetExperimentIdsCall$Response) bhx.a(parcel, SetExperimentIdsCall$Response.CREATOR));
            return true;
        } else if (i == 4) {
            a((GetCurrentExperimentIdsCall$Response) bhx.a(parcel, GetCurrentExperimentIdsCall$Response.CREATOR));
            return true;
        } else if (i == 5) {
            a((GetPendingExperimentIdsCall$Response) bhx.a(parcel, GetPendingExperimentIdsCall$Response.CREATOR));
            return true;
        } else if (i != 8) {
            return false;
        } else {
            a((SetIncludeInGlobalSearchCall$Response) bhx.a(parcel, SetIncludeInGlobalSearchCall$Response.CREATOR));
            return true;
        }
    }
}
