package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.plus.audience.AudienceSelectionListHeaderView;
import java.util.ArrayList;

/* renamed from: znm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class znm extends zni {
    final /* synthetic */ znq a;
    final /* synthetic */ yoy b;
    private final zni c;
    private final String d;
    private final String e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public znm(yoy yoy, int i, String str, zni zni) {
        this((znq) yoy, yoy.a(i), str, zni);
        this.b = yoy;
    }

    private final boolean c(int i) {
        return c() && i == 0;
    }

    private final int d(int i) {
        return c() ? i - 1 : i;
    }

    public final int a(int i) {
        if (c(i)) {
            return this.a.O;
        }
        return this.c.a(d(i));
    }

    public final Object b(int i) {
        return !c(i) ? this.c.b(d(i)) : this.d;
    }

    public final boolean c() {
        return this.d != null;
    }

    public final int d() {
        int d2 = this.c.d();
        int i = 0;
        if (c() && d2 > 0) {
            i = 1;
        }
        return d2 + i;
    }

    public final View a(int i, View view, ViewGroup viewGroup, boolean z) {
        if (!c(i)) {
            zni zni = this.c;
            int d2 = d(i);
            boolean z2 = false;
            if (z) {
                if (!c()) {
                    z2 = true;
                } else if (i != 1) {
                    z2 = true;
                }
            }
            return zni.a(d2, view, viewGroup, z2);
        }
        String str = this.d;
        AudienceSelectionListHeaderView audienceSelectionListHeaderView = (AudienceSelectionListHeaderView) this.b.a(view, R.layout.plus_audience_selection_list_header);
        audienceSelectionListHeaderView.a.setText(str);
        return audienceSelectionListHeaderView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public znm(yoy yoy, int i, zni zni) {
        this((znq) yoy, yoy.a(i), znq.b(yoy.a(i)), zni);
        this.b = yoy;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public znm(yoy yoy, String str, zni zni) {
        this((znq) yoy, str, znq.b(str), zni);
        this.b = yoy;
    }

    public final void a(ArrayList arrayList, int i) {
        if (this.e != null && !b()) {
            arrayList.add(new znn(this.e, i));
        }
        this.c.a(arrayList, i + (c() ? 1 : 0));
    }

    public znm(znq znq, String str, String str2, zni zni) {
        this.a = znq;
        this.c = zni;
        this.d = str;
        this.e = str2;
    }
}
