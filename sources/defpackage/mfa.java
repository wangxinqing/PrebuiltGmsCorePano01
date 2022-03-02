package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;

/* renamed from: mfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface mfa extends IInterface {
    void a(Status status);

    void a(Status status, ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult);

    void a(Status status, GetActivityControlsSettingsResult getActivityControlsSettingsResult);

    void a(Status status, ReadDeviceLevelSettingsResult readDeviceLevelSettingsResult);

    void a(Status status, UpdateActivityControlsSettingsResult updateActivityControlsSettingsResult);
}
