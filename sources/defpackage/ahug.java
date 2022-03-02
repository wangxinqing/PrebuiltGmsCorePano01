package defpackage;

import android.os.HandlerThread;

/* renamed from: ahug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahug extends HandlerThread {
    final /* synthetic */ ahui a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahug(ahui ahui, String str) {
        super(str);
        this.a = ahui;
    }

    public final void run() {
        try {
            this.a.a.b(ajbe.COLLECTIONLIB, 600000, this.a.g);
            super.run();
        } finally {
            this.a.a.c(ajbe.COLLECTIONLIB);
        }
    }
}
