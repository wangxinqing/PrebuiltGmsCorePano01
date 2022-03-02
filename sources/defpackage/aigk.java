package defpackage;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: aigk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aigk implements Runnable {
    final /* synthetic */ FileDescriptor a;
    final /* synthetic */ PrintWriter b;
    final /* synthetic */ String[] c;
    final /* synthetic */ aigl d;

    public aigk(aigl aigl, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.d = aigl;
        this.a = fileDescriptor;
        this.b = printWriter;
        this.c = strArr;
    }

    public final void run() {
        this.d.e.a(this.a, this.b, this.c);
    }
}
