package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.config.InvalidConfigException;

/* renamed from: bkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bkr extends BroadcastReceiver {
    private final bkv a;

    public bkr(bkv bkv) {
        this.a = bkv;
    }

    public final void onReceive(Context context, Intent intent) {
        try {
            this.a.f();
        } catch (InvalidConfigException e) {
        }
    }
}
