package defpackage;

import android.content.Context;
import android.content.Intent;

@Deprecated
/* renamed from: qdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qdd extends qdb {
    static void a(Context context, qdu qdu) {
        qdu.a();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }

    public final void handleIntent(Intent intent) {
        throw null;
    }
}
