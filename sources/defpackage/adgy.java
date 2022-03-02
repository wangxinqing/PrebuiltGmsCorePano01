package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.R;
import java.io.IOException;

/* renamed from: adgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adgy extends AsyncTask {
    private final bjs a;
    private final String b;
    private final String c;
    private final adha d;
    private adgz e;
    private final boolean f;

    public adgy(bjs bjs, String str, String str2, adha adha) {
        this.a = bjs;
        this.b = str;
        this.c = str2;
        iva.a((Object) adha);
        this.d = adha;
        boolean z = false;
        if (!TextUtils.isEmpty(this.b) && this.a != null) {
            z = true;
        }
        this.f = z;
    }

    private final void a() {
        adgz adgz = this.e;
        if (adgz != null) {
            adgz.dismissAllowingStateLoss();
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str;
        Void[] voidArr = (Void[]) objArr;
        if (!this.f) {
            return this.c;
        }
        try {
            String valueOf = String.valueOf(Uri.encode(this.c));
            str = eim.d(this.a, new Account(this.b, "com.google"), valueOf.length() == 0 ? new String("weblogin:continue=") : "weblogin:continue=".concat(valueOf));
        } catch (eif | IOException e2) {
            anih anih = (anih) adhb.a.b();
            anih.a(e2);
            ((anih) anih.a("adgy", "a", 104, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("unable to retrieve token");
            String str2 = this.b;
            String str3 = this.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 59 + String.valueOf(str3).length());
            sb.append("https://accounts.google.com/AccountChooser?Email=");
            sb.append(str2);
            sb.append("&continue=");
            sb.append(str3);
            str = sb.toString();
        }
        return Uri.parse(str).buildUpon().appendQueryParameter("sarp", "1").toString();
    }

    /* access modifiers changed from: protected */
    public final void onCancelled() {
        a();
        this.d.e();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        a();
        this.d.a((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if (this.f) {
            String string = this.a.getResources().getString(R.string.udc_url_login_notice, new Object[]{this.b});
            Bundle bundle = new Bundle();
            bundle.putString("ProgressDialogMessage", string);
            adgz adgz = new adgz();
            adgz.setCancelable(true);
            adgz.setArguments(bundle);
            this.e = adgz;
            adgz.show(this.a.getSupportFragmentManager(), "WebLoginProgressDialog");
            this.e.a = new adgx(this);
        }
    }

    /* access modifiers changed from: protected */
    public final String a(Void... voidArr) {
        String str;
        if (!this.f) {
            return this.c;
        }
        try {
            String valueOf = String.valueOf(Uri.encode(this.c));
            str = eim.d(this.a, new Account(this.b, "com.google"), valueOf.length() == 0 ? new String("weblogin:continue=") : "weblogin:continue=".concat(valueOf));
        } catch (eif | IOException e2) {
            anih anih = (anih) adhb.a.b();
            anih.a(e2);
            ((anih) anih.a("adgy", "a", 104, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("unable to retrieve token");
            String str2 = this.b;
            String str3 = this.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 59 + String.valueOf(str3).length());
            sb.append("https://accounts.google.com/AccountChooser?Email=");
            sb.append(str2);
            sb.append("&continue=");
            sb.append(str3);
            str = sb.toString();
        }
        return Uri.parse(str).buildUpon().appendQueryParameter("sarp", "1").toString();
    }
}
