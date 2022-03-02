package defpackage;

import android.content.Context;
import com.google.android.gms.common.download.DownloadIntentOperation;

/* renamed from: ipe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ipe extends ipc {
    private final String b;

    public ipe(iqc iqc, String str) {
        super(iqc, "GetDownloadStatus");
        this.b = str;
    }

    public final void a(Context context) {
        this.a.a(DownloadIntentOperation.e(context, this.b));
    }
}
