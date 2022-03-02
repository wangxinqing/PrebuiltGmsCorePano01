package defpackage;

import java.io.File;

/* renamed from: afna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afna implements Runnable {
    private final afnb a;
    private final File b;
    private final String c;

    public afna(afnb afnb, File file, String str) {
        this.a = afnb;
        this.b = file;
        this.c = str;
    }

    public final void run() {
        afnb afnb = this.a;
        afnb.a.a(this.b, this.c);
    }
}
