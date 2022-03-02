package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.ExecutionException;

/* renamed from: eyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class eyq implements Runnable {
    private final ezb a;
    private final aorr b;
    private final aorr c;

    public eyq(ezb ezb, aorr aorr, aorr aorr2) {
        this.a = ezb;
        this.b = aorr;
        this.c = aorr2;
    }

    public final void run() {
        ezb ezb = this.a;
        aorr aorr = this.b;
        aorr aorr2 = this.c;
        try {
            ezb.b.m = (ezg) aorr.get();
        } catch (InterruptedException | ExecutionException e) {
        }
        try {
            ezb.b.l = (Bitmap) ((amri) aorr2.get()).c();
        } catch (InterruptedException | ExecutionException e2) {
        }
        ezb.b.a(2);
        ezb.b.a(false);
    }
}
