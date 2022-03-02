package defpackage;

import android.content.DialogInterface;
import android.widget.EditText;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vpd implements DialogInterface.OnClickListener {
    private final SettingsChimeraActivity a;
    private final EditText b;

    public vpd(SettingsChimeraActivity settingsChimeraActivity, EditText editText) {
        this.a = settingsChimeraActivity;
        this.b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a((CharSequence) this.b.getText());
    }
}
