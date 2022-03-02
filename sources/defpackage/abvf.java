package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: abvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abvf implements absz {
    final /* synthetic */ abvi a;

    public abvf(abvi abvi) {
        this.a = abvi;
    }

    public final void a() {
        abvi.h.a("onCompleted called.", new Object[0]);
        abvi abvi = this.a;
        if (abvi.q) {
            abvi.r = ((jfv) abvi.p).schedule((Callable) new abvd(this), azkf.f(), TimeUnit.MILLISECONDS);
            return;
        }
        abvi.a((List) abvi.o);
    }

    public final void a(String str, String str2) {
    }

    public final void b(List list) {
        abvi abvi = this.a;
        Context context = abvi.i;
        ProxyResultReceiver proxyResultReceiver = abvi.m;
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent();
        intent.setClassName(context.getApplicationContext(), "com.google.android.gms.smartdevice.d2d.ui.TargetDirectTransferActivity");
        intent.addFlags(268468224);
        intent.putExtra("resultReceiver", proxyResultReceiver);
        intent.putExtra("extraAccountChallengeData", new ArrayList(list));
        PendingIntent activity = PendingIntent.getActivity(applicationContext, 8, intent, 134217728);
        abvi.h.a("Sending pending intent to listener", new Object[0]);
        abvi.k.a(activity);
    }

    public final void a(int i, String str) {
        this.a.b(i, str);
    }

    public final void a(PendingIntent pendingIntent) {
        abvi abvi = this.a;
        abvi.h.a("Sending pending intent (3pmfm) to listener", new Object[0]);
        abvi.k.a(pendingIntent);
    }

    public final void a(BootstrapAccount bootstrapAccount) {
        this.a.o.add(new AccountTransferResult(bootstrapAccount, 2));
    }

    public final void a(MessagePayload messagePayload) {
        this.a.b(messagePayload);
    }

    public final void a(List list) {
        this.a.a(new ArrayList(list));
    }
}
