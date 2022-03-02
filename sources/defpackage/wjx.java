package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.AsyncTaskLoader;
import java.io.IOException;

/* renamed from: wjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wjx extends AsyncTaskLoader {
    private static final jjg a = jjg.a(iyc.GUNS);
    private final String b;
    private final String c;
    private String d;
    private Bundle e;

    public wjx(Context context, String str, String str2) {
        super(context);
        this.b = str;
        this.c = str2;
    }

    /* renamed from: a */
    public final void deliverResult(Bundle bundle) {
        this.e = bundle;
        if (isStarted()) {
            super.deliverResult(this.e);
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        String str;
        if (this.d == null) {
            try {
                Context context = getContext();
                String str2 = this.b;
                String valueOf = String.valueOf(Uri.encode(this.c));
                str = eig.a(context, str2, valueOf.length() == 0 ? new String("weblogin:continue=") : "weblogin:continue=".concat(valueOf));
            } catch (eif | IOException e2) {
                anih anih = (anih) a.c();
                anih.a(e2);
                anih.a("Failed to get authenticated url for webview.");
                str = null;
            }
            this.d = str;
        }
        String str3 = this.d;
        if (str3 == null) {
            this.e.putBoolean("WebLoginUrlLoader.hadError", true);
        } else {
            this.e.putString("WebloginUrlLoader.authenticatedUrl", str3);
        }
        return this.e;
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        Bundle bundle = this.e;
        if (bundle == null) {
            this.e = new Bundle();
            forceLoad();
            return;
        }
        deliverResult(bundle);
    }
}
