package defpackage;

import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: ojv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ojv {
    public final GoogleHelp a;

    public static final void a(Runnable runnable) {
        Thread thread = new Thread(runnable, "PsdCollector");
        thread.setPriority(4);
        thread.start();
    }

    public ojv(GoogleHelp googleHelp) {
        this.a = googleHelp;
    }
}
