package defpackage;

import android.content.Context;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: adep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class adep implements amqy {
    private final Context a;

    public adep(Context context) {
        this.a = context;
    }

    public final Object a(Object obj) {
        Context context = this.a;
        aonv aonv = (aonv) obj;
        String str = aonv.a;
        amrl.b(aonv.a());
        return new quk(new izd(context, str, aonv.b, context.getApplicationInfo().uid, FragmentTransaction.TRANSIT_FRAGMENT_OPEN));
    }
}
