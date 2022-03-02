package defpackage;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.chimera.ListFragment;
import com.google.android.gms.R;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* renamed from: ymc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ymc extends ListFragment implements ylz {
    protected ymb a;
    private sg b;
    private boolean c;

    public final void a(sg sgVar) {
        if (!isResumed()) {
            this.c = true;
            this.b = sgVar;
            return;
        }
        b(sgVar);
        this.c = false;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        setEmptyText("");
        TextView textView = (TextView) getListView().getEmptyView();
        textView.setTextSize(18.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.plus_empty_text_padding);
        textView.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        textView.setGravity(48);
        textView.setAutoLinkMask(15);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public abstract void b(sg sgVar);

    public abstract FavaDiagnosticsEntity c();

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a = (ymb) getFragmentManager().findFragmentByTag("apps_util");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!this.a.onOptionsItemSelected(menuItem)) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        this.a.onPrepareOptionsMenu(menu);
    }

    public final void onResume() {
        super.onResume();
        if (this.c) {
            b(this.b);
            this.b = null;
            this.c = false;
        }
    }

    public final void onStart() {
        super.onStart();
        this.a.g.add(this);
        a();
    }

    public final void onStop() {
        super.onStop();
        this.a.g.remove(this);
    }
}
