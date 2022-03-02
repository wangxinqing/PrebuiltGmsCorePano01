package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: pzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pzn extends bp {
    public boolean a;
    public boolean b;
    public boolean c;
    public ArrayList d;
    public String e;
    public Bundle f;
    private final String g;
    private final Context h;
    private amzy i;

    public pzn(Context context, String str) {
        this.h = context;
        this.g = str;
    }

    public final bl a(Class cls) {
        return new pzp(this.h, this.g, this.a, this.b, this.i, this.c, this.d, this.e, this.f);
    }

    public final void a(List list) {
        this.i = list != null ? amzy.a((Collection) list) : null;
    }
}
