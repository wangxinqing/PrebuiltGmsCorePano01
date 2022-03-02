package defpackage;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: hsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hsi extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.CLEARCUT_MODULE_UPDATE".equals(intent.getAction())) {
            hwo.a(this);
        }
    }
}
