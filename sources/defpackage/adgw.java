package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.udc.ui.AuthenticatingWebViewChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;

/* renamed from: adgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adgw {
    private final WeakReference a;
    private final String b;
    private final adgu c;

    public adgw(Context context, adgu adgu) {
        this.a = new WeakReference(context);
        this.b = context.getPackageName();
        this.c = adgu;
    }

    public static Intent a(String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!TextUtils.isEmpty(str2)) {
            intent.setData(adhr.a(str2, str));
        }
        intent.setFlags(131076);
        intent.putExtra("com.android.browser.application_id", str3);
        return intent;
    }

    public adgw(Fragment fragment) {
        this(fragment.getActivity(), new adgt(fragment));
    }

    public final adgv a(String str, String str2) {
        boolean z;
        Intent intent;
        if (TextUtils.isEmpty(str)) {
            return new adgv(false, aqmj.LINK_OPENED_IN_BROWSER);
        }
        Pattern f = AuthenticatingWebViewChimeraActivity.f();
        if (f == null || !f.matcher(str).matches()) {
            z = false;
        } else {
            z = true;
        }
        aqmj aqmj = !z ? aqmj.LINK_OPENED_IN_BROWSER : aqmj.LINK_OPENED_IN_WEBVIEW;
        if (z) {
            iva.b(!TextUtils.isEmpty(str));
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str)).setClassName(ihs.b(), "com.google.android.gms.udc.ui.AuthenticatingWebViewActivity").putExtra("AuthWebviewHomeAsUpEnabled", true).putExtra("AuthWebviewShowProgressBar", true).putExtra("AuthWebviewTitle", (CharSequence) null).putExtra("AuthWebviewAccountName", str2);
        } else {
            intent = a(str, str2, this.b);
        }
        try {
            return new adgv(this.c.a(intent), aqmj);
        } catch (ActivityNotFoundException e) {
            Context context = (Context) this.a.get();
            if (context != null) {
                Toast.makeText(context, R.string.udc_unable_open_url, 1).show();
            }
            return new adgv(false, aqmj);
        }
    }
}
