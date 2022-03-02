package defpackage;

import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* renamed from: gox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gox implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ MinuteMaidChimeraActivity b;

    public gox(MinuteMaidChimeraActivity minuteMaidChimeraActivity, boolean z) {
        this.b = minuteMaidChimeraActivity;
        this.a = z;
    }

    public final void run() {
        alhs.a(this.b.getWindow(), this.a);
    }
}
