package defpackage;

import android.graphics.Bitmap;

/* renamed from: agbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agbz implements Runnable {
    private final agcd a;
    private final String b;
    private final Bitmap c;

    public agbz(agcd agcd, String str, Bitmap bitmap) {
        this.a = agcd;
        this.b = str;
        this.c = bitmap;
    }

    public final void run() {
        agcd agcd = this.a;
        String str = this.b;
        Bitmap bitmap = this.c;
        synchronized (agcf.a) {
            agcf.a.put(str, bitmap);
        }
        agcd.a(bitmap);
    }
}
