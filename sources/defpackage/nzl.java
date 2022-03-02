package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.android.volley.Response;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.IOException;
import java.util.Map;

/* renamed from: nzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class nzl extends nzn {
    private byte[] j;

    public nzl(Context context, HelpConfig helpConfig, Account account, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, account, 1, str, listener, errorListener);
    }

    private final void f() {
        if (this.j == null) {
            nzw a = nzw.a();
            a.a = this.e;
            a.b = this.f;
            a(a);
            byte[] k = a.b().k();
            this.j = k;
            try {
                this.j = oaq.a(k);
                this.h.put("Content-Encoding", "gzip");
            } catch (IOException e) {
                Log.e("gH_BasePostRequest", "Gzip HelpMobileRequest bytes failed.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(nzw nzw) {
        throw null;
    }

    public final byte[] getBody() {
        f();
        return this.j;
    }

    public final String getBodyContentType() {
        return "application/protobuf";
    }

    public final Map getHeaders() {
        f();
        return this.h;
    }

    public nzl(Context context, HelpConfig helpConfig, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, 1, str, listener, errorListener);
    }
}
