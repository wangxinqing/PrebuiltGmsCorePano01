package defpackage;

import android.widget.Filter;

/* renamed from: zlg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zlg extends Filter {
    final /* synthetic */ zlk a;

    public zlg(zlk zlk) {
        this.a = zlk;
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        int length;
        String str = null;
        if (charSequence != null && (length = charSequence.length()) > 0 && zlm.a(charSequence.charAt(0))) {
            str = charSequence.subSequence(1, length).toString();
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = str;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        zlk zlk = this.a;
        String str = (String) filterResults.values;
        if (zlk.J != null && zlk.K != null) {
            zlk.I = str;
            zlk.L.a(zlk.I);
            zlk.J.b(zlk.I);
            zlk.K.a(zlk.I);
        }
    }
}
