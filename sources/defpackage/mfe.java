package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.SyncActivityControlsSettingsInternalResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsInternalResult;

/* renamed from: mfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mfe extends bhv implements mfg {
    public mfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.facs.cache.internal.IFacsInternalSyncCallbacks");
    }

    public final void a(Status status, SyncActivityControlsSettingsInternalResult syncActivityControlsSettingsInternalResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) syncActivityControlsSettingsInternalResult);
        c(1, aQ);
    }

    public final void a(Status status, UpdateActivityControlsSettingsInternalResult updateActivityControlsSettingsInternalResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) updateActivityControlsSettingsInternalResult);
        c(2, aQ);
    }
}
