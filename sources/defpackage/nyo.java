package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;

/* renamed from: nyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nyo extends nyq {
    final /* synthetic */ nth a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nyo(ntx ntx, Bundle bundle, Map map, nth nth) {
        super(0, ntx, bundle, map);
        this.a = nth;
    }

    public final void a(Context context, Bundle bundle) {
        nth nth = this.a;
        int i = nth.a;
        if (i == 0) {
            a(nth.e, a(bundle));
        } else if (nth.b) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("Got oneWay request when expecting twoWay for: ");
            sb.append(i);
            Log.w("GCM", sb.toString());
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("data", bundle);
            nth.a(bundle2);
        }
    }
}
