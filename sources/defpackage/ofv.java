package defpackage;

import java.io.File;

/* renamed from: ofv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ofv extends jfx {
    final /* synthetic */ File a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ofv(File file) {
        super(10);
        this.a = file;
    }

    public final void run() {
        if (this.a.exists() && this.a.canWrite()) {
            this.a.delete();
        }
    }
}
