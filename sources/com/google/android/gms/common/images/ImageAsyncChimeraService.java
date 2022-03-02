package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ResultReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ImageAsyncChimeraService extends hcz {
    private static final hdb i = new hdb();
    public iqm a;

    public ImageAsyncChimeraService() {
        super("ImageMultiThreadedAsync", i, 500, jfb.a(4, 9));
    }

    public static void a(Context context, Uri uri, ResultReceiver resultReceiver) {
        i.offer(new iql(uri, resultReceiver));
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.common.images.ImageAsyncService");
        context.startService(intent);
    }

    public final void onCreate() {
        super.onCreate();
        this.a = iqm.a((Context) this, 5376);
    }
}
