package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.View;

/* renamed from: zf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zf extends aav {
    final /* synthetic */ zm a;
    final /* synthetic */ AppCompatSpinner b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zf(AppCompatSpinner appCompatSpinner, View view, zm zmVar) {
        super(view);
        this.b = appCompatSpinner;
        this.a = zmVar;
    }

    public final xl a() {
        return this.a;
    }

    public final boolean b() {
        if (this.b.b.e()) {
            return true;
        }
        this.b.a();
        return true;
    }
}
