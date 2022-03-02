package defpackage;

import android.content.DialogInterface;
import com.google.android.places.ui.aliaseditor.AliasEditorChimeraActivity;

/* renamed from: alaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alaz implements DialogInterface.OnCancelListener {
    final /* synthetic */ AliasEditorChimeraActivity a;

    public alaz(AliasEditorChimeraActivity aliasEditorChimeraActivity) {
        this.a = aliasEditorChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        akzz akzz = this.a.a;
        if (akzz != null) {
            akzz.a();
        }
    }
}
