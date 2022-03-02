package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.audience.AudienceSelectionListCircleView;
import com.google.android.gms.plus.audience.FaclSelectionChimeraActivity;
import java.util.HashSet;

/* renamed from: yqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yqs extends yoy {
    final /* synthetic */ yqt a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yqs(yqt yqt, Context context, yqd yqd, String str, String str2) {
        super(context, yqd, str, str2, false);
        this.a = yqt;
    }

    /* access modifiers changed from: protected */
    public final View a(View view, ViewGroup viewGroup, boolean z) {
        View a2 = super.a(view, viewGroup, z);
        yqt yqt = this.a;
        int i = yqt.c;
        if (yqt.a != null && yqt.b().C) {
            a2.setVisibility(8);
        } else if (!this.a.b().C) {
            a2.setVisibility(0);
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public final AudienceSelectionListCircleView a(wzs wzs, View view, ViewGroup viewGroup, boolean z) {
        AudienceSelectionListCircleView a2 = super.a(wzs, view, viewGroup, z);
        if (wzs.f() == 1) {
            a2.c();
        } else {
            a2.c.setText(R.string.plus_audience_selection_hidden_circle);
            a2.c.setVisibility(0);
        }
        yqt yqt = this.a;
        int i = yqt.c;
        if (yqt.a != null && yqt.b().C) {
            a2.setVisibility(8);
        } else if (!this.a.b().C) {
            a2.setVisibility(0);
        }
        return a2;
    }

    public final void a(ilh ilh) {
        super.a((ilh) new ils(ilh, FaclSelectionChimeraActivity.w));
        yqt yqt = this.a;
        HashSet hashSet = new HashSet();
        int i = yqt.c;
        yqt.b = hashSet;
        for (int i2 = 0; i2 < ilh.a(); i2++) {
            wzs b = ((xfe) ilh).a(i2);
            this.a.b.add(AudienceMember.b(b.c(), b.d()));
        }
        this.a.j();
    }
}
