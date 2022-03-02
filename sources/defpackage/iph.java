package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.download.DownloadIntentOperation;

/* renamed from: iph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iph extends ipc {
    private final String b;

    public iph(iqc iqc, String str) {
        super(iqc, "UnregisterDownload");
        this.b = str;
    }

    public final void a(Context context) {
        DownloadIntentOperation.d(context, this.b);
        this.a.a(new Status(0));
    }
}
