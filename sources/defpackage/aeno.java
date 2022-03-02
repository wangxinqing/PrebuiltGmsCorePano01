package defpackage;

import android.view.View;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: aeno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aeno implements ajyd {
    private final OpenSearchView a;

    public aeno(OpenSearchView openSearchView) {
        this.a = openSearchView;
    }

    public final void a(View view, qn qnVar, ajye ajye) {
        int i;
        int i2;
        OpenSearchView openSearchView = this.a;
        boolean a2 = aeni.a(openSearchView.f);
        if (!a2) {
            i = ajye.a;
        } else {
            i = ajye.c;
        }
        if (!a2) {
            i2 = ajye.c;
        } else {
            i2 = ajye.a;
        }
        openSearchView.f.setPadding(i + qnVar.a(), ajye.b, i2 + qnVar.c(), ajye.d);
    }
}
