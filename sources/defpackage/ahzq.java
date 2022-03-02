package defpackage;

import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubTransaction;
import android.hardware.location.NanoAppState;
import android.util.Log;
import java.util.List;
import java.util.Set;

/* renamed from: ahzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahzq implements ContextHubTransaction.OnCompleteListener {
    final /* synthetic */ ahzr a;
    private final ContextHubInfo b;
    private final List c;
    private final Set d;

    public ahzq(ahzr ahzr, ContextHubInfo contextHubInfo, List list, Set set) {
        this.a = ahzr;
        this.b = contextHubInfo;
        this.c = list;
        this.d = set;
    }

    public final void onComplete(ContextHubTransaction contextHubTransaction, ContextHubTransaction.Response response) {
        ahzr ahzr = this.a;
        if (ahzr.e == null && ahzr.c) {
            if (response.getResult() != 0) {
                if (Log.isLoggable("ContextHubComms", 6)) {
                    int id = this.b.getId();
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("Failed to communicate with contexthub: ");
                    sb.append(id);
                    Log.e("ContextHubComms", sb.toString());
                }
                this.c.remove(this.b);
            } else {
                for (NanoAppState nanoAppId : (List) response.getContents()) {
                    if (this.d.contains(Long.valueOf(nanoAppId.getNanoAppId()))) {
                        ahzr ahzr2 = this.a;
                        ahzr2.e = ahzr2.a.createClient(this.b, ahzr2, ahzr2.b);
                        this.a.d.a(true);
                        return;
                    }
                }
                this.c.remove(this.b);
            }
            if (this.c.isEmpty()) {
                this.a.d.a(false);
            }
        }
    }
}
