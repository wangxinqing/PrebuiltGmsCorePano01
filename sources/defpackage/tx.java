package defpackage;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* renamed from: tx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tx extends wc {
    final /* synthetic */ ty a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tx(ty tyVar, Window.Callback callback) {
        super(callback);
        this.a = tyVar;
    }

    public final View onCreatePanelView(int i) {
        if (i == 0) {
            return new View(this.a.a.b());
        }
        return super.onCreatePanelView(i);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (onPreparePanel) {
            ty tyVar = this.a;
            if (!tyVar.b) {
                tyVar.a.m();
                this.a.b = true;
                return true;
            }
        }
        return onPreparePanel;
    }
}
