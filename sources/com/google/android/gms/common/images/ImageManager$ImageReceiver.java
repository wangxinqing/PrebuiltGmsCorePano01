package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ImageManager$ImageReceiver extends ResultReceiver {
    /* access modifiers changed from: private */
    public final ArrayList mImageRequestList = new ArrayList();
    private final Uri mUri;
    final /* synthetic */ iqq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ImageManager$ImageReceiver(iqq iqq, Uri uri) {
        super(new qvr(Looper.getMainLooper()));
        this.this$0 = iqq;
        this.mUri = uri;
    }

    public void addImageRequest(iqs iqs) {
        irk.a("ImageReceiver.addImageRequest() must be called in the main thread");
        this.mImageRequestList.add(iqs);
    }

    public void onReceiveResult(int i, Bundle bundle) {
        iqq iqq = this.this$0;
        int i2 = iqq.f;
        ExecutorService executorService = iqq.c;
        new iqo(iqq, this.mUri, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor"));
        throw null;
    }

    public void removeImageRequest(iqs iqs) {
        irk.a("ImageReceiver.removeImageRequest() must be called in the main thread");
        this.mImageRequestList.remove(iqs);
    }

    public void sendBroadcast() {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("com.google.android.gms.extras.uri", this.mUri);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        iqq iqq = this.this$0;
        int i = iqq.f;
        Context context = iqq.a;
        throw null;
    }
}
