package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: gml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gml {
    final /* synthetic */ PreAddAccountChimeraActivity a;

    public gml(PreAddAccountChimeraActivity preAddAccountChimeraActivity) {
        this.a = preAddAccountChimeraActivity;
    }

    public final void a(int i) {
        this.a.getSupportLoaderManager().initLoader(i, (Bundle) null, this.a);
    }
}
