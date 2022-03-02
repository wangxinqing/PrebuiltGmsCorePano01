package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.ArrayList;
import java.util.List;

/* renamed from: absj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class absj implements abps {
    final /* synthetic */ absq a;

    public absj(absq absq) {
        this.a = absq;
    }

    public final void a() {
    }

    public final void a(int i, String str) {
        this.a.b(i, str);
    }

    public final void a(PendingIntent pendingIntent) {
        throw new UnsupportedOperationException();
    }

    public final void a(MessagePayload messagePayload) {
        this.a.b(messagePayload);
    }

    public final void a(String str) {
        absq.h.a("onTextMessage: ", str);
    }

    public final void a(List list) {
        this.a.o.b();
        ArrayList arrayList = new ArrayList(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("extraAccountChallengeData", arrayList);
        this.a.n.a(1010, bundle);
    }
}
