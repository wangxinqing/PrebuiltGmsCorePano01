package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: vv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vv implements vq {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c = new ArrayList();
    final ou d = new ou();

    public vv(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.Menu, java.lang.Object, mh] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.Menu a(android.view.Menu r3) {
        /*
            r2 = this;
            ou r0 = r2.d
            java.lang.Object r0 = r0.get(r3)
            android.view.Menu r0 = (android.view.Menu) r0
            if (r0 != 0) goto L_0x0016
            xk r0 = new xk
            android.content.Context r1 = r2.b
            r0.<init>(r1, r3)
            ou r1 = r2.d
            r1.put(r3, r0)
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vv.a(android.view.Menu):android.view.Menu");
    }

    public final void a(vr vrVar) {
        throw null;
    }

    public final boolean a(vr vrVar, Menu menu) {
        throw null;
    }

    public final boolean a(vr vrVar, MenuItem menuItem) {
        throw null;
    }

    public final ActionMode b(vr vrVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            vw vwVar = (vw) this.c.get(i);
            if (vwVar != null && vwVar.b == vrVar) {
                return vwVar;
            }
        }
        vw vwVar2 = new vw(this.b, vrVar);
        this.c.add(vwVar2);
        return vwVar2;
    }

    public final void b(vr vrVar, Menu menu) {
        throw null;
    }
}
