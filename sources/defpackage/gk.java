package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* renamed from: gk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gk extends gx implements bt, agf {
    final /* synthetic */ gl a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gk(gl glVar) {
        super(glVar, glVar, new Handler());
        this.a = glVar;
    }

    public final View a(int i) {
        return this.a.findViewById(i);
    }

    public final void b() {
        this.a.c();
    }

    public final ae getLifecycle() {
        return this.a.b;
    }

    public final bs getViewModelStore() {
        return this.a.getViewModelStore();
    }

    public final void a(gj gjVar, Intent intent, int i) {
        this.a.a(gjVar, intent, i);
    }

    public final boolean a() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
