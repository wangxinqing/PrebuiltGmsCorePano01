package defpackage;

import android.os.IInterface;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcSettingsListActivityRequest;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;

/* renamed from: adca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface adca extends IInterface {
    void a(adbx adbx);

    void a(adbx adbx, UdcCacheRequest udcCacheRequest);

    void a(adbx adbx, UdcSettingsListActivityRequest udcSettingsListActivityRequest);

    void a(adbx adbx, UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest);

    void a(adbx adbx, byte[] bArr);

    void b(adbx adbx);

    void b(adbx adbx, byte[] bArr);

    void c(adbx adbx);

    void c(adbx adbx, byte[] bArr);

    void d(adbx adbx, byte[] bArr);

    void e(adbx adbx, byte[] bArr);

    void f(adbx adbx, byte[] bArr);
}
