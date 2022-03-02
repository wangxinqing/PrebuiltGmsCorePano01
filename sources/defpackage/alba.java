package defpackage;

import android.content.DialogInterface;
import com.google.android.places.ui.aliaseditor.AliasEditorChimeraActivity;

/* renamed from: alba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alba implements DialogInterface.OnClickListener {
    final /* synthetic */ AliasEditorChimeraActivity a;

    public alba(AliasEditorChimeraActivity aliasEditorChimeraActivity) {
        this.a = aliasEditorChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        akzz akzz = this.a.a;
        if (akzz != null) {
            akzz.a();
        }
    }
}
