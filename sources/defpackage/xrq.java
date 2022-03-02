package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;

/* renamed from: xrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xrq extends Fragment {
    private xry a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xry xry = new xry();
        this.a = xry;
        xry.a((bjs) getActivity());
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        this.a.a(menuInflater, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return this.a.a(layoutInflater, viewGroup);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        this.a.a(menuItem);
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onStart() {
        super.onStart();
        this.a.a();
    }

    public final void onStop() {
        this.a.b();
        super.onStop();
    }
}
