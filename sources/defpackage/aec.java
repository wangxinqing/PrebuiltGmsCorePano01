package defpackage;

import android.support.v7.widget.SearchView;
import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: aec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aec implements TextView.OnEditorActionListener {
    final /* synthetic */ SearchView a;

    public aec(SearchView searchView) {
        this.a = searchView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.j();
        return true;
    }
}
