package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import java.util.ArrayList;

/* renamed from: acki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acki {
    private static final acpz a = acqa.a("Setup", "UI", "AccountTransferDelegate");
    private final ArrayList b;
    private final Activity c;
    private boolean d;
    private Fragment e;
    private boolean f = false;
    private final aclo g;

    public acki(Activity activity, aclo aclo, Bundle bundle) {
        this.c = activity;
        this.g = aclo;
        if (bundle != null) {
            this.b = bundle.getParcelableArrayList("AccountTransferDelegate.pendingIntents");
        } else {
            this.b = new ArrayList();
        }
    }

    private final void a(PendingIntent pendingIntent) {
        Activity activity;
        Intent intent;
        try {
            this.d = true;
            a.a("startingIntentForResult %s", pendingIntent);
            Fragment fragment = this.e;
            if (fragment != null) {
                activity = fragment.getActivity();
            } else {
                activity = this.c;
            }
            iva.a((Object) activity);
            if (azlo.b()) {
                Intent intent2 = new Intent();
                alht.a(activity.getIntent(), intent2);
                intent = intent2;
            } else {
                intent = null;
            }
            Fragment fragment2 = this.e;
            if (fragment2 != null) {
                fragment2.startIntentSenderForResult(pendingIntent.getIntentSender(), 3, intent, 0, 0, 0, Bundle.EMPTY);
            } else {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 3, intent, 0, 0, 0);
            }
        } catch (IntentSender.SendIntentException e2) {
            a.e("PendingIntent failed to send", e2, new Object[0]);
            this.d = false;
        }
    }

    public final void b() {
        this.f = true;
    }

    public final void a() {
        this.f = false;
        if (!this.d && !this.b.isEmpty()) {
            a((PendingIntent) this.b.remove(0));
        }
    }

    public final void a(int i, int i2) {
        if (i == 3) {
            this.d = false;
            Bundle bundle = new Bundle();
            bundle.putInt("pendingIntentResult", i2);
            aclo aclo = this.g;
            if (aclo != null) {
                aclo.a.d.a(bundle);
            }
            if (!this.b.isEmpty()) {
                a((PendingIntent) this.b.remove(0));
            } else {
                this.e = null;
            }
        } else {
            throw new IllegalArgumentException("Invalid request code");
        }
    }

    public final void a(Bundle bundle) {
        bundle.putParcelableArrayList("AccountTransferDelegate.pendingIntents", this.b);
    }

    public final void a(Fragment fragment, PendingIntent pendingIntent) {
        a.a("Delegating pendingIntent %s", pendingIntent);
        if (this.f || !this.b.isEmpty() || this.d) {
            this.b.add(pendingIntent);
            return;
        }
        this.e = fragment;
        a(pendingIntent);
    }
}
