package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: akei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akei extends qvv {
    private final Account a;
    private final LinkedHashSet b;
    private final Object c = new Object();
    private final Context d;
    private String e;

    public akei(Context context, Account account) {
        super("PanoUiLib", "ContactChangeContentObserver", (Handler) null);
        this.a = account;
        this.b = new LinkedHashSet();
        this.d = context;
        this.e = akek.a(context, this.a);
    }

    public final void a(Uri uri) {
        synchronized (this.c) {
            this.b.add(uri);
        }
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        String a2 = akek.a(this.d, this.a);
        if (!TextUtils.equals(this.e, a2)) {
            synchronized (this.c) {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    this.d.getContentResolver().notifyChange((Uri) it.next(), (ContentObserver) null);
                }
                this.e = a2;
            }
        }
    }
}
