package defpackage;

import androidx.preference.PreferenceGroup;

/* renamed from: amo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amo implements Runnable {
    final /* synthetic */ PreferenceGroup a;

    public amo(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
    }

    public final void run() {
        synchronized (this) {
            this.a.a.clear();
        }
    }
}
