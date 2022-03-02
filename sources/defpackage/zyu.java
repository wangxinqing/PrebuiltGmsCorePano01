package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyu extends nis {
    private final zsg a = zsg.a("FetchGmsBackupStatsOps");
    private final zvm b;
    private final String c;
    private final long d;

    public zyu(zvm zvm, String str, long j) {
        super(135, "FetchGmsBackupStatsOps");
        this.b = zvm;
        this.c = str;
        this.d = j;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        aqxb a2 = zyz.a.a(this.c, Long.toString(this.d));
        ArrayList arrayList = new ArrayList();
        if (a2 == null) {
            this.a.d("No response found in cache for  account %s, deviceId %d", this.c, Long.valueOf(this.d));
            this.b.c(Status.c, arrayList);
            return;
        }
        HashMap hashMap = new HashMap();
        aucx aucx = a2.a;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            aqxx aqxx = (aqxx) aucx.get(i);
            if (hashMap.containsKey(aqxx.g)) {
                String str = aqxx.g;
                hashMap.put(str, Integer.valueOf(((Integer) hashMap.get(str)).intValue() + 1));
            } else {
                hashMap.put(aqxx.g, 1);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            arrayList.add(new SourceStatsEntity((String) entry.getKey(), (Integer) entry.getValue()));
        }
        this.a.a("Number of source stats found for account %s, device %s : %d", this.c, Long.valueOf(this.d), Integer.valueOf(arrayList.size()));
        this.b.c(Status.a, arrayList);
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
    }
}
