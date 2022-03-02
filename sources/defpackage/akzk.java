package defpackage;

import android.os.Bundle;
import com.google.android.places.ui.aliaseditor.AliasEditorChimeraActivity;

/* renamed from: akzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akzk implements ica {
    final /* synthetic */ alau a;

    public akzk(alau alau) {
        this.a = alau;
    }

    public final void a(int i) {
    }

    public final void g(Bundle bundle) {
        alau alau = this.a;
        AliasEditorChimeraActivity aliasEditorChimeraActivity = alau.a;
        if (aliasEditorChimeraActivity.e) {
            rhq rhq = aliasEditorChimeraActivity.h;
            if (rhq != null) {
                aliasEditorChimeraActivity.b(rhq.a(), alau.a.h.q().toString());
            } else {
                aliasEditorChimeraActivity.b(aliasEditorChimeraActivity.g);
            }
            alau.a.e = false;
        }
    }
}
