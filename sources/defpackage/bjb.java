package defpackage;

import android.content.Context;
import android.net.Uri;
import android.service.notification.ConditionProviderService;

/* renamed from: bjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bjb extends ConditionProviderService {
    final /* synthetic */ com.google.android.chimera.ConditionProviderService a;

    public bjb(com.google.android.chimera.ConditionProviderService conditionProviderService) {
        this.a = conditionProviderService;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void onConnected() {
        this.a.onConnected();
    }

    public final void onRequestConditions(int i) {
        this.a.onRequestConditions(i);
    }

    public final void onSubscribe(Uri uri) {
        this.a.onSubscribe(uri);
    }

    public final void onUnsubscribe(Uri uri) {
        this.a.onUnsubscribe(uri);
    }
}
