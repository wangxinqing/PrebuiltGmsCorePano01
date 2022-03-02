package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: abtg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abtg implements absz {
    final /* synthetic */ abtm a;
    private String b;
    private String c;

    public abtg(abtm abtm) {
        this.a = abtm;
    }

    private final Bundle a(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accounts", arrayList);
        abpi abpi = this.a.j;
        if (abpi != null) {
            bundle.putBoolean("deviceOwnerSet", abpi.a(2));
        }
        bundle.putString("restoreAccount", this.b);
        bundle.putString("restoreToken", this.c);
        return bundle;
    }

    public final void b(List list) {
        this.a.a(new BootstrapProgressResult(1, a(new ArrayList(list))));
    }

    public final void a() {
        abtm abtm = this.a;
        if (abtm.m) {
            abtm.k = ((jfv) abtm.g).schedule((Callable) new abte(this), azkf.f(), TimeUnit.MILLISECONDS);
            return;
        }
        abtm.g();
    }

    public final void a(int i, String str) {
        this.a.d(i);
        this.a.c.a(i);
    }

    public final void a(PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("pendingIntent", pendingIntent);
        this.a.a(new BootstrapProgressResult(1, bundle));
    }

    public final void a(BootstrapAccount bootstrapAccount) {
        this.a.a(new BootstrapProgressResult(7, Bundle.EMPTY));
    }

    public final void a(MessagePayload messagePayload) {
        this.a.b(messagePayload);
    }

    public final void a(String str, String str2) {
        this.b = str;
        this.a.l.b = str2;
        if (!TextUtils.isEmpty(str)) {
            this.a.l.c = new BootstrapAccount(this.b, "com.google");
        }
        this.c = str2;
    }

    public final void a(List list) {
        this.a.a(new BootstrapProgressResult(4, a(new ArrayList(list))));
    }
}
