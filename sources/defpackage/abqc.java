package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abqc implements abps {
    final /* synthetic */ abqd a;

    public abqc(abqd abqd) {
        this.a = abqd;
    }

    public final void a() {
        this.a.h = true;
    }

    public final void a(int i, String str) {
        this.a.d(i);
        this.a.b(i);
    }

    public final void a(PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("pendingIntent", pendingIntent);
        this.a.c.a(new BootstrapProgressResult(1, bundle));
    }

    public final void a(MessagePayload messagePayload) {
        this.a.b(messagePayload);
    }

    public final void a(String str) {
        this.a.c.a(str);
    }

    public final void a(List list) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accounts", new ArrayList(list));
        this.a.c.a(new BootstrapProgressResult(1, bundle));
    }
}
