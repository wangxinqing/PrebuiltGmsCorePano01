package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.download.DownloadDetails;
import java.io.File;

/* renamed from: ipu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ipu {
    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, "com.google.android.gms.common.download.DownloadIntentOperation", "com.google.android.gms.common.download.START");
    }

    public static String b(Context context) {
        return new File(context.getCacheDir(), "downloadservice").getAbsolutePath();
    }

    public static File a(Context context, DownloadDetails downloadDetails) {
        File file;
        if (downloadDetails.e != null) {
            file = new File(context.getFilesDir(), downloadDetails.e);
        } else {
            file = new File(b(context));
        }
        return new File(file, downloadDetails.a);
    }
}
