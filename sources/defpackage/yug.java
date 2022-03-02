package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: yug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yug {
    public static Bundle a(Context context, ClientContext clientContext) {
        yuf yuf = new yuf(context, clientContext);
        yuf.b();
        PendingIntent activity = PendingIntent.getActivity(context, 0, yuf.a(), 0);
        Bundle bundle = new Bundle();
        bundle.putParcelable("pendingIntent", activity);
        return bundle;
    }
}
