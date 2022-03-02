package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: hzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hzb extends hyo {
    private final boolean e;
    private final int f;
    private final int g;

    public hzb(Context context, List list, boolean z) {
        super(context, list);
        this.e = z;
        this.f = list != null ? list.size() : 0;
        this.g = R.layout.common_account_add_account_chip_view;
    }

    public final int getCount() {
        return this.e ? this.f + 1 : this.f;
    }

    public final int getItemViewType(int i) {
        return i == this.f ? 1 : 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (i == this.f) {
            return view == null ? this.a.inflate(this.g, viewGroup, false) : view;
        }
        return super.getView(i, view, viewGroup);
    }

    public final int getViewTypeCount() {
        return 2;
    }
}
