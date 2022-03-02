package defpackage;

import android.view.View;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: aenm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aenm implements View.OnClickListener {
    private final OpenSearchView a;

    public aenm(OpenSearchView openSearchView) {
        this.a = openSearchView;
    }

    public void onClick(View view) {
        OpenSearchView openSearchView = this.a;
        openSearchView.i.setText("");
        openSearchView.g();
    }
}
