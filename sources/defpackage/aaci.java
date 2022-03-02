package defpackage;

import android.os.IBinder;

/* renamed from: aaci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aaci implements Runnable {
    private final aacm a;
    private final IBinder b;

    public aaci(aacm aacm, IBinder iBinder) {
        this.a = aacm;
        this.b = iBinder;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
