package defpackage;

import android.util.Log;
import com.google.android.gms.beacon.BleSighting;
import java.util.List;

/* renamed from: akxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akxu extends gth {
    final /* synthetic */ akxy a;

    public akxu(akxy akxy) {
        this.a = akxy;
    }

    public final void a(int i) {
        if (Log.isLoggable("Places", 5)) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("BLE failure while scanning - code ");
            sb.append(i);
            Log.w("Places", sb.toString());
        }
    }

    public final void a(int i, BleSighting bleSighting) {
        this.a.h.post(new akxt(this, bleSighting));
    }

    public final void a(List list) {
        this.a.h.post(new akxs(this, list));
    }
}
