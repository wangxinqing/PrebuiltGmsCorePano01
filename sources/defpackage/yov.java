package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: yov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yov extends znk {
    final /* synthetic */ yoy a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yov(yoy yoy, ilh ilh, int i) {
        super(ilh, 0, Integer.valueOf(i));
        this.a = yoy;
    }

    public final int a(int i) {
        return this.a.h;
    }

    public final /* bridge */ /* synthetic */ View a(Object obj, View view, ViewGroup viewGroup, boolean z) {
        xfj xfj = (xfj) obj;
        return this.a.a(xfj, xfj.c(), (String) null, xfj.a(), xfj.d(), (String) null, this.a.l.a.b.contains(ixa.a(xfj)), R.layout.plus_audience_selection_list_person, view, z, false, true);
    }
}
