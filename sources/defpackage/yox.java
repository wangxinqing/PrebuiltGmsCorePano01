package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.List;

/* renamed from: yox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yox extends zni {
    final /* synthetic */ yoy a;
    private final List b;
    private final int c;

    public yox(yoy yoy, List list, int i) {
        this.a = yoy;
        this.b = list;
        this.c = i;
    }

    public final int a(int i) {
        return this.a.j;
    }

    public final Object b(int i) {
        return null;
    }

    public final int d() {
        int i = this.c;
        int i2 = this.a.o;
        return ((i + i2) - 1) / i2;
    }

    public final View a(int i, View view, ViewGroup viewGroup, boolean z) {
        ViewGroup viewGroup2;
        int i2;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) view2;
        } else {
            viewGroup2 = (ViewGroup) this.a.N.inflate(R.layout.plus_audience_selection_suggested_image_row, viewGroup, false);
        }
        while (true) {
            int childCount = viewGroup2.getChildCount();
            yoy yoy = this.a;
            if (childCount >= yoy.o) {
                break;
            }
            viewGroup2.addView(yoy.N.inflate(R.layout.plus_audience_selection_suggested_image_item, viewGroup2, false));
        }
        if (viewGroup2.getChildCount() > this.a.o) {
            viewGroup2.removeViews(0, viewGroup2.getChildCount() - this.a.o);
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (i2 < this.a.o) {
            View childAt = viewGroup2.getChildAt(i2);
            int i3 = (this.a.o * i) + i2;
            if (i3 < this.c) {
                AudienceMember audienceMember = (AudienceMember) this.b.get(i3);
                audienceMember.h.putInt("selectionSource", 1);
                this.a.a(audienceMember, audienceMember.f, audienceMember.h.getString("secondaryText"), audienceMember.e, audienceMember.g, audienceMember.h.getString("contactsAvatarUri"), this.a.l.a.b.contains(audienceMember), R.layout.plus_audience_selection_suggested_image_item, childAt, false, true, true).d();
                childAt.setVisibility(0);
            } else {
                childAt.setVisibility(4);
            }
            i2++;
        }
        return viewGroup2;
    }
}
