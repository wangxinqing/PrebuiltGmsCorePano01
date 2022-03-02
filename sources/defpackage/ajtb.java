package defpackage;

import android.view.MenuItem;
import android.view.View;

/* renamed from: ajtb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajtb implements View.OnClickListener {
    final /* synthetic */ ajtc a;

    public ajtb(ajtc ajtc) {
        this.a = ajtc;
    }

    public void onClick(View view) {
        ww wwVar = ((ajsz) view).c;
        ajtc ajtc = this.a;
        if (!ajtc.o.a((MenuItem) wwVar, (xh) ajtc.n, 0)) {
            wwVar.setChecked(true);
        }
    }
}
