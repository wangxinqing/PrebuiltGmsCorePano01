package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: oah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oah {
    private final nzu a;
    private final nzv b;

    public oah(nzu nzu) {
        this.a = nzu;
        this.b = null;
    }

    static Intent a(String str) {
        return Intent.parseUri(str, 1);
    }

    public oah(nzu nzu, nzv nzv) {
        this.a = nzu;
        this.b = nzv;
    }

    public static boolean a(String str, Context context) {
        Intent intent;
        try {
            intent = a(str);
        } catch (Exception e) {
            String valueOf = String.valueOf(str);
            Log.e("gH_IntentActionsUtil", valueOf.length() == 0 ? new String("The Intent URI is invalid: ") : "The Intent URI is invalid: ".concat(valueOf));
            intent = null;
        }
        if (intent != null) {
            return jhg.a(context, intent);
        }
        return false;
    }

    public final Intent a(Uri uri, String str, int i, int i2, String str2) {
        Intent intent;
        String str3;
        String uri2 = uri.toString();
        try {
            intent = a(uri2);
        } catch (Exception e) {
            String valueOf = String.valueOf(uri2);
            Log.e("gH_IntentActionsUtil", valueOf.length() == 0 ? new String("The Intent URI is invalid: ") : "The Intent URI is invalid: ".concat(valueOf));
            intent = null;
        }
        if (intent == null) {
            nzv nzv = this.b;
            if (nzv != null) {
                nzu nzu = this.a;
                oab oab = nzv.a;
                if (oab != null) {
                    str3 = oab.e;
                } else {
                    str3 = null;
                }
                okg.a(nzu, str, str3);
            } else {
                okg.a(this.a, str, (String) null);
            }
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 37);
            sb.append("Intent could not be parsed from Uri: ");
            sb.append(valueOf2);
            Log.w("gH_IntentActionsUtil", sb.toString());
            return null;
        } else if (jhg.a((Context) this.a, intent)) {
            return intent;
        } else {
            a(str, i, i2, str2, false);
            String valueOf3 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 26);
            sb2.append("Intent is not actionable: ");
            sb2.append(valueOf3);
            Log.w("gH_IntentActionsUtil", sb2.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i, int i2, String str2, boolean z) {
        if (i2 != 1) {
            okg.a(this.a, i2, str, i, str2, z);
        }
    }

    public final boolean a(Uri uri, int i) {
        return a(uri, -1, (String) null, i, (String) null);
    }

    public final boolean a(Uri uri, int i, String str, int i2, String str2) {
        boolean z;
        Uri uri2;
        String scheme = uri.getScheme();
        nzv nzv = this.b;
        if (nzv == null || nzv.b()) {
            z = false;
        } else {
            z = true;
        }
        if (!(!z ? scheme.equals("intent") : scheme.equals("ghandroid"))) {
            return false;
        }
        if (z) {
            uri2 = uri.buildUpon().scheme("intent").build();
        } else {
            uri2 = uri;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && this.a != null) {
            String uri3 = TextUtils.isEmpty(str) ? uri2.toString() : str;
            Intent a2 = a(uri2, uri3, i, i2, str2);
            if (a2 != null) {
                a(uri3, i, i2, str2, true);
                if (a2.hasExtra("account_name")) {
                    Account account = this.a.f().d;
                    if (account != null) {
                        a2.putExtra("account_name", account.name);
                    } else {
                        a2.removeExtra("account_name");
                    }
                }
                ((Activity) this.a).startActivityForResult(a2, 0);
            } else {
                Toast.makeText((Context) this.a, R.string.gh_action_not_supported_message, 1).show();
            }
        } else {
            a(str, i, i2, str2, false);
            Log.w("gH_IntentActionsUtil", "No Activity present to use for launching the intent, or not main thread.");
        }
        return true;
    }
}
