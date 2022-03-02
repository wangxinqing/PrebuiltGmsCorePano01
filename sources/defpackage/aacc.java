package defpackage;

import android.content.ComponentName;
import android.os.IBinder;

/* renamed from: aacc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aacc implements Runnable {
    private final aace a;
    private final ComponentName b;
    private final IBinder c;

    public aacc(aace aace, ComponentName componentName, IBinder iBinder) {
        this.a = aace;
        this.b = componentName;
        this.c = iBinder;
    }

    public final void run() {
        this.a.b(this.b, this.c);
    }
}
