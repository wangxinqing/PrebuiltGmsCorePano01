package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;

/* renamed from: mez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class mez extends bhw implements mfa {
    public mez() {
        super("com.google.android.gms.facs.cache.internal.IFacsCacheCallbacks");
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, GetActivityControlsSettingsResult getActivityControlsSettingsResult) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, ReadDeviceLevelSettingsResult readDeviceLevelSettingsResult) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, UpdateActivityControlsSettingsResult updateActivityControlsSettingsResult) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) bhx.a(parcel, Status.CREATOR), (ForceSettingsCacheRefreshResult) bhx.a(parcel, ForceSettingsCacheRefreshResult.CREATOR));
        } else if (i == 2) {
            a((Status) bhx.a(parcel, Status.CREATOR), (UpdateActivityControlsSettingsResult) bhx.a(parcel, UpdateActivityControlsSettingsResult.CREATOR));
        } else if (i == 3) {
            a((Status) bhx.a(parcel, Status.CREATOR), (GetActivityControlsSettingsResult) bhx.a(parcel, GetActivityControlsSettingsResult.CREATOR));
        } else if (i == 4) {
            a((Status) bhx.a(parcel, Status.CREATOR));
        } else if (i != 5) {
            return false;
        } else {
            a((Status) bhx.a(parcel, Status.CREATOR), (ReadDeviceLevelSettingsResult) bhx.a(parcel, ReadDeviceLevelSettingsResult.CREATOR));
        }
        return true;
    }
}
