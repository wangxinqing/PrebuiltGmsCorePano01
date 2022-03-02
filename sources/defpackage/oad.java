package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oad {
    public static Drawable a(Context context, Drawable drawable, int i) {
        Drawable a = ofx.a(drawable, context.getResources());
        ofx.a(a, context, i);
        return a;
    }

    public static void a(oab oab, HelpChimeraActivity helpChimeraActivity) {
        opa.a((Activity) helpChimeraActivity, Uri.parse(oab.i), helpChimeraActivity.x, helpChimeraActivity.y);
    }

    public static void a(oah oah, oab oab, int i, int i2, String str) {
        oah.a(Uri.parse(oab.g), i, oab.e, i2, str);
    }

    public static void a(oho oho, oab oab, HelpChimeraActivity helpChimeraActivity) {
        oho.a = oab.d;
        if (oab.s()) {
            oho.b = oab.r();
        }
        oho.c = oab.e;
        oho.d = oab.v();
        oho.g = helpChimeraActivity.x;
        oho.show(helpChimeraActivity.getSupportFragmentManager(), "setting_action_dialog");
    }

    public static boolean a(ImageView imageView, oab oab, Context context) {
        Drawable drawable;
        if (oab.e()) {
            imageView.setImageResource(R.drawable.quantum_ic_drive_document_googblue_24);
            return true;
        } else if (oab.f()) {
            imageView.setImageResource(R.drawable.quantum_ic_drive_document_googblue_24);
            return true;
        } else if (oab.j() || oab.k() || oab.q()) {
            imageView.setImageResource(R.drawable.quantum_ic_forum_googblue_24);
            return true;
        } else if (oab.l()) {
            imageView.setImageResource(R.drawable.quantum_ic_android_googblue_24);
            return true;
        } else if (oab.h()) {
            imageView.setImageResource(R.drawable.quantum_ic_drive_document_googblue_24);
            return true;
        } else if (oab.m()) {
            imageView.setImageResource(R.drawable.quantum_ic_exit_to_app_googblue_24);
            return true;
        } else if (oab.n()) {
            Drawable a = kf.a(context, (int) R.drawable.quantum_ic_settings_white_24);
            if (ofy.b()) {
                drawable = ofx.b(a, context, kf.b(context, R.color.material_google_blue_500));
            } else {
                drawable = a(context, a, (int) R.color.material_google_blue_500);
            }
            imageView.setImageDrawable(drawable);
            return true;
        } else if (!oab.o()) {
            return oab.g();
        } else {
            imageView.setImageResource(R.drawable.quantum_ic_exit_to_app_googblue_24);
            return true;
        }
    }
}
