package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import java.util.Map;

/* renamed from: bxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxy implements Runnable {
    final /* synthetic */ byd a;

    public bxy(byd byd) {
        this.a = byd;
    }

    public final void run() {
        for (Map.Entry entry : this.a.b.c.entrySet()) {
            ((bwc) entry.getValue()).a(((bwa) entry.getKey()).a(), (ContextData) null);
        }
    }
}
