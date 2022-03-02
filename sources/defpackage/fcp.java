package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import java.util.Arrays;

/* renamed from: fcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fcp {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public Bitmap e;
    public String f;
    private final String g;

    private fcp(String str, String str2, String str3, int i, String str4) {
        this.b = str;
        this.d = str2;
        this.c = str3;
        this.a = i;
        this.g = str4;
    }

    public static fcp a(Context context, InternalSignInCredentialWrapper internalSignInCredentialWrapper, Bitmap bitmap) {
        String str;
        String str2;
        boolean z = !TextUtils.isEmpty(internalSignInCredentialWrapper.g.f);
        Uri uri = internalSignInCredentialWrapper.g.e;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        if (!z && !TextUtils.isEmpty(internalSignInCredentialWrapper.g.b)) {
            str2 = !TextUtils.isEmpty(internalSignInCredentialWrapper.g.b) ? internalSignInCredentialWrapper.g.b : internalSignInCredentialWrapper.g.a;
        } else {
            str2 = internalSignInCredentialWrapper.g.a;
        }
        if (z) {
            String str3 = internalSignInCredentialWrapper.g.a;
            iva.c(str2);
            fcp fcp = new fcp(str3, str2, context.getString(R.string.credentials_assisted_hidden_password), 1, internalSignInCredentialWrapper.f.type);
            fcp.f = str;
            fcp.e = bitmap;
            return fcp;
        }
        String str4 = internalSignInCredentialWrapper.g.a;
        iva.c(str2);
        fcp a2 = a(str4, str2, internalSignInCredentialWrapper.g.a, internalSignInCredentialWrapper.f.type);
        a2.f = str;
        a2.e = null;
        return a2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fcp) {
            fcp fcp = (fcp) obj;
            if (!amqx.a(this.g, fcp.g) || !amqx.a(this.b, fcp.b) || !amqx.a(this.c, fcp.c) || !amqx.a(this.d, fcp.d) || !amqx.a(this.f, fcp.f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.g, this.b, this.c, this.d, this.f});
    }

    public static fcp a(String str, String str2, String str3, String str4) {
        return new fcp(str, str2, str3, 0, str4);
    }
}
