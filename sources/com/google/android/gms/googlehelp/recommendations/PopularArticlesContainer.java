package com.google.android.gms.googlehelp.recommendations;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PopularArticlesContainer extends LinearLayout {
    public HelpChimeraActivity a;
    public List b;
    public oab c;
    public boolean d;
    public int e;

    public PopularArticlesContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public static final void a(HelpChimeraActivity helpChimeraActivity, int i, String str, String str2) {
        okg.a((nzu) helpChimeraActivity, i, str, 0, str2);
    }

    public static boolean b() {
        return ofq.b(axpp.a.a().a());
    }

    public PopularArticlesContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.d = false;
        LayoutInflater from = LayoutInflater.from(context);
        if (!b()) {
            i = R.layout.gh_popular_articles_content_deprecated;
        } else {
            i = R.layout.gh_popular_articles_content;
        }
        from.inflate(i, this, true);
    }

    public final void a() {
        oab oab;
        HelpChimeraActivity helpChimeraActivity = this.a;
        if (helpChimeraActivity != null) {
            HelpConfig helpConfig = helpChimeraActivity.x;
            String v = helpConfig.v();
            oab oab2 = this.c;
            if (oab2 == null || !oab2.e.equals(v)) {
                if (!TextUtils.isEmpty(v)) {
                    oab = oab.a(v, oal.a(), helpConfig);
                } else {
                    oab = null;
                }
                this.c = oab;
                if (oab != null) {
                    a(true);
                    if (!helpConfig.z() && this.d) {
                        a(this.a, 27, this.c.e, "");
                        return;
                    }
                    return;
                }
                a(false);
            } else if (!helpConfig.z() && this.d) {
                a(this.a, 27, this.c.e, "");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.gh_browse_all_articles_title);
        if (materialButton == null) {
            return;
        }
        if (z) {
            materialButton.setVisibility(0);
            materialButton.setOnClickListener(new omc(this));
            return;
        }
        materialButton.setVisibility(8);
    }
}
