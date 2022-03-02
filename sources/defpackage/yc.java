package defpackage;

import android.view.View;

/* renamed from: yc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yc extends aav {
    final /* synthetic */ yd a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yc(yd ydVar, View view) {
        super(view);
        this.a = ydVar;
    }

    public final xl a() {
        ye yeVar = this.a.a.l;
        if (yeVar != null) {
            return yeVar.a();
        }
        return null;
    }

    public final boolean b() {
        this.a.a.c();
        return true;
    }

    public final boolean c() {
        yh yhVar = this.a.a;
        if (yhVar.n != null) {
            return false;
        }
        yhVar.d();
        return true;
    }
}
