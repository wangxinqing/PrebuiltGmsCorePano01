package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.android.gms.R;

/* renamed from: mqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mqs extends agyp {
    private final Activity a;
    private boolean c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mqs(android.app.Activity r2) {
        /*
            r1 = this;
            mqw r0 = defpackage.mqw.a
            if (r0 != 0) goto L_0x000b
            mqw r0 = new mqw
            r0.<init>()
            defpackage.mqw.a = r0
        L_0x000b:
            mqw r0 = defpackage.mqw.a
            r1.<init>(r0, r0)
            r1.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqs.<init>(android.app.Activity):void");
    }

    private final boolean a(Uri uri) {
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("Not whitelisted url: ");
        sb.append(valueOf);
        mfv.e("FamilyWebViewClient", sb.toString(), new Object[0]);
        if (URLUtil.isNetworkUrl(uri.toString())) {
            try {
                this.a.startActivity(new Intent("android.intent.action.VIEW", uri));
                return true;
            } catch (ActivityNotFoundException e) {
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("Can't launch url '%s' externally");
                sb2.append(valueOf2);
                mfv.e("FamilyWebViewClient", sb2.toString(), new Object[0]);
            }
        } else {
            String valueOf3 = String.valueOf(uri);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 19);
            sb3.append("Not a network url: ");
            sb3.append(valueOf3);
            mfv.e("FamilyWebViewClient", sb3.toString(), new Object[0]);
            return false;
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!this.c) {
            webView.setVisibility(0);
            this.a.findViewById(R.id.fm_webview_loading_screen).setVisibility(8);
        }
        this.c = true;
    }

    public final boolean a(WebResourceRequest webResourceRequest) {
        return a(webResourceRequest.getUrl());
    }

    public final boolean a(String str) {
        return a(Uri.parse(str));
    }
}
