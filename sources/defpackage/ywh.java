package defpackage;

import android.content.Context;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ywh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ywh {
    public String a;
    public String b;
    public String c;
    public String[] d;
    public String e;
    public PlusCommonExtras f;
    private final ArrayList g = new ArrayList();

    public ywh(Context context) {
        this.c = context.getPackageName();
        this.b = context.getPackageName();
        this.f = new PlusCommonExtras();
        this.g.add("https://www.googleapis.com/auth/plus.login");
    }

    public final PlusSession a() {
        if (this.a == null) {
            this.a = "<<default account>>";
        }
        ArrayList arrayList = this.g;
        return new PlusSession(this.a, (String[]) arrayList.toArray(new String[arrayList.size()]), (String[]) null, this.d, this.b, this.c, this.e, this.f);
    }

    public final void b() {
        this.g.clear();
    }

    public final void a(String... strArr) {
        this.g.clear();
        this.g.addAll(Arrays.asList(strArr));
    }
}
