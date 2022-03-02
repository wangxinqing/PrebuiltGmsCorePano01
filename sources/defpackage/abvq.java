package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.accounttransfer.DeviceAuthInfo;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: abvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abvq {
    private static final acpz a = acqa.a("D2D", "AccountTransferSingleton");
    private static final ArrayList b;

    static {
        ArrayList arrayList = new ArrayList();
        b = arrayList;
        arrayList.add("com.google");
    }

    /* JADX INFO: finally extract failed */
    public static etq a(Context context, boolean z, boolean z2) {
        long j;
        gdu gdu;
        hwz hwz = new hwz();
        try {
            jca.a().a(context, new Intent().setClassName(context, "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"), hwz, 1);
            IBinder a2 = hwz.a();
            if (a2 != null) {
                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
                gdu = !(queryLocalInterface instanceof gdu) ? new gds(a2) : (gdu) queryLocalInterface;
            } else {
                gdu = null;
            }
            j = gdu.c();
            jca.a().a(context, (ServiceConnection) hwz);
        } catch (RemoteException | InterruptedException e) {
            a.e("Could not get lockscreen duration", e, new Object[0]);
            jca.a().a(context, (ServiceConnection) hwz);
            j = 0;
        } catch (Throwable th) {
            jca.a().a(context, (ServiceConnection) hwz);
            throw th;
        }
        etu etu = new etu();
        etu.a = z;
        etu.c.add(2);
        etu.b = j;
        etu.c.add(3);
        DeviceAuthInfo deviceAuthInfo = new DeviceAuthInfo(etu.c, 1, etu.a, etu.b);
        etp etp = new etp();
        etp.a.putByteArray("deviceAuth", ivy.a(deviceAuthInfo));
        if (z2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(b);
            String b2 = azlf.a.a().b();
            if (!TextUtils.isEmpty(b2)) {
                if (b2.contains(",")) {
                    Collections.addAll(arrayList, b2.split(","));
                } else {
                    arrayList.add(b2);
                }
                a.a("AccountTypes allowed to challenge %s", arrayList);
            }
            if (!arrayList.isEmpty()) {
                etp.a.putStringArrayList("accountTypes", arrayList);
            }
        }
        if (!etp.a.containsKey("accountTypes")) {
            etp.a.putStringArrayList("accountTypes", new ArrayList(0));
        }
        return new etq(etp.a);
    }
}
