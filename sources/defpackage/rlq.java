package defpackage;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.widget.Filter;
import com.google.android.gms.common.api.Status;

/* renamed from: rlq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rlq extends Filter {
    final /* synthetic */ rlr a;
    private Runnable b;

    public rlq(rlr rlr) {
        this.a = rlr;
    }

    private static final Filter.FilterResults a(rlk rlk) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = rlk;
        filterResults.count = rlk.c.size();
        return filterResults;
    }

    public final CharSequence convertResultToString(Object obj) {
        if (!(obj instanceof rhf)) {
            return super.convertResultToString(obj);
        }
        return ((rhf) obj).a((CharacterStyle) null);
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        this.a.a((icf) null);
        this.b = null;
        if (TextUtils.isEmpty(charSequence)) {
            return a(rlk.f);
        }
        if (!this.a.c.i()) {
            return a(rlk.g);
        }
        this.b = new rlp(this, charSequence);
        return a(new rlk(3, (Status) null, this.a.b.c, -1, (rhq) null));
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.a.a((rlk) filterResults.values);
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
            this.b = null;
        }
    }
}
