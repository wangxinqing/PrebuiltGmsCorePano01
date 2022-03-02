package defpackage;

import android.content.Context;
import android.view.MenuItem;
import com.google.android.gms.mdi.download.ui.DebugUiChimeraActivity;

/* renamed from: sdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sdt implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ DebugUiChimeraActivity a;

    public sdt(DebugUiChimeraActivity debugUiChimeraActivity) {
        this.a = debugUiChimeraActivity;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return false;
        }
        new iby((Context) this.a, (int[]) null).j().a(sdl.a);
        return true;
    }
}
