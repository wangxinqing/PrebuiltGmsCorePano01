package defpackage;

import android.content.Intent;

/* renamed from: aipo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aipo implements ikd {
    final /* synthetic */ String a;

    public aipo(String str) {
        this.a = str;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
        Intent intent = (Intent) obj;
        Intent intent2 = (Intent) obj2;
        if (intent == null && intent2 == null) {
            return true;
        }
        if (intent == null || intent2 == null) {
            return false;
        }
        return amqx.a(intent.getParcelableExtra(this.a), intent2.getParcelableExtra(this.a));
    }
}
