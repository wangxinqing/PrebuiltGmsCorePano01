package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* renamed from: abnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abnc implements abnd {
    public final abpr a(Context context, acah acah, abps abps, boolean z, boolean z2) {
        return new abpr(context, acah, abps, z, z2);
    }

    public final abpt a(Context context, acah acah, abps abps, boolean z, boolean z2, ArrayList arrayList) {
        return new abpt(context, acah, abps, z, z2, arrayList, abmq.a(context));
    }

    public final absy a(Context context, Handler handler, acan acan, absz absz, boolean z) {
        return new absy(context, handler, acan, absz, z);
    }

    public final abta a(Context context, acan acan, absz absz, boolean z, boolean z2) {
        return new abta(context, acan, absz, z, z2, abmq.a(context));
    }
}
