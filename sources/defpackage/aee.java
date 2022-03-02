package defpackage;

import android.database.Cursor;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: aee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aee implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ SearchView a;

    public aee(SearchView searchView) {
        this.a = searchView;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        SearchView searchView = this.a;
        Editable text = searchView.a.getText();
        Cursor cursor = searchView.q.d;
        if (cursor == null) {
            return;
        }
        if (cursor.moveToPosition(i)) {
            CharSequence b = searchView.q.b(cursor);
            if (b != null) {
                searchView.b(b);
            } else {
                searchView.b((CharSequence) text);
            }
        } else {
            searchView.b((CharSequence) text);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
