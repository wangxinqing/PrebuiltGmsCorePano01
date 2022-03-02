package defpackage;

import android.accounts.Account;
import com.google.android.gms.appdatasearch.DocumentSection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dsl {
    public List a;
    public Account b;

    public final void a(DocumentSection documentSection) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(documentSection);
    }
}
