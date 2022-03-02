package defpackage;

import android.content.Context;
import com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService;
import java.util.Set;

/* renamed from: aiqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aiqf implements Runnable {
    private final aiqo a;
    private final Set b;
    private final Set c;

    public aiqf(aiqo aiqo, Set set, Set set2) {
        this.a = aiqo;
        this.b = set;
        this.c = set2;
    }

    public final void run() {
        aiqo aiqo = this.a;
        Set<Long> set = this.b;
        Set set2 = this.c;
        new Object[1][0] = "Manager:";
        aiqo.d = false;
        for (Long longValue : set) {
            aiqo.b(longValue.longValue(), 1);
        }
        if (aiqo.c()) {
            NanoAppUpdaterChimeraGcmTaskService.a((Context) ihs.b(), 1);
        } else {
            aiqo.a(set2);
        }
    }
}
