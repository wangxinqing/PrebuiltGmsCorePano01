package defpackage;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.R;
import org.json.JSONObject;

/* renamed from: fyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fyo {
    public static final fyo a = a(gei.SUCCESS);
    public static final fyo b = a(gei.USER_CANCEL);
    public final gei c;
    public final int d;

    static {
        a(gei.BAD_AUTHENTICATION);
        a(gei.NETWORK_ERROR);
    }

    private fyo(gei gei, int i) {
        this.c = gei;
        this.d = i;
    }

    public static fyo a(gei gei) {
        int i;
        gei gei2 = gei.CLIENT_LOGIN_DISABLED;
        int ordinal = gei.ordinal();
        if (ordinal == 8) {
            i = R.string.auth_login_activity_loginfail_text_pwonly;
        } else if (ordinal == 10) {
            i = R.string.auth_error_invalid_second_factor;
        } else if (ordinal == 14) {
            i = R.string.auth_error_account_not_verified;
        } else if (ordinal == 16) {
            i = R.string.auth_error_account_disabled;
        } else if (ordinal == 39) {
            i = R.string.auth_error_bad_username;
        } else if (ordinal == 47) {
            i = R.string.auth_error_username_unavailable;
        } else if (ordinal == 36) {
            i = R.string.auth_account_already_has_gmail;
        } else if (ordinal != 37) {
            switch (ordinal) {
                case 42:
                    i = R.string.auth_error_login_failed;
                    break;
                case 43:
                    i = R.string.auth_error_not_logged_in;
                    break;
                case 44:
                    i = R.string.auth_doesnt_use_gmail;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = R.string.auth_error_bad_password;
        }
        return new fyo(gei, i);
    }

    public final void b(Intent intent) {
        intent.putExtra("Error", this.c.ac);
    }

    public static gei a(Intent intent) {
        if (intent == null) {
            return gei.SUCCESS;
        }
        String stringExtra = intent.getStringExtra("Error");
        if (stringExtra == null) {
            return gei.SUCCESS;
        }
        gei c2 = gei.c(stringExtra);
        return c2 == null ? gei.UNKNOWN : c2;
    }

    public static gei a(String str) {
        if (str == null) {
            return gei.SUCCESS;
        }
        gei c2 = gei.c(str);
        String valueOf = String.valueOf(c2);
        StringBuilder sb = new StringBuilder(str.length() + 44 + String.valueOf(valueOf).length());
        sb.append("gms.StatusHelper Status from wire: ");
        sb.append(str);
        sb.append(" status: ");
        sb.append(valueOf);
        Log.w("GLSActivity", sb.toString());
        return c2 == null ? gei.UNKNOWN : c2;
    }

    public static gei a(JSONObject jSONObject) {
        String optString = jSONObject.optString("status");
        if (optString == null || "".equals(optString)) {
            return gei.SERVER_ERROR;
        }
        try {
            return gei.a(optString);
        } catch (IllegalArgumentException e) {
            return gei.SERVER_ERROR;
        }
    }
}
