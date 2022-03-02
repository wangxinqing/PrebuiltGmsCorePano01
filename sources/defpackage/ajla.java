package defpackage;

import android.accounts.Account;
import com.google.android.location.reporting.server.RemoteDevice;
import com.google.android.ulr.ApiUserSettings;
import com.google.android.ulr.RemoteDeviceInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ajla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajla {
    public final ajkh a;
    public final List b;

    public ajla(ajkh ajkh, List list) {
        this.a = ajkh;
        ajnw.a(list);
        this.b = list;
    }

    public static ajla a(Account account, atdq atdq) {
        atdl atdl = atdq.a;
        if (atdl == null) {
            atdl = atdl.j;
        }
        ajkh a2 = ajkh.a(account, atdl);
        aucx aucx = atdq.b;
        ArrayList arrayList = new ArrayList();
        if (aucx != null) {
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                ated ated = (ated) aucx.get(i);
                arrayList.add(new RemoteDevice(ated.a, ated.d, ated.c, ated.b, Long.valueOf(ated.e), Long.valueOf(ated.f)));
            }
        }
        return new ajla(a2, arrayList);
    }

    public static ajla a(Account account, ApiUserSettings apiUserSettings) {
        boolean z;
        ajkh a2 = ajkh.a(account, apiUserSettings.getSettings());
        ArrayList remoteDeviceInfos = apiUserSettings.getRemoteDeviceInfos();
        ArrayList arrayList = new ArrayList();
        if (remoteDeviceInfos != null) {
            int size = remoteDeviceInfos.size();
            for (int i = 0; i < size; i++) {
                RemoteDeviceInfo remoteDeviceInfo = (RemoteDeviceInfo) remoteDeviceInfos.get(i);
                if (remoteDeviceInfo.b() == null || !remoteDeviceInfo.b().booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                arrayList.add(new RemoteDevice(((Integer) remoteDeviceInfo.b.get("deviceTag")).intValue(), (String) remoteDeviceInfo.b.get("devicePrettyName"), ((Boolean) remoteDeviceInfo.b.get("isRestricted")).booleanValue(), z, (Long) remoteDeviceInfo.b.get("lastReportTimestampMs"), (Long) remoteDeviceInfo.b.get("lastModifiedTimestampMs")));
            }
        }
        return new ajla(a2, arrayList);
    }
}
