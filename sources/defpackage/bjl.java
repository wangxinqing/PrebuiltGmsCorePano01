package defpackage;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.chimera.Fragment;

/* renamed from: bjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface bjl extends Fragment.ProxyCallbacks {
    ListAdapter superGetListAdapter();

    ListView superGetListView();

    long superGetSelectedItemId();

    int superGetSelectedItemPosition();

    void superOnListItemClick(ListView listView, View view, int i, long j);

    void superSetEmptyText(CharSequence charSequence);

    void superSetListAdapter(ListAdapter listAdapter);

    void superSetListShown(boolean z);

    void superSetListShownNoAnimation(boolean z);

    void superSetSelection(int i);
}
