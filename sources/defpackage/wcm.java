package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.sharing.provider.connections.ContactBookUpdater$1;

/* renamed from: wcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class wcm implements Runnable {
    private final ContactBookUpdater$1 a;
    private final Context b;

    public wcm(ContactBookUpdater$1 contactBookUpdater$1, Context context) {
        this.a = contactBookUpdater$1;
        this.b = context;
    }

    public final void run() {
        ContactBookUpdater$1 contactBookUpdater$1 = this.a;
        Context context = this.b;
        wcp wcp = contactBookUpdater$1.a;
        wcp.h = wcp.d();
        if (contactBookUpdater$1.a.h) {
            thp.a(context, "com.google.android.gms.nearby.sharing.ACTION_CONTACTS_REFRESHED");
        }
    }
}
