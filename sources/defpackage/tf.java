package defpackage;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* renamed from: tf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tf extends wc {
    final /* synthetic */ tn a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tf(tn tnVar, Window.Callback callback) {
        super(callback);
        this.a = tnVar;
    }

    /* access modifiers changed from: package-private */
    public final ActionMode a(ActionMode.Callback callback) {
        vv vvVar = new vv(this.a.e, callback);
        tn tnVar = this.a;
        vr vrVar = tnVar.k;
        if (vrVar != null) {
            vrVar.c();
        }
        te teVar = new te(tnVar, vvVar);
        sg a2 = tnVar.a();
        if (a2 != null) {
            tnVar.k = a2.a((vq) teVar);
        }
        if (tnVar.k == null) {
            tnVar.k = tnVar.a((vq) teVar);
        }
        vr vrVar2 = tnVar.k;
        if (vrVar2 != null) {
            return vvVar.b(vrVar2);
        }
        return null;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            tn tnVar = this.a;
            int keyCode = keyEvent.getKeyCode();
            sg a2 = tnVar.a();
            if (a2 == null || !a2.a(keyCode, keyEvent)) {
                tl tlVar = tnVar.x;
                if (tlVar == null || !tnVar.a(tlVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (tnVar.x == null) {
                        tl f = tnVar.f(0);
                        tnVar.a(f, keyEvent);
                        boolean a3 = tnVar.a(f, keyEvent.getKeyCode(), keyEvent);
                        f.m = false;
                        if (!a3) {
                            return false;
                        }
                    }
                    return false;
                }
                tl tlVar2 = tnVar.x;
                if (tlVar2 != null) {
                    tlVar2.n = true;
                }
            }
        }
        return true;
    }

    public final void onContentChanged() {
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof wt)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        sg a2;
        super.onMenuOpened(i, menu);
        tn tnVar = this.a;
        if (i == 108 && (a2 = tnVar.a()) != null) {
            a2.f(true);
        }
        return true;
    }

    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        tn tnVar = this.a;
        if (i == 108) {
            sg a2 = tnVar.a();
            if (a2 != null) {
                a2.f(false);
            }
        } else if (i == 0) {
            tl f = tnVar.f(0);
            if (f.o) {
                tnVar.a(f, false);
            }
        }
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        wt wtVar;
        if (menu instanceof wt) {
            wtVar = (wt) menu;
        } else {
            wtVar = null;
        }
        if (i == 0 && wtVar == null) {
            return false;
        }
        if (wtVar != null) {
            wtVar.j = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (wtVar != null) {
            wtVar.j = false;
        }
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        wt wtVar;
        tl f = this.a.f(0);
        if (f == null || (wtVar = f.j) == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, wtVar, i);
        }
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.a.p) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.a.p && i == 0) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback, i);
    }
}
