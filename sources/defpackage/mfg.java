package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.SyncActivityControlsSettingsInternalResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsInternalResult;

/* renamed from: mfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface mfg extends IInterface {
    void a(Status status, SyncActivityControlsSettingsInternalResult syncActivityControlsSettingsInternalResult);

    void a(Status status, UpdateActivityControlsSettingsInternalResult updateActivityControlsSettingsInternalResult);
}
