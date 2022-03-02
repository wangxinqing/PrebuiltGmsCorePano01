package defpackage;

import com.google.android.gms.usagereporting.ConsentInformation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: adrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adrs {
    public boolean a;
    public boolean b;
    private final List c = new ArrayList();

    public final ConsentInformation a() {
        return new ConsentInformation(this.c, this.a, this.b);
    }

    public final void a(ConsentInformation.AccountConsentInformation accountConsentInformation) {
        iva.a((Object) accountConsentInformation, (Object) "Account Consents cannot be null.");
        this.c.add(accountConsentInformation);
    }
}
