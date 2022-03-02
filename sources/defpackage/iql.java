package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.common.images.ImageAsyncChimeraService;
import java.io.IOException;

/* renamed from: iql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iql implements hcy {
    private final Uri a;
    private final ResultReceiver b;

    public iql(Uri uri, ResultReceiver resultReceiver) {
        this.a = uri;
        this.b = resultReceiver;
    }

    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        if (this.b != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.google.android.gms.extra.fileDescriptor", parcelFileDescriptor);
            this.b.send(0, bundle);
        }
    }

    public final /* bridge */ /* synthetic */ void a(hdd hdd) {
        ImageAsyncChimeraService imageAsyncChimeraService = (ImageAsyncChimeraService) hdd;
        AssetFileDescriptor a2 = imageAsyncChimeraService.a.a((Context) imageAsyncChimeraService, this.a);
        if (a2 == null) {
            Log.e("ImageMultiThreadedAsync", "Failed LoadImageOperation");
            a((ParcelFileDescriptor) null);
        } else {
            a(a2.getParcelFileDescriptor());
        }
        if (a2 != null) {
            try {
                a2.close();
            } catch (IOException e) {
                Log.e("ImageMultiThreadedAsync", "Failed to close file", e);
            }
        }
    }
}
