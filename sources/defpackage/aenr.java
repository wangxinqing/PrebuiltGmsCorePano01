package defpackage;

import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: aenr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aenr implements Runnable {
    private final OpenSearchView a;

    public aenr(OpenSearchView openSearchView) {
        this.a = openSearchView;
    }

    public final void run() {
        OpenSearchView openSearchView = this.a;
        openSearchView.i.requestFocus();
        openSearchView.i().showSoftInput(openSearchView.i, 1);
    }
}
