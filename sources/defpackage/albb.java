package defpackage;

import android.content.DialogInterface;
import com.google.android.places.ui.aliaseditor.AliasEditorChimeraActivity;

/* renamed from: albb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class albb implements DialogInterface.OnClickListener {
    final /* synthetic */ AliasEditorChimeraActivity a;

    public albb(AliasEditorChimeraActivity aliasEditorChimeraActivity) {
        this.a = aliasEditorChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.h();
    }
}
