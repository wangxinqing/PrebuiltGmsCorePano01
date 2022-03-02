package defpackage;

import android.content.Context;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;

/* renamed from: enk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class enk {
    public static final iwd a = ehv.a("ValidateAccountCredentialsOperation");
    public final Context b;
    public final AccountCredentials c;
    public final emw d;
    public final ekq e;

    public enk(Context context, AccountCredentials accountCredentials) {
        ekq ekq = (ekq) ekq.b.b();
        emw emw = new emw(context);
        iva.a((Object) context);
        this.b = context;
        iva.a((Object) accountCredentials);
        this.c = accountCredentials;
        iva.a((Object) ekq);
        this.e = ekq;
        iva.a((Object) emw);
        this.d = emw;
    }
}
