package defpackage;

import android.location.Location;
import android.os.Looper;
import android.os.Message;
import java.util.Collection;

/* renamed from: aigi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aigi extends qvr {
    final /* synthetic */ aigl a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aigi(aigl aigl, Looper looper) {
        super(looper);
        this.a = aigl;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            boolean z = true;
            if (i == 1) {
                this.a.e.b();
            } else if (i == 2) {
                aiex aiex = this.a.e;
                Collection collection = (Collection) message.obj;
                if (message.arg1 == 0) {
                    z = false;
                }
                aiex.a(collection, z);
            } else if (i == 3) {
                this.a.e.a((Location) message.obj, message.arg1);
            } else if (i == 4) {
                this.a.e.a((aido) message.obj);
            } else if (i == 5) {
                this.a.e.a((aiew) message.obj);
            }
        } else {
            this.a.e.a();
        }
    }
}
