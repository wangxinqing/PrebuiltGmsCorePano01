package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.download.DownloadDetails;
import com.google.android.gms.common.download.DownloadIntentOperation;

/* renamed from: ipg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ipg extends ipc {
    private final String b;
    private final String c;

    public ipg(iqc iqc, String str, String str2) {
        super(iqc, "TryDownload");
        this.b = str;
        this.c = str2;
    }

    public final void a(Context context) {
        Status e = DownloadIntentOperation.e(context, this.c);
        if (e.i == 7000) {
            PackageManager packageManager = context.getPackageManager();
            try {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.b, 0));
                DownloadDetails c2 = ipt.c(context, this.c);
                if (c2 != null) {
                    DownloadIntentOperation.a(context, c2, context.getString(R.string.download_notification_title), context.getString(R.string.download_notification_description, new Object[]{applicationLabel}));
                    Intent startIntent = IntentOperation.getStartIntent(context, DownloadIntentOperation.class, "com.google.android.gms.common.download.START");
                    if (startIntent == null) {
                        Log.e("DownloadACService", "getStartIntent returned null!  Unable to start download");
                        this.a.a(new Status(13, context.getString(R.string.download_msg_error_invalid), (PendingIntent) null));
                        return;
                    }
                    context.startService(startIntent);
                    this.a.a(new Status(7001, context.getString(R.string.download_msg_in_progress), (PendingIntent) null));
                    return;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                this.a.a(new Status(8));
                return;
            }
        }
        this.a.a(e);
    }
}
