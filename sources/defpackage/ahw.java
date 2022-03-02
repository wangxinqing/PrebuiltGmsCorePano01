package defpackage;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: ahw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahw extends Filter {
    final ahv a;

    public ahw(ahv ahv) {
        this.a = ahv;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.a.b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a2 = this.a.a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a2 != null) {
            filterResults.count = a2.getCount();
        } else {
            filterResults.count = 0;
            a2 = null;
        }
        filterResults.values = a2;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a2 = this.a.a();
        if (filterResults.values != null && filterResults.values != a2) {
            this.a.a((Cursor) filterResults.values);
        }
    }
}
