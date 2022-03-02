package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: ojx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ojx {
    public static void a(Context context, byte[] bArr, GoogleHelp googleHelp) {
        Intent className = new Intent("com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.LOG_METRIC").setClassName(context, "com.google.android.gms.chimera.GmsIntentOperationService");
        className.putExtra("EXTRA_METRIC_DATA", bArr);
        className.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        context.startService(className);
    }
}
