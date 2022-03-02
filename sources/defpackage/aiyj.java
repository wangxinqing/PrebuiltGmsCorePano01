package defpackage;

import android.net.wifi.WifiScanner;
import android.os.WorkSource;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: aiyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiyj extends aiye {
    public static final /* synthetic */ int f = 0;

    /* access modifiers changed from: protected */
    public final aiaj a(List list, long j, Collection collection) {
        aiaj a = super.a(list, j, collection);
        if (!aydu.a.a().fiveGMode()) {
            return a;
        }
        CellInfoNr cellInfoNr = null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if (cellInfo instanceof CellInfoNr) {
                CellInfoNr cellInfoNr2 = (CellInfoNr) cellInfo;
                if (!cellInfoNr2.isRegistered()) {
                    aiaz a2 = aivv.a(j, cellInfoNr2, aiaj.a);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } else {
                    cellInfoNr = cellInfoNr2;
                }
            }
        }
        if (cellInfoNr == null) {
            return (a == null || arrayList.isEmpty()) ? a : super.a(list, j, (Collection) arrayList);
        }
        if (a != null) {
            arrayList.addAll(a.h);
            arrayList.add(a);
        }
        return aivv.a(j, cellInfoNr, (Collection) arrayList);
    }

    /* access modifiers changed from: protected */
    public final WifiScanner.ScanSettings a(boolean z, int i, int i2, boolean z2) {
        WifiScanner.ScanSettings a = super.a(z, i, i2, z2);
        a.ignoreLocationSettings = z2;
        return a;
    }

    public final void a(TelephonyManager telephonyManager, int i, long j, aivo aivo, aizx aizx, Executor executor) {
        aiyg aiyg = new aiyg(this, aivo, j);
        aiyf aiyf = new aiyf(aivo);
        aiyi aiyi = new aiyi(executor, aiyf);
        try {
            if (aizx instanceof ajrb) {
                WorkSource a = ((ajrb) aizx).a();
                if (a != null) {
                    telephonyManager.requestCellInfoUpdate(a, aiyi, aiyg);
                } else {
                    telephonyManager.requestCellInfoUpdate(aiyi, aiyg);
                }
            } else {
                telephonyManager.requestCellInfoUpdate(aiyi, aiyg);
            }
        } catch (IllegalArgumentException e) {
            if (!aydu.a.a().enableQTelephonyExceptions()) {
                executor.execute(aiyf);
                return;
            }
            throw e;
        }
    }
}
