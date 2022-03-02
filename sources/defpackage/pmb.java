package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.provider.ContactsContract;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: pmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pmb extends qvv {
    public static pmb a;
    final AtomicBoolean b = new AtomicBoolean(false);
    private final Handler c;
    private final Runnable d;

    public pmb(Context context) {
        super("icing", "ContactsContentObserver", (Handler) null);
        this.c = new qvr(context.getMainLooper());
        this.d = new pma(this, context);
    }

    public static boolean a(Context context) {
        int i = pmr.a;
        boolean z = false;
        if (((Long) ozx.ak.c()).longValue() < 0) {
            pnz.c("Contacts content observer disabled.");
            b(context);
            return false;
        } else if (pnm.a()) {
            synchronized (pmb.class) {
                if (a == null) {
                    pnz.a("Registering ContactsContentObserver.");
                    a = new pmb(context.getApplicationContext());
                    try {
                        context.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, false, a);
                        pnz.a("ContactsContentObserver is registered.");
                        z = true;
                    } catch (SecurityException e) {
                        new oyq(context).a("cp2_register_observer_failed");
                    }
                }
            }
            return z;
        } else {
            pnz.c("Contacts corpus disabled.");
            b(context);
            return false;
        }
    }

    private static synchronized void b(Context context) {
        synchronized (pmb.class) {
            if (a != null) {
                pnz.a("Unregistering contacts observer.");
                context.getContentResolver().unregisterContentObserver(a);
                a = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        pnz.d("ContactsContentObserver onChange selfChange=%b", Boolean.valueOf(z));
        if (!this.b.getAndSet(true)) {
            pnz.a("Scheduling delta update.");
            this.c.postDelayed(this.d, ((Long) ozx.ak.c()).longValue());
            return;
        }
        pnz.a("Delta update already scheduled.");
    }
}
