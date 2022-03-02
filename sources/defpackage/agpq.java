package defpackage;

import android.util.Log;

/* renamed from: agpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agpq implements amqy {
    private final agqi a;

    public agpq(agqi agqi) {
        this.a = agqi;
    }

    public final Object a(Object obj) {
        agqi agqi = this.a;
        Void voidR = (Void) obj;
        if (!agqi.a) {
            Log.w("DeletionsDownloader", "No deletedAll callback received during initialization sync");
        }
        if (agqi.b > 0) {
            Log.w("DeletionsDownloader", "Ignored deleteByUuids callback during initialization sync");
        }
        return Boolean.FALSE;
    }
}
