package defpackage;

import android.util.Log;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.HashMap;
import java.util.Map;

/* renamed from: agwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agwi implements acvp {
    private final agwj a;
    private final Map b;

    public agwi(agwj agwj, Map map) {
        this.a = agwj;
        this.b = map;
    }

    public final void a(acwa acwa) {
        String str;
        HashMap hashMap;
        agwj agwj = this.a;
        Map map = this.b;
        if (!acwa.b()) {
            Log.e("ContentProviderFlagSource", "Could not read flags from Phenotype API, not performing optimistic update");
            return;
        }
        Configurations configurations = (Configurations) acwa.d();
        if (configurations != null && (str = configurations.a) != null && !str.isEmpty()) {
            if (configurations.f) {
                hashMap = new HashMap(map);
            } else {
                hashMap = anet.a();
            }
            for (Configuration configuration : configurations.d) {
                for (Flag flag : configuration.b) {
                    hashMap.put(flag.a, flag.f());
                }
                for (String remove : configuration.c) {
                    hashMap.remove(remove);
                }
            }
            hashMap.put("__phenotype_server_token", configurations.c);
            hashMap.put("__phenotype_snapshot_token", configurations.a);
            hashMap.put("__phenotype_configuration_version", Long.toString(configurations.g));
            anaf a2 = anaf.a((Map) hashMap);
            if (!agwj.h.a((Map) a2)) {
                agwz.a(agwj.e.a());
            } else {
                agwj.a((Map) a2);
            }
        }
    }
}
