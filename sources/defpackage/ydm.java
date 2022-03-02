package defpackage;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: ydm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ydm {
    public final ixk a;

    static {
        new HashSet(Arrays.asList(new String[]{"generic", "generic_x86", "google", "Android"}));
        new HashSet(Arrays.asList(new String[]{"generic", "generic_x86", "Android"}));
    }

    public ydm(Context context) {
        ClientContext clientContext = new ClientContext();
        clientContext.e = context.getPackageName();
        clientContext.b = Process.myUid();
        this.a = ixk.a(context, clientContext);
    }
}
