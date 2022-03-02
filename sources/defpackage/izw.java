package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;

/* renamed from: izw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izw {
    protected final Account a;
    protected final String b;
    protected final String c;
    protected final Bundle d;
    protected String e;

    public izw(ClientContext clientContext) {
        this.b = clientContext.f;
        Bundle bundle = new Bundle();
        this.d = bundle;
        bundle.putString(eig.b, this.b);
        if (!clientContext.d()) {
            this.d.putInt("callerUid", clientContext.b);
        }
        if (clientContext.h() != null) {
            this.d.putString("request_visible_actions", TextUtils.join(" ", clientContext.h()));
        }
        this.a = clientContext.c;
        this.c = clientContext.g();
    }

    public final String a(Context context) {
        try {
            this.e = eig.a(context, this.a, this.c, this.d);
            izx.a().a(this.b);
            return this.e;
        } catch (IOException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("AuthSessionAuthenticato", valueOf.length() == 0 ? new String("Auth related exception is being ignored: ") : "Auth related exception is being ignored: ".concat(valueOf));
            return null;
        } catch (eif e3) {
            String valueOf2 = String.valueOf(e3.getMessage());
            Log.w("AuthSessionAuthenticato", valueOf2.length() == 0 ? new String("Auth related exception is being ignored: ") : "Auth related exception is being ignored: ".concat(valueOf2));
            return null;
        }
    }

    public final String b(Context context) {
        this.e = eig.a(context, this.a, this.c, this.d);
        izx.a().a(this.b);
        return this.e;
    }

    public final void c(Context context) {
        String str = this.e;
        if (str != null) {
            eig.a(context, str);
            izx a2 = izx.a();
            String str2 = this.b;
            synchronized (a2.a) {
                a2.a.remove(str2);
            }
        }
        this.e = null;
    }

    public izw(ClientContext clientContext, byte[] bArr) {
        this(clientContext);
        this.d.putBoolean("suppressProgressScreen", true);
    }
}
