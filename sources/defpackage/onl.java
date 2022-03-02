package defpackage;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.List;

/* renamed from: onl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class onl extends acg {
    public List a;
    private final HelpChimeraActivity e;
    private String f;

    public onl(HelpChimeraActivity helpChimeraActivity) {
        this.e = helpChimeraActivity;
    }

    private static final onk a(ViewGroup viewGroup) {
        int i;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (!ofq.b(axqb.b())) {
            i = R.layout.gh_help_content_list_item_deprecated;
        } else {
            i = R.layout.gh_help_content_list_item;
        }
        View inflate = from.inflate(i, viewGroup, false);
        ((LinearLayout) inflate).setGravity(48);
        return new onk(inflate);
    }

    public final int a() {
        if (!ofq.a(axnu.b()) || !this.e.x.H()) {
            List list = this.a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        List list2 = this.a;
        if (list2 != null) {
            return list2.size() + 1;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r1.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r2) {
        /*
            r1 = this;
            boolean r0 = defpackage.axnu.b()
            boolean r0 = defpackage.ofq.a(r0)
            if (r0 == 0) goto L_0x0016
            java.util.List r0 = r1.a
            if (r0 == 0) goto L_0x0016
            int r0 = r0.size()
            if (r2 != r0) goto L_0x0016
            r2 = 1
            return r2
        L_0x0016:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onl.a(int):int");
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        if (!ofq.a(axnu.b())) {
            return a(viewGroup);
        }
        if (i == 0) {
            return a(viewGroup);
        }
        if (i == 1) {
            return new onk(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gh_need_more_help_options, viewGroup, false));
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Error, unknown viewType '");
        sb.append(i);
        sb.append("' encountered!");
        Log.e("gH_SearchSugAdapter", sb.toString());
        return null;
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        onk onk = (onk) adl;
        if (!ofq.a(axnu.b())) {
            a(onk, i);
        } else if (a(i) != 0) {
            HelpConfig helpConfig = this.e.x;
            if (helpConfig.H()) {
                View view = onk.s;
                if (!TextUtils.isEmpty(helpConfig.G())) {
                    oao.a(this.e, view, 196);
                }
                if (!TextUtils.isEmpty(helpConfig.F())) {
                    oao.b(this.e, view, 196);
                }
                View findViewById = view.findViewById(R.id.gh_bottom_section_divider);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                View findViewById2 = view.findViewById(R.id.gh_top_section_divider);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                TextView textView = (TextView) view.findViewById(R.id.gh_need_more_help_title);
                if (textView != null) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams.gravity = 17;
                    textView.setLayoutParams(layoutParams);
                    textView.setPadding(0, 0, 0, this.e.getResources().getDimensionPixelSize(R.dimen.gh_twice_padding));
                }
            }
        } else {
            a(onk, i);
        }
    }

    public final void a(String str, List list) {
        this.f = str;
        this.a = list;
        as();
    }

    /* access modifiers changed from: package-private */
    public final void a(onk onk, int i) {
        List list = this.a;
        if (list != null) {
            oab oab = (oab) list.get(i);
            oac oac = new oac(this.e, oab, i, 7, this.f);
            View view = onk.s;
            HelpChimeraActivity helpChimeraActivity = this.e;
            if (!oae.a(view, oab, helpChimeraActivity)) {
                view.setVisibility(8);
            } else {
                oae.a(view, helpChimeraActivity, oab, (View.OnClickListener) oac, true);
            }
        }
    }
}
