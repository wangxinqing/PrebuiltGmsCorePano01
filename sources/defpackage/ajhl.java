package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: ajhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajhl {
    public boolean a;
    private final Context b;
    private final PendingIntent c;
    private final Account d;

    private ajhl(Context context, PendingIntent pendingIntent, Account account) {
        iva.a((Object) context);
        this.b = context;
        iva.a((Object) pendingIntent);
        this.c = pendingIntent;
        this.d = account;
    }

    public final void b() {
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("Place inference reporting - stop for ");
        sb.append(valueOf);
        sb.toString();
        if (!this.a) {
            String valueOf2 = String.valueOf(this.d);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 48);
            sb2.append("Place inference reporting - already stopped for ");
            sb2.append(valueOf2);
            sb2.toString();
        } else if (azte.a.a().e()) {
            rij.a(this.b).f(this.c).a((acvp) new ajhk(this));
        }
    }

    public static ajhl a(Context context, Account account) {
        Intent a2 = ajme.a(context, "com.google.android.location.reporting.ACTION_PLACE_INFERENCE", "placeInferences");
        if (account != null) {
            a2.setData(Uri.fromParts("mailto:", account.name, account.type));
        }
        return new ajhl(context, PendingIntent.getService(context, 0, a2, 134217728), account);
    }

    public final void a() {
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("Place inference reporting - start for ");
        sb.append(valueOf);
        sb.toString();
        if (this.a) {
            String valueOf2 = String.valueOf(this.d);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 48);
            sb2.append("Place inference reporting - already started for ");
            sb2.append(valueOf2);
            sb2.toString();
            return;
        }
        rhv a2 = rij.a(this.b);
        rih rih = new rih();
        rih.c = (int) azrx.d();
        a2.a(rih.a(), this.c).a((acvp) new ajhj(this));
    }
}
