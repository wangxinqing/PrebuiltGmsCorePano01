package com.google.android.chimera;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ListFragment extends Fragment {
    private iq a = null;

    private final bjl bc() {
        return (bjl) getProxy();
    }

    public Object getContainerFragment() {
        return getProxy();
    }

    public ListAdapter getListAdapter() {
        return bc().superGetListAdapter();
    }

    public ListView getListView() {
        return bc().superGetListView();
    }

    public long getSelectedItemId() {
        return bc().superGetSelectedItemId();
    }

    public int getSelectedItemPosition() {
        return bc().superGetSelectedItemPosition();
    }

    public void onListItemClick(ListView listView, View view, int i, long j) {
        bc().superOnListItemClick(listView, view, i, j);
    }

    public void setEmptyText(CharSequence charSequence) {
        bc().superSetEmptyText(charSequence);
    }

    /* access modifiers changed from: protected */
    public final void setImpl(iq iqVar) {
        super.setImpl(iqVar);
        this.a = iqVar;
    }

    public void setListAdapter(ListAdapter listAdapter) {
        bc().superSetListAdapter(listAdapter);
    }

    public void setListShown(boolean z) {
        bc().superSetListShown(z);
    }

    public void setListShownNoAnimation(boolean z) {
        bc().superSetListShownNoAnimation(z);
    }

    public void setSelection(int i) {
        bc().superSetSelection(i);
    }

    public void setTargetFragment(ListFragment listFragment, int i) {
        getProxy().setTargetFragment((ListFragmentProxy) listFragment.getContainerFragment(), i);
    }

    /* access modifiers changed from: protected */
    public iq getProxy() {
        if (this.a == null) {
            setImpl(new ListFragmentProxy(this));
        }
        return this.a;
    }

    public iq getSupportContainerFragment() {
        return getProxy();
    }
}
