package defpackage;

import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.google.android.gms.R;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: txi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class txi implements Runnable {
    private final txk a;
    private final HeadsetPiece b;
    private final RemoteViews c;
    private final AtomicInteger d;
    private final txc e;

    public txi(txk txk, HeadsetPiece headsetPiece, RemoteViews remoteViews, AtomicInteger atomicInteger, txc txc) {
        this.a = txk;
        this.b = headsetPiece;
        this.c = remoteViews;
        this.d = atomicInteger;
        this.e = txc;
    }

    public final void run() {
        txk txk = this.a;
        HeadsetPiece headsetPiece = this.b;
        RemoteViews remoteViews = this.c;
        AtomicInteger atomicInteger = this.d;
        txc txc = this.e;
        Bitmap bitmap = null;
        if (headsetPiece.c() != null && !headsetPiece.c().isEmpty()) {
            int dimensionPixelSize = txk.F.getResources().getDimensionPixelSize(R.dimen.fast_pair_battery_notification_image_size);
            bitmap = txj.a(headsetPiece.c(), dimensionPixelSize, dimensionPixelSize);
        }
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(16908294, aryg.a(txk.F, bitmap));
        }
        jjg jjg = tsp.a;
        headsetPiece.c();
        txk.a(atomicInteger, txc);
    }
}
