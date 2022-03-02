package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.google.android.gms.R;

/* renamed from: amm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amm implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    private final Preference a;

    public amm(Preference preference) {
        this.a = preference;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        CharSequence f = this.a.f();
        if (this.a.A && !TextUtils.isEmpty(f)) {
            contextMenu.setHeaderTitle(f);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        CharSequence f = this.a.f();
        ((ClipboardManager) this.a.k.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", f));
        Context context = this.a.k;
        Toast.makeText(context, context.getString(R.string.preference_copied, new Object[]{f}), 0).show();
        return true;
    }
}
