package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.config.ConfigChimeraService;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: jnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jnx extends joo {
    final /* synthetic */ jop a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ List d;
    final /* synthetic */ joq e;

    public jnx(joq joq, jop jop, int i, String str, List list) {
        this.e = joq;
        this.a = jop;
        this.b = i;
        this.c = str;
        this.d = list;
    }

    public final void a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
        if (fetchConfigIpcResponse != null) {
            fetchConfigIpcResponse.a();
        }
        try {
            jop jop = this.a;
            Status status2 = Status.a;
            ConfigChimeraService configChimeraService = this.e.a;
            int i = this.b;
            String str = this.c;
            List<String> list = this.d;
            TreeMap treeMap = null;
            if (configChimeraService.a(i, str)) {
                if (list != null && !list.isEmpty()) {
                    synchronized (configChimeraService.a) {
                        Map map = configChimeraService.b;
                        if (map != null && map.get(str) != null && ((HashMap) configChimeraService.b.get(str)).get("configns:p4") != null) {
                            TreeMap treeMap2 = (TreeMap) ((HashMap) configChimeraService.b.get(str)).get("configns:p4");
                            if (treeMap2 != null) {
                                treeMap = new TreeMap();
                                for (String str2 : list) {
                                    treeMap.put(str2, (byte[]) treeMap2.get(str2));
                                }
                            }
                        }
                    }
                }
            }
            jop.a(status2, (Map) treeMap);
        } catch (RemoteException e2) {
            Log.e("ConfigChimeraService", "Exception at callback.", e2);
        }
    }
}
