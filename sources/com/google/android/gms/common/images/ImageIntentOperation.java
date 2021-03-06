package com.google.android.gms.common.images;

import android.content.Intent;
import android.net.Uri;
import android.os.ResultReceiver;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ImageIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        ImageAsyncChimeraService.a(this, (Uri) intent.getParcelableExtra("com.google.android.gms.extras.uri"), (ResultReceiver) intent.getParcelableExtra("com.google.android.gms.extras.resultReceiver"));
    }
}
