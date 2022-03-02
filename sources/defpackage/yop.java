package defpackage;

import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.gms.R;

/* renamed from: yop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yop extends znk {
    final /* synthetic */ yoy a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yop(yoy yoy, ilh ilh) {
        super(ilh);
        this.a = yoy;
    }

    public final int a(int i) {
        return this.a.f;
    }

    public final /* bridge */ /* synthetic */ View a(Object obj, View view, ViewGroup viewGroup, boolean z) {
        char c;
        ypp ypp;
        int i;
        wzs wzs = (wzs) obj;
        yoy yoy = this.a;
        if (!yoy.t) {
            return yoy.a(wzs, view, viewGroup, z);
        }
        if (!yoy.a(wzs, (wzs) yoy.w.b(0))) {
            zni zni = this.a.w;
            c = yoy.a(wzs, (wzs) zni.b(zni.d() + -1)) ? (char) 2 : 0;
        } else {
            c = 1;
        }
        yoy yoy2 = this.a;
        if (view == null) {
            ypp = new ypp(yoy2.M);
        } else {
            ypp = (ypp) view;
        }
        if (c == 0) {
            i = (int) yoy2.u.getResources().getDimension(R.dimen.plus_audience_selection_list_update_item_height);
        } else {
            i = (int) yoy2.u.getResources().getDimension(R.dimen.plus_audience_selection_list_update_item_height_extra);
        }
        int dimension = c == 1 ? (int) yoy2.u.getResources().getDimension(R.dimen.plus_audience_selection_list_update_item_padding_extra) : 0;
        int dimension2 = c == 2 ? (int) yoy2.u.getResources().getDimension(R.dimen.plus_audience_selection_list_update_item_padding_extra) : 0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i);
        RelativeLayout relativeLayout = (RelativeLayout) ypp.findViewById(R.id.audience_selection_update_circle_view);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setPadding(0, dimension, 0, dimension2);
        int i2 = Build.VERSION.SDK_INT;
        ypp.a();
        ypp.d = wzs;
        String d = wzs.d();
        int g = wzs.g();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sb = new StringBuilder(11);
        sb.append(g);
        String sb2 = sb.toString();
        SpannableString spannableString = new SpannableString(sb2);
        spannableString.setSpan(new ForegroundColorSpan(ypp.getResources().getColor(R.color.plus_audience_selection_update_text_light_color)), 0, sb2.length(), 0);
        if (!ypp.c) {
            spannableStringBuilder.append(d);
            if (g > 0) {
                spannableStringBuilder.append("  ");
                spannableStringBuilder.append(spannableString);
            }
            ypp.a.setGravity(19);
        } else {
            if (g > 0) {
                spannableStringBuilder.append(spannableString);
                spannableStringBuilder.append("  ");
            }
            spannableStringBuilder.append(d);
            ypp.a.setGravity(21);
        }
        ypp.a.setText(spannableStringBuilder);
        ypp.setChecked(yoy2.l.a.b.contains(ixa.a(wzs)));
        ypp.f = yoy2;
        View.OnClickListener onClickListener = yoy2.e;
        if (onClickListener == null) {
            return ypp;
        }
        ypp.b = onClickListener;
        return ypp;
    }
}
