package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import com.google.android.gms.R;
import com.google.android.places.ui.aliaseditor.AliasEditorChimeraActivity;

/* renamed from: alar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alar implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ AliasEditorChimeraActivity d;

    public alar(AliasEditorChimeraActivity aliasEditorChimeraActivity, Context context, String str, String str2) {
        this.d = aliasEditorChimeraActivity;
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        AliasEditorChimeraActivity aliasEditorChimeraActivity = this.d;
        if (aliasEditorChimeraActivity.f) {
            aliasEditorChimeraActivity.k();
            AliasEditorChimeraActivity aliasEditorChimeraActivity2 = this.d;
            if (aliasEditorChimeraActivity2.c == null) {
                aliasEditorChimeraActivity2.c = new AlertDialog.Builder(this.a).setMessage(R.string.alias_editor_update_failed).setPositiveButton(R.string.common_retry, new alaq(this)).setNegativeButton(R.string.common_cancel, new alap(this)).setOnCancelListener(new alao(this)).create();
            }
            this.d.c.show();
        }
    }
}
