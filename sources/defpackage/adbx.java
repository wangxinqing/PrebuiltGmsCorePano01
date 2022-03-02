package defpackage;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.List;

/* renamed from: adbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface adbx extends IInterface {
    void a(Status status);

    void a(Status status, PendingIntent pendingIntent);

    void a(Status status, DeviceDataUploadOptInFlags deviceDataUploadOptInFlags);

    void a(Status status, DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable);

    void a(Status status, SettingDisplayInfo settingDisplayInfo, PendingIntent pendingIntent);

    void a(Status status, UdcCacheResponse udcCacheResponse);

    void a(Status status, List list);

    void a(Status status, byte[] bArr);

    void b(Status status, byte[] bArr);

    void c(Status status, byte[] bArr);

    void d(Status status, byte[] bArr);
}
