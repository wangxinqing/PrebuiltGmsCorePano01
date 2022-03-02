package defpackage;

import android.content.Context;
import com.google.android.location.reporting.state.update.Conditions;

/* renamed from: ajmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmx {
    private final Context a;

    public ajmx(Context context) {
        ajnw.a(context);
        this.a = context;
    }

    public final Conditions a() {
        return new Conditions(jjy.a(this.a), jgu.e(this.a), azru.b(), jjm.a(this.a), rns.b(this.a));
    }
}
