package defpackage;

import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import java.util.List;

/* renamed from: eis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eis {
    public String a = null;
    public Long b = null;
    public boolean c = false;
    public boolean d = false;
    public List e = null;
    public String f = null;

    public final TokenData a() {
        if (this.d && this.e == null) {
            throw new IllegalStateException("Granted scopes must be set if the token is snowballed.");
        } else if (!TextUtils.isEmpty(this.a)) {
            return new TokenData(1, this.a, this.b, this.c, this.d, this.e, this.f);
        } else {
            return null;
        }
    }
}
