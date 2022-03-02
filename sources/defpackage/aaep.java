package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;

/* renamed from: aaep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaep extends qvv {
    private final qvz a;
    private final Context b;

    public aaep(Context context, Handler handler, qvz qvz) {
        super("scheduler", "UriTaskContentObserverForSecondaryUser", handler);
        this.b = context;
        this.a = qvz;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        Intent intent = new Intent();
        intent.setClassName(this.b, "com.google.android.gms.gcm.nts.SchedulerInternalReceiver");
        intent.putExtra("OP_CODE", 3);
        intent.putExtra("content_uri_flags_array", new int[]{this.a.b});
        intent.putExtra("content_uri_array", new Uri[]{this.a.a});
        intent.putExtra("triggered_uris", new Uri[]{uri});
        intent.putExtra("user_serial", nqw.d());
        nqw.a(this.b, 0, intent, "com.google.android.gms.permission.INTERNAL_BROADCAST", (BroadcastReceiver) null, (Handler) null);
    }
}
