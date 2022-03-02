package defpackage;

import android.content.Context;
import com.google.android.gms.R;

/* renamed from: ymx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ymx {
    private static ymx a;

    private ymx() {
    }

    public static final CharSequence a(Context context, int i) {
        String str;
        CharSequence charSequence;
        if (i == 1) {
            charSequence = context.getText(R.string.plus_list_apps_disabled_error);
            str = (String) ysu.E.c();
        } else if (i != 2) {
            charSequence = context.getText(R.string.plus_manage_app_disabled_error);
            str = (String) ysu.I.c();
        } else {
            charSequence = context.getText(R.string.plus_list_moments_disabled_error);
            str = (String) ysu.G.c();
        }
        return str != null ? yng.a(charSequence, str) : charSequence;
    }

    public static final boolean b(Context context, int i) {
        String str;
        if (i == 1) {
            str = (String) ysu.D.c();
        } else if (i != 2) {
            str = (String) ysu.H.c();
        } else {
            str = (String) ysu.F.c();
        }
        if (str != null) {
            String num = Integer.toString(jhg.d(context));
            for (String equals : str.split(";")) {
                if (equals.equals(num)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a() {
        if (a == null) {
            a = new ymx();
        }
    }
}
