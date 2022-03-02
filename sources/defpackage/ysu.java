package defpackage;

import android.net.Uri;
import com.android.volley.DefaultRetryPolicy;

/* renamed from: ysu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ysu {
    public static final ikz A = ikz.a("plus.post_max_individual_acls", (Integer) 10);
    public static final ikz B = ikz.a("plus.lso_aspen_scope_ids", "9335");
    public static final ikz C = ikz.a("plus.lso_conn_read_scope_ids", (Integer) 64806);
    public static final ikz D = ikz.a("plus.list_apps.disabled_versions", "");
    public static final ikz E = ikz.a("plus.list_apps.disabled_url", "https://support.google.com/plus/?p=plus_controls_mobile");
    public static final ikz F = ikz.a("plus.list_moments.disabled_versions", "");
    public static final ikz G = ikz.a("plus.list_moments.disabled_url", "https://support.google.com/plus/?p=plus_controls_mobile");
    public static final ikz H = ikz.a("plus.manage_app.disabled_versions", "");
    public static final ikz I = ikz.a("plus.manage_app.disabled_url", "https://support.google.com/plus/?p=plus_controls_mobile");
    public static final ikz J = ikz.a("plus.oob_debugging", false);
    public static final ikz K = ikz.a("plus.oob_default_birthday", "1940-01-01");
    public static final ikz L = ikz.a("plus.oob_last_name_first_countries", "*ja*ko*hu*zh*");
    public static final ikz M = ikz.a("plus.share_box.max_people", (Integer) 100);
    public static final ikz N = ikz.a("plus.share_box.add_to_circle_enabled", false);
    public static final ikz O = ikz.a("plus.share_box.add_to_circle_default", true);
    public static final ikz P = ikz.a("plus.share_box.show_acl_picker_first", true);
    public static final ikz Q = ikz.a("plus.share_box.showcased_suggestion_count", (Integer) 6);
    public static final ikz R = ikz.a("plus.share_box.suggestion_count", (Integer) 0);
    public static final ikz S = ikz.a("plus.share_box.client_suggestion_count", (Integer) 3);
    public static final ikz T = ikz.a("plus.share_box.show_suggested_default", true);
    public static final ikz U = ikz.a("plus.share_box.include_suggestions_default", true);
    public static final ikz V = ikz.a("plus.share_box.show_add_to_circle_default", true);
    public static final ikz W = ikz.a("plus.share_box.add_to_circle_max_name_length", (Integer) 50);
    public static final ikz X = ikz.a("plus.share_box.people_sync_allowance_seconds", (Long) 28800L);
    public static final ikz Y = ikz.a("plus.share_box.people_sync_allowance_seconds_sign_in", (Long) 0L);
    public static final ikz Z = ikz.a("plus.server.timeout_ms.default", Integer.valueOf(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS));
    public static final ikz a = ikz.a("plus.cache_enabled", false);
    public static final ikz aa = ikz.a("plus.sign_in.skip_google_plus_upgrade", false);
    public static final ikz ab = ikz.a("plus.write_moments.online_disabled", false);
    public static final ikz b = ikz.a("plus.verbose_logging", true);
    public static final ikz c = ikz.a("plus.apiary_trace", "");
    public static final ikz d = ikz.a("plus.pos_server_url", "https://www.googleapis.com");
    public static final ikz e = ikz.a("plus.pos_server_api_path", "/pos/v1/");
    public static final ikz f = ikz.a("plus.pos_backend_override", "");
    public static final ikz g = ikz.a("plus.pos_anonymous_api_key", "AIzaSyBa9bgzwtnGchlkux96-c5Q_fi19fE1pEA");
    public static final ikz h = ikz.a("plus.whitelisted_server_url", "https://www.googleapis.com");
    public static final ikz i = ikz.a("plus.whitelisted_server_api_path", "/plus/v1whitelisted/");
    public static final ikz j = ikz.a("plus.whitelisted_backend_override", "");
    public static final ikz k = ikz.a("plus.v1_server_url", "https://www.googleapis.com");
    public static final ikz l = ikz.a("plus.v1_server_api_path", "/plus/v1/");
    public static final ikz m = ikz.a("plus.v1_backend_override", "");
    public static final ikz n = ikz.a("plus.oauth_server_url", "https://accounts.google.com");
    public static final ikz o = ikz.a("plus.oauth_server_api_path", "/o/oauth2");
    public static final ikz p = ikz.a("plus.oauth_backend_override", "");
    public static final ikz q = ikz.a("plus.list_apps.reset", true);
    public static final ikz r = ikz.a("plus.list_apps.learn_more_url", "https://support.google.com/plus/?p=plus_sign_in");
    public static final ikz s = ikz.a("plus.list_apps.help_url", "https://support.google.com/plus/?p=plus_controls_mobile");
    public static final ikz t = ikz.a("plus.list_fitness_apps.learn_more_url", "https://support.google.com/mobile/?p=google_settings_fitness_devices");
    public static final ikz u = ikz.a("plus.list_apps_fitness._help_url", "https://support.google.com/mobile/?p=google_settings_fitness");
    public static final ikz v = ikz.a("plus.list_apps_lso._help_url", "https://support.google.com/accounts/answer/3290768");
    public static final ikz w = ikz.a("plus.list_moments.help_url", "https://support.google.com/plus/?p=plus_controls_mobile");
    public static final ikz x = ikz.a("plus.moments.manage_web_url", "https://support.google.com/plus/?p=plus_controls_mobile");
    public static final ikz y = ikz.a("plus.list_apps.max_items", (Integer) 100);
    public static final ikz z = ikz.a("plus.list_moments.max_items", (Integer) 100);

    public static int a(int i2, String str) {
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        Object[] array = parse.getPathSegments().toArray();
        int length = array.length;
        a(sb, i2, array, length, -1);
        int intValue = ((Integer) ikz.a(sb.toString(), (Integer) -1).c()).intValue();
        if (intValue <= 0 && (intValue = a(sb, i2, array, length)) <= 0) {
            while (true) {
                if (length <= 0) {
                    break;
                }
                int i3 = length - 1;
                array[i3] = "*";
                int a2 = a(sb, i2, array, length);
                if (a2 > 0) {
                    intValue = a2;
                    break;
                }
                int i4 = i3;
                intValue = a2;
                length = i4;
            }
        }
        return intValue <= 0 ? ((Integer) Z.c()).intValue() : intValue;
    }

    private static int a(StringBuilder sb, int i2, Object[] objArr, int i3) {
        int i4 = -1;
        for (int i5 = i3 - 1; i5 >= 0; i5--) {
            a(sb, i2, objArr, i3, i5);
            i4 = ((Integer) ikz.a(sb.toString(), (Integer) -1).c()).intValue();
            if (i4 > 0) {
                break;
            }
        }
        return i4;
    }

    private static void a(StringBuilder sb, int i2, Object[] objArr, int i3, int i4) {
        sb.setLength(0);
        sb.append("plus.server.timeout_ms.");
        if (i2 == -1) {
            sb.append("DEPRECATED_GET_OR_POST.");
        } else if (i2 == 0) {
            sb.append("GET.");
        } else if (i2 == 1) {
            sb.append("POST.");
        } else if (i2 == 2) {
            sb.append("PUT.");
        } else if (i2 == 3) {
            sb.append("DELETE.");
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append('/');
            if (i5 == i4) {
                sb.append('*');
            } else {
                sb.append(objArr[i5]);
            }
        }
    }
}
