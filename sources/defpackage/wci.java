package defpackage;

import android.content.IntentFilter;
import android.provider.ContactsContract;

/* renamed from: wci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wci implements Runnable {
    private final wcp a;

    public wci(wcp wcp) {
        this.a = wcp;
    }

    public final void run() {
        wcp wcp = this.a;
        thp.a(wcp.a, wcp.i, new IntentFilter("com.google.android.gms.nearby.sharing.DEVICE_CONTACTS_CONSENT_ENABLED"));
        ((anih) ((anih) vvj.a.d()).a("wcp", "g", 201, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ContactBookUpdater has started listening for device contacts consent.");
        try {
            wcp.a.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, wcp.j);
            ((anih) ((anih) vvj.a.d()).a("wcp", "g", 209, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ContactBookUpdater has started listening for contact book changed events.");
        } catch (SecurityException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("wcp", "g", 214, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ContactBookUpdater failed to listen to contact book changes.");
        }
    }
}
