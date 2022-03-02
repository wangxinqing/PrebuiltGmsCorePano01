package defpackage;

import android.text.TextUtils;

/* renamed from: afv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afv implements Runnable {
    final /* synthetic */ afz a;

    public afv(afz afz) {
        this.a = afz;
    }

    public final void run() {
        try {
            afv.super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}
