package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.userlocation.SemanticLocationUpdateSubscription;

/* renamed from: alli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alli implements akin {
    private final SemanticLocationUpdateRequest a;
    private final SemanticLocationUpdateSubscription b;
    private final advg c;

    public alli(advg advg, SemanticLocationUpdateRequest semanticLocationUpdateRequest, SemanticLocationUpdateSubscription semanticLocationUpdateSubscription) {
        this.c = advg;
        this.a = semanticLocationUpdateRequest;
        this.b = semanticLocationUpdateSubscription;
    }

    public final void a(akip akip) {
        int i = akip.g;
        if (azcr.d()) {
            if (Log.isLoggable("Places", 5)) {
                alfy.c("Places", "SemanticLocationUpdateReceiver disabled via flag, ignoring result.");
            }
        } else if (i == 0 && akip.a != 0) {
            advg advg = this.c;
            if (advg != null) {
                try {
                    advg.a(Status.a, alll.a(akip, this.a.c.b));
                } catch (RemoteException e) {
                    if (Log.isLoggable("Places", 5)) {
                        alfy.c("Places", "SemanticLocationUpdateSubscription invalidated after callback failure");
                    }
                    this.b.b();
                }
            } else {
                this.b.b();
            }
        }
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("semanticLocationUpdateRequest", this.a);
        return a2.toString();
    }
}
