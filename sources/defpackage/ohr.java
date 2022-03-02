package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;

/* renamed from: ohr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ohr {
    private final Context a;

    public ohr(Context context) {
        this.a = context;
    }

    public static final Boolean a(String str) {
        if (str.equals("1")) {
            return true;
        }
        return str.equals("0") ? false : null;
    }

    private final ohp d(avmc avmc) {
        Cursor a2;
        if (!TextUtils.isEmpty(avmc.c) && (a2 = a(new Uri.Builder().scheme("content").authority("com.google.android.settings.external").path("settings_manager").appendPath(avmc.c).build())) != null) {
            try {
                a2.moveToPosition(0);
                ohp ohp = new ohp();
                ohp.a = a2.getString(0);
                ohp.b = a2.getString(1);
                ohp.c = a2.getString(2);
                return ohp;
            } catch (Exception e) {
            }
        }
        return null;
    }

    public final Intent b(avmc avmc) {
        ohp d = d(avmc);
        if (d == null || TextUtils.isEmpty(d.c)) {
            return null;
        }
        try {
            return Intent.parseUri(d.c, 0);
        } catch (URISyntaxException e) {
            String valueOf = String.valueOf(d.c);
            if (valueOf.length() == 0) {
                new String("Invalid intent Uri: ");
            } else {
                "Invalid intent Uri: ".concat(valueOf);
            }
            return null;
        }
    }

    public final Boolean c(avmc avmc) {
        ohp d;
        String str;
        int a2 = avmb.a(avmc.b);
        if (a2 == 0 || a2 != 2 || (d = d(avmc)) == null || (str = d.a) == null) {
            return null;
        }
        return a(str);
    }

    /* access modifiers changed from: package-private */
    public final Cursor a(Uri uri) {
        try {
            return this.a.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
        } catch (Exception e) {
            return null;
        }
    }

    public final boolean a(avmc avmc) {
        String str;
        ohp d = d(avmc);
        if (d == null || (str = d.b) == null) {
            return false;
        }
        return str.equals("0");
    }
}
