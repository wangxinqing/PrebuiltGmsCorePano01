package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.List;
import org.json.JSONException;

/* renamed from: onb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class onb extends acg {
    public final HelpChimeraActivity a;
    public List e;

    public onb(HelpChimeraActivity helpChimeraActivity) {
        this.a = helpChimeraActivity;
    }

    public final int a() {
        List list = this.e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (!ofq.b(axqb.b())) {
            i2 = R.layout.gh_autocomplete_suggestion_item_deprecated;
        } else {
            i2 = R.layout.gh_autocomplete_suggestion_item;
        }
        return new ona(from.inflate(i2, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        int i2;
        ona ona = (ona) adl;
        omv omv = (omv) this.e.get(i);
        int i3 = omv.a;
        if (i3 == -1) {
            ona.s.setVisibility(8);
            return;
        }
        TextView textView = (TextView) ona.s.findViewById(R.id.gh_suggestion_label);
        String str = omv.b;
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        Spanned a2 = oag.a(str);
        textView.setText(a2);
        textView.setContentDescription(a2.toString());
        textView.setVisibility(0);
        ImageView imageView = (ImageView) ona.s.findViewById(R.id.gh_article_suggestion_icon);
        ImageView imageView2 = (ImageView) ona.s.findViewById(R.id.gh_query_suggestion_icon);
        ImageView imageView3 = (ImageView) ona.s.findViewById(R.id.gh_query_suggestion_refinement_icon);
        String str2 = omv.d;
        if (i3 == 1) {
            imageView.setImageResource(R.drawable.quantum_ic_drive_document_googblue_24);
            if (ofq.b(axou.b())) {
                ofx.a(imageView, (Context) this.a, ofy.b() ? ofy.a(this.a, R.attr.gh_primaryBlueColor) : kf.b(this.a, R.color.google_blue600));
            }
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
            imageView3.setVisibility(8);
            ona.s.setOnClickListener(new omw(this, i, str2, omv));
        } else if (i3 != 2) {
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            if (ofq.b(axou.b())) {
                ofx.a(imageView2, (Context) this.a, ofy.b() ? ofy.a(this.a, R.attr.ghf_greyIconColor) : kf.b(this.a, R.color.google_grey700));
            }
            imageView3.setVisibility(0);
            if (ofq.b(axou.b())) {
                ofx.a(imageView3, (Context) this.a, ofy.b() ? ofy.a(this.a, R.attr.ghf_greyIconColor) : kf.b(this.a, R.color.google_grey700));
            }
            imageView3.setTag(textView.getText());
            imageView3.setOnClickListener(new omy(this));
            ona.s.setOnClickListener(new omz(this, omv));
        } else {
            try {
                String str3 = omv.e;
                oad.a(imageView, oab.b(str3, ""), (Context) this.a);
                if (ofq.b(axou.b())) {
                    HelpChimeraActivity helpChimeraActivity = this.a;
                    if (ofy.b()) {
                        i2 = ofy.a(this.a, R.attr.gh_primaryBlueColor);
                    } else {
                        i2 = kf.b(this.a, R.color.google_blue600);
                    }
                    ofx.a(imageView, (Context) helpChimeraActivity, i2);
                }
                imageView.setVisibility(0);
                imageView2.setVisibility(8);
                imageView3.setVisibility(8);
                ona.s.setOnClickListener(new omx(this, str3, str2, i, omv));
            } catch (JSONException e2) {
                ona.s.setVisibility(8);
            }
        }
    }

    public final void a(List list, omv omv) {
        okg.a((nzu) this.a, list, omv);
    }
}
