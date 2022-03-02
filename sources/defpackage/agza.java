package defpackage;

import android.system.Os;
import java.io.FileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: agza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agza implements Callable {
    private final FileDescriptor a;

    public agza(FileDescriptor fileDescriptor) {
        this.a = fileDescriptor;
    }

    public final Object call() {
        return Os.fstat(this.a);
    }
}
