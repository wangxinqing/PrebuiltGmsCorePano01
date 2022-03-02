package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: aiib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiib {
    public static final String[] a = new String[0];
    public final Context b;
    public final aiia c;
    public final aidg d;
    public final aidf e = new aidf(200);
    public final aiii f;
    public final aict g;

    public aiib(Context context) {
        aiii aiii;
        aiii aiii2;
        Looper a2 = aieo.a();
        aict aict = new aict(context);
        this.b = context;
        this.d = new aidg(new qvr(a2), aieo.a(context));
        this.c = new aiia(this, context, this.d.c);
        if (ayaz.a.a().fopEnableInertialAnchorOrientationEngineV2()) {
            if (ayaz.o()) {
                aiii2 = new aiih(this.b, this.d, a());
            } else {
                aiii2 = new aihu(this.b, this.d, a());
            }
            this.f = aiii2;
        } else {
            if (ayaz.o()) {
                aiii = new aiie(this.b, this.d, a());
            } else {
                aiii = new aihu(this.b, this.d, a());
            }
            this.f = aiii;
        }
        this.g = aict;
    }

    private final aihz a() {
        return new aihz(this);
    }

    public static final void a(aihv aihv, PrintWriter printWriter) {
        printWriter.print("  ");
        printWriter.print(aihv.a);
        printWriter.print(" Uid=");
        printWriter.print(aihv.c);
        printWriter.print(" Package=");
        printWriter.print(aihv.b);
    }

    public final void a(rdz rdz) {
        if (rdz == null) {
            aihr.a("Received null listener to remove uid:%s packages:%s", Integer.valueOf(Binder.getCallingUid()), Arrays.toString(jni.b(this.b).a(Binder.getCallingUid())));
            return;
        }
        this.d.a(31, new aihw(this, rdz));
    }
}
