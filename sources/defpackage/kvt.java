package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.internal.OnEventResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kvt extends kwi {
    public static final ith a = new ith("EventCallback", "");
    public final List b = new ArrayList();
    private final int c = 3;
    private final kss d;
    private final kvs e;

    public kvt(Looper looper, Context context, kss kss) {
        this.d = kss;
        this.e = new kvs(looper, context);
    }

    public final void a(OnEventResponse onEventResponse) {
        boolean z;
        DriveEvent a2 = onEventResponse.a();
        if (this.c == a2.a()) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        iva.a(this.b.contains(Integer.valueOf(a2.a())));
        kvs kvs = this.e;
        kvs.sendMessage(kvs.obtainMessage(1, new Pair(this.d, a2)));
    }
}
