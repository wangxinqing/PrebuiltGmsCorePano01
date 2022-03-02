package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.SyncActivityControlsSettingsInternalResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsInternalResult;

/* renamed from: mff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class mff extends bhw implements mfg {
    public mff() {
        super("com.google.android.gms.facs.cache.internal.IFacsInternalSyncCallbacks");
    }

    public void a(Status status, SyncActivityControlsSettingsInternalResult syncActivityControlsSettingsInternalResult) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, UpdateActivityControlsSettingsInternalResult updateActivityControlsSettingsInternalResult) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) bhx.a(parcel, Status.CREATOR), (SyncActivityControlsSettingsInternalResult) bhx.a(parcel, SyncActivityControlsSettingsInternalResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a((Status) bhx.a(parcel, Status.CREATOR), (UpdateActivityControlsSettingsInternalResult) bhx.a(parcel, UpdateActivityControlsSettingsInternalResult.CREATOR));
        }
        return true;
    }
}
