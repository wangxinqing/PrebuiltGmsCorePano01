package defpackage;

import android.content.Context;
import com.google.android.gms.common.download.DownloadDetails;
import com.google.android.gms.common.download.DownloadIntentOperation;

/* renamed from: ipf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ipf extends ipc {
    private final DownloadDetails b;

    public ipf(iqc iqc, DownloadDetails downloadDetails) {
        super(iqc, "RegisterDownload");
        this.b = downloadDetails;
    }

    public final void a(Context context) {
        DownloadIntentOperation.c(context, this.b);
        this.a.a(DownloadIntentOperation.e(context, this.b.a));
    }
}
