package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import java.util.List;

/* renamed from: abxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface abxq extends IInterface {
    void a(Status status);

    void a(Status status, AdvertisingInfo advertisingInfo);

    void a(Status status, ManagedAccountSetupInfo managedAccountSetupInfo);

    void a(Status status, String str);

    void a(Status status, List list);

    void b(Status status);

    void c(Status status);

    void d(Status status);

    void e(Status status);
}
