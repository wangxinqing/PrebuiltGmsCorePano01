package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;

/* renamed from: xxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xxj extends xxi {
    private static final anaf p = anaf.a(xjo.GROUP, xkm.GROUP_SYNC_UP_PROGRESS, xjo.CONTACT, xkm.CONTACT_SYNC_UP_PROGRESS, xjo.PHOTO, xkm.PHOTO_SYNC_UP_PROGRESS);

    public xxj(Context context, Account account, wss wss, yaz yaz) {
        super(context, account, wss, yaz, R.string.people_fsa_progress_notification_format_for_sync_up, 3, "FSA2_SyncUpProgressNotifier");
    }

    public static boolean a(wss wss, yaz yaz, String str) {
        if (!xxi.f() || !ayug.a.a().N() || ((ayug.a.a().j() && ((ybh) yaz).o > 0) || ((long) wss.g(str)) >= ayug.a.a().t())) {
            return false;
        }
        return true;
    }

    public final String a() {
        return "com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_UP";
    }

    public final String b() {
        return "com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_UP";
    }

    public final Intent c() {
        if (ayug.a.a().T()) {
            return e();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final xkm a(xjo xjo) {
        return (xkm) p.getOrDefault(xjo, xkm.UNKNOWN_STAGE);
    }

    /* access modifiers changed from: protected */
    public final void a(int i, boolean z) {
        if (this.k > 0) {
            a(false);
        }
        h();
    }
}
