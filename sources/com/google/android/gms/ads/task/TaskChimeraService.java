package com.google.android.gms.ads.task;

import com.google.android.gms.ads.identifier.settings.s;
import com.google.android.gms.ads.jams.a;
import com.google.android.gms.ads.jams.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class TaskChimeraService extends qwf {
    private final List a = new ArrayList();
    private final Map b = new HashMap();

    public TaskChimeraService() {
        a aVar = new a(new c(ihs.b()));
        s sVar = new s();
        this.a.add(aVar);
        this.a.add(sVar);
        this.b.put("jams-negotiation-task", aVar);
        this.b.put("ads.fetch_integrity_token.one_time", sVar);
        this.b.put("ads.fetch_integrity_token.periodic", sVar);
    }

    public final int a(qxz qxz) {
        String str = qxz.a;
        if (this.b.containsKey(str)) {
            return ((a) this.b.get(str)).b();
        }
        String valueOf = String.valueOf(str);
        com.google.android.gms.ads.internal.util.client.c.a(valueOf.length() == 0 ? new String("Unexpected task tag: ") : "Unexpected task tag: ".concat(valueOf));
        return 2;
    }

    public final void aH() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((a) list.get(i)).a();
        }
    }
}
