package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: pjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pjr extends nis {
    private final String a;
    private final pjn b;
    private final pjo c;
    private final pia d;

    public pjr(int i, String str, String str2, pjn pjn, pjo pjo) {
        super(i, str);
        this.d = pjo.y();
        this.a = str2;
        this.b = pjn;
        this.c = pjo;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        if (pbq.a()) {
            try {
                pif pif = new pif();
                pjo pjo = this.c;
                awdx.a(pjo);
                pif.b = pjo;
                pjq pjq = new pjq(this.a, context, this.b);
                awdx.a(pjq);
                pif.a = pjq;
                awdx.a((Object) pif.a, pjq.class);
                awdx.a((Object) pif.b, pjo.class);
                new pil(pif.a, pif.b).b.b().get();
            } catch (InterruptedException e) {
                this.b.a(pku.a(this.m, 14, "Delegate failed"));
            } catch (ExecutionException e2) {
                this.b.a(pku.a(this.m, "Delegate failed"));
                if (e2.getCause() instanceof babl) {
                    babl babl = (babl) e2.getCause();
                }
            }
        } else {
            this.b.a(new Status(17, "Delegate aborted"));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.d.e("MdhAsyncOperation[%s]#onFailure: %s", this.m, status);
        this.b.a(status);
    }
}
