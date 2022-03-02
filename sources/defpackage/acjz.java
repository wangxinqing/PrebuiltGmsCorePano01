package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals;
import com.google.android.gms.smartdevice.setup.accounts.ScreenlockState;
import com.google.android.gms.smartdevice.setup.accounts.StarguardData;
import java.util.Map;

/* renamed from: acjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acjz {
    private static final iwd a = acqa.a("Setup", "Accounts", "Utils", "DeviceRiskSignalsUtils");
    private final Context b;
    private final lya c;
    private final Map d;
    private final boolean e;

    public acjz(Context context, lya lya, Map map, boolean z) {
        amrl.a((Object) context, (Object) "context cannot be null.");
        this.b = context;
        amrl.a((Object) lya, (Object) "droidGuardHandle cannot be null");
        this.c = lya;
        amrl.a((Object) map, (Object) "droidGuardArgs cannot be null");
        this.d = map;
        this.e = z;
    }

    public final DeviceRiskSignals a() {
        long j;
        long j2;
        gdu gdu;
        long j3;
        long a2 = jhg.a(this.b);
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        int i = Build.VERSION.SDK_INT;
        boolean a3 = acpm.a(this.b);
        int i2 = !a3 ? 1 : 10;
        boolean z = this.e;
        if (a3) {
            hwz hwz = new hwz();
            try {
                jca.a().a(this.b, new Intent().setClassName(this.b, "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"), hwz, 1);
                IBinder a4 = hwz.a();
                if (a4 != null) {
                    IInterface queryLocalInterface = a4.queryLocalInterface("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
                    gdu = !(queryLocalInterface instanceof gdu) ? new gds(a4) : (gdu) queryLocalInterface;
                } else {
                    gdu = null;
                }
                long b2 = gdu.b();
                long c2 = gdu.c();
                if (b2 != -1) {
                    j3 = SystemClock.elapsedRealtime() - b2;
                } else {
                    j3 = -1;
                }
                long j4 = -1;
                if (c2 != -1) {
                    j4 = c2;
                }
                jca.a().a(this.b, (ServiceConnection) hwz);
                j = j3;
                j2 = j4;
            } catch (RemoteException | InterruptedException e2) {
                a.d("Could not get device signals. Setting to insecure.", e2, new Object[0]);
                jca.a().a(this.b, (ServiceConnection) hwz);
                j2 = -1;
                j = -1;
            } catch (Throwable th) {
                jca.a().a(this.b, (ServiceConnection) hwz);
                throw th;
            }
        } else {
            j2 = -1;
            j = -1;
        }
        iwd iwd = a;
        StringBuilder sb = new StringBuilder(50);
        sb.append("elapsedTimeSinceUnlockMillis: ");
        sb.append(j);
        String str3 = str2;
        iwd.b(sb.toString(), new Object[0]);
        iwd iwd2 = a;
        StringBuilder sb2 = new StringBuilder(49);
        sb2.append("screenlockSettingsAgeMillis: ");
        sb2.append(j2);
        iwd2.b(sb2.toString(), new Object[0]);
        return new DeviceRiskSignals(a2, str, str3, (long) i, new ScreenlockState(a3, i2, j2, j, z), new StarguardData(this.c.a(this.d)));
    }
}
