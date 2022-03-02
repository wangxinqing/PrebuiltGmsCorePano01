package defpackage;

/* renamed from: mxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mxq implements Runnable {
    public final void run() {
        Process process = mxu.h;
        if (process != null) {
            process.destroy();
        }
    }
}
