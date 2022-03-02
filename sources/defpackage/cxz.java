package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import org.chromium.net.UrlRequest;

/* renamed from: cxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cxz {
    public static int a(Context context, aqrk aqrk) {
        aqrk aqrk2 = aqrk.ICON_UNSPECIFIED;
        switch (aqrk.ordinal()) {
            case 6:
            case 7:
            case 8:
                return !cyd.a(context) ? R.drawable.quantum_ic_chevron_right_vd_theme_24 : R.drawable.quantum_ic_chevron_left_vd_theme_24;
            case 9:
                return R.drawable.quantum_ic_edit_vd_theme_24;
            case 10:
                return R.drawable.quantum_ic_open_in_new_vd_theme_24;
            case 11:
                return R.drawable.quantum_gm_ic_phone_android_vd_theme_24;
            case 12:
                return que.a(context, R.attr.asPlaceholder, R.drawable.as_placeholder_light);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return que.a(context, R.attr.asAccountCircleOutlineVdTheme24, R.drawable.as_account_circle_outline_vd_theme_24_light);
            case UrlRequest.Status.READING_RESPONSE /*14*/:
            case 18:
                return R.drawable.quantum_ic_search_vd_theme_24;
            case Service.START_CONTINUATION_MASK:
                return R.drawable.quantum_ic_help_outline_vd_theme_24;
            case 16:
            case 20:
                return R.drawable.quantum_ic_menu_vd_theme_24;
            case 17:
                return R.drawable.quantum_ic_account_circle_vd_theme_24;
            case 19:
                return R.drawable.quantum_ic_help_vd_theme_24;
            case 21:
                return R.drawable.as_ic_personal_info;
            case 22:
                return R.drawable.quantum_gm_ic_toggle_on_vd_theme_24;
            case 23:
                return R.drawable.quantum_gm_ic_payment_vd_theme_24;
            case 24:
                return R.drawable.quantum_gm_ic_people_outline_vd_theme_24;
            case 25:
                return R.drawable.quantum_gm_ic_lock_vd_theme_24;
            case 26:
                return R.drawable.quantum_ic_cloud_off_vd_theme_24;
            case 27:
                return R.drawable.quantum_ic_error_outline_vd_theme_24;
            case 28:
                return R.drawable.product_logo_googleg_color_24;
            case 29:
                return R.drawable.quantum_gm_ic_perm_device_information_vd_theme_24;
            case 30:
                return R.drawable.quantum_gm_ic_local_hospital_vd_theme_24;
            case 31:
                return R.drawable.quantum_gm_ic_group_vd_theme_24;
            case 32:
                return R.drawable.quantum_ic_google_vd_theme_24;
            default:
                return 0;
        }
    }

    public static Drawable b(Context context, aqrk aqrk) {
        Drawable a;
        int a2 = a(context, aqrk);
        if (a2 == 0 || (a = kf.a(context, a2)) == null) {
            return null;
        }
        ma.a(a, a(aqrk));
        return a;
    }

    public static boolean a(aqrk aqrk) {
        return aqrk == aqrk.OPEN_IN_NEW_ICON;
    }
}
