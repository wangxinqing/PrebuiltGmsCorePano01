package defpackage;

import android.content.ComponentName;

/* renamed from: aacb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aacb implements Runnable {
    private final aace a;
    private final ComponentName b;

    public aacb(aace aace, ComponentName componentName) {
        this.a = aace;
        this.b = componentName;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
