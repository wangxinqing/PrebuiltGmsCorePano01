package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;

/* renamed from: mey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mey extends bhv implements mfa {
    public mey(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.facs.cache.internal.IFacsCacheCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(4, aQ);
    }

    public final void a(Status status, ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) forceSettingsCacheRefreshResult);
        c(1, aQ);
    }

    public final void a(Status status, GetActivityControlsSettingsResult getActivityControlsSettingsResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) getActivityControlsSettingsResult);
        c(3, aQ);
    }

    public final void a(Status status, ReadDeviceLevelSettingsResult readDeviceLevelSettingsResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) readDeviceLevelSettingsResult);
        c(5, aQ);
    }

    public final void a(Status status, UpdateActivityControlsSettingsResult updateActivityControlsSettingsResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) updateActivityControlsSettingsResult);
        c(2, aQ);
    }
}
