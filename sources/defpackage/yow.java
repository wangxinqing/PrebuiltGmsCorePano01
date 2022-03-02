package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.audience.AudienceSelectionListPersonView;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: yow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yow extends znj {
    public String a;
    final /* synthetic */ yoy b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yow(yoy yoy, Collection collection) {
        super(collection);
        this.b = yoy;
        new ArrayList();
    }

    public final int a(int i) {
        return this.b.h;
    }

    public final /* bridge */ /* synthetic */ View a(Object obj, View view, ViewGroup viewGroup, boolean z) {
        boolean z2;
        boolean z3;
        xfj xfj = (xfj) obj;
        int indexOf = this.b.l.a.b.indexOf(ixa.a(xfj));
        if (indexOf >= 0) {
            z2 = ((AudienceMember) this.b.l.a.b.get(indexOf)).h.getBoolean("checkboxEnabled", true);
            z3 = true;
        } else {
            z3 = false;
            z2 = true;
        }
        AudienceSelectionListPersonView a2 = this.b.a(xfj, xfj.c(), this.a, xfj.a(), xfj.d(), (String) null, z3, R.layout.plus_audience_selection_list_person, view, z, false, z2);
        a2.g = true;
        return a2;
    }
}
