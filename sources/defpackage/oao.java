package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.material.card.MaterialCardView;

/* renamed from: oao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oao {
    public static MaterialCardView a(HelpChimeraActivity helpChimeraActivity, View view, int i) {
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(R.id.gh_community_card);
        materialCardView.setVisibility(0);
        materialCardView.setOnClickListener(new oam(helpChimeraActivity, i));
        okg.c((nzu) helpChimeraActivity, i);
        return materialCardView;
    }

    public static MaterialCardView b(HelpChimeraActivity helpChimeraActivity, View view, int i) {
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(R.id.gh_smart_journey_card);
        materialCardView.setVisibility(0);
        materialCardView.setOnClickListener(new oan(helpChimeraActivity, i));
        okg.f(helpChimeraActivity, i);
        return materialCardView;
    }

    public static void a(HelpChimeraActivity helpChimeraActivity) {
        if (ofq.b(axpp.d())) {
            HelpConfig helpConfig = helpChimeraActivity.x;
            oab a = oab.a(helpConfig.F(), oal.a(), helpConfig);
            if (a == null) {
                String F = helpConfig.F();
                StringBuilder sb = new StringBuilder(String.valueOf(F).length() + 42);
                sb.append("Error, could not load smart journey for '");
                sb.append(F);
                sb.append("'");
                Log.e("gH_NeedMoreHelpUtil", sb.toString());
                return;
            }
            ooe.a(helpChimeraActivity, a, 173, 0);
            return;
        }
        HelpConfig helpConfig2 = helpChimeraActivity.x;
        opa.a((Activity) helpChimeraActivity, new Intent("android.intent.action.VIEW").setData(Uri.parse(helpConfig2.F())).putExtra("requireGcmToken", true), helpConfig2, 5);
    }
}
